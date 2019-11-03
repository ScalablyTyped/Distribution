package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a CreateKnowledgeBaseRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest")
@js.native
/**
  * Constructs a new CreateKnowledgeBaseRequest.
  * @param [properties] Properties to set
  */
class CreateKnowledgeBaseRequest () extends ICreateKnowledgeBaseRequest {
  def this(properties: ICreateKnowledgeBaseRequest) = this()
  /** CreateKnowledgeBaseRequest parent. */
  @JSName("parent")
  var parent_CreateKnowledgeBaseRequest: String = js.native
  /**
    * Converts this CreateKnowledgeBaseRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest")
@js.native
object CreateKnowledgeBaseRequest extends js.Object {
  /**
    * Creates a new CreateKnowledgeBaseRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateKnowledgeBaseRequest instance
    */
  def create(): CreateKnowledgeBaseRequest = js.native
  def create(properties: ICreateKnowledgeBaseRequest): CreateKnowledgeBaseRequest = js.native
  /**
    * Decodes a CreateKnowledgeBaseRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): CreateKnowledgeBaseRequest = js.native
  def decode(reader: Reader, length: Double): CreateKnowledgeBaseRequest = js.native
  def decode(reader: Uint8Array): CreateKnowledgeBaseRequest = js.native
  def decode(reader: Uint8Array, length: Double): CreateKnowledgeBaseRequest = js.native
  /**
    * Decodes a CreateKnowledgeBaseRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): CreateKnowledgeBaseRequest = js.native
  def decodeDelimited(reader: Uint8Array): CreateKnowledgeBaseRequest = js.native
  /**
    * Encodes the specified CreateKnowledgeBaseRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.verify|verify} messages.
    * @param message CreateKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICreateKnowledgeBaseRequest): Writer = js.native
  def encode(message: ICreateKnowledgeBaseRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified CreateKnowledgeBaseRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.verify|verify} messages.
    * @param message CreateKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICreateKnowledgeBaseRequest): Writer = js.native
  def encodeDelimited(message: ICreateKnowledgeBaseRequest, writer: Writer): Writer = js.native
  /**
    * Creates a CreateKnowledgeBaseRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateKnowledgeBaseRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): CreateKnowledgeBaseRequest = js.native
  /**
    * Creates a plain object from a CreateKnowledgeBaseRequest message. Also converts values to other types if specified.
    * @param message CreateKnowledgeBaseRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: CreateKnowledgeBaseRequest): StringDictionary[js.Any] = js.native
  def toObject(message: CreateKnowledgeBaseRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a CreateKnowledgeBaseRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

