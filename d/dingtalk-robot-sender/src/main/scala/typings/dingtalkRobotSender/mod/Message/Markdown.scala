package typings.dingtalkRobotSender.mod.Message

import typings.dingtalkRobotSender.AnonAtMobilesIsAtAll
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.markdown
import typings.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Markdown extends MessageType {
  var markdown: AnonAtMobilesIsAtAll
  var msgtype: markdown
}

object Markdown {
  @scala.inline
  def apply(markdown: AnonAtMobilesIsAtAll, msgtype: markdown): Markdown = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Markdown]
  }
}

