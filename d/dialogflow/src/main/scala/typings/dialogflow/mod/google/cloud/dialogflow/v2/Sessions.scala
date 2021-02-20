package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.cloud.dialogflow.v2.Sessions.DetectIntentCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Sessions.StreamingDetectIntentCallback
import typings.protobufjs.mod.RPCImpl
import typings.protobufjs.mod.rpc.Service
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Sessions */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Sessions")
@js.native
class Sessions protected () extends Service {
  /**
    * Constructs a new Sessions service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  
  /**
    * Calls DetectIntent.
    * @param request DetectIntentRequest message or plain object
    * @returns Promise
    */
  def detectIntent(request: IDetectIntentRequest): js.Promise[DetectIntentResponse] = js.native
  /**
    * Calls DetectIntent.
    * @param request DetectIntentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and DetectIntentResponse
    */
  def detectIntent(request: IDetectIntentRequest, callback: DetectIntentCallback): Unit = js.native
  
  /**
    * Calls StreamingDetectIntent.
    * @param request StreamingDetectIntentRequest message or plain object
    * @returns Promise
    */
  def streamingDetectIntent(request: IStreamingDetectIntentRequest): js.Promise[StreamingDetectIntentResponse] = js.native
  /**
    * Calls StreamingDetectIntent.
    * @param request StreamingDetectIntentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and StreamingDetectIntentResponse
    */
  def streamingDetectIntent(request: IStreamingDetectIntentRequest, callback: StreamingDetectIntentCallback): Unit = js.native
}
object Sessions {
  
  /**
    * Creates new Sessions service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Sessions.create")
  @js.native
  def create(rpcImpl: RPCImpl): Sessions = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Sessions.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean): Sessions = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Sessions.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean): Sessions = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Sessions.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): Sessions = js.native
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Sessions#detectIntent}.
    * @param error Error, if any
    * @param [response] DetectIntentResponse
    */
  type DetectIntentCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[DetectIntentResponse], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Sessions#streamingDetectIntent}.
    * @param error Error, if any
    * @param [response] StreamingDetectIntentResponse
    */
  type StreamingDetectIntentCallback = js.Function2[
    /* error */ Error | Null, 
    /* response */ js.UndefOr[StreamingDetectIntentResponse], 
    Unit
  ]
}
