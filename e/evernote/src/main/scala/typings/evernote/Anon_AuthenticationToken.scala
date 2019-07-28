package typings.evernote

import typings.evernote.evernoteMod.EvernoteNs.PublicUserInfo
import typings.evernote.evernoteMod.EvernoteNs.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticationToken extends js.Object {
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

object Anon_AuthenticationToken {
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
  ): Anon_AuthenticationToken = {
    val __obj = js.Dynamic.literal(authenticationToken = authenticationToken, currentTime = currentTime, expiration = expiration)
    if (noteStoreUrl != null) __obj.updateDynamic("noteStoreUrl")(noteStoreUrl)
    if (publicUserInfo != null) __obj.updateDynamic("publicUserInfo")(publicUserInfo)
    if (secondFactorDeliveryHint != null) __obj.updateDynamic("secondFactorDeliveryHint")(secondFactorDeliveryHint)
    if (!js.isUndefined(secondFactorRequired)) __obj.updateDynamic("secondFactorRequired")(secondFactorRequired)
    if (user != null) __obj.updateDynamic("user")(user)
    if (webApiUrlPrefix != null) __obj.updateDynamic("webApiUrlPrefix")(webApiUrlPrefix)
    __obj.asInstanceOf[Anon_AuthenticationToken]
  }
}

