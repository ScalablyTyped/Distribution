package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an UpdateEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest")
@js.native
/**
  * Constructs a new UpdateEntityTypeRequest.
  * @param [properties] Properties to set
  */
class UpdateEntityTypeRequest () extends IUpdateEntityTypeRequest {
  def this(properties: IUpdateEntityTypeRequest) = this()
  /** UpdateEntityTypeRequest languageCode. */
  @JSName("languageCode")
  var languageCode_UpdateEntityTypeRequest: String = js.native
  /**
    * Converts this UpdateEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest")
@js.native
object UpdateEntityTypeRequest extends js.Object {
  /**
    * Creates a new UpdateEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateEntityTypeRequest instance
    */
  def create(): UpdateEntityTypeRequest = js.native
  def create(properties: IUpdateEntityTypeRequest): UpdateEntityTypeRequest = js.native
  /**
    * Decodes an UpdateEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): UpdateEntityTypeRequest = js.native
  def decode(reader: Reader, length: Double): UpdateEntityTypeRequest = js.native
  def decode(reader: Uint8Array): UpdateEntityTypeRequest = js.native
  def decode(reader: Uint8Array, length: Double): UpdateEntityTypeRequest = js.native
  /**
    * Decodes an UpdateEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): UpdateEntityTypeRequest = js.native
  def decodeDelimited(reader: Uint8Array): UpdateEntityTypeRequest = js.native
  /**
    * Encodes the specified UpdateEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.verify|verify} messages.
    * @param message UpdateEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IUpdateEntityTypeRequest): Writer = js.native
  def encode(message: IUpdateEntityTypeRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified UpdateEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.verify|verify} messages.
    * @param message UpdateEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IUpdateEntityTypeRequest): Writer = js.native
  def encodeDelimited(message: IUpdateEntityTypeRequest, writer: Writer): Writer = js.native
  /**
    * Creates an UpdateEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateEntityTypeRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): UpdateEntityTypeRequest = js.native
  /**
    * Creates a plain object from an UpdateEntityTypeRequest message. Also converts values to other types if specified.
    * @param message UpdateEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: UpdateEntityTypeRequest): StringDictionary[js.Any] = js.native
  def toObject(message: UpdateEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an UpdateEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

