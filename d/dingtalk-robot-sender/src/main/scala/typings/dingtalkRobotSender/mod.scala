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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dingtalk-robot-sender", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ChatBot {
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
  
  trait BaseUrlOptions extends StObject {
    
    var accessToken: String
    
    var baseUrl: String
    
    var httpclient: js.UndefOr[Any] = js.undefined
  }
  object BaseUrlOptions {
    
    inline def apply(accessToken: String, baseUrl: String): BaseUrlOptions = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseUrlOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseUrlOptions] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setHttpclient(value: Any): Self = StObject.set(x, "httpclient", value.asInstanceOf[js.Any])
      
      inline def setHttpclientUndefined: Self = StObject.set(x, "httpclient", js.undefined)
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
    def actionCard(card: BtnOrientation): js.Promise[AxiosResponse[Any, Any]] = js.native
    
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
    def feedCard(links: js.Array[FeedCardItem]): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    /**
      * 发送单个图文链接
      *
      * @param link.title 标题
      * @param link.text 消息内容
      * @param link.messageUrl 跳转的Url
      * @param link.picUrl 图片的链接
      * @return
      */
    def link(link: MessageUrl): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    /**
      * 发送Markdown消息
      *
      * @param title 标题
      * @param text 消息内容(支持Markdown)
      * @return
      */
    def markdown(title: String, text: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def markdown(title: String, text: String, at: AtMobiles): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    /**
      * 发送钉钉消息
      *
      * @param content 发动的消息对象
      * @return
      */
    def send(content: MessageType): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    /**
      * 发送纯文本消息，支持@群内成员
      *
      * @param content 消息内容
      * @param at 群内@成员的手机号
      * @return
      */
    def text(content: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def text(content: String, at: js.UndefOr[AtMobiles]): js.Promise[AxiosResponse[Any, Any]] = js.native
  }
  
  object Message {
    
    trait ActionCard
      extends StObject
         with MessageType {
      
      var actionCard: BtnOrientation
      
      var msgtype: actionCard
    }
    object ActionCard {
      
      inline def apply(actionCard: BtnOrientation): ActionCard = {
        val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = "actionCard")
        __obj.asInstanceOf[ActionCard]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ActionCard] (val x: Self) extends AnyVal {
        
        inline def setActionCard(value: BtnOrientation): Self = StObject.set(x, "actionCard", value.asInstanceOf[js.Any])
        
        inline def setMsgtype(value: actionCard): Self = StObject.set(x, "msgtype", value.asInstanceOf[js.Any])
      }
    }
    
    trait FeedCardItem
      extends StObject
         with MessageType {
      
      var feedCard: MessageURL_
      
      var msgtype: feedCard
    }
    object FeedCardItem {
      
      inline def apply(feedCard: MessageURL_): FeedCardItem = {
        val __obj = js.Dynamic.literal(feedCard = feedCard.asInstanceOf[js.Any], msgtype = "feedCard")
        __obj.asInstanceOf[FeedCardItem]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FeedCardItem] (val x: Self) extends AnyVal {
        
        inline def setFeedCard(value: MessageURL_): Self = StObject.set(x, "feedCard", value.asInstanceOf[js.Any])
        
        inline def setMsgtype(value: feedCard): Self = StObject.set(x, "msgtype", value.asInstanceOf[js.Any])
      }
    }
    
    trait Link
      extends StObject
         with MessageType {
      
      var link: MessageUrl
      
      var msgtype: link
    }
    object Link {
      
      inline def apply(link: MessageUrl): Link = {
        val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = "link")
        __obj.asInstanceOf[Link]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
        
        inline def setLink(value: MessageUrl): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setMsgtype(value: link): Self = StObject.set(x, "msgtype", value.asInstanceOf[js.Any])
      }
    }
    
    trait Markdown
      extends StObject
         with MessageType {
      
      var markdown: IsAtAll
      
      var msgtype: markdown
    }
    object Markdown {
      
      inline def apply(markdown: IsAtAll): Markdown = {
        val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], msgtype = "markdown")
        __obj.asInstanceOf[Markdown]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Markdown] (val x: Self) extends AnyVal {
        
        inline def setMarkdown(value: IsAtAll): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
        
        inline def setMsgtype(value: markdown): Self = StObject.set(x, "msgtype", value.asInstanceOf[js.Any])
      }
    }
    
    trait Text
      extends StObject
         with MessageType {
      
      var at: js.UndefOr[AtMobiles] = js.undefined
      
      var msgtype: text
      
      var text: Content
    }
    object Text {
      
      inline def apply(text: Content): Text = {
        val __obj = js.Dynamic.literal(msgtype = "text", text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[Text]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
        
        inline def setAt(value: AtMobiles): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
        
        inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
        
        inline def setMsgtype(value: text): Self = StObject.set(x, "msgtype", value.asInstanceOf[js.Any])
        
        inline def setText(value: Content): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
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
    
    inline def ActionCard(actionCard: BtnOrientation): typings.dingtalkRobotSender.mod.Message.ActionCard = {
      val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = "actionCard")
      __obj.asInstanceOf[typings.dingtalkRobotSender.mod.Message.ActionCard]
    }
    
    inline def FeedCardItem(feedCard: MessageURL_): typings.dingtalkRobotSender.mod.Message.FeedCardItem = {
      val __obj = js.Dynamic.literal(feedCard = feedCard.asInstanceOf[js.Any], msgtype = "feedCard")
      __obj.asInstanceOf[typings.dingtalkRobotSender.mod.Message.FeedCardItem]
    }
    
    inline def Link(link: MessageUrl): typings.dingtalkRobotSender.mod.Message.Link = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = "link")
      __obj.asInstanceOf[typings.dingtalkRobotSender.mod.Message.Link]
    }
    
    inline def Markdown(markdown: IsAtAll): typings.dingtalkRobotSender.mod.Message.Markdown = {
      val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], msgtype = "markdown")
      __obj.asInstanceOf[typings.dingtalkRobotSender.mod.Message.Markdown]
    }
    
    inline def Text(text: Content): typings.dingtalkRobotSender.mod.Message.Text = {
      val __obj = js.Dynamic.literal(msgtype = "text", text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dingtalkRobotSender.mod.Message.Text]
    }
  }
  
  trait WebHookOptions extends StObject {
    
    var httpclient: js.UndefOr[Any] = js.undefined
    
    var webhook: String
  }
  object WebHookOptions {
    
    inline def apply(webhook: String): WebHookOptions = {
      val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebHookOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebHookOptions] (val x: Self) extends AnyVal {
      
      inline def setHttpclient(value: Any): Self = StObject.set(x, "httpclient", value.asInstanceOf[js.Any])
      
      inline def setHttpclientUndefined: Self = StObject.set(x, "httpclient", js.undefined)
      
      inline def setWebhook(value: String): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    }
  }
}
