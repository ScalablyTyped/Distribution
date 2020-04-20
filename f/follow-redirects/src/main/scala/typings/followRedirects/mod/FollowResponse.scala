package typings.followRedirects.mod

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
    val __obj = js.Dynamic.literal(redirects = redirects.asInstanceOf[js.Any], responseUrl = responseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowResponse]
  }
}

