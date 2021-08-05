package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TrainAgentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest")
@js.native
/**
  * Constructs a new TrainAgentRequest.
  * @param [properties] Properties to set
  */
class TrainAgentRequest ()
  extends StObject
     with ITrainAgentRequest {
  def this(properties: ITrainAgentRequest) = this()
  
  /** TrainAgentRequest parent. */
  @JSName("parent")
  var parent_TrainAgentRequest: String = js.native
  
  /**
    * Converts this TrainAgentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object TrainAgentRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TrainAgentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TrainAgentRequest instance
    */
  /* static member */
  inline def create(): TrainAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TrainAgentRequest]
  inline def create(properties: ITrainAgentRequest): TrainAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TrainAgentRequest]
  
  /**
    * Decodes a TrainAgentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TrainAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): TrainAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TrainAgentRequest]
  inline def decode(reader: Reader, length: Double): TrainAgentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TrainAgentRequest]
  inline def decode(reader: Uint8Array): TrainAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TrainAgentRequest]
  inline def decode(reader: Uint8Array, length: Double): TrainAgentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TrainAgentRequest]
  
  /**
    * Decodes a TrainAgentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TrainAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): TrainAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TrainAgentRequest]
  inline def decodeDelimited(reader: Uint8Array): TrainAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TrainAgentRequest]
  
  /**
    * Encodes the specified TrainAgentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.TrainAgentRequest.verify|verify} messages.
    * @param message TrainAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ITrainAgentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITrainAgentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TrainAgentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.TrainAgentRequest.verify|verify} messages.
    * @param message TrainAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ITrainAgentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITrainAgentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TrainAgentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TrainAgentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): TrainAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TrainAgentRequest]
  
  /**
    * Creates a plain object from a TrainAgentRequest message. Also converts values to other types if specified.
    * @param message TrainAgentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: TrainAgentRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: TrainAgentRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TrainAgentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
