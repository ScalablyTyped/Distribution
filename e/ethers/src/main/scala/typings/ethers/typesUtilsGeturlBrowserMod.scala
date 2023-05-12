package typings.ethers

import typings.ethers.typesUtilsFetchMod.FetchCancelSignal
import typings.ethers.typesUtilsFetchMod.FetchRequest
import typings.ethers.typesUtilsFetchMod.GetUrlResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsGeturlBrowserMod {
  
  @JSImport("ethers/types/utils/geturl-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUrl(req: FetchRequest): js.Promise[GetUrlResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(req.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetUrlResponse]]
  inline def getUrl(req: FetchRequest, _signal: FetchCancelSignal): js.Promise[GetUrlResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(req.asInstanceOf[js.Any], _signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetUrlResponse]]
  
  object global {
    
    @JSGlobal("Headers")
    @js.native
    open class Headers protected () extends StObject {
      def this(values: js.Array[js.Tuple2[String, String]]) = this()
      
      def forEach(func: js.Function2[/* v */ String, /* k */ String, Unit]): Unit = js.native
    }
    
    @JSGlobal("Response")
    @js.native
    open class Response () extends StObject {
      
      def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
      
      var headers: Headers = js.native
      
      var status: Double = js.native
      
      var statusText: String = js.native
    }
    
    inline def fetch(url: String, init: FetchInit): js.Promise[Response] = (js.Dynamic.global.applyDynamic("fetch")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
    
    trait FetchInit extends StObject {
      
      var body: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
      
      var headers: js.UndefOr[Headers] = js.undefined
      
      var method: js.UndefOr[String] = js.undefined
    }
    object FetchInit {
      
      inline def apply(): FetchInit = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FetchInit]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FetchInit] (val x: Self) extends AnyVal {
        
        inline def setBody(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      }
    }
  }
}
