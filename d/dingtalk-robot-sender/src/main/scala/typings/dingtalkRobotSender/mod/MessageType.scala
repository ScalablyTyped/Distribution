package typings.dingtalkRobotSender.mod

import typings.dingtalkRobotSender.Anon0
import typings.dingtalkRobotSender.AnonAtMobiles
import typings.dingtalkRobotSender.AnonAtMobilesIsAtAll
import typings.dingtalkRobotSender.AnonContent
import typings.dingtalkRobotSender.AnonMessageUrl
import typings.dingtalkRobotSender.Anon_MessageURL
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.actionCard
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.feedCard
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.link
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.markdown
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dingtalkRobotSender.mod.Message.Text
  - typings.dingtalkRobotSender.mod.Message.Link
  - typings.dingtalkRobotSender.mod.Message.Markdown
  - typings.dingtalkRobotSender.mod.Message.ActionCard
  - typings.dingtalkRobotSender.mod.Message.FeedCardItem
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  def FeedCardItem(feedCard: Anon_MessageURL, msgtype: feedCard): MessageType = {
    val __obj = js.Dynamic.literal(feedCard = feedCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def ActionCard(actionCard: Anon0, msgtype: actionCard): MessageType = {
    val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Text(msgtype: text, text: AnonContent, at: AnonAtMobiles = null): MessageType = {
    val __obj = js.Dynamic.literal(msgtype = msgtype.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Markdown(markdown: AnonAtMobilesIsAtAll, msgtype: markdown): MessageType = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Link(link: AnonMessageUrl, msgtype: link): MessageType = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
}

