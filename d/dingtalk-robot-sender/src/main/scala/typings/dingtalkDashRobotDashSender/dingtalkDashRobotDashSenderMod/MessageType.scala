package typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod

import typings.dingtalkDashRobotDashSender.Anon_0
import typings.dingtalkDashRobotDashSender.Anon_AtMobiles
import typings.dingtalkDashRobotDashSender.Anon_AtMobilesIsAtAll
import typings.dingtalkDashRobotDashSender.Anon_Content
import typings.dingtalkDashRobotDashSender.Anon_MessageURL
import typings.dingtalkDashRobotDashSender.Anon_MessageUrl
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.actionCard
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.feedCard
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.link
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.markdown
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message.Text
  - typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message.Link
  - typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message.Markdown
  - typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message.ActionCard
  - typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message.FeedCardItem
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  def FeedCardItem(feedCard: Anon_MessageURL, msgtype: feedCard): MessageType = {
    val __obj = js.Dynamic.literal(feedCard = feedCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def ActionCard(actionCard: Anon_0, msgtype: actionCard): MessageType = {
    val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Text(msgtype: text, text: Anon_Content, at: Anon_AtMobiles = null): MessageType = {
    val __obj = js.Dynamic.literal(msgtype = msgtype.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Markdown(markdown: Anon_AtMobilesIsAtAll, msgtype: markdown): MessageType = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Link(link: Anon_MessageUrl, msgtype: link): MessageType = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
}

