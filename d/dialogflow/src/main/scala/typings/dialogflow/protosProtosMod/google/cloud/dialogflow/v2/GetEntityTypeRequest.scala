package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GetEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.GetEntityTypeRequest")
@js.native
/**
  * Constructs a new GetEntityTypeRequest.
  * @param [properties] Properties to set
  */
class GetEntityTypeRequest () extends IGetEntityTypeRequest {
  def this(properties: IGetEntityTypeRequest) = this()
  /** GetEntityTypeRequest languageCode. */
  @JSName("languageCode")
  var languageCode_GetEntityTypeRequest: String = js.native
  /** GetEntityTypeRequest name. */
  @JSName("name")
  var name_GetEntityTypeRequest: String = js.native
  /**
    * Converts this GetEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.GetEntityTypeRequest")
@js.native
object GetEntityTypeRequest extends js.Object {
  /**
    * Creates a new GetEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetEntityTypeRequest instance
    */
  def create(): GetEntityTypeRequest = js.native
  def create(properties: IGetEntityTypeRequest): GetEntityTypeRequest = js.native
  /**
    * Decodes a GetEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GetEntityTypeRequest = js.native
  def decode(reader: Reader, length: Double): GetEntityTypeRequest = js.native
  def decode(reader: Uint8Array): GetEntityTypeRequest = js.native
  def decode(reader: Uint8Array, length: Double): GetEntityTypeRequest = js.native
  /**
    * Decodes a GetEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GetEntityTypeRequest = js.native
  def decodeDelimited(reader: Uint8Array): GetEntityTypeRequest = js.native
  /**
    * Encodes the specified GetEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.GetEntityTypeRequest.verify|verify} messages.
    * @param message GetEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGetEntityTypeRequest): Writer = js.native
  def encode(message: IGetEntityTypeRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GetEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.GetEntityTypeRequest.verify|verify} messages.
    * @param message GetEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGetEntityTypeRequest): Writer = js.native
  def encodeDelimited(message: IGetEntityTypeRequest, writer: Writer): Writer = js.native
  /**
    * Creates a GetEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetEntityTypeRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): GetEntityTypeRequest = js.native
  /**
    * Creates a plain object from a GetEntityTypeRequest message. Also converts values to other types if specified.
    * @param message GetEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GetEntityTypeRequest): StringDictionary[js.Any] = js.native
  def toObject(message: GetEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GetEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

