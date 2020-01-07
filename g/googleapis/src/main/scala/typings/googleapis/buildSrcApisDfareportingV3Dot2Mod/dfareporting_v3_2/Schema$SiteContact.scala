package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Site Contact
  */
@js.native
trait Schema$SiteContact extends js.Object {
  /**
    * Address of this site contact.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * Site contact type.
    */
  var contactType: js.UndefOr[String] = js.native
  /**
    * Email address of this site contact. This is a required field.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * First name of this site contact.
    */
  var firstName: js.UndefOr[String] = js.native
  /**
    * ID of this site contact. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Last name of this site contact.
    */
  var lastName: js.UndefOr[String] = js.native
  /**
    * Primary phone number of this site contact.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * Title or designation of this site contact.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$SiteContact {
  @scala.inline
  def apply(
    address: String = null,
    contactType: String = null,
    email: String = null,
    firstName: String = null,
    id: String = null,
    lastName: String = null,
    phone: String = null,
    title: String = null
  ): Schema$SiteContact = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (contactType != null) __obj.updateDynamic("contactType")(contactType.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SiteContact]
  }
}

