package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteKnowledgeBaseRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest")
@js.native
/**
  * Constructs a new DeleteKnowledgeBaseRequest.
  * @param [properties] Properties to set
  */
class DeleteKnowledgeBaseRequest ()
  extends StObject
     with IDeleteKnowledgeBaseRequest {
  def this(properties: IDeleteKnowledgeBaseRequest) = this()
  
  /** DeleteKnowledgeBaseRequest force. */
  @JSName("force")
  var force_DeleteKnowledgeBaseRequest: Boolean = js.native
  
  /** DeleteKnowledgeBaseRequest name. */
  @JSName("name")
  var name_DeleteKnowledgeBaseRequest: String = js.native
  
  /**
    * Converts this DeleteKnowledgeBaseRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DeleteKnowledgeBaseRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DeleteKnowledgeBaseRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteKnowledgeBaseRequest instance
    */
  /* static member */
  @scala.inline
  def create(): DeleteKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DeleteKnowledgeBaseRequest]
  @scala.inline
  def create(properties: IDeleteKnowledgeBaseRequest): DeleteKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DeleteKnowledgeBaseRequest]
  
  /**
    * Decodes a DeleteKnowledgeBaseRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): DeleteKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteKnowledgeBaseRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): DeleteKnowledgeBaseRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteKnowledgeBaseRequest]
  @scala.inline
  def decode(reader: Uint8Array): DeleteKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteKnowledgeBaseRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): DeleteKnowledgeBaseRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteKnowledgeBaseRequest]
  
  /**
    * Decodes a DeleteKnowledgeBaseRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): DeleteKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteKnowledgeBaseRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): DeleteKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteKnowledgeBaseRequest]
  
  /**
    * Encodes the specified DeleteKnowledgeBaseRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.verify|verify} messages.
    * @param message DeleteKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IDeleteKnowledgeBaseRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IDeleteKnowledgeBaseRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DeleteKnowledgeBaseRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.verify|verify} messages.
    * @param message DeleteKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IDeleteKnowledgeBaseRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IDeleteKnowledgeBaseRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DeleteKnowledgeBaseRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteKnowledgeBaseRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): DeleteKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DeleteKnowledgeBaseRequest]
  
  /**
    * Creates a plain object from a DeleteKnowledgeBaseRequest message. Also converts values to other types if specified.
    * @param message DeleteKnowledgeBaseRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: DeleteKnowledgeBaseRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: DeleteKnowledgeBaseRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a DeleteKnowledgeBaseRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
