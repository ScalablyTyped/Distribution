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
  var apps: js.Array[firebaseLib.firebaseMod.appNs.App] = js.native
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
  def app(): firebaseLib.firebaseMod.appNs.App = js.native
  def app(name: java.lang.String): firebaseLib.firebaseMod.appNs.App = js.native
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
    * ```javascript
    *
    * // Get the Auth service for the default app
    * var defaultAuth = firebase.auth();
    * ```
    * @example
    * ```javascript
    *
    * // Get the Auth service for a given app
    * var otherAuth = firebase.auth(otherApp);
    * ```
    * @param app
    */
  def auth(): firebaseLib.firebaseMod.authNs.Auth = js.native
  def auth(app: firebaseLib.firebaseMod.appNs.App): firebaseLib.firebaseMod.authNs.Auth = js.native
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
    * ```javascript
    * // Get the Database service for the default app
    * var defaultDatabase = firebase.database();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Database service for a specific app
    * var otherDatabase = firebase.database(app);
    * ```
    *
    * @namespace
    * @param app Optional app whose Database service to
    *   return. If not provided, the default Database service will be returned.
    * @return The default Database service if no app
    *   is provided or the Database service associated with the provided app.
    */
  def database(): firebaseLib.firebaseMod.databaseNs.Database = js.native
  def database(app: firebaseLib.firebaseMod.appNs.App): firebaseLib.firebaseMod.databaseNs.Database = js.native
  def firestore(): firebaseLib.firebaseMod.firestoreNs.Firestore = js.native
  def firestore(app: firebaseLib.firebaseMod.appNs.App): firebaseLib.firebaseMod.firestoreNs.Firestore = js.native
  def functions(): firebaseLib.firebaseMod.functionsNs.Functions = js.native
  def functions(app: firebaseLib.firebaseMod.appNs.App): firebaseLib.firebaseMod.functionsNs.Functions = js.native
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
    * ```javascript
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
    * ```javascript
    *
    * // Initialize another app
    * var otherApp = firebase.initializeApp({
    *   databaseURL: "https://<OTHER_DATABASE_NAME>.firebaseio.com",
    *   storageBucket: "<OTHER_STORAGE_BUCKET>.appspot.com"
    * }, "otherApp");
    * ```
    *
    * @param options Options to configure the app's services.
    * @param name Optional name of the app to initialize. If no name
    *   is provided, the default is `"[DEFAULT]"`.
    *
    * @return {!firebase.app.App} The initialized app.
    */
  def initializeApp(options: js.Object): firebaseLib.firebaseMod.appNs.App = js.native
  def initializeApp(options: js.Object, name: java.lang.String): firebaseLib.firebaseMod.appNs.App = js.native
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
    * ```javascript
    * // Get the Messaging service for the default app
    * var defaultMessaging = firebase.messaging();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Messaging service for a given app
    * var otherMessaging = firebase.messaging(otherApp);
    * ```
    *
    * @namespace
    * @param app The app to create a Messaging service for.
    *     If not passed, uses the default app.
    */
  def messaging(): firebaseLib.firebaseMod.messagingNs.Messaging = js.native
  def messaging(app: firebaseLib.firebaseMod.appNs.App): firebaseLib.firebaseMod.messagingNs.Messaging = js.native
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
    * ```javascript
    * // Get the Storage service for the default app
    * var defaultStorage = firebase.storage();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Storage service for a given app
    * var otherStorage = firebase.storage(otherApp);
    * ```
    *
    * @param app The app to create a storage service for.
    *     If not passed, uses the default app.
    */
  def storage(): firebaseLib.firebaseMod.storageNs.Storage = js.native
  def storage(app: firebaseLib.firebaseMod.appNs.App): firebaseLib.firebaseMod.storageNs.Storage = js.native
}

