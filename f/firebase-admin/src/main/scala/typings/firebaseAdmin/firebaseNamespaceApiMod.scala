package typings.firebaseAdmin

import typings.firebaseAdmin.authMod.auth.Auth
import typings.firebaseAdmin.credentialMod.credential.Credential
import typings.firebaseAdmin.databaseMod.database.Database
import typings.firebaseAdmin.firebaseNamespaceApiMod.app.App
import typings.firebaseAdmin.firestoreMod.firestore.Firestore
import typings.firebaseAdmin.instanceIdMod.instanceId.InstanceId
import typings.firebaseAdmin.machineLearningMod.machineLearning.MachineLearning
import typings.firebaseAdmin.messagingMod.messaging.Messaging
import typings.firebaseAdmin.projectManagementMod.projectManagement.ProjectManagement
import typings.firebaseAdmin.remoteConfigMod.remoteConfig.RemoteConfig
import typings.firebaseAdmin.securityRulesMod.securityRules.SecurityRules
import typings.firebaseAdmin.storageMod.storage.Storage
import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseNamespaceApiMod {
  
  @JSImport("firebase-admin/lib/firebase-namespace-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/firebase-namespace-api", "SDK_VERSION")
  @js.native
  val SDK_VERSION: String = js.native
  
  object app {
    
    inline def apply(): App = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[App]
    inline def apply(name: String): App = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[App]
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "app")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A Firebase app holds the initialization information for a collection of
      * services.
      *
      * Do not call this constructor directly. Instead, use
      * {@link
      *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
      *   `admin.initializeApp()`}
      * to create an app.
      */
    @js.native
    trait App extends StObject {
      
      def auth(): Auth = js.native
      
      def database(): Database = js.native
      def database(url: String): Database = js.native
      
      /**
        * Renders this local `FirebaseApp` unusable and frees the resources of
        * all associated services (though it does *not* clean up any backend
        * resources). When running the SDK locally, this method
        * must be called to ensure graceful termination of the process.
        *
        * @example
        * ```javascript
        * app.delete()
        *   .then(function() {
        *     console.log("App deleted successfully");
        *   })
        *   .catch(function(error) {
        *     console.log("Error deleting app:", error);
        *   });
        * ```
        */
      def delete(): js.Promise[Unit] = js.native
      
      def firestore(): Firestore = js.native
      
      def instanceId(): InstanceId = js.native
      
      def machineLearning(): MachineLearning = js.native
      
      def messaging(): Messaging = js.native
      
      /**
        * The (read-only) name for this app.
        *
        * The default app's name is `"[DEFAULT]"`.
        *
        * @example
        * ```javascript
        * // The default app's name is "[DEFAULT]"
        * admin.initializeApp(defaultAppConfig);
        * console.log(admin.app().name);  // "[DEFAULT]"
        * ```
        *
        * @example
        * ```javascript
        * // A named app's name is what you provide to initializeApp()
        * var otherApp = admin.initializeApp(otherAppConfig, "other");
        * console.log(otherApp.name);  // "other"
        * ```
        */
      var name: String = js.native
      
      /**
        * The (read-only) configuration options for this app. These are the original
        * parameters given in
        * {@link
        *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
        *   `admin.initializeApp()`}.
        *
        * @example
        * ```javascript
        * var app = admin.initializeApp(config);
        * console.log(app.options.credential === config.credential);  // true
        * console.log(app.options.databaseURL === config.databaseURL);  // true
        * ```
        */
      var options: AppOptions = js.native
      
      def projectManagement(): ProjectManagement = js.native
      
      def remoteConfig(): RemoteConfig = js.native
      
      def securityRules(): SecurityRules = js.native
      
      def storage(): Storage = js.native
    }
  }
  
  @JSImport("firebase-admin/lib/firebase-namespace-api", "apps")
  @js.native
  val apps: js.Array[App | Null] = js.native
  
  inline def initializeApp(): App = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")().asInstanceOf[App]
  inline def initializeApp(options: Unit, name: String): App = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[App]
  inline def initializeApp(options: AppOptions): App = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any]).asInstanceOf[App]
  inline def initializeApp(options: AppOptions, name: String): App = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[App]
  
  trait AppOptions extends StObject {
    
    /**
      * A {@link credential.Credential `Credential`} object used to
      * authenticate the Admin SDK.
      *
      * See [Initialize the SDK](/docs/admin/setup#initialize_the_sdk) for detailed
      * documentation and code samples.
      */
    var credential: js.UndefOr[Credential] = js.undefined
    
    /**
      * The object to use as the [`auth`](/docs/reference/security/database/#auth)
      * variable in your Realtime Database Rules when the Admin SDK reads from or
      * writes to the Realtime Database. This allows you to downscope the Admin SDK
      * from its default full read and write privileges.
      *
      * You can pass `null` to act as an unauthenticated client.
      *
      * See
      * [Authenticate with limited privileges](/docs/database/admin/start#authenticate-with-limited-privileges)
      * for detailed documentation and code samples.
      */
    var databaseAuthVariableOverride: js.UndefOr[js.Object | Null] = js.undefined
    
    /**
      * The URL of the Realtime Database from which to read and write data.
      */
    var databaseURL: js.UndefOr[String] = js.undefined
    
    /**
      * An [HTTP Agent](https://nodejs.org/api/http.html#http_class_http_agent)
      * to be used when making outgoing HTTP calls. This Agent instance is used
      * by all services that make REST calls (e.g. `auth`, `messaging`,
      * `projectManagement`).
      *
      * Realtime Database and Firestore use other means of communicating with
      * the backend servers, so they do not use this HTTP Agent. `Credential`
      * instances also do not use this HTTP Agent, but instead support
      * specifying an HTTP Agent in the corresponding factory methods.
      */
    var httpAgent: js.UndefOr[Agent] = js.undefined
    
    /**
      * The ID of the Google Cloud project associated with the App.
      */
    var projectId: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the service account to be used for signing custom tokens. This
      * can be found in the `client_email` field of a service account JSON file.
      */
    var serviceAccountId: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the Google Cloud Storage bucket used for storing application data.
      * Use only the bucket name without any prefixes or additions (do *not* prefix
      * the name with "gs://").
      */
    var storageBucket: js.UndefOr[String] = js.undefined
  }
  object AppOptions {
    
    inline def apply(): AppOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppOptions]
    }
    
    extension [Self <: AppOptions](x: Self) {
      
      inline def setCredential(value: Credential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
      
      inline def setDatabaseAuthVariableOverride(value: js.Object): Self = StObject.set(x, "databaseAuthVariableOverride", value.asInstanceOf[js.Any])
      
      inline def setDatabaseAuthVariableOverrideNull: Self = StObject.set(x, "databaseAuthVariableOverride", null)
      
      inline def setDatabaseAuthVariableOverrideUndefined: Self = StObject.set(x, "databaseAuthVariableOverride", js.undefined)
      
      inline def setDatabaseURL(value: String): Self = StObject.set(x, "databaseURL", value.asInstanceOf[js.Any])
      
      inline def setDatabaseURLUndefined: Self = StObject.set(x, "databaseURL", js.undefined)
      
      inline def setHttpAgent(value: Agent): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
      
      inline def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      inline def setServiceAccountId(value: String): Self = StObject.set(x, "serviceAccountId", value.asInstanceOf[js.Any])
      
      inline def setServiceAccountIdUndefined: Self = StObject.set(x, "serviceAccountId", js.undefined)
      
      inline def setStorageBucket(value: String): Self = StObject.set(x, "storageBucket", value.asInstanceOf[js.Any])
      
      inline def setStorageBucketUndefined: Self = StObject.set(x, "storageBucket", js.undefined)
    }
  }
  
  trait FirebaseArrayIndexError extends StObject {
    
    /**
      * The error object.
      */
    var error: FirebaseError
    
    /**
      * The index of the errored item within the original array passed as part of the
      * called API method.
      */
    var index: Double
  }
  object FirebaseArrayIndexError {
    
    inline def apply(error: FirebaseError, index: Double): FirebaseArrayIndexError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseArrayIndexError]
    }
    
    extension [Self <: FirebaseArrayIndexError](x: Self) {
      
      inline def setError(value: FirebaseError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait FirebaseError extends StObject {
    
    /**
      * Error codes are strings using the following format: `"service/string-code"`.
      * Some examples include `"auth/invalid-uid"` and
      * `"messaging/invalid-recipient"`.
      *
      * While the message for a given error can change, the code will remain the same
      * between backward-compatible versions of the Firebase SDK.
      */
    var code: String
    
    /**
      * An explanatory message for the error that just occurred.
      *
      * This message is designed to be helpful to you, the developer. Because
      * it generally does not convey meaningful information to end users,
      * this message should not be displayed in your application.
      */
    var message: String
    
    /**
      * A string value containing the execution backtrace when the error originally
      * occurred.
      *
      * This information can be useful to you and can be sent to
      * {@link https://firebase.google.com/support/ Firebase Support} to help
      * explain the cause of an error.
      */
    var stack: js.UndefOr[String] = js.undefined
    
    /**
      * @return A JSON-serializable representation of this object.
      */
    def toJSON(): js.Object
  }
  object FirebaseError {
    
    inline def apply(code: String, message: String, toJSON: () => js.Object): FirebaseError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[FirebaseError]
    }
    
    extension [Self <: FirebaseError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
