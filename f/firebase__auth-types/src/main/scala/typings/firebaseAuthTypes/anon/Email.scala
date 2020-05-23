package typings.firebaseAuthTypes.anon

import typings.firebaseAuthTypes.mod.MultiFactorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var email: js.UndefOr[String | Null] = js.undefined
  var fromEmail: js.UndefOr[String | Null] = js.undefined
  var multiFactorInfo: js.UndefOr[MultiFactorInfo | Null] = js.undefined
  var previousEmail: js.UndefOr[String | Null] = js.undefined
}

object Email {
  @scala.inline
  def apply(
    email: js.UndefOr[Null | String] = js.undefined,
    fromEmail: js.UndefOr[Null | String] = js.undefined,
    multiFactorInfo: js.UndefOr[Null | MultiFactorInfo] = js.undefined,
    previousEmail: js.UndefOr[Null | String] = js.undefined
  ): Email = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(email)) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(fromEmail)) __obj.updateDynamic("fromEmail")(fromEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(multiFactorInfo)) __obj.updateDynamic("multiFactorInfo")(multiFactorInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(previousEmail)) __obj.updateDynamic("previousEmail")(previousEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

