package typings.firebaseAuthTypes

import typings.firebaseAuthTypes.mod.MultiFactorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var email: js.UndefOr[String | Null] = js.undefined
  var fromEmail: js.UndefOr[String | Null] = js.undefined
  var multiFactorInfo: js.UndefOr[MultiFactorInfo | Null] = js.undefined
  var previousEmail: js.UndefOr[String | Null] = js.undefined
}

object AnonEmail {
  @scala.inline
  def apply(
    email: String = null,
    fromEmail: String = null,
    multiFactorInfo: MultiFactorInfo = null,
    previousEmail: String = null
  ): AnonEmail = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (fromEmail != null) __obj.updateDynamic("fromEmail")(fromEmail.asInstanceOf[js.Any])
    if (multiFactorInfo != null) __obj.updateDynamic("multiFactorInfo")(multiFactorInfo.asInstanceOf[js.Any])
    if (previousEmail != null) __obj.updateDynamic("previousEmail")(previousEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}

