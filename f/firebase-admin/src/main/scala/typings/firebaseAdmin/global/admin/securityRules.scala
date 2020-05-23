package typings.firebaseAdmin.global.admin

import typings.firebaseAdmin.admin.app.App
import typings.firebaseAdmin.admin.securityRules.SecurityRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.securityRules")
@js.native
object securityRules extends js.Object {
  /**
    * Gets the {@link admin.securityRules.SecurityRules
    * `SecurityRules`} service for the default app or a given app.
    *
    * `admin.securityRules()` can be called with no arguments to access the
    * default app's {@link admin.securityRules.SecurityRules
    * `SecurityRules`} service, or as `admin.securityRules(app)` to access
    * the {@link admin.securityRules.SecurityRules `SecurityRules`}
    * service associated with a specific app.
    *
    * @example
    * ```javascript
    * // Get the SecurityRules service for the default app
    * var defaultSecurityRules = admin.securityRules();
    * ```
    *
    * @example
    * ```javascript
    * // Get the SecurityRules service for a given app
    * var otherSecurityRules = admin.securityRules(otherApp);
    * ```
    *
    * @param app Optional app to return the `SecurityRules` service
    *     for. If not provided, the default `SecurityRules` service
    *     is returned.
    * @return The default `SecurityRules` service if no app is provided, or the
    *   `SecurityRules` service associated with the provided app.
    */
  def apply(): SecurityRules = js.native
  def apply(app: App): SecurityRules = js.native
}

