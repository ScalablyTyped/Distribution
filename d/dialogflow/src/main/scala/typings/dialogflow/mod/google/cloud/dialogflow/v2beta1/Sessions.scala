package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Sessions.DetectIntentCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Sessions.StreamingDetectIntentCallback
import typings.protobufjs.mod.RPCImpl
import typings.protobufjs.mod.rpc.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Sessions */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sessions")
@js.native
open class Sessions protected () extends Service {
  /**
    * Constructs a new Sessions service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
  
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
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sessions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new Sessions service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  inline def create(rpcImpl: RPCImpl): Sessions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[Sessions]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): Sessions = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[Sessions]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): Sessions = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Sessions]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): Sessions = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Sessions]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Sessions#detectIntent}.
    * @param error Error, if any
    * @param [response] DetectIntentResponse
    */
  type DetectIntentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[DetectIntentResponse], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Sessions#streamingDetectIntent}.
    * @param error Error, if any
    * @param [response] StreamingDetectIntentResponse
    */
  type StreamingDetectIntentCallback = js.Function2[
    /* error */ js.Error | Null, 
    /* response */ js.UndefOr[StreamingDetectIntentResponse], 
    Unit
  ]
}
