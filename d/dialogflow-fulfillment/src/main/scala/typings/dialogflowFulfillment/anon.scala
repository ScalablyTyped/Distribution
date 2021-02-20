package typings.dialogflowFulfillment

import typings.dialogflowFulfillment.mod.Platforms
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ImageUrl extends StObject {
    
    var imageUrl: String = js.native
    
    var platform: Platforms = js.native
  }
  object ImageUrl {
    
    @scala.inline
    def apply(imageUrl: String, platform: Platforms): ImageUrl = {
      val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageUrl]
    }
    
    @scala.inline
    implicit class ImageUrlMutableBuilder[Self <: ImageUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: Platforms): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Lifespan extends StObject {
    
    var lifespan: Double = js.native
    
    var name: String = js.native
    
    var parameters: js.Object = js.native
  }
  object Lifespan {
    
    @scala.inline
    def apply(lifespan: Double, name: String, parameters: js.Object): Lifespan = {
      val __obj = js.Dynamic.literal(lifespan = lifespan.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lifespan]
    }
    
    @scala.inline
    implicit class LifespanMutableBuilder[Self <: Lifespan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLifespan(value: Double): Self = StObject.set(x, "lifespan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RawPayload extends StObject {
    
    var rawPayload: js.UndefOr[Boolean] = js.native
    
    var sendAsMessage: js.UndefOr[Boolean] = js.native
  }
  object RawPayload {
    
    @scala.inline
    def apply(): RawPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RawPayload]
    }
    
    @scala.inline
    implicit class RawPayloadMutableBuilder[Self <: RawPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRawPayload(value: Boolean): Self = StObject.set(x, "rawPayload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawPayloadUndefined: Self = StObject.set(x, "rawPayload", js.undefined)
      
      @scala.inline
      def setSendAsMessage(value: Boolean): Self = StObject.set(x, "sendAsMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendAsMessageUndefined: Self = StObject.set(x, "sendAsMessage", js.undefined)
    }
  }
  
  @js.native
  trait Request extends StObject {
    
    var request: Request_[ParamsDictionary, _, _, Query] = js.native
    
    var response: Response_[_] = js.native
  }
  object Request {
    
    @scala.inline
    def apply(request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: Request_[ParamsDictionary, _, _, Query]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Response_[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Text extends StObject {
    
    var text: String = js.native
    
    var url: String = js.native
  }
  object Text {
    
    @scala.inline
    def apply(text: String, url: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
