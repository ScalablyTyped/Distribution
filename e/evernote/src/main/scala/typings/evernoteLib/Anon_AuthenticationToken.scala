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

