package typings.firebase.firebaseMod.firebase

import typings.firebase.firebaseMod.firebase.analytics.Analytics
import typings.firebase.firebaseMod.firebase.appCheck.AppCheck
import typings.firebase.firebaseMod.firebase.auth.Auth
import typings.firebase.firebaseMod.firebase.database.Database
import typings.firebase.firebaseMod.firebase.firestore.Firestore
import typings.firebase.firebaseMod.firebase.functions.Functions
import typings.firebase.firebaseMod.firebase.installations.Installations
import typings.firebase.firebaseMod.firebase.messaging.Messaging
import typings.firebase.firebaseMod.firebase.performance.Performance
import typings.firebase.firebaseMod.firebase.remoteConfig.RemoteConfig
import typings.firebase.firebaseMod.firebase.storage.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object app {
  
  /**
    * A Firebase App holds the initialization information for a collection of
    * services.
    *
    * Do not call this constructor directly. Instead, use
    * {@link firebase.initializeApp|`firebase.initializeApp()`} to create an app.
    *
    */
  @js.native
  trait App extends StObject {
    
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
    
    def appCheck(): AppCheck = js.native
    
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
      * The settable config flag for GDPR opt-in/opt-out
      */
    var automaticDataCollectionEnabled: Boolean = js.native
    
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
    def delete(): js.Promise[Any] = js.native
    
    def firestore(): Firestore = js.native
    
    def functions(): Functions = js.native
    def functions(regionOrCustomDomain: String): Functions = js.native
    
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
