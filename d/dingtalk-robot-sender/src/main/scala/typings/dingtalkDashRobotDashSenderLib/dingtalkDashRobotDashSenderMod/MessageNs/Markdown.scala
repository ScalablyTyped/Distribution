package typings
package dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderMod.MessageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Markdown
  extends dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderMod.MessageType {
  var markdown: dingtalkDashRobotDashSenderLib.Anon_AtMobilesIsAtAll
  var msgtype: dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.markdown
}

object Markdown {
  @scala.inline
  def apply(
    markdown: dingtalkDashRobotDashSenderLib.Anon_AtMobilesIsAtAll,
    msgtype: dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.markdown
  ): Markdown = {
    val __obj = js.Dynamic.literal(markdown = markdown, msgtype = msgtype)
  
    __obj.asInstanceOf[Markdown]
  }
}

