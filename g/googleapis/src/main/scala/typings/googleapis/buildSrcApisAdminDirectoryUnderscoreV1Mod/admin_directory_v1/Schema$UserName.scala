package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for name of a user in Directory API.
  */
@js.native
trait Schema$UserName extends js.Object {
  /**
    * Last Name
    */
  var familyName: js.UndefOr[String] = js.native
  /**
    * Full Name
    */
  var fullName: js.UndefOr[String] = js.native
  /**
    * First Name
    */
  var givenName: js.UndefOr[String] = js.native
}

object Schema$UserName {
  @scala.inline
  def apply(familyName: String = null, fullName: String = null, givenName: String = null): Schema$UserName = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserName]
  }
}

