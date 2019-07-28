package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiaInventorySettings extends js.Object {
  var inventoryVerificationContactEmail: js.UndefOr[String] = js.undefined
  var inventoryVerificationContactName: js.UndefOr[String] = js.undefined
  var inventoryVerificationContactStatus: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object LiaInventorySettings {
  @scala.inline
  def apply(
    inventoryVerificationContactEmail: String = null,
    inventoryVerificationContactName: String = null,
    inventoryVerificationContactStatus: String = null,
    status: String = null
  ): LiaInventorySettings = {
    val __obj = js.Dynamic.literal()
    if (inventoryVerificationContactEmail != null) __obj.updateDynamic("inventoryVerificationContactEmail")(inventoryVerificationContactEmail)
    if (inventoryVerificationContactName != null) __obj.updateDynamic("inventoryVerificationContactName")(inventoryVerificationContactName)
    if (inventoryVerificationContactStatus != null) __obj.updateDynamic("inventoryVerificationContactStatus")(inventoryVerificationContactStatus)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[LiaInventorySettings]
  }
}

