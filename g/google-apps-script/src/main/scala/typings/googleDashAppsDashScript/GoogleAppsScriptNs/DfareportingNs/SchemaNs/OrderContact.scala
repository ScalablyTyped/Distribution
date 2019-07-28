package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderContact extends js.Object {
  var contactInfo: js.UndefOr[String] = js.undefined
  var contactName: js.UndefOr[String] = js.undefined
  var contactTitle: js.UndefOr[String] = js.undefined
  var contactType: js.UndefOr[String] = js.undefined
  var signatureUserProfileId: js.UndefOr[String] = js.undefined
}

object OrderContact {
  @scala.inline
  def apply(
    contactInfo: String = null,
    contactName: String = null,
    contactTitle: String = null,
    contactType: String = null,
    signatureUserProfileId: String = null
  ): OrderContact = {
    val __obj = js.Dynamic.literal()
    if (contactInfo != null) __obj.updateDynamic("contactInfo")(contactInfo)
    if (contactName != null) __obj.updateDynamic("contactName")(contactName)
    if (contactTitle != null) __obj.updateDynamic("contactTitle")(contactTitle)
    if (contactType != null) __obj.updateDynamic("contactType")(contactType)
    if (signatureUserProfileId != null) __obj.updateDynamic("signatureUserProfileId")(signatureUserProfileId)
    __obj.asInstanceOf[OrderContact]
  }
}

