package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticationToken extends js.Object {
  var authenticationToken: java.lang.String
  var currentTime: scala.Double
  var expiration: scala.Double
  var noteStoreUrl: js.UndefOr[java.lang.String] = js.undefined
  var publicUserInfo: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.PublicUserInfo] = js.undefined
  var secondFactorDeliveryHint: js.UndefOr[java.lang.String] = js.undefined
  var secondFactorRequired: js.UndefOr[scala.Boolean] = js.undefined
  var user: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.User] = js.undefined
  var webApiUrlPrefix: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AuthenticationToken {
  @scala.inline
  def apply(
    authenticationToken: java.lang.String,
    currentTime: scala.Double,
    expiration: scala.Double,
    noteStoreUrl: java.lang.String = null,
    publicUserInfo: evernoteLib.evernoteMod.EvernoteNs.PublicUserInfo = null,
    secondFactorDeliveryHint: java.lang.String = null,
    secondFactorRequired: js.UndefOr[scala.Boolean] = js.undefined,
    user: evernoteLib.evernoteMod.EvernoteNs.User = null,
    webApiUrlPrefix: java.lang.String = null
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

