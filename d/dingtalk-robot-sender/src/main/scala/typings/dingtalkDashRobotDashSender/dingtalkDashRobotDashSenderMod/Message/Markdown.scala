package typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message

import typings.dingtalkDashRobotDashSender.Anon_AtMobilesIsAtAll
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.MessageType
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.markdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Markdown extends MessageType {
  var markdown: Anon_AtMobilesIsAtAll
  var msgtype: markdown
}

object Markdown {
  @scala.inline
  def apply(markdown: Anon_AtMobilesIsAtAll, msgtype: markdown): Markdown = {
    val __obj = js.Dynamic.literal(markdown = markdown, msgtype = msgtype)
  
    __obj.asInstanceOf[Markdown]
  }
}

