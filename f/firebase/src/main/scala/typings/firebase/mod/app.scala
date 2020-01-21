package typings.firebase.mod

import typings.firebase.mod.analytics.Analytics
import typings.firebase.mod.auth.Auth
import typings.firebase.mod.database.Database
import typings.firebase.mod.firestore.Firestore
import typings.firebase.mod.functions.Functions
import typings.firebase.mod.installations.Installations
import typings.firebase.mod.messaging.Messaging
import typings.firebase.mod.performance.Performance
import typings.firebase.mod.remoteConfig.RemoteConfig
import typings.firebase.mod.storage.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "app")
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
  
  /**
    * Retrieves a Firebase {@link firebase.app.App app} instance.
    *
    * When called with no arguments, the default app is returned. When an app name
    * is provided, the app corresponding to that name is returned.
    *
    * An exception is thrown if the app being retrieved has not yet been
    * initialized.
    *
    * @example
    * ```javascript
    * // Return the default app
    * var app = firebase.app();
    * ```
    *
    * @example
    * ```javascript
    * // Return a named app
    * var otherApp = firebase.app("otherApp");
    * ```
    *
    * @param name Optional name of the app to return. If no name is
    *   provided, the default is `"[DEFAULT]"`.
    *
    * @return The app corresponding to the provided app name.
    *   If no app name is provided, the default app is returned.
    */
  def apply(): App = js.native
  def apply(name: String): App = js.native
}

