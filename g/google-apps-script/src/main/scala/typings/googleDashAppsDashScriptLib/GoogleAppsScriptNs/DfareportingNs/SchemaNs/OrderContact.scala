package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderContact extends js.Object {
  var contactInfo: js.UndefOr[java.lang.String] = js.undefined
  var contactName: js.UndefOr[java.lang.String] = js.undefined
  var contactTitle: js.UndefOr[java.lang.String] = js.undefined
  var contactType: js.UndefOr[java.lang.String] = js.undefined
  var signatureUserProfileId: js.UndefOr[java.lang.String] = js.undefined
}

object OrderContact {
  @scala.inline
  def apply(
    contactInfo: java.lang.String = null,
    contactName: java.lang.String = null,
    contactTitle: java.lang.String = null,
    contactType: java.lang.String = null,
    signatureUserProfileId: java.lang.String = null
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

