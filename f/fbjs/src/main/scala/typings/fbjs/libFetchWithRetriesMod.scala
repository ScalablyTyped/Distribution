package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFetchWithRetriesMod {
  
  inline def apply(uri: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].apply(uri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def apply(uri: String, initWithRetries: InitWithRetries): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply(uri.asInstanceOf[js.Any], initWithRetries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  @JSImport("fbjs/lib/fetchWithRetries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait InitWithRetries extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var cache: js.UndefOr[String | Null] = js.undefined
    
    var credentials: js.UndefOr[String | Null] = js.undefined
    
    var fetchTimeout: js.UndefOr[Double | Null] = js.undefined
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var method: js.UndefOr[String | Null] = js.undefined
    
    var mode: js.UndefOr[String | Null] = js.undefined
    
    var retryDelays: js.UndefOr[js.Array[Double] | Null] = js.undefined
  }
  object InitWithRetries {
    
    inline def apply(): InitWithRetries = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitWithRetries]
    }
    
    extension [Self <: InitWithRetries](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheNull: Self = StObject.set(x, "cache", null)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsNull: Self = StObject.set(x, "credentials", null)
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setFetchTimeout(value: Double): Self = StObject.set(x, "fetchTimeout", value.asInstanceOf[js.Any])
      
      inline def setFetchTimeoutNull: Self = StObject.set(x, "fetchTimeout", null)
      
      inline def setFetchTimeoutUndefined: Self = StObject.set(x, "fetchTimeout", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodNull: Self = StObject.set(x, "method", null)
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeNull: Self = StObject.set(x, "mode", null)
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRetryDelays(value: js.Array[Double]): Self = StObject.set(x, "retryDelays", value.asInstanceOf[js.Any])
      
      inline def setRetryDelaysNull: Self = StObject.set(x, "retryDelays", null)
      
      inline def setRetryDelaysUndefined: Self = StObject.set(x, "retryDelays", js.undefined)
      
      inline def setRetryDelaysVarargs(value: Double*): Self = StObject.set(x, "retryDelays", js.Array(value*))
    }
  }
}
