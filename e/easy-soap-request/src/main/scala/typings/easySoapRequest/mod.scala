package typings.easySoapRequest

import typings.axios.mod.AxiosProxyConfig
import typings.axios.mod.AxiosRequestConfig
import typings.easySoapRequest.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @returns parsed from a AxiosResponse
    * @throws {any|AxiosError} response from AxiosError.response.data
    */
  inline def apply(options: Options): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  
  @JSImport("easy-soap-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Object of additional axios parameters.
      */
    var extraOpts: js.UndefOr[AxiosRequestConfig[Any]] = js.undefined
    
    /**
      * HTTP headers, can be string or object
      */
    var headers: js.UndefOr[js.Object | String] = js.undefined
    
    /**
      * Limit body size being sent(bytes)
      * @default Infinity
      */
    var maxBodyLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Limit content size being sent(bytes)
      * @default Infinity
      */
    var maxContentLength: js.UndefOr[Double] = js.undefined
    
    /**
      * HTTP request method
      * @default 'POST'
      */
    var method: js.UndefOr[String] = js.undefined
    
    /**
      * Object with proxy configuration
      */
    var proxy: js.UndefOr[AxiosProxyConfig] = js.undefined
    
    /**
      * Milliseconds before timing out request
      * @default 10000
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * endpoint URL
      */
    var url: String
    
    /**
      *  SOAP envelope, can be read from file or passed as string
      */
    var xml: String
  }
  object Options {
    
    inline def apply(url: String, xml: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExtraOpts(value: AxiosRequestConfig[Any]): Self = StObject.set(x, "extraOpts", value.asInstanceOf[js.Any])
      
      inline def setExtraOptsUndefined: Self = StObject.set(x, "extraOpts", js.undefined)
      
      inline def setHeaders(value: js.Object | String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMaxBodyLength(value: Double): Self = StObject.set(x, "maxBodyLength", value.asInstanceOf[js.Any])
      
      inline def setMaxBodyLengthUndefined: Self = StObject.set(x, "maxBodyLength", js.undefined)
      
      inline def setMaxContentLength(value: Double): Self = StObject.set(x, "maxContentLength", value.asInstanceOf[js.Any])
      
      inline def setMaxContentLengthUndefined: Self = StObject.set(x, "maxContentLength", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setProxy(value: AxiosProxyConfig): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response extends StObject {
    
    var response: Body
  }
  object Response {
    
    inline def apply(response: Body): Response = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      inline def setResponse(value: Body): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
