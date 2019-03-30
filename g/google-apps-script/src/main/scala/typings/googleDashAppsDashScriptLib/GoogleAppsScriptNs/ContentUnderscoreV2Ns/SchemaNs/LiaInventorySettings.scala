package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiaInventorySettings extends js.Object {
  var inventoryVerificationContactEmail: js.UndefOr[java.lang.String] = js.undefined
  var inventoryVerificationContactName: js.UndefOr[java.lang.String] = js.undefined
  var inventoryVerificationContactStatus: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object LiaInventorySettings {
  @scala.inline
  def apply(
    inventoryVerificationContactEmail: java.lang.String = null,
    inventoryVerificationContactName: java.lang.String = null,
    inventoryVerificationContactStatus: java.lang.String = null,
    status: java.lang.String = null
  ): LiaInventorySettings = {
    val __obj = js.Dynamic.literal()
    if (inventoryVerificationContactEmail != null) __obj.updateDynamic("inventoryVerificationContactEmail")(inventoryVerificationContactEmail)
    if (inventoryVerificationContactName != null) __obj.updateDynamic("inventoryVerificationContactName")(inventoryVerificationContactName)
    if (inventoryVerificationContactStatus != null) __obj.updateDynamic("inventoryVerificationContactStatus")(inventoryVerificationContactStatus)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[LiaInventorySettings]
  }
}

