package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GetContextRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetContextRequest")
@js.native
/**
  * Constructs a new GetContextRequest.
  * @param [properties] Properties to set
  */
class GetContextRequest () extends IGetContextRequest {
  def this(properties: IGetContextRequest) = this()
  /** GetContextRequest name. */
  @JSName("name")
  var name_GetContextRequest: String = js.native
  /**
    * Converts this GetContextRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetContextRequest")
@js.native
object GetContextRequest extends js.Object {
  /**
    * Creates a new GetContextRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetContextRequest instance
    */
  def create(): GetContextRequest = js.native
  def create(properties: IGetContextRequest): GetContextRequest = js.native
  /**
    * Decodes a GetContextRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GetContextRequest = js.native
  def decode(reader: Reader, length: Double): GetContextRequest = js.native
  def decode(reader: Uint8Array): GetContextRequest = js.native
  def decode(reader: Uint8Array, length: Double): GetContextRequest = js.native
  /**
    * Decodes a GetContextRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GetContextRequest = js.native
  def decodeDelimited(reader: Uint8Array): GetContextRequest = js.native
  /**
    * Encodes the specified GetContextRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetContextRequest.verify|verify} messages.
    * @param message GetContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGetContextRequest): Writer = js.native
  def encode(message: IGetContextRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GetContextRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetContextRequest.verify|verify} messages.
    * @param message GetContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGetContextRequest): Writer = js.native
  def encodeDelimited(message: IGetContextRequest, writer: Writer): Writer = js.native
  /**
    * Creates a GetContextRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetContextRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): GetContextRequest = js.native
  /**
    * Creates a plain object from a GetContextRequest message. Also converts values to other types if specified.
    * @param message GetContextRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GetContextRequest): StringDictionary[js.Any] = js.native
  def toObject(message: GetContextRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GetContextRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

