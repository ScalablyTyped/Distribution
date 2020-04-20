package typings.firebaseMessaging.apiMod

import typings.firebaseMessaging.AnonApplicationPubKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiRequestBody extends js.Object {
  var web: AnonApplicationPubKey
}

object ApiRequestBody {
  @scala.inline
  def apply(web: AnonApplicationPubKey): ApiRequestBody = {
    val __obj = js.Dynamic.literal(web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiRequestBody]
  }
}

