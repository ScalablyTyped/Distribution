package typings.ethers

import typings.ethers.anon.ReadonlyUint8Array
import typings.std.Iterable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsFetchMod {
  
  @JSImport("ethers/types/utils/fetch", "FetchCancelSignal")
  @js.native
  open class FetchCancelSignal protected () extends StObject {
    def this(request: FetchRequest) = this()
    
    def addListener(listener: js.Function0[Unit]): Unit = js.native
    
    def cancelled: Boolean = js.native
    
    def checkSignal(): Unit = js.native
    
    /* private */ var `private`: Any = js.native
  }
  
  @JSImport("ethers/types/utils/fetch", "FetchRequest")
  @js.native
  open class FetchRequest protected ()
    extends StObject
       with Iterable[js.Tuple2[/* key */ String, /* value */ String]] {
    /**
      *  Create a new FetchRequest instance with default values.
      *
      *  Once created, each property may be set before issuing a
      *  ``.send()`` to make the request.
      */
    def this(url: String) = this()
    
    /**
      *  Enable and request gzip-encoded responses. The response will
      *  automatically be decompressed. //(default: true)//
      */
    def allowGzip: Boolean = js.native
    def allowGzip_=(value: Boolean): Unit = js.native
    
    /**
      *  Allow ``Authentication`` credentials to be sent over insecure
      *  channels. //(default: false)//
      */
    def allowInsecureAuthentication: Boolean = js.native
    def allowInsecureAuthentication_=(value: Boolean): Unit = js.native
    
    /**
      *  The fetch body, if any, to send as the request body. //(default: null)//
      *
      *  When setting a body, the intrinsic ``Content-Type`` is automatically
      *  set and will be used if **not overridden** by setting a custom
      *  header.
      *
      *  If %%body%% is null, the body is cleared (along with the
      *  intrinsic ``Content-Type``) and the .
      *
      *  If %%body%% is a string, the intrincis ``Content-Type`` is set to
      *  ``text/plain``.
      *
      *  If %%body%% is a Uint8Array, the intrincis ``Content-Type`` is set to
      *  ``application/octet-stream``.
      *
      *  If %%body%% is any other object, the intrincis ``Content-Type`` is
      *  set to ``application/json``.
      */
    def body: Null | js.typedarray.Uint8Array = js.native
    def body_=(body: Null | String | js.Object | ReadonlyUint8Array): Unit = js.native
    
    /**
      *  Cancels the inflight response, causing a ``CANCELLED``
      *  error to be rejected from the [[send]].
      */
    def cancel(): Unit = js.native
    
    /**
      *  Clear all headers, resetting all intrinsic headers.
      */
    def clearHeaders(): Unit = js.native
    
    /**
      *  The value that will be sent for the ``Authorization`` header.
      *
      *  To set the credentials, use the ``setCredentials`` method.
      */
    def credentials: Null | String = js.native
    
    /**
      *  Get the header for %%key%%, ignoring case.
      */
    def getHeader(key: String): String = js.native
    
    /**
      *  Returns true if the request has a body.
      */
    def hasBody(): /* is ethers.anon.FetchRequestbodyUint8Arra */ Boolean = js.native
    
    /**
      *  The headers that will be used when requesting the URI. All
      *  keys are lower-case.
      *
      *  This object is a copy, so any chnages will **NOT** be reflected
      *  in the ``FetchRequest``.
      *
      *  To set a header entry, use the ``setHeader`` method.
      */
    def headers: Record[String, String] = js.native
    
    /**
      *  The HTTP method to use when requesting the URI. If no method
      *  has been explicitly set, then ``GET`` is used if the body is
      *  null and ``POST`` otherwise.
      */
    def method: String = js.native
    def method_=(method: Null | String): Unit = js.native
    
    /**
      *  This function is called prior to each request, for example
      *  during a redirection or retry in case of server throttling.
      *
      *  This offers an opportunity to populate headers or update
      *  content before sending a request.
      */
    def preflightFunc: Null | FetchPreflightFunc = js.native
    def preflightFunc_=(preflight: Null | FetchPreflightFunc): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      *  This function is called after each response, offering an
      *  opportunity to provide client-level throttling or updating
      *  response data.
      *
      *  Any error thrown in this causes the ``send()`` to throw.
      *
      *  To schedule a retry attempt (assuming the maximum retry limit
      *  has not been reached), use [[response.throwThrottleError]].
      */
    def processFunc: Null | FetchProcessFunc = js.native
    def processFunc_=(process: Null | FetchProcessFunc): Unit = js.native
    
    /**
      *  Returns a new [[FetchRequest]] that represents the redirection
      *  to %%location%%.
      */
    def redirect(location: String): FetchRequest = js.native
    
    /**
      *  This function is called on each retry attempt.
      */
    def retryFunc: Null | FetchRetryFunc = js.native
    def retryFunc_=(retry: Null | FetchRetryFunc): Unit = js.native
    
    /**
      *  Resolves to the response by sending the request.
      */
    def send(): js.Promise[FetchResponse] = js.native
    
    /**
      *  Sets an ``Authorization`` for %%username%% with %%password%%.
      */
    def setCredentials(username: String, password: String): Unit = js.native
    
    /**
      *  Set the header for %%key%% to %%value%%. All values are coerced
      *  to a string.
      */
    def setHeader(key: String, value: String): Unit = js.native
    def setHeader(key: String, value: Double): Unit = js.native
    
    /**
      *  Update the throttle parameters used to determine maximum
      *  attempts and exponential-backoff properties.
      */
    def setThrottleParams(params: FetchThrottleParams): Unit = js.native
    
    /**
      *  The timeout (in milliseconds) to wait for a complere response.
      *  //(default: 5 minutes)//
      */
    def timeout: Double = js.native
    def timeout_=(timeout: Double): Unit = js.native
    
    /**
      *  The fetch URI to requrest.
      */
    def url: String = js.native
    def url_=(url: String): Unit = js.native
  }
  /* static members */
  object FetchRequest {
    
    @JSImport("ethers/types/utils/fetch", "FetchRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a function that can "fetch" data URIs.
      *
      *  Note that this is automatically done internally to support
      *  data URIs, so it is not necessary to register it.
      *
      *  This is not generally something that is needed, but may
      *  be useful in a wrapper to perfom custom data URI functionality.
      */
    inline def createDataGateway(): FetchGatewayFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("createDataGateway")().asInstanceOf[FetchGatewayFunc]
    
    /**
      *  Creates a function that will fetch IPFS (unvalidated) from
      *  a custom gateway baseUrl.
      *
      *  The default IPFS gateway used internally is
      *  ``"https:/\/gateway.ipfs.io/ipfs/"``.
      */
    inline def createIpfsGatewayFunc(baseUrl: String): FetchGatewayFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("createIpfsGatewayFunc")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[FetchGatewayFunc]
    
    /**
      *  Get the current Gateway function for %%scheme%%.
      */
    inline def getGateway(scheme: String): Null | FetchGatewayFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getGateway")(scheme.asInstanceOf[js.Any]).asInstanceOf[Null | FetchGatewayFunc]
    
    /**
      *  Locks all static configuration for gateways and FetchGetUrlFunc
      *  registration.
      */
    inline def lockConfig(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lockConfig")().asInstanceOf[Unit]
    
    /**
      *  Use the %%func%% when fetching URIs using %%scheme%%.
      *
      *  This method affects all requests globally.
      *
      *  If [[lockConfig]] has been called, no change is made and this
      *  throws.
      */
    inline def registerGateway(scheme: String, func: FetchGatewayFunc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGateway")(scheme.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *  Use %%getUrl%% when fetching URIs over HTTP and HTTPS requests.
      *
      *  This method affects all requests globally.
      *
      *  If [[lockConfig]] has been called, no change is made and this
      *  throws.
      */
    inline def registerGetUrl(getUrl: FetchGetUrlFunc): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerGetUrl")(getUrl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("ethers/types/utils/fetch", "FetchResponse")
  @js.native
  open class FetchResponse protected ()
    extends StObject
       with Iterable[js.Tuple2[/* key */ String, /* value */ String]] {
    def this(statusCode: Double, statusMessage: String, headers: Record[String, String]) = this()
    def this(
      statusCode: Double,
      statusMessage: String,
      headers: Record[String, String],
      body: js.typedarray.Uint8Array
    ) = this()
    def this(
      statusCode: Double,
      statusMessage: String,
      headers: Record[String, String],
      body: js.typedarray.Uint8Array,
      request: FetchRequest
    ) = this()
    def this(
      statusCode: Double,
      statusMessage: String,
      headers: Record[String, String],
      body: Null,
      request: FetchRequest
    ) = this()
    
    /**
      *  Throws a ``SERVER_ERROR`` if this response is not ok.
      */
    def assertOk(): Unit = js.native
    
    /**
      *  The response body, or ``null`` if there was no body.
      */
    def body: Null | ReadonlyUint8Array = js.native
    
    /**
      *  The response body, decoded as JSON.
      *
      *  An error is thrown if the body is invalid JSON-encoded data
      *  or if there was no body.
      */
    def bodyJson: Any = js.native
    
    /**
      *  The response body as a UTF-8 encoded string, or the empty
      *  string (i.e. ``""``) if there was no body.
      *
      *  An error is thrown if the body is invalid UTF-8 data.
      */
    def bodyText: String = js.native
    
    /**
      *  Get the header value for %%key%%, ignoring case.
      */
    def getHeader(key: String): String = js.native
    
    /**
      *  Returns true of the response has a body.
      */
    def hasBody(): /* is ethers.anon.FetchResponsebodyUint8Arr */ Boolean = js.native
    
    /**
      *  The response headers. All keys are lower-case.
      */
    def headers: Record[String, String] = js.native
    
    /**
      *  Return a Response with matching headers and body, but with
      *  an error status code (i.e. 599) and %%message%% with an
      *  optional %%error%%.
      */
    def makeServerError(): FetchResponse = js.native
    def makeServerError(message: String): FetchResponse = js.native
    def makeServerError(message: String, error: js.Error): FetchResponse = js.native
    def makeServerError(message: Unit, error: js.Error): FetchResponse = js.native
    
    /**
      *  Returns true if this response was a success statusCode.
      */
    def ok(): Boolean = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      *  The request made for this response.
      */
    def request: Null | FetchRequest = js.native
    
    /**
      *  The response status code.
      */
    def statusCode: Double = js.native
    
    /**
      *  The response status message.
      */
    def statusMessage: String = js.native
    
    /**
      *  If called within a [request.processFunc](FetchRequest-processFunc)
      *  call, causes the request to retry as if throttled for %%stall%%
      *  milliseconds.
      */
    def throwThrottleError(): scala.Nothing = js.native
    def throwThrottleError(message: String): scala.Nothing = js.native
    def throwThrottleError(message: String, stall: Double): scala.Nothing = js.native
    def throwThrottleError(message: Unit, stall: Double): scala.Nothing = js.native
  }
  
  type FetchGatewayFunc = js.Function2[
    /* url */ String, 
    /* signal */ js.UndefOr[FetchCancelSignal], 
    js.Promise[FetchRequest | FetchResponse]
  ]
  
  type FetchGetUrlFunc = js.Function2[
    /* req */ FetchRequest, 
    /* signal */ js.UndefOr[FetchCancelSignal], 
    js.Promise[GetUrlResponse]
  ]
  
  type FetchPreflightFunc = js.Function1[/* req */ FetchRequest, js.Promise[FetchRequest]]
  
  type FetchProcessFunc = js.Function2[/* req */ FetchRequest, /* resp */ FetchResponse, js.Promise[FetchResponse]]
  
  type FetchRetryFunc = js.Function3[
    /* req */ FetchRequest, 
    /* resp */ FetchResponse, 
    /* attempt */ Double, 
    js.Promise[Boolean]
  ]
  
  trait FetchThrottleParams extends StObject {
    
    var maxAttempts: js.UndefOr[Double] = js.undefined
    
    var slotInterval: js.UndefOr[Double] = js.undefined
  }
  object FetchThrottleParams {
    
    inline def apply(): FetchThrottleParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchThrottleParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchThrottleParams] (val x: Self) extends AnyVal {
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      inline def setSlotInterval(value: Double): Self = StObject.set(x, "slotInterval", value.asInstanceOf[js.Any])
      
      inline def setSlotIntervalUndefined: Self = StObject.set(x, "slotInterval", js.undefined)
    }
  }
  
  trait GetUrlResponse extends StObject {
    
    var body: Null | js.typedarray.Uint8Array
    
    var headers: Record[String, String]
    
    var statusCode: Double
    
    var statusMessage: String
  }
  object GetUrlResponse {
    
    inline def apply(headers: Record[String, String], statusCode: Double, statusMessage: String): GetUrlResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], body = null)
      __obj.asInstanceOf[GetUrlResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetUrlResponse] (val x: Self) extends AnyVal {
      
      inline def setBody(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    }
  }
}
