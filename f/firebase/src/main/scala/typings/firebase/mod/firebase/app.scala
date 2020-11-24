package typings.firebase.mod.firebase

import typings.firebase.mod.firebase.analytics.Analytics
import typings.firebase.mod.firebase.auth.Auth
import typings.firebase.mod.firebase.database.Database
import typings.firebase.mod.firebase.firestore.Firestore
import typings.firebase.mod.firebase.functions.Functions
import typings.firebase.mod.firebase.installations.Installations
import typings.firebase.mod.firebase.messaging.Messaging
import typings.firebase.mod.firebase.performance.Performance
import typings.firebase.mod.firebase.remoteConfig.RemoteConfig
import typings.firebase.mod.firebase.storage.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "firebase.app")
@js.native
object app extends js.Object {
  
  /**
    * A Firebase App holds the initialization information for a collection of
    * services.
    *
    * Do not call this constructor directly. Instead, use
    * {@link firebase.initializeApp|`firebase.initializeApp()`} to create an app.
    *
    */
  @js.native
  trait App extends js.Object {
    
    /**
      * Gets the {@link firebase.analytics.Analytics `Analytics`} service for the
      * current app. If the current app is not the default one, throws an error.
      *
      * @webonly
      *
      * @example
      * ```javascript
      * const analytics = app.analytics();
      * // The above is shorthand for:
      * // const analytics = firebase.analytics(app);
      * ```
      */
    def analytics(): Analytics = js.native
    
    /**
      * Gets the {@link firebase.auth.Auth `Auth`} service for the current app.
      *
      * @example
      * ```javascript
      * var auth = app.auth();
      * // The above is shorthand for:
      * // var auth = firebase.auth(app);
      * ```
      */
    def auth(): Auth = js.native
    
    /**
      * Gets the {@link firebase.database.Database `Database`} service for the
      * current app.
      *
      * @example
      * ```javascript
      * var database = app.database();
      * // The above is shorthand for:
      * // var database = firebase.database(app);
      * ```
      */
    def database(): Database = js.native
    def database(url: String): Database = js.native
    
    /**
      * Renders this app unusable and frees the resources of all associated
      * services.
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
    def delete(): js.Promise[_] = js.native
    
    def firestore(): Firestore = js.native
    
    def functions(): Functions = js.native
    def functions(region: String): Functions = js.native
    
    /**
      * Gets the {@link firebase.installations.Installations `Installations`} service for the
      * current app.
      *
      * @webonly
      *
      * @example
      * ```javascript
      * const installations = app.installations();
      * // The above is shorthand for:
      * // const installations = firebase.installations(app);
      * ```
      */
    def installations(): Installations = js.native
    
    /**
      * Gets the {@link firebase.messaging.Messaging `Messaging`} service for the
      * current app.
      *
      * @webonly
      *
      * @example
      * ```javascript
      * var messaging = app.messaging();
      * // The above is shorthand for:
      * // var messaging = firebase.messaging(app);
      * ```
      */
    def messaging(): Messaging = js.native
    
    /**
      * The (read-only) name for this app.
      *
      * The default app's name is `"[DEFAULT]"`.
      *
      * @example
      * ```javascript
      * // The default app's name is "[DEFAULT]"
      * firebase.initializeApp(defaultAppConfig);
      * console.log(firebase.app().name);  // "[DEFAULT]"
      * ```
      *
      * @example
      * ```javascript
      * // A named app's name is what you provide to initializeApp()
      * var otherApp = firebase.initializeApp(otherAppConfig, "other");
      * console.log(otherApp.name);  // "other"
      * ```
      */
    var name: String = js.native
    
    /**
      * The (read-only) configuration options for this app. These are the original
      * parameters given in
      * {@link firebase.initializeApp `firebase.initializeApp()`}.
      *
      * @example
      * ```javascript
      * var app = firebase.initializeApp(config);
      * console.log(app.options.databaseURL === config.databaseURL);  // true
      * ```
      */
    var options: js.Object = js.native
    
    /**
      * Gets the {@link firebase.performance.Performance `Performance`} service for the
      * current app. If the current app is not the default one, throws an error.
      *
      * @webonly
      *
      * @example
      * ```javascript
      * const perf = app.performance();
      * // The above is shorthand for:
      * // const perf = firebase.performance(app);
      * ```
      */
    def performance(): Performance = js.native
    
    /**
      * Gets the {@link firebase.remoteConfig.RemoteConfig `RemoteConfig`} instance.
      *
      * @webonly
      *
      * @example
      * ```javascript
      * const rc = app.remoteConfig();
      * // The above is shorthand for:
      * // const rc = firebase.remoteConfig(app);
      * ```
      */
    def remoteConfig(): RemoteConfig = js.native
    
    /**
      * Gets the {@link firebase.storage.Storage `Storage`} service for the current
      * app, optionally initialized with a custom storage bucket.
      *
      * @webonly
      *
      * @example
      * ```javascript
      * var storage = app.storage();
      * // The above is shorthand for:
      * // var storage = firebase.storage(app);
      * ```
      *
      * @example
      * ```javascript
      * var storage = app.storage("gs://your-app.appspot.com");
      * ```
      *
      * @param url The gs:// url to your Firebase Storage Bucket.
      *     If not passed, uses the app's default Storage Bucket.
      */
    def storage(): Storage = js.native
    def storage(url: String): Storage = js.native
  }
}
