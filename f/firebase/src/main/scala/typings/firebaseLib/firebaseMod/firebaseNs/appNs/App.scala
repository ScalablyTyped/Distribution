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
    * ```
    * // The default app's name is "[DEFAULT]"
    * firebase.initializeApp(defaultAppConfig);
    * console.log(firebase.app().name);  // "[DEFAULT]"
    * ```
    *
    * @example
    * ```
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
    * ```
    * var app = firebase.initializeApp(config);
    * console.log(app.options.databaseURL === config.databaseURL);  // true
    * ```
    */
  var options: coreDashJsLib.Object = js.native
  /**
    * Gets the {@link firebase.auth.Auth `Auth`} service for the current app.
    *
    * @example
    * ```
    * var auth = app.auth();
    * // The above is shorthand for:
    * // var auth = firebase.auth(app);
    * ```
    *
    * @return {!firebase.auth.Auth}
    */
  def auth(): firebaseLib.firebaseMod.firebaseNs.authNs.Auth = js.native
  /**
    * Gets the {@link firebase.database.Database `Database`} service for the
    * current app.
    *
    * @example
    * ```
    * var database = app.database();
    * // The above is shorthand for:
    * // var database = firebase.database(app);
    * ```
    *
    * @return {!firebase.database.Database}
    */
  def database(): firebaseLib.firebaseMod.firebaseNs.databaseNs.Database = js.native
  def database(url: java.lang.String): firebaseLib.firebaseMod.firebaseNs.databaseNs.Database = js.native
  def firestore(): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Firestore = js.native
  def functions(): firebaseLib.firebaseMod.firebaseNs.functionsNs.Functions = js.native
  def functions(region: java.lang.String): firebaseLib.firebaseMod.firebaseNs.functionsNs.Functions = js.native
  /**
    * Renders this app unusable and frees the resources of all associated
    * services.
    *
    * @example
    * ```
    * app.delete()
    *   .then(function() {
    *     console.log("App deleted successfully");
    *   })
    *   .catch(function(error) {
    *     console.log("Error deleting app:", error);
    *   });
    * ```
    *
    * @return {!firebase.Promise<void>} An empty promise fulfilled when the app has
    *   been deleted.
    */
  /**
    * Gets the {@link firebase.messaging.Messaging `Messaging`} service for the
    * current app.
    *
    * @example
    * ```
    * var messaging = app.messaging();
    * // The above is shorthand for:
    * // var messaging = firebase.messaging(app);
    * ```
    *
    * @return {!firebase.messaging.Messaging}
    */
  def messaging(): firebaseLib.firebaseMod.firebaseNs.messagingNs.Messaging = js.native
  /**
    * Gets the {@link firebase.storage.Storage `Storage`} service for the current
    * app, optionally initialized with a custom storage bucket.
    *
    * @example
    * ```
    * var storage = app.storage();
    * // The above is shorthand for:
    * // var storage = firebase.storage(app);
    * ```
    *
    * @example
    * ```
    * var storage = app.storage("gs://your-app.appspot.com");
    * ```
    *
    * @param {string=} url The gs:// url to your Firebase Storage Bucket.
    *     If not passed, uses the app's default Storage Bucket.
    * @return {!firebase.storage.Storage}
    */
  def storage(): firebaseLib.firebaseMod.firebaseNs.storageNs.Storage = js.native
  def storage(url: java.lang.String): firebaseLib.firebaseMod.firebaseNs.storageNs.Storage = js.native
}

