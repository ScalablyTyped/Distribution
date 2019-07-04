package typings
package firebaseDashAdminLib.adminNs.projectManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a Firebase iOS app.
  *
  * Do not call this constructor directly. Instead, use
  * [`projectManagement.iosApp()`](admin.projectManagement.ProjectManagement#iosApp).
  */
trait IosApp extends js.Object {
  var appId: java.lang.String
  /**
    * Gets the configuration artifact associated with this app.
    *
    * @return A promise that resolves to the iOS app's Firebase
    *     config file, in UTF-8 string format. This string is typically intended to
    *     be written to a plist file that gets shipped with your iOS app.
    */
  def getConfig(): js.Promise[java.lang.String]
  /**
    * Retrieves metadata about this iOS app.
    *
    * @return {!Promise<admin.projectManagement.IosAppMetadata>} A promise that
    *     resolves to the retrieved metadata about this iOS app.
    */
  def getMetadata(): js.Promise[IosAppMetadata]
  /**
    * Sets the optional user-assigned display name of the app.
    *
    * @param newDisplayName The new display name to set.
    *
    * @return A promise that resolves when the display name has
    *     been set.
    */
  def setDisplayName(newDisplayName: java.lang.String): js.Promise[scala.Unit]
}

object IosApp {
  @scala.inline
  def apply(
    appId: java.lang.String,
    getConfig: () => js.Promise[java.lang.String],
    getMetadata: () => js.Promise[IosAppMetadata],
    setDisplayName: java.lang.String => js.Promise[scala.Unit]
  ): IosApp = {
    val __obj = js.Dynamic.literal(appId = appId, getConfig = js.Any.fromFunction0(getConfig), getMetadata = js.Any.fromFunction0(getMetadata), setDisplayName = js.Any.fromFunction1(setDisplayName))
  
    __obj.asInstanceOf[IosApp]
  }
}

