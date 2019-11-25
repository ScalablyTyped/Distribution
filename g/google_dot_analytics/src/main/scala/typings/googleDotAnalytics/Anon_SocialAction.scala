package typings.googleDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SocialAction extends js.Object {
  var socialAction: String
  var socialNetwork: String
  var socialTarget: String
}

object Anon_SocialAction {
  @scala.inline
  def apply(socialAction: String, socialNetwork: String, socialTarget: String): Anon_SocialAction = {
    val __obj = js.Dynamic.literal(socialAction = socialAction.asInstanceOf[js.Any], socialNetwork = socialNetwork.asInstanceOf[js.Any], socialTarget = socialTarget.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SocialAction]
  }
}

