package typings.firebaseAdmin.global.admin

import typings.firebaseAdmin.admin.app.App
import typings.firebaseAdmin.admin.database.Database
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.database")
@js.native
object database extends js.Object {
  /**
    * Gets the {@link admin.database.Database `Database`} service for the default
    * app or a given app.
    *
    * `admin.database()` can be called with no arguments to access the default
    * app's {@link admin.database.Database `Database`} service or as
    * `admin.database(app)` to access the
    * {@link admin.database.Database `Database`} service associated with a specific
    * app.
    *
    * `admin.database` is also a namespace that can be used to access global
    * constants and methods associated with the `Database` service.
    *
    * @example
    * ```javascript
    * // Get the Database service for the default app
    * var defaultDatabase = admin.database();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Database service for a specific app
    * var otherDatabase = admin.database(app);
    * ```
    *
    * @param App whose `Database` service to
    *   return. If not provided, the default `Database` service will be returned.
    *
    * @return The default `Database` service if no app
    *   is provided or the `Database` service associated with the provided app.
    */
  def apply(): Database = js.native
  def apply(app: App): Database = js.native
  /* eslint-disable-next-line @typescript-eslint/no-unused-vars */
  def enableLogging(): js.Any = js.native
  def enableLogging(logger: js.Function1[/* message */ String, _]): js.Any = js.native
  def enableLogging(logger: js.Function1[/* message */ String, _], persistent: Boolean): js.Any = js.native
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
    val TIMESTAMP: js.Object = js.native
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

