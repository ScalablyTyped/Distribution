package typings.googleAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSocialAction extends js.Object {
  var socialAction: String
  var socialNetwork: String
  var socialTarget: String
}

object AnonSocialAction {
  @scala.inline
  def apply(socialAction: String, socialNetwork: String, socialTarget: String): AnonSocialAction = {
    val __obj = js.Dynamic.literal(socialAction = socialAction.asInstanceOf[js.Any], socialNetwork = socialNetwork.asInstanceOf[js.Any], socialTarget = socialTarget.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSocialAction]
  }
}

