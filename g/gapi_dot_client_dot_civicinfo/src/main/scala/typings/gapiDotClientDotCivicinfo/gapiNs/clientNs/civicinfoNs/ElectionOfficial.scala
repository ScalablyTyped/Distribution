package typings.gapiDotClientDotCivicinfo.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectionOfficial extends js.Object {
  /** The email address of the election official. */
  var emailAddress: js.UndefOr[String] = js.undefined
  /** The fax number of the election official. */
  var faxNumber: js.UndefOr[String] = js.undefined
  /** The full name of the election official. */
  var name: js.UndefOr[String] = js.undefined
  /** The office phone number of the election official. */
  var officePhoneNumber: js.UndefOr[String] = js.undefined
  /** The title of the election official. */
  var title: js.UndefOr[String] = js.undefined
}

object ElectionOfficial {
  @scala.inline
  def apply(
    emailAddress: String = null,
    faxNumber: String = null,
    name: String = null,
    officePhoneNumber: String = null,
    title: String = null
  ): ElectionOfficial = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (faxNumber != null) __obj.updateDynamic("faxNumber")(faxNumber)
    if (name != null) __obj.updateDynamic("name")(name)
    if (officePhoneNumber != null) __obj.updateDynamic("officePhoneNumber")(officePhoneNumber)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ElectionOfficial]
  }
}

