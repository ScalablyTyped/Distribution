package typings
package firebaseLib.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * The current SDK version.
    */
  var SDK_VERSION: java.lang.String = js.native
  /**
    * A (read-only) array of all initialized apps.
    */
  var apps: coreDashJsLib.Array[firebaseLib.firebaseMod.firebaseNs.appNs.App] = js.native
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
    * ```
    * // Return the default app
    * var app = firebase.app();
    * ```
    *
    * @example
    * ```
    * // Return a named app
    * var otherApp = firebase.app("otherApp");
    * ```
    *
    * @param {string=} name Optional name of the app to return. If no name is
    *   provided, the default is `"[DEFAULT]"`.
    *
    * @return {!firebase.app.App} The app corresponding to the provided app name.
    *   If no app name is provided, the default app is returned.
    */
  def app(): firebaseLib.firebaseMod.firebaseNs.appNs.App = js.native
  def app(name: java.lang.String): firebaseLib.firebaseMod.firebaseNs.appNs.App = js.native
  /**
    * Gets the {@link firebase.auth.Auth `Auth`} service for the default app or a
    * given app.
    *
    * `firebase.auth()` can be called with no arguments to access the default app's
    * {@link firebase.auth.Auth `Auth`} service or as `firebase.auth(app)` to
    * access the {@link firebase.auth.Auth `Auth`} service associated with a
    * specific app.
    *
    * @example
    * ```
    *
    * // Get the Auth service for the default app
    * var defaultAuth = firebase.auth();
    * ```
    * @example
    * ```
    *
    * // Get the Auth service for a given app
    * var otherAuth = firebase.auth(otherApp);
    * ```
    * @param {!firebase.app.App=} app
    *
    * @return {!firebase.auth.Auth}
    */
  def auth(): firebaseLib.firebaseMod.firebaseNs.authNs.Auth = js.native
  def auth(app: firebaseLib.firebaseMod.firebaseNs.appNs.App): firebaseLib.firebaseMod.firebaseNs.authNs.Auth = js.native
  /**
    * Gets the {@link firebase.database.Database `Database`} service for the
    * default app or a given app.
    *
    * `firebase.database()` can be called with no arguments to access the default
    * app's {@link firebase.database.Database `Database`} service or as
    * `firebase.database(app)` to access the
    * {@link firebase.database.Database `Database`} service associated with a
    * specific app.
    *
    * `firebase.database` is also a namespace that can be used to access global
    * constants and methods associated with the `Database` service.
    *
    * @example
    * ```
    * // Get the Database service for the default app
    * var defaultDatabase = firebase.database();
    * ```
    *
    * @example
    * ```
    * // Get the Database service for a specific app
    * var otherDatabase = firebase.database(app);
    * ```
    *
    * @namespace
    * @param {!firebase.app.App=} app Optional app whose Database service to
    *   return. If not provided, the default Database service will be returned.
    * @return {!firebase.database.Database} The default Database service if no app
    *   is provided or the Database service associated with the provided app.
    */
  def database(): firebaseLib.firebaseMod.firebaseNs.databaseNs.Database = js.native
  def database(app: firebaseLib.firebaseMod.firebaseNs.appNs.App): firebaseLib.firebaseMod.firebaseNs.databaseNs.Database = js.native
  def firestore(): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Firestore = js.native
  def firestore(app: firebaseLib.firebaseMod.firebaseNs.appNs.App): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Firestore = js.native
  def functions(): firebaseLib.firebaseMod.firebaseNs.functionsNs.Functions = js.native
  def functions(app: firebaseLib.firebaseMod.firebaseNs.appNs.App): firebaseLib.firebaseMod.firebaseNs.functionsNs.Functions = js.native
  /**
    * Creates and initializes a Firebase {@link firebase.app.App app} instance.
    *
    * See
    * {@link
    *   https://firebase.google.com/docs/web/setup#add_firebase_to_your_app
    *   Add Firebase to your app} and
    * {@link
    *   https://firebase.google.com/docs/web/setup#initialize_multiple_apps
    *   Initialize multiple apps} for detailed documentation.
    *
    * @example
    * ```
    *
    * // Initialize default app
    * // Retrieve your own options values by adding a web app on
    * // https://console.firebase.google.com
    * firebase.initializeApp({
    *   apiKey: "AIza....",                             // Auth / General Use
    *   authDomain: "YOUR_APP.firebaseapp.com",         // Auth with popup/redirect
    *   databaseURL: "https://YOUR_APP.firebaseio.com", // Realtime Database
    *   storageBucket: "YOUR_APP.appspot.com",          // Storage
    *   messagingSenderId: "123456789"                  // Cloud Messaging
    * });
    * ```
    *
    * @example
    * ```
    *
    * // Initialize another app
    * var otherApp = firebase.initializeApp({
    *   databaseURL: "https://<OTHER_DATABASE_NAME>.firebaseio.com",
    *   storageBucket: "<OTHER_STORAGE_BUCKET>.appspot.com"
    * }, "otherApp");
    * ```
    *
    * @param {!Object} options Options to configure the app's services.
    * @param {string=} name Optional name of the app to initialize. If no name
    *   is provided, the default is `"[DEFAULT]"`.
    *
    * @return {!firebase.app.App} The initialized app.
    */
  def initializeApp(options: coreDashJsLib.Object): firebaseLib.firebaseMod.firebaseNs.appNs.App = js.native
  def initializeApp(options: coreDashJsLib.Object, name: java.lang.String): firebaseLib.firebaseMod.firebaseNs.appNs.App = js.native
  /**
    * Gets the {@link firebase.messaging.Messaging `Messaging`} service for the
    * default app or a given app.
    *
    * `firebase.messaging()` can be called with no arguments to access the default
    * app's {@link firebase.messaging.Messaging `Messaging`} service or as
    * `firebase.messaging(app)` to access the
    * {@link firebase.messaging.Messaging `Messaging`} service associated with a
    * specific app.
    *
    * Calling `firebase.messaging()` in a service worker results in Firebase
    * generating notifications if the push message payload has a `notification`
    * parameter.
    *
    * @example
    * ```
    * // Get the Messaging service for the default app
    * var defaultMessaging = firebase.messaging();
    * ```
    *
    * @example
    * ```
    * // Get the Messaging service for a given app
    * var otherMessaging = firebase.messaging(otherApp);
    * ```
    *
    * @namespace
    * @param {!firebase.app.App=} app The app to create a Messaging service for.
    *     If not passed, uses the default app.
    *
    * @return {!firebase.messaging.Messaging}
    */
  def messaging(): firebaseLib.firebaseMod.firebaseNs.messagingNs.Messaging = js.native
  def messaging(app: firebaseLib.firebaseMod.firebaseNs.appNs.App): firebaseLib.firebaseMod.firebaseNs.messagingNs.Messaging = js.native
  /**
    * Gets the {@link firebase.storage.Storage `Storage`} service for the default
    * app or a given app.
    *
    * `firebase.storage()` can be called with no arguments to access the default
    * app's {@link firebase.storage.Storage `Storage`} service or as
    * `firebase.storage(app)` to access the
    * {@link firebase.storage.Storage `Storage`} service associated with a
    * specific app.
    *
    * @example
    * ```
    * // Get the Storage service for the default app
    * var defaultStorage = firebase.storage();
    * ```
    *
    * @example
    * ```
    * // Get the Storage service for a given app
    * var otherStorage = firebase.storage(otherApp);
    * ```
    *
    * @param {!firebase.app.App=} app The app to create a storage service for.
    *     If not passed, uses the default app.
    *
    * @return {!firebase.storage.Storage}
    */
  def storage(): firebaseLib.firebaseMod.firebaseNs.storageNs.Storage = js.native
  def storage(app: firebaseLib.firebaseMod.firebaseNs.appNs.App): firebaseLib.firebaseMod.firebaseNs.storageNs.Storage = js.native
}

