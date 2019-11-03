package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an UpdateContextRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.UpdateContextRequest")
@js.native
/**
  * Constructs a new UpdateContextRequest.
  * @param [properties] Properties to set
  */
class UpdateContextRequest () extends IUpdateContextRequest {
  def this(properties: IUpdateContextRequest) = this()
  /**
    * Converts this UpdateContextRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.UpdateContextRequest")
@js.native
object UpdateContextRequest extends js.Object {
  /**
    * Creates a new UpdateContextRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateContextRequest instance
    */
  def create(): UpdateContextRequest = js.native
  def create(properties: IUpdateContextRequest): UpdateContextRequest = js.native
  /**
    * Decodes an UpdateContextRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): UpdateContextRequest = js.native
  def decode(reader: Reader, length: Double): UpdateContextRequest = js.native
  def decode(reader: Uint8Array): UpdateContextRequest = js.native
  def decode(reader: Uint8Array, length: Double): UpdateContextRequest = js.native
  /**
    * Decodes an UpdateContextRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): UpdateContextRequest = js.native
  def decodeDelimited(reader: Uint8Array): UpdateContextRequest = js.native
  /**
    * Encodes the specified UpdateContextRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.UpdateContextRequest.verify|verify} messages.
    * @param message UpdateContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IUpdateContextRequest): Writer = js.native
  def encode(message: IUpdateContextRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified UpdateContextRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.UpdateContextRequest.verify|verify} messages.
    * @param message UpdateContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IUpdateContextRequest): Writer = js.native
  def encodeDelimited(message: IUpdateContextRequest, writer: Writer): Writer = js.native
  /**
    * Creates an UpdateContextRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateContextRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): UpdateContextRequest = js.native
  /**
    * Creates a plain object from an UpdateContextRequest message. Also converts values to other types if specified.
    * @param message UpdateContextRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: UpdateContextRequest): StringDictionary[js.Any] = js.native
  def toObject(message: UpdateContextRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an UpdateContextRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

