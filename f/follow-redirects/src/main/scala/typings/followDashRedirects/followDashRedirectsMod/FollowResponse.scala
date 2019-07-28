package typings.followDashRedirects.followDashRedirectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowResponse extends js.Object {
  var redirects: js.Array[Redirect]
  var responseUrl: String
}

object FollowResponse {
  @scala.inline
  def apply(redirects: js.Array[Redirect], responseUrl: String): FollowResponse = {
    val __obj = js.Dynamic.literal(redirects = redirects, responseUrl = responseUrl)
  
    __obj.asInstanceOf[FollowResponse]
  }
}

