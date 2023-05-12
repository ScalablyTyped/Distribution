package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1

import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.TextToSpeechLongAudioSynthesize.SynthesizeLongAudioCallback
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.longrunning.Operation
import typings.googleGax.mod.protobuf.rpc.Service
import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TextToSpeechLongAudioSynthesize */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.TextToSpeechLongAudioSynthesize")
@js.native
open class TextToSpeechLongAudioSynthesize protected () extends Service {
  /**
    * Constructs a new TextToSpeechLongAudioSynthesize service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
  
  /**
    * Calls SynthesizeLongAudio.
    * @param request SynthesizeLongAudioRequest message or plain object
    * @returns Promise
    */
  def synthesizeLongAudio(request: ISynthesizeLongAudioRequest): js.Promise[Operation] = js.native
  /**
    * Calls SynthesizeLongAudio.
    * @param request SynthesizeLongAudioRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def synthesizeLongAudio(request: ISynthesizeLongAudioRequest, callback: SynthesizeLongAudioCallback): Unit = js.native
}
object TextToSpeechLongAudioSynthesize {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.TextToSpeechLongAudioSynthesize")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new TextToSpeechLongAudioSynthesize service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  inline def create(rpcImpl: RPCImpl): TextToSpeechLongAudioSynthesize = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[TextToSpeechLongAudioSynthesize]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): TextToSpeechLongAudioSynthesize = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[TextToSpeechLongAudioSynthesize]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): TextToSpeechLongAudioSynthesize = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[TextToSpeechLongAudioSynthesize]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): TextToSpeechLongAudioSynthesize = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[TextToSpeechLongAudioSynthesize]
  
  /**
    * Callback as used by {@link google.cloud.texttospeech.v1beta1.TextToSpeechLongAudioSynthesize|synthesizeLongAudio}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type SynthesizeLongAudioCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
}
