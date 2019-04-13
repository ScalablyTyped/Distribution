package typings
package electronDashPackagerLib.electronDashPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectronOsXSignOptions extends js.Object {
  var entitlements: js.UndefOr[java.lang.String] = js.undefined
  var `entitlements-inherit`: js.UndefOr[java.lang.String] = js.undefined
  var identity: js.UndefOr[java.lang.String] = js.undefined
}

object ElectronOsXSignOptions {
  @scala.inline
  def apply(
    entitlements: java.lang.String = null,
    `entitlements-inherit`: java.lang.String = null,
    identity: java.lang.String = null
  ): ElectronOsXSignOptions = {
    val __obj = js.Dynamic.literal()
    if (entitlements != null) __obj.updateDynamic("entitlements")(entitlements)
    if (`entitlements-inherit` != null) __obj.updateDynamic("entitlements-inherit")(`entitlements-inherit`)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    __obj.asInstanceOf[ElectronOsXSignOptions]
  }
}

