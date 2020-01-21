package typings.evernote

import typings.evernote.mod.Evernote.PublicUserInfo
import typings.evernote.mod.Evernote.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthenticationToken extends js.Object {
  var authenticationToken: String
  var currentTime: Double
  var expiration: Double
  var noteStoreUrl: js.UndefOr[String] = js.undefined
  var publicUserInfo: js.UndefOr[PublicUserInfo] = js.undefined
  var secondFactorDeliveryHint: js.UndefOr[String] = js.undefined
  var secondFactorRequired: js.UndefOr[Boolean] = js.undefined
  var user: js.UndefOr[User] = js.undefined
  var webApiUrlPrefix: js.UndefOr[String] = js.undefined
}

object AnonAuthenticationToken {
  @scala.inline
  def apply(
    authenticationToken: String,
    currentTime: Double,
    expiration: Double,
    noteStoreUrl: String = null,
    publicUserInfo: PublicUserInfo = null,
    secondFactorDeliveryHint: String = null,
    secondFactorRequired: js.UndefOr[Boolean] = js.undefined,
    user: User = null,
    webApiUrlPrefix: String = null
  ): AnonAuthenticationToken = {
    val __obj = js.Dynamic.literal(authenticationToken = authenticationToken.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any])
    if (noteStoreUrl != null) __obj.updateDynamic("noteStoreUrl")(noteStoreUrl.asInstanceOf[js.Any])
    if (publicUserInfo != null) __obj.updateDynamic("publicUserInfo")(publicUserInfo.asInstanceOf[js.Any])
    if (secondFactorDeliveryHint != null) __obj.updateDynamic("secondFactorDeliveryHint")(secondFactorDeliveryHint.asInstanceOf[js.Any])
    if (!js.isUndefined(secondFactorRequired)) __obj.updateDynamic("secondFactorRequired")(secondFactorRequired.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (webApiUrlPrefix != null) __obj.updateDynamic("webApiUrlPrefix")(webApiUrlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthenticationToken]
  }
}

