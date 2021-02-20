package typings.dingtalkRobotSender

import typings.axios.mod.AxiosResponse
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
import typings.dingtalkRobotSender.mod.Message.FeedCardItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dingtalk-robot-sender", JSImport.Namespace)
  @js.native
  class ^ protected () extends ChatBot {
    def this(options: BaseUrlOptions) = this()
    /**
      * 机器人工厂，所有的消息推送项目都会调用 this.webhook 接口进行发送
      *
      * @param options.webhook 完整的接口地址
      * @param options.baseUrl 接口地址
      * @param options.accessToken accessToken
      * @param options.httpclient 例如 urllib / axios
      */
    def this(options: WebHookOptions) = this()
  }
  
  @js.native
  trait BaseUrlOptions extends StObject {
    
    var accessToken: String = js.native
    
    var baseUrl: String = js.native
    
    var httpclient: js.UndefOr[js.Any] = js.native
  }
  object BaseUrlOptions {
    
    @scala.inline
    def apply(accessToken: String, baseUrl: String): BaseUrlOptions = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseUrlOptions]
    }
    
    @scala.inline
    implicit class BaseUrlOptionsMutableBuilder[Self <: BaseUrlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpclient(value: js.Any): Self = StObject.set(x, "httpclient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpclientUndefined: Self = StObject.set(x, "httpclient", js.undefined)
    }
  }
  
  @js.native
  trait ChatBot extends StObject {
    
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
  
  object Message {
    
    @js.native
    trait ActionCard extends MessageType {
      
      var actionCard: BtnOrientation = js.native
      
      var msgtype: actionCard = js.native
    }
    object ActionCard {
      
      @scala.inline
      def apply(actionCard: BtnOrientation, msgtype: actionCard): ActionCard = {
        val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
        __obj.asInstanceOf[ActionCard]
      }
      
      @scala.inline
      implicit class ActionCardMutableBuilder[Self <: ActionCard] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActionCard(value: BtnOrientation): Self = StObject.set(x, "actionCard", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMsgtype(value: actionCard): Self = StObject.set(x, "msgtype", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait FeedCardItem extends MessageType {
      
      var feedCard: MessageURL_ = js.native
      
      var msgtype: feedCard = js.native
    }
    object FeedCardItem {
      
      @scala.inline
      def apply(feedCard: MessageURL_, msgtype: feedCard): FeedCardItem = {
        val __obj = js.Dynamic.literal(feedCard = feedCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
        __obj.asInstanceOf[FeedCardItem]
      }
      
      @scala.inline
      implicit class FeedCardItemMutableBuilder[Self <: FeedCardItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFeedCard(value: MessageURL_): Self = StObject.set(x, "feedCard", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMsgtype(value: feedCard): Self = StObject.set(x, "msgtype", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Link extends MessageType {
      
      var link: MessageUrl = js.native
      
      var msgtype: link = js.native
    }
    object Link {
      
      @scala.inline
      def apply(link: MessageUrl, msgtype: link): Link = {
        val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
        __obj.asInstanceOf[Link]
      }
      
      @scala.inline
      implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLink(value: MessageUrl): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMsgtype(value: link): Self = StObject.set(x, "msgtype", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Markdown extends MessageType {
      
      var markdown: IsAtAll = js.native
      
      var msgtype: markdown = js.native
    }
    object Markdown {
      
      @scala.inline
      def apply(markdown: IsAtAll, msgtype: markdown): Markdown = {
        val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
        __obj.asInstanceOf[Markdown]
      }
      
      @scala.inline
      implicit class MarkdownMutableBuilder[Self <: Markdown] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMarkdown(value: IsAtAll): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMsgtype(value: markdown): Self = StObject.set(x, "msgtype", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Text extends MessageType {
      
      var at: js.UndefOr[AtMobiles] = js.native
      
      var msgtype: text = js.native
      
      var text: Content = js.native
    }
    object Text {
      
      @scala.inline
      def apply(msgtype: text, text: Content): Text = {
        val __obj = js.Dynamic.literal(msgtype = msgtype.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[Text]
      }
      
      @scala.inline
      implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAt(value: AtMobiles): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
        
        @scala.inline
        def setMsgtype(value: text): Self = StObject.set(x, "msgtype", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setText(value: Content): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dingtalkRobotSender.mod.Message.Text
    - typings.dingtalkRobotSender.mod.Message.Link
    - typings.dingtalkRobotSender.mod.Message.Markdown
    - typings.dingtalkRobotSender.mod.Message.ActionCard
    - typings.dingtalkRobotSender.mod.Message.FeedCardItem
  */
  trait MessageType extends StObject
  object MessageType {
    
    @scala.inline
    def ActionCard(actionCard: BtnOrientation, msgtype: actionCard): typings.dingtalkRobotSender.mod.Message.ActionCard = {
      val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dingtalkRobotSender.mod.Message.ActionCard]
    }
    
    @scala.inline
    def FeedCardItem(feedCard: MessageURL_, msgtype: feedCard): typings.dingtalkRobotSender.mod.Message.FeedCardItem = {
      val __obj = js.Dynamic.literal(feedCard = feedCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dingtalkRobotSender.mod.Message.FeedCardItem]
    }
    
    @scala.inline
    def Link(link: MessageUrl, msgtype: link): typings.dingtalkRobotSender.mod.Message.Link = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dingtalkRobotSender.mod.Message.Link]
    }
    
    @scala.inline
    def Markdown(markdown: IsAtAll, msgtype: markdown): typings.dingtalkRobotSender.mod.Message.Markdown = {
      val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dingtalkRobotSender.mod.Message.Markdown]
    }
    
    @scala.inline
    def Text(msgtype: text, text: Content): typings.dingtalkRobotSender.mod.Message.Text = {
      val __obj = js.Dynamic.literal(msgtype = msgtype.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dingtalkRobotSender.mod.Message.Text]
    }
  }
  
  @js.native
  trait WebHookOptions extends StObject {
    
    var httpclient: js.UndefOr[js.Any] = js.native
    
    var webhook: String = js.native
  }
  object WebHookOptions {
    
    @scala.inline
    def apply(webhook: String): WebHookOptions = {
      val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebHookOptions]
    }
    
    @scala.inline
    implicit class WebHookOptionsMutableBuilder[Self <: WebHookOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpclient(value: js.Any): Self = StObject.set(x, "httpclient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpclientUndefined: Self = StObject.set(x, "httpclient", js.undefined)
      
      @scala.inline
      def setWebhook(value: String): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    }
  }
}
