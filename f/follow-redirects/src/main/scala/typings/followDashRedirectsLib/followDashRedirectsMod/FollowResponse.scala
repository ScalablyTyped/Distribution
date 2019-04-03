package typings
package followDashRedirectsLib.followDashRedirectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowResponse extends js.Object {
  var redirects: js.Array[Redirect]
  var responseUrl: java.lang.String
}

object FollowResponse {
  @scala.inline
  def apply(redirects: js.Array[Redirect], responseUrl: java.lang.String): FollowResponse = {
    val __obj = js.Dynamic.literal(redirects = redirects, responseUrl = responseUrl)
  
    __obj.asInstanceOf[FollowResponse]
  }
}

