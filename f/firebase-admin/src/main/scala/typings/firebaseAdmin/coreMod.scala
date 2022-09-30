package typings.firebaseAdmin

import typings.firebaseAdmin.credentialMod.Credential
import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  trait App extends StObject {
    
    /**
      * The (read-only) name for this app.
      *
      * The default app's name is `"[DEFAULT]"`.
      *
      * @example
      * ```javascript
      * // The default app's name is "[DEFAULT]"
      * initializeApp(defaultAppConfig);
      * console.log(admin.app().name);  // "[DEFAULT]"
      * ```
      *
      * @example
      * ```javascript
      * // A named app's name is what you provide to initializeApp()
      * const otherApp = initializeApp(otherAppConfig, "other");
      * console.log(otherApp.name);  // "other"
      * ```
      */
    var name: String
    
    /**
      * The (read-only) configuration options for this app. These are the original
      * parameters given in {@link firebase-admin.app#initializeApp}.
      *
      * @example
      * ```javascript
      * const app = initializeApp(config);
      * console.log(app.options.credential === config.credential);  // true
      * console.log(app.options.databaseURL === config.databaseURL);  // true
      * ```
      */
    var options: AppOptions
  }
  object App {
    
    inline def apply(name: String, options: AppOptions): App = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[App]
    }
    
    extension [Self <: App](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: AppOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppOptions extends StObject {
    
    /**
      * A {@link firebase-admin.app#Credential} object used to
      * authenticate the Admin SDK.
      *
      * See {@link https://firebase.google.com/docs/admin/setup#initialize_the_sdk | Initialize the SDK}
      * for detailed documentation and code samples.
      */
    var credential: js.UndefOr[Credential] = js.undefined
    
    /**
      * The object to use as the {@link https://firebase.google.com/docs/reference/security/database/#auth | auth}
      * variable in your Realtime Database Rules when the Admin SDK reads from or
      * writes to the Realtime Database. This allows you to downscope the Admin SDK
      * from its default full read and write privileges.
      *
      * You can pass `null` to act as an unauthenticated client.
      *
      * See
      * {@link https://firebase.google.com/docs/database/admin/start#authenticate-with-limited-privileges |
      * Authenticate with limited privileges}
      * for detailed documentation and code samples.
      */
    var databaseAuthVariableOverride: js.UndefOr[js.Object | Null] = js.undefined
    
    /**
      * The URL of the Realtime Database from which to read and write data.
      */
    var databaseURL: js.UndefOr[String] = js.undefined
    
    /**
      * An {@link https://nodejs.org/api/http.html#http_class_http_agent | HTTP Agent}
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
      * This information can be useful for troubleshooting the cause of the error with
      * {@link https://firebase.google.com/support | Firebase Support}.
      */
    var stack: js.UndefOr[String] = js.undefined
    
    /**
      * Returns a JSON-serializable object representation of this error.
      *
      * @returns A JSON-serializable representation of this object.
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
