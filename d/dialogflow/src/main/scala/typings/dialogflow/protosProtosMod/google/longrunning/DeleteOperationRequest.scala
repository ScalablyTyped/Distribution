package typings.dialogflow.protosProtosMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DeleteOperationRequest. */
@JSImport("dialogflow/protos/protos", "google.longrunning.DeleteOperationRequest")
@js.native
/**
  * Constructs a new DeleteOperationRequest.
  * @param [properties] Properties to set
  */
class DeleteOperationRequest () extends IDeleteOperationRequest {
  def this(properties: IDeleteOperationRequest) = this()
  /** DeleteOperationRequest name. */
  @JSName("name")
  var name_DeleteOperationRequest: String = js.native
  /**
    * Converts this DeleteOperationRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.longrunning.DeleteOperationRequest")
@js.native
object DeleteOperationRequest extends js.Object {
  /**
    * Creates a new DeleteOperationRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteOperationRequest instance
    */
  def create(): DeleteOperationRequest = js.native
  def create(properties: IDeleteOperationRequest): DeleteOperationRequest = js.native
  /**
    * Decodes a DeleteOperationRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): DeleteOperationRequest = js.native
  def decode(reader: Reader, length: Double): DeleteOperationRequest = js.native
  def decode(reader: Uint8Array): DeleteOperationRequest = js.native
  def decode(reader: Uint8Array, length: Double): DeleteOperationRequest = js.native
  /**
    * Decodes a DeleteOperationRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): DeleteOperationRequest = js.native
  def decodeDelimited(reader: Uint8Array): DeleteOperationRequest = js.native
  /**
    * Encodes the specified DeleteOperationRequest message. Does not implicitly {@link google.longrunning.DeleteOperationRequest.verify|verify} messages.
    * @param message DeleteOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDeleteOperationRequest): Writer = js.native
  def encode(message: IDeleteOperationRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DeleteOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.DeleteOperationRequest.verify|verify} messages.
    * @param message DeleteOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDeleteOperationRequest): Writer = js.native
  def encodeDelimited(message: IDeleteOperationRequest, writer: Writer): Writer = js.native
  /**
    * Creates a DeleteOperationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteOperationRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): DeleteOperationRequest = js.native
  /**
    * Creates a plain object from a DeleteOperationRequest message. Also converts values to other types if specified.
    * @param message DeleteOperationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: DeleteOperationRequest): StringDictionary[js.Any] = js.native
  def toObject(message: DeleteOperationRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DeleteOperationRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

