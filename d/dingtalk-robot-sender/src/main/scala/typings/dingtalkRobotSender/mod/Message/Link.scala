package typings.dingtalkRobotSender.mod.Message

import typings.dingtalkRobotSender.anon.MessageUrl
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.link
import typings.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends MessageType {
  var link: MessageUrl
  var msgtype: link
}

object Link {
  @scala.inline
  def apply(link: MessageUrl, msgtype: link): Link = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

