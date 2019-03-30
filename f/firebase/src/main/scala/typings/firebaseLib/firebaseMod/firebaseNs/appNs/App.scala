package typings
package firebaseLib.firebaseMod.firebaseNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var name: java.lang.String = js.native
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
    * Gets the {@link firebase.auth.Auth `Auth`} service for the current app.
    *
    * @example
    * ```javascript
    * var auth = app.auth();
    * // The above is shorthand for:
    * // var auth = firebase.auth(app);
    * ```
    */
  def auth(): firebaseLib.firebaseMod.firebaseNs.authNs.Auth = js.native
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
  def database(): firebaseLib.firebaseMod.firebaseNs.databaseNs.Database = js.native
  def database(url: java.lang.String): firebaseLib.firebaseMod.firebaseNs.databaseNs.Database = js.native
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
  def firestore(): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Firestore = js.native
  def functions(): firebaseLib.firebaseMod.firebaseNs.functionsNs.Functions = js.native
  def functions(region: java.lang.String): firebaseLib.firebaseMod.firebaseNs.functionsNs.Functions = js.native
  /**
    * Gets the {@link firebase.messaging.Messaging `Messaging`} service for the
    * current app.
    *
    * @example
    * ```javascript
    * var messaging = app.messaging();
    * // The above is shorthand for:
    * // var messaging = firebase.messaging(app);
    * ```
    */
  def messaging(): firebaseLib.firebaseMod.firebaseNs.messagingNs.Messaging = js.native
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
  def storage(): firebaseLib.firebaseMod.firebaseNs.storageNs.Storage = js.native
  def storage(url: java.lang.String): firebaseLib.firebaseMod.firebaseNs.storageNs.Storage = js.native
}

