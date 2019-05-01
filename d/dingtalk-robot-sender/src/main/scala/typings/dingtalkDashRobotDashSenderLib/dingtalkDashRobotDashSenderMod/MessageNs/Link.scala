package typings
package dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderMod.MessageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link
  extends dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderMod.MessageType {
  var link: dingtalkDashRobotDashSenderLib.Anon_MessageUrl
  var msgtype: dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.link
}

object Link {
  @scala.inline
  def apply(
    link: dingtalkDashRobotDashSenderLib.Anon_MessageUrl,
    msgtype: dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.link
  ): Link = {
    val __obj = js.Dynamic.literal(link = link, msgtype = msgtype)
  
    __obj.asInstanceOf[Link]
  }
}

