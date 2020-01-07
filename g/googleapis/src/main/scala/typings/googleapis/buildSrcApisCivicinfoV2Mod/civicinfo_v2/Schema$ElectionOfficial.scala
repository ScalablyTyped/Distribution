package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about individual election officials.
  */
@js.native
trait Schema$ElectionOfficial extends js.Object {
  /**
    * The email address of the election official.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * The fax number of the election official.
    */
  var faxNumber: js.UndefOr[String] = js.native
  /**
    * The full name of the election official.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The office phone number of the election official.
    */
  var officePhoneNumber: js.UndefOr[String] = js.native
  /**
    * The title of the election official.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$ElectionOfficial {
  @scala.inline
  def apply(
    emailAddress: String = null,
    faxNumber: String = null,
    name: String = null,
    officePhoneNumber: String = null,
    title: String = null
  ): Schema$ElectionOfficial = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (faxNumber != null) __obj.updateDynamic("faxNumber")(faxNumber.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (officePhoneNumber != null) __obj.updateDynamic("officePhoneNumber")(officePhoneNumber.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ElectionOfficial]
  }
}

