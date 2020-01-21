package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for an always-on VPN connection.
  */
@js.native
trait SchemaAlwaysOnVpnPackage extends js.Object {
  /**
    * Disallows networking when the VPN is not connected.
    */
  var lockdownEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The package name of the VPN app.
    */
  var packageName: js.UndefOr[String] = js.native
}

object SchemaAlwaysOnVpnPackage {
  @scala.inline
  def apply(lockdownEnabled: js.UndefOr[Boolean] = js.undefined, packageName: String = null): SchemaAlwaysOnVpnPackage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lockdownEnabled)) __obj.updateDynamic("lockdownEnabled")(lockdownEnabled.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAlwaysOnVpnPackage]
  }
}

