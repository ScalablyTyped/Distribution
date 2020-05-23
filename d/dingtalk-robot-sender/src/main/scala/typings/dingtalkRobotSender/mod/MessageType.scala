package typings.dingtalkRobotSender.mod

import typings.dingtalkRobotSender.anon.AtMobiles
import typings.dingtalkRobotSender.anon.BtnOrientation
import typings.dingtalkRobotSender.anon.Content
import typings.dingtalkRobotSender.anon.IsAtAll
import typings.dingtalkRobotSender.anon.MessageURL_
import typings.dingtalkRobotSender.anon.MessageUrl
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
  def FeedCardItem(feedCard: MessageURL_, msgtype: feedCard): MessageType = {
    val __obj = js.Dynamic.literal(feedCard = feedCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Link(link: MessageUrl, msgtype: link): MessageType = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Text(msgtype: text, text: Content, at: AtMobiles = null): MessageType = {
    val __obj = js.Dynamic.literal(msgtype = msgtype.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Markdown(markdown: IsAtAll, msgtype: markdown): MessageType = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def ActionCard(actionCard: BtnOrientation, msgtype: actionCard): MessageType = {
    val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
}

