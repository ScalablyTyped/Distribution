package typings.ethers.anon

import typings.ethers.typesUtilsFetchMod.FetchRequest
import typings.ethers.typesUtilsFetchMod.FetchResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined ethers.ethers/types/utils/fetch.FetchResponse & {  body :std.Uint8Array} */
@js.native
trait FetchResponsebodyUint8Arr extends StObject {
  
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
  
  @JSName("body")
  var body_FFetchResponsebodyUint8Arr: js.typedarray.Uint8Array = js.native
  
  /**
    *  Get the header value for %%key%%, ignoring case.
    */
  def getHeader(key: String): String = js.native
  
  /**
    *  Returns true of the response has a body.
    */
  def hasBody(): Boolean = js.native
  
  /**
    *  The response headers. All keys are lower-case.
    */
  def headers: Record[String, String] = js.native
  
  /* standard es2015.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[js.Iterator[js.Tuple2[/* key */ String, /* value */ String]]] = js.native
  
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
