package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.authRequired
import typings.devtoolsProtocol.devtoolsProtocolStrings.requestPaused
import typings.devtoolsProtocol.mod.Protocol.Fetch.AuthRequiredEvent
import typings.devtoolsProtocol.mod.Protocol.Fetch.ContinueRequestRequest
import typings.devtoolsProtocol.mod.Protocol.Fetch.ContinueResponseRequest
import typings.devtoolsProtocol.mod.Protocol.Fetch.ContinueWithAuthRequest
import typings.devtoolsProtocol.mod.Protocol.Fetch.EnableRequest
import typings.devtoolsProtocol.mod.Protocol.Fetch.FailRequestRequest
import typings.devtoolsProtocol.mod.Protocol.Fetch.FulfillRequestRequest
import typings.devtoolsProtocol.mod.Protocol.Fetch.GetResponseBodyRequest
import typings.devtoolsProtocol.mod.Protocol.Fetch.GetResponseBodyResponse
import typings.devtoolsProtocol.mod.Protocol.Fetch.RequestPausedEvent
import typings.devtoolsProtocol.mod.Protocol.Fetch.TakeResponseBodyAsStreamRequest
import typings.devtoolsProtocol.mod.Protocol.Fetch.TakeResponseBodyAsStreamResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchApi extends StObject {
  
  /**
    * Continues the request, optionally modifying some of its parameters.
    */
  def continueRequest(params: ContinueRequestRequest): js.Promise[Unit] = js.native
  
  /**
    * Continues loading of the paused response, optionally modifying the
    * response headers. If either responseCode or headers are modified, all of them
    * must be present.
    */
  def continueResponse(params: ContinueResponseRequest): js.Promise[Unit] = js.native
  
  /**
    * Continues a request supplying authChallengeResponse following authRequired event.
    */
  def continueWithAuth(params: ContinueWithAuthRequest): js.Promise[Unit] = js.native
  
  /**
    * Disables the fetch domain.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables issuing of requestPaused events. A request will be paused until client
    * calls one of failRequest, fulfillRequest or continueRequest/continueWithAuth.
    */
  def enable(params: EnableRequest): js.Promise[Unit] = js.native
  
  /**
    * Causes the request to fail with specified reason.
    */
  def failRequest(params: FailRequestRequest): js.Promise[Unit] = js.native
  
  /**
    * Provides response to the request.
    */
  def fulfillRequest(params: FulfillRequestRequest): js.Promise[Unit] = js.native
  
  /**
    * Causes the body of the response to be received from the server and
    * returned as a single string. May only be issued for a request that
    * is paused in the Response stage and is mutually exclusive with
    * takeResponseBodyForInterceptionAsStream. Calling other methods that
    * affect the request or disabling fetch domain before body is received
    * results in an undefined behavior.
    */
  def getResponseBody(params: GetResponseBodyRequest): js.Promise[GetResponseBodyResponse] = js.native
  
  /**
    * Issued when the domain is enabled with handleAuthRequests set to true.
    * The request is paused until client responds with continueWithAuth.
    */
  @JSName("on")
  def on_authRequired(event: authRequired, listener: js.Function1[/* params */ AuthRequiredEvent, Unit]): Unit = js.native
  /**
    * Issued when the domain is enabled and the request URL matches the
    * specified filter. The request is paused until the client responds
    * with one of continueRequest, failRequest or fulfillRequest.
    * The stage of the request can be determined by presence of responseErrorReason
    * and responseStatusCode -- the request is at the response stage if either
    * of these fields is present and in the request stage otherwise.
    */
  @JSName("on")
  def on_requestPaused(event: requestPaused, listener: js.Function1[/* params */ RequestPausedEvent, Unit]): Unit = js.native
  
  /**
    * Returns a handle to the stream representing the response body.
    * The request must be paused in the HeadersReceived stage.
    * Note that after this command the request can't be continued
    * as is -- client either needs to cancel it or to provide the
    * response body.
    * The stream only supports sequential read, IO.read will fail if the position
    * is specified.
    * This method is mutually exclusive with getResponseBody.
    * Calling other methods that affect the request or disabling fetch
    * domain before body is received results in an undefined behavior.
    */
  def takeResponseBodyAsStream(params: TakeResponseBodyAsStreamRequest): js.Promise[TakeResponseBodyAsStreamResponse] = js.native
}
