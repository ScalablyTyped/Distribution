package typings.firebaseDashAdmin.admin.database

import typings.firebaseDashAdmin.admin.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.database")
@js.native
object ^ extends js.Object {
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
}

