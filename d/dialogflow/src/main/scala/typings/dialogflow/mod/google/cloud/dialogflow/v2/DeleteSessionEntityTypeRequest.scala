package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DeleteSessionEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteSessionEntityTypeRequest")
@js.native
/**
  * Constructs a new DeleteSessionEntityTypeRequest.
  * @param [properties] Properties to set
  */
class DeleteSessionEntityTypeRequest () extends IDeleteSessionEntityTypeRequest {
  def this(properties: IDeleteSessionEntityTypeRequest) = this()
  /** DeleteSessionEntityTypeRequest name. */
  @JSName("name")
  var name_DeleteSessionEntityTypeRequest: String = js.native
  /**
    * Converts this DeleteSessionEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteSessionEntityTypeRequest")
@js.native
object DeleteSessionEntityTypeRequest extends js.Object {
  /**
    * Creates a new DeleteSessionEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteSessionEntityTypeRequest instance
    */
  def create(): DeleteSessionEntityTypeRequest = js.native
  def create(properties: IDeleteSessionEntityTypeRequest): DeleteSessionEntityTypeRequest = js.native
  /**
    * Decodes a DeleteSessionEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): DeleteSessionEntityTypeRequest = js.native
  def decode(reader: Reader, length: Double): DeleteSessionEntityTypeRequest = js.native
  def decode(reader: Uint8Array): DeleteSessionEntityTypeRequest = js.native
  def decode(reader: Uint8Array, length: Double): DeleteSessionEntityTypeRequest = js.native
  /**
    * Decodes a DeleteSessionEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): DeleteSessionEntityTypeRequest = js.native
  def decodeDelimited(reader: Uint8Array): DeleteSessionEntityTypeRequest = js.native
  /**
    * Encodes the specified DeleteSessionEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteSessionEntityTypeRequest.verify|verify} messages.
    * @param message DeleteSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDeleteSessionEntityTypeRequest): Writer = js.native
  def encode(message: IDeleteSessionEntityTypeRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DeleteSessionEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteSessionEntityTypeRequest.verify|verify} messages.
    * @param message DeleteSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDeleteSessionEntityTypeRequest): Writer = js.native
  def encodeDelimited(message: IDeleteSessionEntityTypeRequest, writer: Writer): Writer = js.native
  /**
    * Creates a DeleteSessionEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteSessionEntityTypeRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): DeleteSessionEntityTypeRequest = js.native
  /**
    * Creates a plain object from a DeleteSessionEntityTypeRequest message. Also converts values to other types if specified.
    * @param message DeleteSessionEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: DeleteSessionEntityTypeRequest): StringDictionary[js.Any] = js.native
  def toObject(message: DeleteSessionEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DeleteSessionEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

