package typings.firebase.mod.default

import typings.firebase.mod.firebase.app.App
import typings.firebase.mod.firebase.database.Database
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "database")
@js.native
object database extends js.Object {
  
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
  def apply(): Database = js.native
  def apply(app: App): Database = js.native
  
  /**
    * Logs debugging information to the console.
    *
    * @example
    * ```javascript
    * // Enable logging
    * firebase.database.enableLogging(true);
    * ```
    *
    * @example
    * ```javascript
    * // Disable logging
    * firebase.database.enableLogging(false);
    * ```
    *
    * @example
    * ```javascript
    * // Enable logging across page refreshes
    * firebase.database.enableLogging(true, true);
    * ```
    *
    * @example
    * ```javascript
    * // Provide custom logger which prefixes log statements with "[FIREBASE]"
    * firebase.database.enableLogging(function(message) {
    *   console.log("[FIREBASE]", message);
    * });
    * ```
    *
    * @param logger Enables logging if `true`;
    *   disables logging if `false`. You can also provide a custom logger function
    *   to control how things get logged.
    * @param persistent Remembers the logging state between page
    *   refreshes if `true`.
    */
  def enableLogging(): js.Any = js.native
  def enableLogging(logger: js.UndefOr[scala.Nothing], persistent: Boolean): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ String, _]): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ String, _], persistent: Boolean): js.Any = js.native
  def enableLogging(logger: Boolean): js.Any = js.native
  def enableLogging(logger: Boolean, persistent: Boolean): js.Any = js.native
  
  @js.native
  object ServerValue extends js.Object {
    
    /**
      * A placeholder value for auto-populating the current timestamp (time
      * since the Unix epoch, in milliseconds) as determined by the Firebase
      * servers.
      *
      * @example
      * ```javascript
      * var sessionsRef = firebase.database().ref("sessions");
      * sessionsRef.push({
      *   startedAt: firebase.database.ServerValue.TIMESTAMP
      * });
      * ```
      */
    var TIMESTAMP: js.Object = js.native
    
    /**
      * Returns a placeholder value that can be used to atomically increment the
      * current database value by the provided delta.
      *
      * @param delta the amount to modify the current value atomically.
      * @return a placeholder value for modifying data atomically server-side.
      */
    def increment(delta: Double): js.Object = js.native
  }
}
