package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectionOfficial extends js.Object {
  /** The email address of the election official. */
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  /** The fax number of the election official. */
  var faxNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The full name of the election official. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The office phone number of the election official. */
  var officePhoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The title of the election official. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ElectionOfficial {
  @scala.inline
  def apply(
    emailAddress: java.lang.String = null,
    faxNumber: java.lang.String = null,
    name: java.lang.String = null,
    officePhoneNumber: java.lang.String = null,
    title: java.lang.String = null
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

