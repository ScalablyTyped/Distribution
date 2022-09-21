package typings.fetchRetry

import typings.fetchRetry.anon.FnCall
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fetch-retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fetch: FnCall): js.Function2[
    /* input */ RequestInfo, 
    /* init */ js.UndefOr[RequestInitWithRetry], 
    js.Promise[Response]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fetch.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* input */ RequestInfo, 
    /* init */ js.UndefOr[RequestInitWithRetry], 
    js.Promise[Response]
  ]]
  inline def default(fetch: FnCall, defaults: js.Object): js.Function2[
    /* input */ RequestInfo, 
    /* init */ js.UndefOr[RequestInitWithRetry], 
    js.Promise[Response]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fetch.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* input */ RequestInfo, 
    /* init */ js.UndefOr[RequestInitWithRetry], 
    js.Promise[Response]
  ]]
  
  type RequestDelayFunction = js.Function3[
    /* attempt */ Double, 
    /* error */ js.Error | Null, 
    /* response */ Response | Null, 
    Double
  ]
  
  trait RequestInitWithRetry
    extends StObject
       with RequestInit {
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var retryDelay: js.UndefOr[Double | RequestDelayFunction] = js.undefined
    
    var retryOn: js.UndefOr[js.Array[Double] | RequestRetryOnFunction] = js.undefined
  }
  object RequestInitWithRetry {
    
    inline def apply(): RequestInitWithRetry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInitWithRetry]
    }
    
    extension [Self <: RequestInitWithRetry](x: Self) {
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setRetryDelay(value: Double | RequestDelayFunction): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayFunction3(
        value: (/* attempt */ Double, /* error */ js.Error | Null, /* response */ Response | Null) => Double
      ): Self = StObject.set(x, "retryDelay", js.Any.fromFunction3(value))
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setRetryOn(value: js.Array[Double] | RequestRetryOnFunction): Self = StObject.set(x, "retryOn", value.asInstanceOf[js.Any])
      
      inline def setRetryOnFunction3(
        value: (/* attempt */ Double, /* error */ js.Error | Null, /* response */ Response | Null) => Boolean | js.Promise[Boolean]
      ): Self = StObject.set(x, "retryOn", js.Any.fromFunction3(value))
      
      inline def setRetryOnUndefined: Self = StObject.set(x, "retryOn", js.undefined)
      
      inline def setRetryOnVarargs(value: Double*): Self = StObject.set(x, "retryOn", js.Array(value*))
    }
  }
  
  type RequestRetryOnFunction = js.Function3[
    /* attempt */ Double, 
    /* error */ js.Error | Null, 
    /* response */ Response | Null, 
    Boolean | js.Promise[Boolean]
  ]
}
