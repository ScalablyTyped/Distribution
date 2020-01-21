package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DeleteAllContextsRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteAllContextsRequest")
@js.native
/**
  * Constructs a new DeleteAllContextsRequest.
  * @param [properties] Properties to set
  */
class DeleteAllContextsRequest () extends IDeleteAllContextsRequest {
  def this(properties: IDeleteAllContextsRequest) = this()
  /** DeleteAllContextsRequest parent. */
  @JSName("parent")
  var parent_DeleteAllContextsRequest: String = js.native
  /**
    * Converts this DeleteAllContextsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteAllContextsRequest")
@js.native
object DeleteAllContextsRequest extends js.Object {
  /**
    * Creates a new DeleteAllContextsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteAllContextsRequest instance
    */
  def create(): DeleteAllContextsRequest = js.native
  def create(properties: IDeleteAllContextsRequest): DeleteAllContextsRequest = js.native
  /**
    * Decodes a DeleteAllContextsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteAllContextsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): DeleteAllContextsRequest = js.native
  def decode(reader: Reader, length: Double): DeleteAllContextsRequest = js.native
  def decode(reader: Uint8Array): DeleteAllContextsRequest = js.native
  def decode(reader: Uint8Array, length: Double): DeleteAllContextsRequest = js.native
  /**
    * Decodes a DeleteAllContextsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteAllContextsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): DeleteAllContextsRequest = js.native
  def decodeDelimited(reader: Uint8Array): DeleteAllContextsRequest = js.native
  /**
    * Encodes the specified DeleteAllContextsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteAllContextsRequest.verify|verify} messages.
    * @param message DeleteAllContextsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDeleteAllContextsRequest): Writer = js.native
  def encode(message: IDeleteAllContextsRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DeleteAllContextsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteAllContextsRequest.verify|verify} messages.
    * @param message DeleteAllContextsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDeleteAllContextsRequest): Writer = js.native
  def encodeDelimited(message: IDeleteAllContextsRequest, writer: Writer): Writer = js.native
  /**
    * Creates a DeleteAllContextsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteAllContextsRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): DeleteAllContextsRequest = js.native
  /**
    * Creates a plain object from a DeleteAllContextsRequest message. Also converts values to other types if specified.
    * @param message DeleteAllContextsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: DeleteAllContextsRequest): StringDictionary[js.Any] = js.native
  def toObject(message: DeleteAllContextsRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DeleteAllContextsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

