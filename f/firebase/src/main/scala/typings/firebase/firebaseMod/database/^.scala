package typings.firebase.firebaseMod.database

import typings.firebase.firebaseMod.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "database")
@js.native
object ^ extends js.Object {
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
}

