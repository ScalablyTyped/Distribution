package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySiteContact extends js.Object {
  /** Address of this directory site contact. */
  var address: js.UndefOr[String] = js.undefined
  /** Email address of this directory site contact. */
  var email: js.UndefOr[String] = js.undefined
  /** First name of this directory site contact. */
  var firstName: js.UndefOr[String] = js.undefined
  /** ID of this directory site contact. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#directorySiteContact". */
  var kind: js.UndefOr[String] = js.undefined
  /** Last name of this directory site contact. */
  var lastName: js.UndefOr[String] = js.undefined
  /** Phone number of this directory site contact. */
  var phone: js.UndefOr[String] = js.undefined
  /** Directory site contact role. */
  var role: js.UndefOr[String] = js.undefined
  /** Title or designation of this directory site contact. */
  var title: js.UndefOr[String] = js.undefined
  /** Directory site contact type. */
  var `type`: js.UndefOr[String] = js.undefined
}

object DirectorySiteContact {
  @scala.inline
  def apply(
    address: String = null,
    email: String = null,
    firstName: String = null,
    id: String = null,
    kind: String = null,
    lastName: String = null,
    phone: String = null,
    role: String = null,
    title: String = null,
    `type`: String = null
  ): DirectorySiteContact = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectorySiteContact]
  }
}

