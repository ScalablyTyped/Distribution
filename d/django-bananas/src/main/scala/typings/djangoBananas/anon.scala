package typings.djangoBananas

import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action extends StObject {
    
    var action: String
    
    var location: Any
  }
  object Action {
    
    inline def apply(action: String, location: Any): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Any): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait Patch extends StObject {
    
    var patch: js.UndefOr[Boolean] = js.undefined
    
    var rewrite: js.UndefOr[Boolean] = js.undefined
  }
  object Patch {
    
    inline def apply(): Patch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Patch]
    }
    
    extension [Self <: Patch](x: Self) {
      
      inline def setPatch(value: Boolean): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setRewrite(value: Boolean): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
      
      inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
    }
  }
  
  trait RequestInterceptor extends StObject {
    
    var requestInterceptor: js.UndefOr[js.Function1[/* v */ Request, Request]] = js.undefined
    
    var responseInterceptor: js.UndefOr[js.Function1[/* v */ Response, Response]] = js.undefined
    
    var url: String
  }
  object RequestInterceptor {
    
    inline def apply(url: String): RequestInterceptor = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestInterceptor]
    }
    
    extension [Self <: RequestInterceptor](x: Self) {
      
      inline def setRequestInterceptor(value: /* v */ Request => Request): Self = StObject.set(x, "requestInterceptor", js.Any.fromFunction1(value))
      
      inline def setRequestInterceptorUndefined: Self = StObject.set(x, "requestInterceptor", js.undefined)
      
      inline def setResponseInterceptor(value: /* v */ Response => Response): Self = StObject.set(x, "responseInterceptor", js.Any.fromFunction1(value))
      
      inline def setResponseInterceptorUndefined: Self = StObject.set(x, "responseInterceptor", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
