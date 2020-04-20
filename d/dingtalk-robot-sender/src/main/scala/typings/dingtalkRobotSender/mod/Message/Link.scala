package typings.dingtalkRobotSender.mod.Message

import typings.dingtalkRobotSender.AnonMessageUrl
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.link
import typings.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends MessageType {
  var link: AnonMessageUrl
  var msgtype: link
}

object Link {
  @scala.inline
  def apply(link: AnonMessageUrl, msgtype: link): Link = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

