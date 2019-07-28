package typings.firebaseDashAdmin.adminNs.databaseNs

import typings.firebaseDashAdmin.adminNs.appNs.App
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Firebase Realtime Database service interface.
  *
  * Do not call this constructor directly. Instead, use
  * [`admin.database()`](admin.database#database).
  *
  * See
  * {@link
  *   https://firebase.google.com/docs/database/admin/start/
  *   Introduction to the Admin Database API}
  * for a full guide on how to use the Firebase Realtime Database service.
  */
@js.native
trait Database extends js.Object {
  var app: App = js.native
  /**
    * Gets the currently applied security rules as a string. The return value consists of
    * the rules source including comments.
    *
    * @return A promise fulfilled with the rules as a raw string.
    */
  def getRules(): js.Promise[String] = js.native
  /**
    * Gets the currently applied security rules as a parsed JSON object. Any comments in
    * the original source are stripped away.
    *
    * @return A promise fulfilled with the parsed rules object.
    */
  def getRulesJSON(): js.Promise[js.Object] = js.native
  /**
    * Disconnects from the server (all Database operations will be completed
    * offline).
    *
    * The client automatically maintains a persistent connection to the Database
    * server, which will remain active indefinitely and reconnect when
    * disconnected. However, the `goOffline()` and `goOnline()` methods may be used
    * to control the client connection in cases where a persistent connection is
    * undesirable.
    *
    * While offline, the client will no longer receive data updates from the
    * Database. However, all Database operations performed locally will continue to
    * immediately fire events, allowing your application to continue behaving
    * normally. Additionally, each operation performed locally will automatically
    * be queued and retried upon reconnection to the Database server.
    *
    * To reconnect to the Database and begin receiving remote events, see
    * `goOnline()`.
    *
    * @example
    * ```javascript
    * admin.database().goOffline();
    * ```
    */
  def goOffline(): Unit = js.native
  /**
    * Reconnects to the server and synchronizes the offline Database state
    * with the server state.
    *
    * This method should be used after disabling the active connection with
    * `goOffline()`. Once reconnected, the client will transmit the proper data
    * and fire the appropriate events so that your client "catches up"
    * automatically.
    *
    * @example
    * ```javascript
    * admin.database().goOnline();
    * ```
    */
  def goOnline(): Unit = js.native
  /**
    * Returns a `Reference` representing the location in the Database
    * corresponding to the provided path. Also can be invoked with an existing
    * `Reference` as the argument. In that case returns a new `Reference`
    * pointing to the same location. If no path argument is
    * provided, returns a `Reference` that represents the root of the Database.
    *
    * @example
    * ```javascript
    * // Get a reference to the root of the Database
    * var rootRef = admin.database.ref();
    * ```
    *
    * @example
    * ```javascript
    * // Get a reference to the /users/ada node
    * var adaRef = admin.database().ref("users/ada");
    * // The above is shorthand for the following operations:
    * //var rootRef = admin.database().ref();
    * //var adaRef = rootRef.child("users/ada");
    * ```
    *
    * @example
    * ```javascript
    * var adaRef = admin.database().ref("users/ada");
    * // Get a new reference pointing to the same location.
    * var anotherAdaRef = admin.database().ref(adaRef);
    * ```
    *
    *
    * @param path Optional path representing
    *   the location the returned `Reference` will point. Alternatively, a
    *   `Reference` object to copy. If not provided, the returned `Reference` will
    *   point to the root of the Database.
    * @return If a path is provided, a `Reference`
    *   pointing to the provided path. Otherwise, a `Reference` pointing to the
    *   root of the Database.
    */
  def ref(): Reference = js.native
  def ref(path: String): Reference = js.native
  def ref(path: Reference): Reference = js.native
  /**
    * Returns a `Reference` representing the location in the Database
    * corresponding to the provided Firebase URL.
    *
    * An exception is thrown if the URL is not a valid Firebase Database URL or it
    * has a different domain than the current `Database` instance.
    *
    * Note that all query parameters (`orderBy`, `limitToLast`, etc.) are ignored
    * and are not applied to the returned `Reference`.
    *
    * @example
    * ```javascript
    * // Get a reference to the root of the Database
    * var rootRef = admin.database().ref("https://<DATABASE_NAME>.firebaseio.com");
    * ```
    *
    * @example
    * ```javascript
    * // Get a reference to the /users/ada node
    * var adaRef = admin.database().ref("https://<DATABASE_NAME>.firebaseio.com/users/ada");
    * ```
    *
    * @param url The Firebase URL at which the returned `Reference` will
    *   point.
    * @return  A `Reference` pointing to the provided Firebase URL.
    */
  def refFromURL(url: String): Reference = js.native
  /**
    * Sets the specified rules on the Firebase Realtime Database instance. If the rules source is
    * specified as a string or a Buffer, it may include comments.
    *
    * @param source Source of the rules to apply. Must not be `null` or empty.
    * @return Resolves when the rules are set on the Realtime Database.
    */
  def setRules(source: String): js.Promise[Unit] = js.native
  def setRules(source: js.Object): js.Promise[Unit] = js.native
  def setRules(source: Buffer): js.Promise[Unit] = js.native
}

