package typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message

import typings.dingtalkDashRobotDashSender.Anon_MessageUrl
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.MessageType
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends MessageType {
  var link: Anon_MessageUrl
  var msgtype: link
}

object Link {
  @scala.inline
  def apply(link: Anon_MessageUrl, msgtype: link): Link = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Link]
  }
}

