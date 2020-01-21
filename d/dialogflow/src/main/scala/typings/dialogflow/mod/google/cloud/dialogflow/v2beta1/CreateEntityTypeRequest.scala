package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a CreateEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest")
@js.native
/**
  * Constructs a new CreateEntityTypeRequest.
  * @param [properties] Properties to set
  */
class CreateEntityTypeRequest () extends ICreateEntityTypeRequest {
  def this(properties: ICreateEntityTypeRequest) = this()
  /** CreateEntityTypeRequest languageCode. */
  @JSName("languageCode")
  var languageCode_CreateEntityTypeRequest: String = js.native
  /** CreateEntityTypeRequest parent. */
  @JSName("parent")
  var parent_CreateEntityTypeRequest: String = js.native
  /**
    * Converts this CreateEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest")
@js.native
object CreateEntityTypeRequest extends js.Object {
  /**
    * Creates a new CreateEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateEntityTypeRequest instance
    */
  def create(): CreateEntityTypeRequest = js.native
  def create(properties: ICreateEntityTypeRequest): CreateEntityTypeRequest = js.native
  /**
    * Decodes a CreateEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): CreateEntityTypeRequest = js.native
  def decode(reader: Reader, length: Double): CreateEntityTypeRequest = js.native
  def decode(reader: Uint8Array): CreateEntityTypeRequest = js.native
  def decode(reader: Uint8Array, length: Double): CreateEntityTypeRequest = js.native
  /**
    * Decodes a CreateEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): CreateEntityTypeRequest = js.native
  def decodeDelimited(reader: Uint8Array): CreateEntityTypeRequest = js.native
  /**
    * Encodes the specified CreateEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest.verify|verify} messages.
    * @param message CreateEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICreateEntityTypeRequest): Writer = js.native
  def encode(message: ICreateEntityTypeRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified CreateEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest.verify|verify} messages.
    * @param message CreateEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICreateEntityTypeRequest): Writer = js.native
  def encodeDelimited(message: ICreateEntityTypeRequest, writer: Writer): Writer = js.native
  /**
    * Creates a CreateEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateEntityTypeRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): CreateEntityTypeRequest = js.native
  /**
    * Creates a plain object from a CreateEntityTypeRequest message. Also converts values to other types if specified.
    * @param message CreateEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: CreateEntityTypeRequest): StringDictionary[js.Any] = js.native
  def toObject(message: CreateEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a CreateEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

