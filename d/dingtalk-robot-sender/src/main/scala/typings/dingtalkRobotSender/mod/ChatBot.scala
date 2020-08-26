package typings.dingtalkRobotSender.mod

import typings.axios.mod.AxiosResponse
import typings.dingtalkRobotSender.anon.AtMobiles
import typings.dingtalkRobotSender.anon.BtnOrientation
import typings.dingtalkRobotSender.anon.MessageUrl
import typings.dingtalkRobotSender.mod.Message.FeedCardItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatBot extends js.Object {
  /**
    * 发送actionCard(动作卡片)
    * Ps: 支持多个按钮，支持Markdown
    *
    * @param card.title 标题
    * @param card.text 消息内容
    * @param card.hideAvatar 隐藏发送者头像(1隐藏，0显示，默认为0)
    * @param card.btnOrientation 按钮排列的方向(0竖直，1横向，默认为0)
    * @param card.btn.title 某个按钮标题
    * @param card.btn.actionURL 某个按钮链接
    * @return
    */
  def actionCard(card: BtnOrientation): js.Promise[AxiosResponse[_]] = js.native
  /**
    * 发送feedCard，支持多图文链接
    * Ps: links可包含多个link，建议不要超过4个
    *
    * @param link.title 标题
    * @param link.text 消息内容
    * @param link.messageUrl 跳转的Url
    * @param link.picUrl 图片的链接
    * @return
    */
  def feedCard(links: js.Array[FeedCardItem]): js.Promise[AxiosResponse[_]] = js.native
  /**
    * 发送单个图文链接
    *
    * @param link.title 标题
    * @param link.text 消息内容
    * @param link.messageUrl 跳转的Url
    * @param link.picUrl 图片的链接
    * @return
    */
  def link(link: MessageUrl): js.Promise[AxiosResponse[_]] = js.native
  /**
    * 发送Markdown消息
    *
    * @param title 标题
    * @param text 消息内容(支持Markdown)
    * @return
    */
  def markdown(title: String, text: String): js.Promise[AxiosResponse[_]] = js.native
  def markdown(title: String, text: String, at: AtMobiles): js.Promise[AxiosResponse[_]] = js.native
  /**
    * 发送钉钉消息
    *
    * @param content 发动的消息对象
    * @return
    */
  def send(content: MessageType): js.Promise[AxiosResponse[_]] = js.native
  /**
    * 发送纯文本消息，支持@群内成员
    *
    * @param content 消息内容
    * @param at 群内@成员的手机号
    * @return
    */
  def text(content: String): js.Promise[AxiosResponse[_]] = js.native
  def text(content: String, at: js.UndefOr[AtMobiles]): js.Promise[AxiosResponse[_]] = js.native
}

