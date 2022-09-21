package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StreamingDetectIntentResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse")
@js.native
/**
  * Constructs a new StreamingDetectIntentResponse.
  * @param [properties] Properties to set
  */
open class StreamingDetectIntentResponse ()
  extends StObject
     with IStreamingDetectIntentResponse {
  def this(properties: IStreamingDetectIntentResponse) = this()
  
  /** StreamingDetectIntentResponse outputAudio. */
  @JSName("outputAudio")
  var outputAudio_StreamingDetectIntentResponse: js.typedarray.Uint8Array | String = js.native
  
  /** StreamingDetectIntentResponse responseId. */
  @JSName("responseId")
  var responseId_StreamingDetectIntentResponse: String = js.native
  
  /**
    * Converts this StreamingDetectIntentResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object StreamingDetectIntentResponse {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingDetectIntentResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new StreamingDetectIntentResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingDetectIntentResponse instance
    */
  /* static member */
  inline def create(): StreamingDetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[StreamingDetectIntentResponse]
  inline def create(properties: IStreamingDetectIntentResponse): StreamingDetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): StreamingDetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): StreamingDetectIntentResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StreamingDetectIntentResponse]
  /**
    * Decodes a StreamingDetectIntentResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingDetectIntentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): StreamingDetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentResponse]
  inline def decode(reader: Reader, length: Double): StreamingDetectIntentResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StreamingDetectIntentResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): StreamingDetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentResponse]
  /**
    * Decodes a StreamingDetectIntentResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingDetectIntentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): StreamingDetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentResponse]
  
  /**
    * Encodes the specified StreamingDetectIntentResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.StreamingDetectIntentResponse.verify|verify} messages.
    * @param message StreamingDetectIntentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IStreamingDetectIntentResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IStreamingDetectIntentResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified StreamingDetectIntentResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.StreamingDetectIntentResponse.verify|verify} messages.
    * @param message StreamingDetectIntentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IStreamingDetectIntentResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IStreamingDetectIntentResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a StreamingDetectIntentResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingDetectIntentResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): StreamingDetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentResponse]
  
  /**
    * Creates a plain object from a StreamingDetectIntentResponse message. Also converts values to other types if specified.
    * @param message StreamingDetectIntentResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: StreamingDetectIntentResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: StreamingDetectIntentResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a StreamingDetectIntentResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
