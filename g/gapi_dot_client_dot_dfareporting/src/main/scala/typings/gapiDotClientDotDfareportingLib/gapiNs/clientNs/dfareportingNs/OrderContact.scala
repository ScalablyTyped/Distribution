package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderContact extends js.Object {
  /**
    * Free-form information about this contact. It could be any information related to this contact in addition to type, title, name, and signature user
    * profile ID.
    */
  var contactInfo: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this contact. */
  var contactName: js.UndefOr[java.lang.String] = js.undefined
  /** Title of this contact. */
  var contactTitle: js.UndefOr[java.lang.String] = js.undefined
  /** Type of this contact. */
  var contactType: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the user profile containing the signature that will be embedded into order documents. */
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

