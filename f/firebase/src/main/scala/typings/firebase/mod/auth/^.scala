package typings.firebase.mod.auth

import typings.firebase.mod.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "auth")
@js.native
object ^ extends js.Object {
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
  def apply(): Auth = js.native
  def apply(app: App): Auth = js.native
}

