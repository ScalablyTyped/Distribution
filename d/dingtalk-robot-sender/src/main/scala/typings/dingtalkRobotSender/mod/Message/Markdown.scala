package typings.dingtalkRobotSender.mod.Message

import typings.dingtalkRobotSender.anon.IsAtAll
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.markdown
import typings.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Markdown extends MessageType {
  var markdown: IsAtAll
  var msgtype: markdown
}

object Markdown {
  @scala.inline
  def apply(markdown: IsAtAll, msgtype: markdown): Markdown = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Markdown]
  }
}

