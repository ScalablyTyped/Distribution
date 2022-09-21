package typings.gaxios

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.gaxiosStrings.CONNECT
import typings.gaxios.gaxiosStrings.DELETE
import typings.gaxios.gaxiosStrings.GET
import typings.gaxios.gaxiosStrings.HEAD
import typings.gaxios.gaxiosStrings.OPTIONS
import typings.gaxios.gaxiosStrings.PATCH
import typings.gaxios.gaxiosStrings.POST
import typings.gaxios.gaxiosStrings.PUT
import typings.gaxios.gaxiosStrings.TRACE
import typings.gaxios.gaxiosStrings.arraybuffer
import typings.gaxios.gaxiosStrings.blob
import typings.gaxios.gaxiosStrings.json
import typings.gaxios.gaxiosStrings.stream
import typings.gaxios.gaxiosStrings.text
import typings.node.httpMod.Agent
import typings.node.urlMod.URL_
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("gaxios/build/src/common", "GaxiosError")
  @js.native
  open class GaxiosError[T] protected ()
    extends StObject
       with Error {
    def this(message: String, options: GaxiosOptions, response: GaxiosResponse[T]) = this()
    
    var code: js.UndefOr[String] = js.native
    
    var config: GaxiosOptions = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var response: js.UndefOr[GaxiosResponse[T]] = js.native
  }
  
  @js.native
  trait FetchHeaders extends StObject {
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    def forEach(callbackfn: js.Function2[/* value */ String, /* key */ String, Unit]): Unit = js.native
    def forEach(callbackfn: js.Function2[/* value */ String, /* key */ String, Unit], thisArg: Any): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def has(name: String): Boolean = js.native
    
    def set(name: String, value: String): Unit = js.native
  }
  
  type FetchImplementation = js.Function2[
    /* input */ FetchRequestInfo, 
    /* init */ js.UndefOr[FetchRequestInit], 
    js.Promise[FetchResponse]
  ]
  
  type FetchRequestInfo = Any
  
  trait FetchRequestInit extends StObject {
    
    var method: js.UndefOr[String] = js.undefined
  }
  object FetchRequestInit {
    
    inline def apply(): FetchRequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchRequestInit]
    }
    
    extension [Self <: FetchRequestInit](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  trait FetchResponse extends StObject {
    
    def arrayBuffer(): js.Promise[Any]
    
    def blob(): js.Promise[Any]
    
    val body: Any | Null
    
    val headers: FetchHeaders
    
    def json(): js.Promise[Any]
    
    val status: Double
    
    val statusText: String
    
    def text(): js.Promise[String]
    
    val url: String
  }
  object FetchResponse {
    
    inline def apply(
      arrayBuffer: () => js.Promise[Any],
      blob: () => js.Promise[Any],
      headers: FetchHeaders,
      json: () => js.Promise[Any],
      status: Double,
      statusText: String,
      text: () => js.Promise[String],
      url: String
    ): FetchResponse = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any], body = null)
      __obj.asInstanceOf[FetchResponse]
    }
    
    extension [Self <: FetchResponse](x: Self) {
      
      inline def setArrayBuffer(value: () => js.Promise[Any]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      inline def setBlob(value: () => js.Promise[Any]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setHeaders(value: FetchHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJson(value: () => js.Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait GaxiosOptions extends StObject {
    
    /**
      * Optional method to override making the actual HTTP request. Useful
      * for writing tests.
      */
    var adapter: js.UndefOr[
        js.Function2[
          /* options */ this.type, 
          /* defaultAdapter */ js.Function1[/* options */ this.type, GaxiosPromise[Any]], 
          GaxiosPromise[Any]
        ]
      ] = js.undefined
    
    var agent: js.UndefOr[Agent | (js.Function1[/* parsedUrl */ URL_, Agent])] = js.undefined
    
    var baseURL: js.UndefOr[String] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[Any] = js.undefined
    
    var cert: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * Implementation of `fetch` to use when making the API call. By default,
      * will use the browser context if available, and fall back to `node-fetch`
      * in node.js otherwise.
      */
    var fetchImplementation: js.UndefOr[FetchImplementation] = js.undefined
    
    var follow: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * The maximum size of the http response content in bytes allowed.
      */
    var maxContentLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of redirects to follow. Defaults to 20.
      */
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[GET | HEAD | POST | DELETE | PUT | CONNECT | OPTIONS | TRACE | PATCH] = js.undefined
    
    /**
      * @deprecated ignored
      */
    var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ Any, Unit]] = js.undefined
    
    var params: js.UndefOr[Any] = js.undefined
    
    var paramsSerializer: js.UndefOr[js.Function1[/* params */ StringDictionary[String | Double], String]] = js.undefined
    
    var responseType: js.UndefOr[arraybuffer | blob | json | text | stream] = js.undefined
    
    var retry: js.UndefOr[Boolean] = js.undefined
    
    var retryConfig: js.UndefOr[RetryConfig] = js.undefined
    
    var signal: js.UndefOr[Any] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var validateStatus: js.UndefOr[js.Function1[/* status */ Double, Boolean]] = js.undefined
  }
  object GaxiosOptions {
    
    inline def apply(): GaxiosOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GaxiosOptions]
    }
    
    extension [Self <: GaxiosOptions](x: Self) {
      
      inline def setAdapter(
        value: (GaxiosOptions, /* defaultAdapter */ js.Function1[GaxiosOptions, GaxiosPromise[Any]]) => GaxiosPromise[Any]
      ): Self = StObject.set(x, "adapter", js.Any.fromFunction2(value))
      
      inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      inline def setAgent(value: Agent | (js.Function1[/* parsedUrl */ URL_, Agent])): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentFunction1(value: /* parsedUrl */ URL_ => Agent): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFetchImplementation(
        value: (/* input */ FetchRequestInfo, /* init */ js.UndefOr[FetchRequestInit]) => js.Promise[FetchResponse]
      ): Self = StObject.set(x, "fetchImplementation", js.Any.fromFunction2(value))
      
      inline def setFetchImplementationUndefined: Self = StObject.set(x, "fetchImplementation", js.undefined)
      
      inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMaxContentLength(value: Double): Self = StObject.set(x, "maxContentLength", value.asInstanceOf[js.Any])
      
      inline def setMaxContentLengthUndefined: Self = StObject.set(x, "maxContentLength", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setMethod(value: GET | HEAD | POST | DELETE | PUT | CONNECT | OPTIONS | TRACE | PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOnUploadProgress(value: /* progressEvent */ Any => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
      
      inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsSerializer(value: /* params */ StringDictionary[String | Double] => String): Self = StObject.set(x, "paramsSerializer", js.Any.fromFunction1(value))
      
      inline def setParamsSerializerUndefined: Self = StObject.set(x, "paramsSerializer", js.undefined)
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setResponseType(value: arraybuffer | blob | json | text | stream): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setRetry(value: Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryConfig(value: RetryConfig): Self = StObject.set(x, "retryConfig", value.asInstanceOf[js.Any])
      
      inline def setRetryConfigUndefined: Self = StObject.set(x, "retryConfig", js.undefined)
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setSignal(value: Any): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setValidateStatus(value: /* status */ Double => Boolean): Self = StObject.set(x, "validateStatus", js.Any.fromFunction1(value))
      
      inline def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
    }
  }
  
  type GaxiosPromise[T] = js.Promise[GaxiosResponse[T]]
  
  trait GaxiosResponse[T] extends StObject {
    
    var config: GaxiosOptions
    
    var data: T
    
    var headers: Headers
    
    var request: GaxiosXMLHttpRequest
    
    var status: Double
    
    var statusText: String
  }
  object GaxiosResponse {
    
    inline def apply[T](
      config: GaxiosOptions,
      data: T,
      headers: Headers,
      request: GaxiosXMLHttpRequest,
      status: Double,
      statusText: String
    ): GaxiosResponse[T] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaxiosResponse[T]]
    }
    
    extension [Self <: GaxiosResponse[?], T](x: Self & GaxiosResponse[T]) {
      
      inline def setConfig(value: GaxiosOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: GaxiosXMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
  
  trait GaxiosXMLHttpRequest extends StObject {
    
    var responseURL: String
  }
  object GaxiosXMLHttpRequest {
    
    inline def apply(responseURL: String): GaxiosXMLHttpRequest = {
      val __obj = js.Dynamic.literal(responseURL = responseURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaxiosXMLHttpRequest]
    }
    
    extension [Self <: GaxiosXMLHttpRequest](x: Self) {
      
      inline def setResponseURL(value: String): Self = StObject.set(x, "responseURL", value.asInstanceOf[js.Any])
    }
  }
  
  type Headers = StringDictionary[Any]
  
  trait RetryConfig extends StObject {
    
    /**
      * The number of retries already attempted.
      */
    var currentRetryAttempt: js.UndefOr[Double] = js.undefined
    
    /**
      * The HTTP Methods that will be automatically retried.
      * Defaults to ['GET','PUT','HEAD','OPTIONS','DELETE']
      */
    var httpMethodsToRetry: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * When there is no response, the number of retries to attempt. Defaults to 2.
      */
    var noResponseRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * Function to invoke when a retry attempt is made.
      */
    var onRetryAttempt: js.UndefOr[js.Function1[/* err */ GaxiosError[Any], js.Promise[Unit] | Unit]] = js.undefined
    
    /**
      * The number of times to retry the request.  Defaults to 3.
      */
    var retry: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of time to initially delay the retry, in ms.  Defaults to 100ms.
      */
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Function to invoke which determines if you should retry
      */
    var shouldRetry: js.UndefOr[js.Function1[/* err */ GaxiosError[Any], js.Promise[Boolean] | Boolean]] = js.undefined
    
    /**
      * The HTTP response status codes that will automatically be retried.
      * Defaults to: [[100, 199], [429, 429], [500, 599]]
      */
    var statusCodesToRetry: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  }
  object RetryConfig {
    
    inline def apply(): RetryConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryConfig]
    }
    
    extension [Self <: RetryConfig](x: Self) {
      
      inline def setCurrentRetryAttempt(value: Double): Self = StObject.set(x, "currentRetryAttempt", value.asInstanceOf[js.Any])
      
      inline def setCurrentRetryAttemptUndefined: Self = StObject.set(x, "currentRetryAttempt", js.undefined)
      
      inline def setHttpMethodsToRetry(value: js.Array[String]): Self = StObject.set(x, "httpMethodsToRetry", value.asInstanceOf[js.Any])
      
      inline def setHttpMethodsToRetryUndefined: Self = StObject.set(x, "httpMethodsToRetry", js.undefined)
      
      inline def setHttpMethodsToRetryVarargs(value: String*): Self = StObject.set(x, "httpMethodsToRetry", js.Array(value*))
      
      inline def setNoResponseRetries(value: Double): Self = StObject.set(x, "noResponseRetries", value.asInstanceOf[js.Any])
      
      inline def setNoResponseRetriesUndefined: Self = StObject.set(x, "noResponseRetries", js.undefined)
      
      inline def setOnRetryAttempt(value: /* err */ GaxiosError[Any] => js.Promise[Unit] | Unit): Self = StObject.set(x, "onRetryAttempt", js.Any.fromFunction1(value))
      
      inline def setOnRetryAttemptUndefined: Self = StObject.set(x, "onRetryAttempt", js.undefined)
      
      inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setShouldRetry(value: /* err */ GaxiosError[Any] => js.Promise[Boolean] | Boolean): Self = StObject.set(x, "shouldRetry", js.Any.fromFunction1(value))
      
      inline def setShouldRetryUndefined: Self = StObject.set(x, "shouldRetry", js.undefined)
      
      inline def setStatusCodesToRetry(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "statusCodesToRetry", value.asInstanceOf[js.Any])
      
      inline def setStatusCodesToRetryUndefined: Self = StObject.set(x, "statusCodesToRetry", js.undefined)
      
      inline def setStatusCodesToRetryVarargs(value: js.Array[Double]*): Self = StObject.set(x, "statusCodesToRetry", js.Array(value*))
    }
  }
}
