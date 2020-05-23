package typings.googleAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialAction extends js.Object {
  var socialAction: String
  var socialNetwork: String
  var socialTarget: String
}

object SocialAction {
  @scala.inline
  def apply(socialAction: String, socialNetwork: String, socialTarget: String): SocialAction = {
    val __obj = js.Dynamic.literal(socialAction = socialAction.asInstanceOf[js.Any], socialNetwork = socialNetwork.asInstanceOf[js.Any], socialTarget = socialTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialAction]
  }
}

