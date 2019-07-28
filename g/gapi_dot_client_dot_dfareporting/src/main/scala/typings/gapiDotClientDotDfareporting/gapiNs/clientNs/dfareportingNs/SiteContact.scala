package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteContact extends js.Object {
  /** Address of this site contact. */
  var address: js.UndefOr[String] = js.undefined
  /** Site contact type. */
  var contactType: js.UndefOr[String] = js.undefined
  /** Email address of this site contact. This is a required field. */
  var email: js.UndefOr[String] = js.undefined
  /** First name of this site contact. */
  var firstName: js.UndefOr[String] = js.undefined
  /** ID of this site contact. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Last name of this site contact. */
  var lastName: js.UndefOr[String] = js.undefined
  /** Primary phone number of this site contact. */
  var phone: js.UndefOr[String] = js.undefined
  /** Title or designation of this site contact. */
  var title: js.UndefOr[String] = js.undefined
}

object SiteContact {
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
  ): SiteContact = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (contactType != null) __obj.updateDynamic("contactType")(contactType)
    if (email != null) __obj.updateDynamic("email")(email)
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastName != null) __obj.updateDynamic("lastName")(lastName)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SiteContact]
  }
}

