package typings.firebaseAdmin.global.admin

import typings.firebaseAdmin.admin.app.App
import typings.firebaseAdmin.admin.storage.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.storage")
@js.native
object storage extends js.Object {
  /**
    * Gets the {@link admin.storage.Storage `Storage`} service for the
    * default app or a given app.
    *
    * `admin.storage()` can be called with no arguments to access the default
    * app's {@link admin.storage.Storage `Storage`} service or as
    * `admin.storage(app)` to access the
    * {@link admin.storage.Storage `Storage`} service associated with a
    * specific app.
    *
    * @example
    * ```javascript
    * // Get the Storage service for the default app
    * var defaultStorage = admin.storage();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Storage service for a given app
    * var otherStorage = admin.storage(otherApp);
    * ```
    */
  def apply(): Storage = js.native
  def apply(app: App): Storage = js.native
}

