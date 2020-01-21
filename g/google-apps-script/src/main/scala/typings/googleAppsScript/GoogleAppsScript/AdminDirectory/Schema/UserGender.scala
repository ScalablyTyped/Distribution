package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserGender extends js.Object {
  var addressMeAs: js.UndefOr[String] = js.undefined
  var customGender: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object UserGender {
  @scala.inline
  def apply(addressMeAs: String = null, customGender: String = null, `type`: String = null): UserGender = {
    val __obj = js.Dynamic.literal()
    if (addressMeAs != null) __obj.updateDynamic("addressMeAs")(addressMeAs.asInstanceOf[js.Any])
    if (customGender != null) __obj.updateDynamic("customGender")(customGender.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserGender]
  }
}

