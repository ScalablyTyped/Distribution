package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StreamingDetectIntentResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse")
@js.native
/**
  * Constructs a new StreamingDetectIntentResponse.
  * @param [properties] Properties to set
  */
class StreamingDetectIntentResponse ()
  extends StObject
     with IStreamingDetectIntentResponse {
  def this(properties: IStreamingDetectIntentResponse) = this()
  
  /** StreamingDetectIntentResponse alternativeQueryResults. */
  @JSName("alternativeQueryResults")
  var alternativeQueryResults_StreamingDetectIntentResponse: js.Array[IQueryResult] = js.native
  
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
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new StreamingDetectIntentResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingDetectIntentResponse instance
    */
  /* static member */
  @scala.inline
  def create(): StreamingDetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[StreamingDetectIntentResponse]
  @scala.inline
  def create(properties: IStreamingDetectIntentResponse): StreamingDetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentResponse]
  
  /**
    * Decodes a StreamingDetectIntentResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingDetectIntentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): StreamingDetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): StreamingDetectIntentResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StreamingDetectIntentResponse]
  @scala.inline
  def decode(reader: Uint8Array): StreamingDetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): StreamingDetectIntentResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StreamingDetectIntentResponse]
  
  /**
    * Decodes a StreamingDetectIntentResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingDetectIntentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): StreamingDetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): StreamingDetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentResponse]
  
  /**
    * Encodes the specified StreamingDetectIntentResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse.verify|verify} messages.
    * @param message StreamingDetectIntentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IStreamingDetectIntentResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IStreamingDetectIntentResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified StreamingDetectIntentResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse.verify|verify} messages.
    * @param message StreamingDetectIntentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IStreamingDetectIntentResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IStreamingDetectIntentResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a StreamingDetectIntentResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingDetectIntentResponse
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): StreamingDetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentResponse]
  
  /**
    * Creates a plain object from a StreamingDetectIntentResponse message. Also converts values to other types if specified.
    * @param message StreamingDetectIntentResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: StreamingDetectIntentResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: StreamingDetectIntentResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a StreamingDetectIntentResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
