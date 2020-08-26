package typings.googleAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocialAction extends js.Object {
  var socialAction: String = js.native
  var socialNetwork: String = js.native
  var socialTarget: String = js.native
}

object SocialAction {
  @scala.inline
  def apply(socialAction: String, socialNetwork: String, socialTarget: String): SocialAction = {
    val __obj = js.Dynamic.literal(socialAction = socialAction.asInstanceOf[js.Any], socialNetwork = socialNetwork.asInstanceOf[js.Any], socialTarget = socialTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialAction]
  }
  @scala.inline
  implicit class SocialActionOps[Self <: SocialAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSocialAction(value: String): Self = this.set("socialAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocialNetwork(value: String): Self = this.set("socialNetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocialTarget(value: String): Self = this.set("socialTarget", value.asInstanceOf[js.Any])
  }
  
}

