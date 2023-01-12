package typings.dialogflowFulfillment

import typings.dialogflowFulfillment.mod.Platforms
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ImageUrl extends StObject {
    
    var imageUrl: String
    
    var platform: Platforms
  }
  object ImageUrl {
    
    inline def apply(imageUrl: String, platform: Platforms): ImageUrl = {
      val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageUrl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageUrl] (val x: Self) extends AnyVal {
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: Platforms): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  trait Lifespan extends StObject {
    
    var lifespan: Double
    
    var name: String
    
    var parameters: js.Object
  }
  object Lifespan {
    
    inline def apply(lifespan: Double, name: String, parameters: js.Object): Lifespan = {
      val __obj = js.Dynamic.literal(lifespan = lifespan.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lifespan]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lifespan] (val x: Self) extends AnyVal {
      
      inline def setLifespan(value: Double): Self = StObject.set(x, "lifespan", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawPayload extends StObject {
    
    var rawPayload: js.UndefOr[Boolean] = js.undefined
    
    var sendAsMessage: js.UndefOr[Boolean] = js.undefined
  }
  object RawPayload {
    
    inline def apply(): RawPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RawPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawPayload] (val x: Self) extends AnyVal {
      
      inline def setRawPayload(value: Boolean): Self = StObject.set(x, "rawPayload", value.asInstanceOf[js.Any])
      
      inline def setRawPayloadUndefined: Self = StObject.set(x, "rawPayload", js.undefined)
      
      inline def setSendAsMessage(value: Boolean): Self = StObject.set(x, "sendAsMessage", value.asInstanceOf[js.Any])
      
      inline def setSendAsMessageUndefined: Self = StObject.set(x, "sendAsMessage", js.undefined)
    }
  }
  
  trait Request extends StObject {
    
    var request: Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]
    
    var response: Response_[Any, Record[String, Any]]
  }
  object Request {
    
    inline def apply(
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      response: Response_[Any, Record[String, Any]]
    ): Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setRequest(
        value: Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]
      ): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response_[Any, Record[String, Any]]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var text: String
    
    var url: String
  }
  object Text {
    
    inline def apply(text: String, url: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
