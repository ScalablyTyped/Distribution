package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.Agent
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsApiRequestMod {
  
  @JSImport("firebase-admin/lib/utils/api-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/utils/api-request", "ApiSettings")
  @js.native
  open class ApiSettings protected () extends StObject {
    def this(endpoint: String) = this()
    def this(endpoint: String, httpMethod: HttpMethod) = this()
    
    /* private */ var endpoint: Any = js.native
    
    /** @returns The backend API endpoint. */
    def getEndpoint(): String = js.native
    
    /** @returns The request HTTP method. */
    def getHttpMethod(): HttpMethod = js.native
    
    /** @returns The request validator. */
    def getRequestValidator(): ApiCallbackFunction = js.native
    
    /** @returns The response validator. */
    def getResponseValidator(): ApiCallbackFunction = js.native
    
    /* private */ var httpMethod: Any = js.native
    
    /* private */ var requestValidator: Any = js.native
    
    /* private */ var responseValidator: Any = js.native
    
    /**
      * @param requestValidator - The request validator.
      * @returns The current API settings instance.
      */
    def setRequestValidator(): ApiSettings = js.native
    def setRequestValidator(requestValidator: ApiCallbackFunction): ApiSettings = js.native
    
    /**
      * @param responseValidator - The response validator.
      * @returns The current API settings instance.
      */
    def setResponseValidator(): ApiSettings = js.native
    def setResponseValidator(responseValidator: ApiCallbackFunction): ApiSettings = js.native
  }
  
  @JSImport("firebase-admin/lib/utils/api-request", "AuthorizedHttpClient")
  @js.native
  open class AuthorizedHttpClient protected () extends HttpClient {
    def this(app: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseApp */ Any) = this()
    
    /* private */ val app: Any = js.native
    
    /* protected */ def getToken(): js.Promise[String] = js.native
  }
  
  @JSImport("firebase-admin/lib/utils/api-request", "ExponentialBackoffPoller")
  @js.native
  open class ExponentialBackoffPoller[T] () extends EventEmitter {
    def this(initialPollingDelayMillis: Double) = this()
    def this(initialPollingDelayMillis: Double, maxPollingDelayMillis: Double) = this()
    def this(initialPollingDelayMillis: Unit, maxPollingDelayMillis: Double) = this()
    def this(initialPollingDelayMillis: Double, maxPollingDelayMillis: Double, masterTimeoutMillis: Double) = this()
    def this(initialPollingDelayMillis: Double, maxPollingDelayMillis: Unit, masterTimeoutMillis: Double) = this()
    def this(initialPollingDelayMillis: Unit, maxPollingDelayMillis: Double, masterTimeoutMillis: Double) = this()
    def this(initialPollingDelayMillis: Unit, maxPollingDelayMillis: Unit, masterTimeoutMillis: Double) = this()
    
    /* private */ var completed: Any = js.native
    
    /* private */ var getPollingDelayMillis: Any = js.native
    
    /* private */ val initialPollingDelayMillis: Any = js.native
    
    /* private */ var markCompleted: Any = js.native
    
    /* private */ val masterTimeoutMillis: Any = js.native
    
    /* private */ var masterTimer: Any = js.native
    
    /* private */ val maxPollingDelayMillis: Any = js.native
    
    /* private */ var numTries: Any = js.native
    
    /**
      * Poll the provided callback with exponential backoff.
      *
      * @param callback - The callback to be called for each poll. If the
      *     callback resolves to a falsey value, polling will continue. Otherwise, the truthy
      *     resolution will be used to resolve the promise returned by this method.
      * @returns A Promise which resolves to the truthy value returned by the provided
      *     callback when polling is complete.
      */
    def poll(callback: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
    /* private */ var pollCallback: Any = js.native
    
    /* private */ var reject: Any = js.native
    
    /* private */ var repoll: Any = js.native
    
    /* private */ var repollTimer: Any = js.native
    
    /* private */ var resolve: Any = js.native
  }
  
  @JSImport("firebase-admin/lib/utils/api-request", "HttpClient")
  @js.native
  open class HttpClient () extends StObject {
    def this(retry: RetryConfig) = this()
    
    /* private */ var backOffDelayMillis: Any = js.native
    
    /* private */ var createHttpResponse: Any = js.native
    
    /**
      * Checks if a failed request is eligible for a retry, and if so returns the duration to wait before initiating
      * the retry.
      *
      * @param retryAttempts - Number of retries completed up to now.
      * @param err - The last encountered error.
      * @returns A 2-tuple where the 1st element is the duration to wait before another retry, and the
      *     2nd element is a boolean indicating whether the request is eligible for a retry or not.
      */
    /* private */ var getRetryDelayMillis: Any = js.native
    
    /* private */ var isRetryEligible: Any = js.native
    
    /**
      * Parses the Retry-After HTTP header as a milliseconds value. Return value is negative if the Retry-After header
      * contains an expired timestamp or otherwise malformed.
      */
    /* private */ var parseRetryAfterIntoMillis: Any = js.native
    
    /* private */ val retry: Any = js.native
    
    /**
      * Sends an HTTP request to a remote server. If the server responds with a successful response (2xx), the returned
      * promise resolves with an HttpResponse. If the server responds with an error (3xx, 4xx, 5xx), the promise rejects
      * with an HttpError. In case of all other errors, the promise rejects with a FirebaseAppError. If a request fails
      * due to a low-level network error, transparently retries the request once before rejecting the promise.
      *
      * If the request data is specified as an object, it will be serialized into a JSON string. The application/json
      * content-type header will also be automatically set in this case. For all other payload types, the content-type
      * header should be explicitly set by the caller. To send a JSON leaf value (e.g. "foo", 5), parse it into JSON,
      * and pass as a string or a Buffer along with the appropriate content-type header.
      *
      * @param config - HTTP request to be sent.
      * @returns A promise that resolves with the response details.
      */
    def send(config: HttpRequestConfig): js.Promise[HttpResponse] = js.native
    
    /**
      * Sends an HTTP request. In the event of an error, retries the HTTP request according to the
      * RetryConfig set on the HttpClient.
      *
      * @param config - HTTP request to be sent.
      * @param retryAttempts - Number of retries performed up to now.
      * @returns A promise that resolves with the response details.
      */
    /* private */ var sendWithRetry: Any = js.native
    
    /* private */ var waitForRetry: Any = js.native
  }
  
  @JSImport("firebase-admin/lib/utils/api-request", "HttpError")
  @js.native
  open class HttpError protected ()
    extends StObject
       with Error {
    def this(response: HttpResponse) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val response: HttpResponse = js.native
  }
  
  inline def defaultRetryConfig(): RetryConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryConfig")().asInstanceOf[RetryConfig]
  
  inline def parseHttpResponse(response: String, config: HttpRequestConfig): HttpResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHttpResponse")(response.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[HttpResponse]
  inline def parseHttpResponse(response: Buffer, config: HttpRequestConfig): HttpResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHttpResponse")(response.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[HttpResponse]
  
  type ApiCallbackFunction = js.Function1[/* data */ js.Object, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAdmin.firebaseAdminStrings.GET
    - typings.firebaseAdmin.firebaseAdminStrings.POST
    - typings.firebaseAdmin.firebaseAdminStrings.PUT
    - typings.firebaseAdmin.firebaseAdminStrings.DELETE
    - typings.firebaseAdmin.firebaseAdminStrings.PATCH
    - typings.firebaseAdmin.firebaseAdminStrings.HEAD
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def DELETE: typings.firebaseAdmin.firebaseAdminStrings.DELETE = "DELETE".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.DELETE]
    
    inline def GET: typings.firebaseAdmin.firebaseAdminStrings.GET = "GET".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.GET]
    
    inline def HEAD: typings.firebaseAdmin.firebaseAdminStrings.HEAD = "HEAD".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.HEAD]
    
    inline def PATCH: typings.firebaseAdmin.firebaseAdminStrings.PATCH = "PATCH".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.PATCH]
    
    inline def POST: typings.firebaseAdmin.firebaseAdminStrings.POST = "POST".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.POST]
    
    inline def PUT: typings.firebaseAdmin.firebaseAdminStrings.PUT = "PUT".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.PUT]
  }
  
  trait HttpRequestConfig extends StObject {
    
    var data: js.UndefOr[String | js.Object | Buffer | Null] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var httpAgent: js.UndefOr[Agent] = js.undefined
    
    var method: HttpMethod
    
    /** Connect and read timeout (in milliseconds) for the outgoing request. */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** Target URL of the request. Should be a well-formed URL including protocol, hostname, port and path. */
    var url: String
  }
  object HttpRequestConfig {
    
    inline def apply(method: HttpMethod, url: String): HttpRequestConfig = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpRequestConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpRequestConfig] (val x: Self) extends AnyVal {
      
      inline def setData(value: String | js.Object | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHttpAgent(value: Agent): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
      
      inline def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
      
      inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpResponse extends StObject {
    
    /** Response data as a parsed JSON object. */
    val data: js.UndefOr[Any] = js.undefined
    
    val headers: Any
    
    /**
      * Indicates if the response content is JSON-formatted or not. If true, data field can be used
      * to retrieve the content as a parsed JSON object.
      */
    def isJson(): Boolean
    
    /** For multipart responses, the payloads of individual parts. */
    val multipart: js.UndefOr[js.Array[Buffer]] = js.undefined
    
    val status: Double
    
    /** Response data as a raw string. */
    val text: js.UndefOr[String] = js.undefined
  }
  object HttpResponse {
    
    inline def apply(headers: Any, isJson: () => Boolean, status: Double): HttpResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], isJson = js.Any.fromFunction0(isJson), status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpResponse] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setIsJson(value: () => Boolean): Self = StObject.set(x, "isJson", js.Any.fromFunction0(value))
      
      inline def setMultipart(value: js.Array[Buffer]): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
      
      inline def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
      
      inline def setMultipartVarargs(value: Buffer*): Self = StObject.set(x, "multipart", js.Array(value*))
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait RetryConfig extends StObject {
    
    /**
      * The multiplier for exponential back off. The retry delay is calculated in seconds using the formula
      * `(2^n) * backOffFactor`, where n is the number of retries performed so far. When the backOffFactor is set
      * to 0, retries are not delayed. When the backOffFactor is 1, retry duration is doubled each iteration.
      */
    var backOffFactor: js.UndefOr[Double] = js.undefined
    
    /** Low-level I/O error codes that should be retried. */
    var ioErrorCodes: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Maximum duration to wait before initiating a retry. */
    var maxDelayInMillis: Double
    
    /** Maximum number of times to retry a given request. */
    var maxRetries: Double
    
    /** HTTP status codes that should be retried. */
    var statusCodes: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object RetryConfig {
    
    inline def apply(maxDelayInMillis: Double, maxRetries: Double): RetryConfig = {
      val __obj = js.Dynamic.literal(maxDelayInMillis = maxDelayInMillis.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryConfig] (val x: Self) extends AnyVal {
      
      inline def setBackOffFactor(value: Double): Self = StObject.set(x, "backOffFactor", value.asInstanceOf[js.Any])
      
      inline def setBackOffFactorUndefined: Self = StObject.set(x, "backOffFactor", js.undefined)
      
      inline def setIoErrorCodes(value: js.Array[String]): Self = StObject.set(x, "ioErrorCodes", value.asInstanceOf[js.Any])
      
      inline def setIoErrorCodesUndefined: Self = StObject.set(x, "ioErrorCodes", js.undefined)
      
      inline def setIoErrorCodesVarargs(value: String*): Self = StObject.set(x, "ioErrorCodes", js.Array(value*))
      
      inline def setMaxDelayInMillis(value: Double): Self = StObject.set(x, "maxDelayInMillis", value.asInstanceOf[js.Any])
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setStatusCodes(value: js.Array[Double]): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
      
      inline def setStatusCodesUndefined: Self = StObject.set(x, "statusCodes", js.undefined)
      
      inline def setStatusCodesVarargs(value: Double*): Self = StObject.set(x, "statusCodes", js.Array(value*))
    }
  }
}
