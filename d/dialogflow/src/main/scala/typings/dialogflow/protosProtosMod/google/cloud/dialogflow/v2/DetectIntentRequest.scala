package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DetectIntentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentRequest")
@js.native
/**
  * Constructs a new DetectIntentRequest.
  * @param [properties] Properties to set
  */
open class DetectIntentRequest ()
  extends StObject
     with IDetectIntentRequest {
  def this(properties: IDetectIntentRequest) = this()
  
  /** DetectIntentRequest inputAudio. */
  @JSName("inputAudio")
  var inputAudio_DetectIntentRequest: js.typedarray.Uint8Array | String = js.native
  
  /** DetectIntentRequest session. */
  @JSName("session")
  var session_DetectIntentRequest: String = js.native
  
  /**
    * Converts this DetectIntentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DetectIntentRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DetectIntentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DetectIntentRequest instance
    */
  /* static member */
  inline def create(): DetectIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DetectIntentRequest]
  inline def create(properties: IDetectIntentRequest): DetectIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DetectIntentRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): DetectIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DetectIntentRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): DetectIntentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DetectIntentRequest]
  /**
    * Decodes a DetectIntentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DetectIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): DetectIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DetectIntentRequest]
  inline def decode(reader: Reader, length: Double): DetectIntentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DetectIntentRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): DetectIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DetectIntentRequest]
  /**
    * Decodes a DetectIntentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DetectIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): DetectIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DetectIntentRequest]
  
  /**
    * Encodes the specified DetectIntentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.DetectIntentRequest.verify|verify} messages.
    * @param message DetectIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IDetectIntentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IDetectIntentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DetectIntentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.DetectIntentRequest.verify|verify} messages.
    * @param message DetectIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IDetectIntentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IDetectIntentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DetectIntentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DetectIntentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DetectIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DetectIntentRequest]
  
  /**
    * Creates a plain object from a DetectIntentRequest message. Also converts values to other types if specified.
    * @param message DetectIntentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DetectIntentRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DetectIntentRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a DetectIntentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
