package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a CreateContextRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateContextRequest")
@js.native
/**
  * Constructs a new CreateContextRequest.
  * @param [properties] Properties to set
  */
class CreateContextRequest () extends ICreateContextRequest {
  def this(properties: ICreateContextRequest) = this()
  /** CreateContextRequest parent. */
  @JSName("parent")
  var parent_CreateContextRequest: String = js.native
  /**
    * Converts this CreateContextRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateContextRequest")
@js.native
object CreateContextRequest extends js.Object {
  /**
    * Creates a new CreateContextRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateContextRequest instance
    */
  def create(): CreateContextRequest = js.native
  def create(properties: ICreateContextRequest): CreateContextRequest = js.native
  /**
    * Decodes a CreateContextRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): CreateContextRequest = js.native
  def decode(reader: Reader, length: Double): CreateContextRequest = js.native
  def decode(reader: Uint8Array): CreateContextRequest = js.native
  def decode(reader: Uint8Array, length: Double): CreateContextRequest = js.native
  /**
    * Decodes a CreateContextRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): CreateContextRequest = js.native
  def decodeDelimited(reader: Uint8Array): CreateContextRequest = js.native
  /**
    * Encodes the specified CreateContextRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.CreateContextRequest.verify|verify} messages.
    * @param message CreateContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICreateContextRequest): Writer = js.native
  def encode(message: ICreateContextRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified CreateContextRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.CreateContextRequest.verify|verify} messages.
    * @param message CreateContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICreateContextRequest): Writer = js.native
  def encodeDelimited(message: ICreateContextRequest, writer: Writer): Writer = js.native
  /**
    * Creates a CreateContextRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateContextRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): CreateContextRequest = js.native
  /**
    * Creates a plain object from a CreateContextRequest message. Also converts values to other types if specified.
    * @param message CreateContextRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: CreateContextRequest): StringDictionary[js.Any] = js.native
  def toObject(message: CreateContextRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a CreateContextRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

