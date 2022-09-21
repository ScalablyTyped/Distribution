package typings.dingtalkRobotSender

import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.`0`
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActionURL extends StObject {
    
    var actionURL: String
    
    var title: String
  }
  object ActionURL {
    
    inline def apply(actionURL: String, title: String): ActionURL = {
      val __obj = js.Dynamic.literal(actionURL = actionURL.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionURL]
    }
    
    extension [Self <: ActionURL](x: Self) {
      
      inline def setActionURL(value: String): Self = StObject.set(x, "actionURL", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait AtMobiles extends StObject {
    
    var atMobiles: js.Array[String]
    
    var isAtAll: Boolean
  }
  object AtMobiles {
    
    inline def apply(atMobiles: js.Array[String], isAtAll: Boolean): AtMobiles = {
      val __obj = js.Dynamic.literal(atMobiles = atMobiles.asInstanceOf[js.Any], isAtAll = isAtAll.asInstanceOf[js.Any])
      __obj.asInstanceOf[AtMobiles]
    }
    
    extension [Self <: AtMobiles](x: Self) {
      
      inline def setAtMobiles(value: js.Array[String]): Self = StObject.set(x, "atMobiles", value.asInstanceOf[js.Any])
      
      inline def setAtMobilesVarargs(value: String*): Self = StObject.set(x, "atMobiles", js.Array(value*))
      
      inline def setIsAtAll(value: Boolean): Self = StObject.set(x, "isAtAll", value.asInstanceOf[js.Any])
    }
  }
  
  trait BtnOrientation extends StObject {
    
    var btnOrientation: `0` | `1`
    
    var btns: js.UndefOr[js.Array[ActionURL]] = js.undefined
    
    var hideAvatar: `0` | `1`
    
    var singleTitle: js.UndefOr[String] = js.undefined
    
    var singleURL: js.UndefOr[String] = js.undefined
    
    var text: String
    
    var title: String
  }
  object BtnOrientation {
    
    inline def apply(btnOrientation: `0` | `1`, hideAvatar: `0` | `1`, text: String, title: String): BtnOrientation = {
      val __obj = js.Dynamic.literal(btnOrientation = btnOrientation.asInstanceOf[js.Any], hideAvatar = hideAvatar.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[BtnOrientation]
    }
    
    extension [Self <: BtnOrientation](x: Self) {
      
      inline def setBtnOrientation(value: `0` | `1`): Self = StObject.set(x, "btnOrientation", value.asInstanceOf[js.Any])
      
      inline def setBtns(value: js.Array[ActionURL]): Self = StObject.set(x, "btns", value.asInstanceOf[js.Any])
      
      inline def setBtnsUndefined: Self = StObject.set(x, "btns", js.undefined)
      
      inline def setBtnsVarargs(value: ActionURL*): Self = StObject.set(x, "btns", js.Array(value*))
      
      inline def setHideAvatar(value: `0` | `1`): Self = StObject.set(x, "hideAvatar", value.asInstanceOf[js.Any])
      
      inline def setSingleTitle(value: String): Self = StObject.set(x, "singleTitle", value.asInstanceOf[js.Any])
      
      inline def setSingleTitleUndefined: Self = StObject.set(x, "singleTitle", js.undefined)
      
      inline def setSingleURL(value: String): Self = StObject.set(x, "singleURL", value.asInstanceOf[js.Any])
      
      inline def setSingleURLUndefined: Self = StObject.set(x, "singleURL", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Content extends StObject {
    
    var content: String
  }
  object Content {
    
    inline def apply(content: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsAtAll extends StObject {
    
    var atMobiles: js.Array[String]
    
    var isAtAll: Boolean
    
    var text: String
    
    var title: String
  }
  object IsAtAll {
    
    inline def apply(atMobiles: js.Array[String], isAtAll: Boolean, text: String, title: String): IsAtAll = {
      val __obj = js.Dynamic.literal(atMobiles = atMobiles.asInstanceOf[js.Any], isAtAll = isAtAll.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsAtAll]
    }
    
    extension [Self <: IsAtAll](x: Self) {
      
      inline def setAtMobiles(value: js.Array[String]): Self = StObject.set(x, "atMobiles", value.asInstanceOf[js.Any])
      
      inline def setAtMobilesVarargs(value: String*): Self = StObject.set(x, "atMobiles", js.Array(value*))
      
      inline def setIsAtAll(value: Boolean): Self = StObject.set(x, "isAtAll", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageURL_ extends StObject {
    
    var messageURL: String
    
    var picURL: String
    
    var title: String
  }
  object MessageURL_ {
    
    inline def apply(messageURL: String, picURL: String, title: String): MessageURL_ = {
      val __obj = js.Dynamic.literal(messageURL = messageURL.asInstanceOf[js.Any], picURL = picURL.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageURL_]
    }
    
    extension [Self <: MessageURL_](x: Self) {
      
      inline def setMessageURL(value: String): Self = StObject.set(x, "messageURL", value.asInstanceOf[js.Any])
      
      inline def setPicURL(value: String): Self = StObject.set(x, "picURL", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageUrl extends StObject {
    
    var messageUrl: String
    
    var picUrl: String
    
    var text: String
    
    var title: String
  }
  object MessageUrl {
    
    inline def apply(messageUrl: String, picUrl: String, text: String, title: String): MessageUrl = {
      val __obj = js.Dynamic.literal(messageUrl = messageUrl.asInstanceOf[js.Any], picUrl = picUrl.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageUrl]
    }
    
    extension [Self <: MessageUrl](x: Self) {
      
      inline def setMessageUrl(value: String): Self = StObject.set(x, "messageUrl", value.asInstanceOf[js.Any])
      
      inline def setPicUrl(value: String): Self = StObject.set(x, "picUrl", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
