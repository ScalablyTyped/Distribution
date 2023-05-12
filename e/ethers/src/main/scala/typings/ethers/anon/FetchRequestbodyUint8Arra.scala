package typings.ethers.anon

import typings.ethers.typesUtilsFetchMod.FetchPreflightFunc
import typings.ethers.typesUtilsFetchMod.FetchProcessFunc
import typings.ethers.typesUtilsFetchMod.FetchRequest
import typings.ethers.typesUtilsFetchMod.FetchResponse
import typings.ethers.typesUtilsFetchMod.FetchRetryFunc
import typings.ethers.typesUtilsFetchMod.FetchThrottleParams
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined ethers.ethers/types/utils/fetch.FetchRequest & {  body :std.Uint8Array} */
@js.native
trait FetchRequestbodyUint8Arra extends StObject {
  
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
  @JSName("body")
  var body_FFetchRequestbodyUint8Arra: js.typedarray.Uint8Array = js.native
  
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
  def hasBody(): Boolean = js.native
  
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
  
  /* standard es2015.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[js.Iterator[js.Tuple2[/* key */ String, /* value */ String]]] = js.native
  
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
