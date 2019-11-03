package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DeleteEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest")
@js.native
/**
  * Constructs a new DeleteEntityTypeRequest.
  * @param [properties] Properties to set
  */
class DeleteEntityTypeRequest () extends IDeleteEntityTypeRequest {
  def this(properties: IDeleteEntityTypeRequest) = this()
  /** DeleteEntityTypeRequest name. */
  @JSName("name")
  var name_DeleteEntityTypeRequest: String = js.native
  /**
    * Converts this DeleteEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest")
@js.native
object DeleteEntityTypeRequest extends js.Object {
  /**
    * Creates a new DeleteEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteEntityTypeRequest instance
    */
  def create(): DeleteEntityTypeRequest = js.native
  def create(properties: IDeleteEntityTypeRequest): DeleteEntityTypeRequest = js.native
  /**
    * Decodes a DeleteEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): DeleteEntityTypeRequest = js.native
  def decode(reader: Reader, length: Double): DeleteEntityTypeRequest = js.native
  def decode(reader: Uint8Array): DeleteEntityTypeRequest = js.native
  def decode(reader: Uint8Array, length: Double): DeleteEntityTypeRequest = js.native
  /**
    * Decodes a DeleteEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): DeleteEntityTypeRequest = js.native
  def decodeDelimited(reader: Uint8Array): DeleteEntityTypeRequest = js.native
  /**
    * Encodes the specified DeleteEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.verify|verify} messages.
    * @param message DeleteEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDeleteEntityTypeRequest): Writer = js.native
  def encode(message: IDeleteEntityTypeRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DeleteEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.verify|verify} messages.
    * @param message DeleteEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDeleteEntityTypeRequest): Writer = js.native
  def encodeDelimited(message: IDeleteEntityTypeRequest, writer: Writer): Writer = js.native
  /**
    * Creates a DeleteEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteEntityTypeRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): DeleteEntityTypeRequest = js.native
  /**
    * Creates a plain object from a DeleteEntityTypeRequest message. Also converts values to other types if specified.
    * @param message DeleteEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: DeleteEntityTypeRequest): StringDictionary[js.Any] = js.native
  def toObject(message: DeleteEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DeleteEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

