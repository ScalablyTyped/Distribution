package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StreamingDetectIntentResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse")
@js.native
/**
  * Constructs a new StreamingDetectIntentResponse.
  * @param [properties] Properties to set
  */
class StreamingDetectIntentResponse () extends IStreamingDetectIntentResponse {
  def this(properties: IStreamingDetectIntentResponse) = this()
  
  /** StreamingDetectIntentResponse outputAudio. */
  @JSName("outputAudio")
  var outputAudio_StreamingDetectIntentResponse: Uint8Array | String = js.native
  
  /** StreamingDetectIntentResponse responseId. */
  @JSName("responseId")
  var responseId_StreamingDetectIntentResponse: String = js.native
  
  /**
    * Converts this StreamingDetectIntentResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object StreamingDetectIntentResponse {
  
  /**
    * Creates a new StreamingDetectIntentResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingDetectIntentResponse instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.create")
  @js.native
  def create(): StreamingDetectIntentResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.create")
  @js.native
  def create(properties: IStreamingDetectIntentResponse): StreamingDetectIntentResponse = js.native
  
  /**
    * Decodes a StreamingDetectIntentResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingDetectIntentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.decode")
  @js.native
  def decode(reader: Reader): StreamingDetectIntentResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): StreamingDetectIntentResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.decode")
  @js.native
  def decode(reader: Uint8Array): StreamingDetectIntentResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): StreamingDetectIntentResponse = js.native
  
  /**
    * Decodes a StreamingDetectIntentResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingDetectIntentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): StreamingDetectIntentResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): StreamingDetectIntentResponse = js.native
  
  /**
    * Encodes the specified StreamingDetectIntentResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.StreamingDetectIntentResponse.verify|verify} messages.
    * @param message StreamingDetectIntentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.encode")
  @js.native
  def encode(message: IStreamingDetectIntentResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.encode")
  @js.native
  def encode(message: IStreamingDetectIntentResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StreamingDetectIntentResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.StreamingDetectIntentResponse.verify|verify} messages.
    * @param message StreamingDetectIntentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStreamingDetectIntentResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStreamingDetectIntentResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a StreamingDetectIntentResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingDetectIntentResponse
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): StreamingDetectIntentResponse = js.native
  
  /**
    * Creates a plain object from a StreamingDetectIntentResponse message. Also converts values to other types if specified.
    * @param message StreamingDetectIntentResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.toObject")
  @js.native
  def toObject(message: StreamingDetectIntentResponse): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.toObject")
  @js.native
  def toObject(message: StreamingDetectIntentResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StreamingDetectIntentResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
