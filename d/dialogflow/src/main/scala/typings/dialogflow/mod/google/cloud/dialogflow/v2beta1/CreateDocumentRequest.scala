package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a CreateDocumentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest")
@js.native
/**
  * Constructs a new CreateDocumentRequest.
  * @param [properties] Properties to set
  */
class CreateDocumentRequest () extends ICreateDocumentRequest {
  def this(properties: ICreateDocumentRequest) = this()
  /** CreateDocumentRequest parent. */
  @JSName("parent")
  var parent_CreateDocumentRequest: String = js.native
  /**
    * Converts this CreateDocumentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest")
@js.native
object CreateDocumentRequest extends js.Object {
  /**
    * Creates a new CreateDocumentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateDocumentRequest instance
    */
  def create(): CreateDocumentRequest = js.native
  def create(properties: ICreateDocumentRequest): CreateDocumentRequest = js.native
  /**
    * Decodes a CreateDocumentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): CreateDocumentRequest = js.native
  def decode(reader: Reader, length: Double): CreateDocumentRequest = js.native
  def decode(reader: Uint8Array): CreateDocumentRequest = js.native
  def decode(reader: Uint8Array, length: Double): CreateDocumentRequest = js.native
  /**
    * Decodes a CreateDocumentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): CreateDocumentRequest = js.native
  def decodeDelimited(reader: Uint8Array): CreateDocumentRequest = js.native
  /**
    * Encodes the specified CreateDocumentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateDocumentRequest.verify|verify} messages.
    * @param message CreateDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICreateDocumentRequest): Writer = js.native
  def encode(message: ICreateDocumentRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified CreateDocumentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateDocumentRequest.verify|verify} messages.
    * @param message CreateDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICreateDocumentRequest): Writer = js.native
  def encodeDelimited(message: ICreateDocumentRequest, writer: Writer): Writer = js.native
  /**
    * Creates a CreateDocumentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateDocumentRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): CreateDocumentRequest = js.native
  /**
    * Creates a plain object from a CreateDocumentRequest message. Also converts values to other types if specified.
    * @param message CreateDocumentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: CreateDocumentRequest): StringDictionary[js.Any] = js.native
  def toObject(message: CreateDocumentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a CreateDocumentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

