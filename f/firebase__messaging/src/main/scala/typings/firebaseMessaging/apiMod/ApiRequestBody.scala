package typings.firebaseMessaging.apiMod

import typings.firebaseMessaging.anon.ApplicationPubKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiRequestBody extends js.Object {
  var web: ApplicationPubKey
}

object ApiRequestBody {
  @scala.inline
  def apply(web: ApplicationPubKey): ApiRequestBody = {
    val __obj = js.Dynamic.literal(web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiRequestBody]
  }
}

