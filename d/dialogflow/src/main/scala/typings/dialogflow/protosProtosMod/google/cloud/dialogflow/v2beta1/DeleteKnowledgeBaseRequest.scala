package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DeleteKnowledgeBaseRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest")
@js.native
/**
  * Constructs a new DeleteKnowledgeBaseRequest.
  * @param [properties] Properties to set
  */
class DeleteKnowledgeBaseRequest () extends IDeleteKnowledgeBaseRequest {
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

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest")
@js.native
object DeleteKnowledgeBaseRequest extends js.Object {
  /**
    * Creates a new DeleteKnowledgeBaseRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteKnowledgeBaseRequest instance
    */
  def create(): DeleteKnowledgeBaseRequest = js.native
  def create(properties: IDeleteKnowledgeBaseRequest): DeleteKnowledgeBaseRequest = js.native
  /**
    * Decodes a DeleteKnowledgeBaseRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): DeleteKnowledgeBaseRequest = js.native
  def decode(reader: Reader, length: Double): DeleteKnowledgeBaseRequest = js.native
  def decode(reader: Uint8Array): DeleteKnowledgeBaseRequest = js.native
  def decode(reader: Uint8Array, length: Double): DeleteKnowledgeBaseRequest = js.native
  /**
    * Decodes a DeleteKnowledgeBaseRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): DeleteKnowledgeBaseRequest = js.native
  def decodeDelimited(reader: Uint8Array): DeleteKnowledgeBaseRequest = js.native
  /**
    * Encodes the specified DeleteKnowledgeBaseRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.verify|verify} messages.
    * @param message DeleteKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDeleteKnowledgeBaseRequest): Writer = js.native
  def encode(message: IDeleteKnowledgeBaseRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DeleteKnowledgeBaseRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.verify|verify} messages.
    * @param message DeleteKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDeleteKnowledgeBaseRequest): Writer = js.native
  def encodeDelimited(message: IDeleteKnowledgeBaseRequest, writer: Writer): Writer = js.native
  /**
    * Creates a DeleteKnowledgeBaseRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteKnowledgeBaseRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): DeleteKnowledgeBaseRequest = js.native
  /**
    * Creates a plain object from a DeleteKnowledgeBaseRequest message. Also converts values to other types if specified.
    * @param message DeleteKnowledgeBaseRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: DeleteKnowledgeBaseRequest): StringDictionary[js.Any] = js.native
  def toObject(message: DeleteKnowledgeBaseRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DeleteKnowledgeBaseRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

