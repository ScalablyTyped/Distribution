package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
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
class UpdateKnowledgeBaseRequest ()
  extends StObject
     with IUpdateKnowledgeBaseRequest {
  def this(properties: IUpdateKnowledgeBaseRequest) = this()
  
  /**
    * Converts this UpdateKnowledgeBaseRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
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
  @scala.inline
  def create(): UpdateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[UpdateKnowledgeBaseRequest]
  @scala.inline
  def create(properties: IUpdateKnowledgeBaseRequest): UpdateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[UpdateKnowledgeBaseRequest]
  
  /**
    * Decodes an UpdateKnowledgeBaseRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): UpdateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateKnowledgeBaseRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): UpdateKnowledgeBaseRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateKnowledgeBaseRequest]
  @scala.inline
  def decode(reader: Uint8Array): UpdateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateKnowledgeBaseRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): UpdateKnowledgeBaseRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateKnowledgeBaseRequest]
  
  /**
    * Decodes an UpdateKnowledgeBaseRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): UpdateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateKnowledgeBaseRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): UpdateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateKnowledgeBaseRequest]
  
  /**
    * Encodes the specified UpdateKnowledgeBaseRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.verify|verify} messages.
    * @param message UpdateKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IUpdateKnowledgeBaseRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IUpdateKnowledgeBaseRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified UpdateKnowledgeBaseRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.verify|verify} messages.
    * @param message UpdateKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IUpdateKnowledgeBaseRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IUpdateKnowledgeBaseRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an UpdateKnowledgeBaseRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateKnowledgeBaseRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): UpdateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UpdateKnowledgeBaseRequest]
  
  /**
    * Creates a plain object from an UpdateKnowledgeBaseRequest message. Also converts values to other types if specified.
    * @param message UpdateKnowledgeBaseRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: UpdateKnowledgeBaseRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: UpdateKnowledgeBaseRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an UpdateKnowledgeBaseRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
