package typings.firebaseAdmin.admin.auth

import typings.firebaseAdmin.admin.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.auth")
@js.native
object ^ extends js.Object {
  /**
    * Gets the {@link admin.auth.Auth `Auth`} service for the default app or a
    * given app.
    *
    * `admin.auth()` can be called with no arguments to access the default app's
    * {@link admin.auth.Auth `Auth`} service or as `admin.auth(app)` to access the
    * {@link admin.auth.Auth `Auth`} service associated with a specific app.
    *
    * @example
    * ```javascript
    * // Get the Auth service for the default app
    * var defaultAuth = admin.auth();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Auth service for a given app
    * var otherAuth = admin.auth(otherApp);
    * ```
    *
    */
  def apply(): Auth = js.native
  def apply(app: App): Auth = js.native
}

