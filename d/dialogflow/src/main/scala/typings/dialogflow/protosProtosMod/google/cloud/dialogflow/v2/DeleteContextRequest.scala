package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DeleteContextRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest")
@js.native
/**
  * Constructs a new DeleteContextRequest.
  * @param [properties] Properties to set
  */
class DeleteContextRequest () extends IDeleteContextRequest {
  def this(properties: IDeleteContextRequest) = this()
  /** DeleteContextRequest name. */
  @JSName("name")
  var name_DeleteContextRequest: String = js.native
  /**
    * Converts this DeleteContextRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest")
@js.native
object DeleteContextRequest extends js.Object {
  /**
    * Creates a new DeleteContextRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteContextRequest instance
    */
  def create(): DeleteContextRequest = js.native
  def create(properties: IDeleteContextRequest): DeleteContextRequest = js.native
  /**
    * Decodes a DeleteContextRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): DeleteContextRequest = js.native
  def decode(reader: Reader, length: Double): DeleteContextRequest = js.native
  def decode(reader: Uint8Array): DeleteContextRequest = js.native
  def decode(reader: Uint8Array, length: Double): DeleteContextRequest = js.native
  /**
    * Decodes a DeleteContextRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): DeleteContextRequest = js.native
  def decodeDelimited(reader: Uint8Array): DeleteContextRequest = js.native
  /**
    * Encodes the specified DeleteContextRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteContextRequest.verify|verify} messages.
    * @param message DeleteContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDeleteContextRequest): Writer = js.native
  def encode(message: IDeleteContextRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DeleteContextRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteContextRequest.verify|verify} messages.
    * @param message DeleteContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDeleteContextRequest): Writer = js.native
  def encodeDelimited(message: IDeleteContextRequest, writer: Writer): Writer = js.native
  /**
    * Creates a DeleteContextRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteContextRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): DeleteContextRequest = js.native
  /**
    * Creates a plain object from a DeleteContextRequest message. Also converts values to other types if specified.
    * @param message DeleteContextRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: DeleteContextRequest): StringDictionary[js.Any] = js.native
  def toObject(message: DeleteContextRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DeleteContextRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

