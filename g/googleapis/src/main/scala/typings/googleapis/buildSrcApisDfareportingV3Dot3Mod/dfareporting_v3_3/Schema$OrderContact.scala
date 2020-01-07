package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contact of an order.
  */
@js.native
trait Schema$OrderContact extends js.Object {
  /**
    * Free-form information about this contact. It could be any information
    * related to this contact in addition to type, title, name, and signature
    * user profile ID.
    */
  var contactInfo: js.UndefOr[String] = js.native
  /**
    * Name of this contact.
    */
  var contactName: js.UndefOr[String] = js.native
  /**
    * Title of this contact.
    */
  var contactTitle: js.UndefOr[String] = js.native
  /**
    * Type of this contact.
    */
  var contactType: js.UndefOr[String] = js.native
  /**
    * ID of the user profile containing the signature that will be embedded
    * into order documents.
    */
  var signatureUserProfileId: js.UndefOr[String] = js.native
}

object Schema$OrderContact {
  @scala.inline
  def apply(
    contactInfo: String = null,
    contactName: String = null,
    contactTitle: String = null,
    contactType: String = null,
    signatureUserProfileId: String = null
  ): Schema$OrderContact = {
    val __obj = js.Dynamic.literal()
    if (contactInfo != null) __obj.updateDynamic("contactInfo")(contactInfo.asInstanceOf[js.Any])
    if (contactName != null) __obj.updateDynamic("contactName")(contactName.asInstanceOf[js.Any])
    if (contactTitle != null) __obj.updateDynamic("contactTitle")(contactTitle.asInstanceOf[js.Any])
    if (contactType != null) __obj.updateDynamic("contactType")(contactType.asInstanceOf[js.Any])
    if (signatureUserProfileId != null) __obj.updateDynamic("signatureUserProfileId")(signatureUserProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderContact]
  }
}

