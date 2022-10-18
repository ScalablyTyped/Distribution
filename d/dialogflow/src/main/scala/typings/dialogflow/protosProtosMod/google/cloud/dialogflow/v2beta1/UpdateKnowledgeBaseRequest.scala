package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UpdateKnowledgeBaseRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest")
@js.native
/**
  * Constructs a new UpdateKnowledgeBaseRequest.
  * @param [properties] Properties to set
  */
open class UpdateKnowledgeBaseRequest ()
  extends StObject
     with IUpdateKnowledgeBaseRequest {
  def this(properties: IUpdateKnowledgeBaseRequest) = this()
  
  /**
    * Converts this UpdateKnowledgeBaseRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object UpdateKnowledgeBaseRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new UpdateKnowledgeBaseRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateKnowledgeBaseRequest instance
    */
  /* static member */
  inline def create(): UpdateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[UpdateKnowledgeBaseRequest]
  inline def create(properties: IUpdateKnowledgeBaseRequest): UpdateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[UpdateKnowledgeBaseRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): UpdateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateKnowledgeBaseRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): UpdateKnowledgeBaseRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateKnowledgeBaseRequest]
  /**
    * Decodes an UpdateKnowledgeBaseRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): UpdateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateKnowledgeBaseRequest]
  inline def decode(reader: Reader, length: Double): UpdateKnowledgeBaseRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateKnowledgeBaseRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): UpdateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateKnowledgeBaseRequest]
  /**
    * Decodes an UpdateKnowledgeBaseRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): UpdateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateKnowledgeBaseRequest]
  
  /**
    * Encodes the specified UpdateKnowledgeBaseRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.verify|verify} messages.
    * @param message UpdateKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IUpdateKnowledgeBaseRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IUpdateKnowledgeBaseRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified UpdateKnowledgeBaseRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.verify|verify} messages.
    * @param message UpdateKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IUpdateKnowledgeBaseRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IUpdateKnowledgeBaseRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an UpdateKnowledgeBaseRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateKnowledgeBaseRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): UpdateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UpdateKnowledgeBaseRequest]
  
  /**
    * Creates a plain object from an UpdateKnowledgeBaseRequest message. Also converts values to other types if specified.
    * @param message UpdateKnowledgeBaseRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: UpdateKnowledgeBaseRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: UpdateKnowledgeBaseRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an UpdateKnowledgeBaseRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
