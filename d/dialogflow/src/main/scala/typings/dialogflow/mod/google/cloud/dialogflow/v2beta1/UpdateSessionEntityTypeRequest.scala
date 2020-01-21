package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an UpdateSessionEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest")
@js.native
/**
  * Constructs a new UpdateSessionEntityTypeRequest.
  * @param [properties] Properties to set
  */
class UpdateSessionEntityTypeRequest () extends IUpdateSessionEntityTypeRequest {
  def this(properties: IUpdateSessionEntityTypeRequest) = this()
  /**
    * Converts this UpdateSessionEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest")
@js.native
object UpdateSessionEntityTypeRequest extends js.Object {
  /**
    * Creates a new UpdateSessionEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateSessionEntityTypeRequest instance
    */
  def create(): UpdateSessionEntityTypeRequest = js.native
  def create(properties: IUpdateSessionEntityTypeRequest): UpdateSessionEntityTypeRequest = js.native
  /**
    * Decodes an UpdateSessionEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): UpdateSessionEntityTypeRequest = js.native
  def decode(reader: Reader, length: Double): UpdateSessionEntityTypeRequest = js.native
  def decode(reader: Uint8Array): UpdateSessionEntityTypeRequest = js.native
  def decode(reader: Uint8Array, length: Double): UpdateSessionEntityTypeRequest = js.native
  /**
    * Decodes an UpdateSessionEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): UpdateSessionEntityTypeRequest = js.native
  def decodeDelimited(reader: Uint8Array): UpdateSessionEntityTypeRequest = js.native
  /**
    * Encodes the specified UpdateSessionEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.verify|verify} messages.
    * @param message UpdateSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IUpdateSessionEntityTypeRequest): Writer = js.native
  def encode(message: IUpdateSessionEntityTypeRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified UpdateSessionEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.verify|verify} messages.
    * @param message UpdateSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IUpdateSessionEntityTypeRequest): Writer = js.native
  def encodeDelimited(message: IUpdateSessionEntityTypeRequest, writer: Writer): Writer = js.native
  /**
    * Creates an UpdateSessionEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateSessionEntityTypeRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): UpdateSessionEntityTypeRequest = js.native
  /**
    * Creates a plain object from an UpdateSessionEntityTypeRequest message. Also converts values to other types if specified.
    * @param message UpdateSessionEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: UpdateSessionEntityTypeRequest): StringDictionary[js.Any] = js.native
  def toObject(message: UpdateSessionEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an UpdateSessionEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

