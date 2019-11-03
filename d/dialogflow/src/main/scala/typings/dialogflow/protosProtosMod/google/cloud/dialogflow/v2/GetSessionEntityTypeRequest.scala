package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GetSessionEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.GetSessionEntityTypeRequest")
@js.native
/**
  * Constructs a new GetSessionEntityTypeRequest.
  * @param [properties] Properties to set
  */
class GetSessionEntityTypeRequest () extends IGetSessionEntityTypeRequest {
  def this(properties: IGetSessionEntityTypeRequest) = this()
  /** GetSessionEntityTypeRequest name. */
  @JSName("name")
  var name_GetSessionEntityTypeRequest: String = js.native
  /**
    * Converts this GetSessionEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.GetSessionEntityTypeRequest")
@js.native
object GetSessionEntityTypeRequest extends js.Object {
  /**
    * Creates a new GetSessionEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetSessionEntityTypeRequest instance
    */
  def create(): GetSessionEntityTypeRequest = js.native
  def create(properties: IGetSessionEntityTypeRequest): GetSessionEntityTypeRequest = js.native
  /**
    * Decodes a GetSessionEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GetSessionEntityTypeRequest = js.native
  def decode(reader: Reader, length: Double): GetSessionEntityTypeRequest = js.native
  def decode(reader: Uint8Array): GetSessionEntityTypeRequest = js.native
  def decode(reader: Uint8Array, length: Double): GetSessionEntityTypeRequest = js.native
  /**
    * Decodes a GetSessionEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GetSessionEntityTypeRequest = js.native
  def decodeDelimited(reader: Uint8Array): GetSessionEntityTypeRequest = js.native
  /**
    * Encodes the specified GetSessionEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.GetSessionEntityTypeRequest.verify|verify} messages.
    * @param message GetSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGetSessionEntityTypeRequest): Writer = js.native
  def encode(message: IGetSessionEntityTypeRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GetSessionEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.GetSessionEntityTypeRequest.verify|verify} messages.
    * @param message GetSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGetSessionEntityTypeRequest): Writer = js.native
  def encodeDelimited(message: IGetSessionEntityTypeRequest, writer: Writer): Writer = js.native
  /**
    * Creates a GetSessionEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetSessionEntityTypeRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): GetSessionEntityTypeRequest = js.native
  /**
    * Creates a plain object from a GetSessionEntityTypeRequest message. Also converts values to other types if specified.
    * @param message GetSessionEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GetSessionEntityTypeRequest): StringDictionary[js.Any] = js.native
  def toObject(message: GetSessionEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GetSessionEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

