package typings.googleDashGax.buildSrcApiCallerMod

import typings.googleDashGax.buildSrcApitypesMod.APICallback
import typings.googleDashGax.buildSrcApitypesMod.CancellableStream
import typings.googleDashGax.buildSrcApitypesMod.GRPCCall
import typings.googleDashGax.buildSrcApitypesMod.ResultTuple
import typings.googleDashGax.buildSrcApitypesMod.SimpleCallbackFunction
import typings.googleDashGax.buildSrcCallMod.CancellablePromise
import typings.googleDashGax.buildSrcCallMod.OngoingCall
import typings.googleDashGax.buildSrcCallMod.OngoingCallPromise
import typings.googleDashGax.buildSrcGoogleErrorMod.GoogleError
import typings.googleDashGax.buildSrcStreamingCallsStreamingMod.StreamProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APICaller extends js.Object {
  def call(apiCall: SimpleCallbackFunction, argument: js.Object, settings: js.Object, canceller: OngoingCall): Unit = js.native
  def call(
    apiCall: SimpleCallbackFunction,
    argument: js.Object,
    settings: js.Object,
    canceller: OngoingCallPromise
  ): Unit = js.native
  def call(apiCall: SimpleCallbackFunction, argument: js.Object, settings: js.Object, canceller: StreamProxy): Unit = js.native
  def fail(canceller: CancellableStream, err: GoogleError): Unit = js.native
  def fail(canceller: OngoingCallPromise, err: GoogleError): Unit = js.native
  def fail(canceller: OngoingCall, err: GoogleError): Unit = js.native
  def init(settings: ApiCallerSettings): OngoingCallPromise | OngoingCall | StreamProxy = js.native
  def init(settings: ApiCallerSettings, callback: APICallback): OngoingCallPromise | OngoingCall | StreamProxy = js.native
  def result(canceller: CancellableStream): CancellablePromise[ResultTuple] | CancellableStream = js.native
  def result(canceller: OngoingCall): CancellablePromise[ResultTuple] | CancellableStream = js.native
  def result(canceller: OngoingCallPromise): CancellablePromise[ResultTuple] | CancellableStream = js.native
  def wrap(func: GRPCCall): GRPCCall = js.native
}

