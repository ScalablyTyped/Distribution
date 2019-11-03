package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SetAgentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest")
@js.native
/**
  * Constructs a new SetAgentRequest.
  * @param [properties] Properties to set
  */
class SetAgentRequest () extends ISetAgentRequest {
  def this(properties: ISetAgentRequest) = this()
  /**
    * Converts this SetAgentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest")
@js.native
object SetAgentRequest extends js.Object {
  /**
    * Creates a new SetAgentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SetAgentRequest instance
    */
  def create(): SetAgentRequest = js.native
  def create(properties: ISetAgentRequest): SetAgentRequest = js.native
  /**
    * Decodes a SetAgentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SetAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): SetAgentRequest = js.native
  def decode(reader: Reader, length: Double): SetAgentRequest = js.native
  def decode(reader: Uint8Array): SetAgentRequest = js.native
  def decode(reader: Uint8Array, length: Double): SetAgentRequest = js.native
  /**
    * Decodes a SetAgentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SetAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): SetAgentRequest = js.native
  def decodeDelimited(reader: Uint8Array): SetAgentRequest = js.native
  /**
    * Encodes the specified SetAgentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SetAgentRequest.verify|verify} messages.
    * @param message SetAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISetAgentRequest): Writer = js.native
  def encode(message: ISetAgentRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SetAgentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SetAgentRequest.verify|verify} messages.
    * @param message SetAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISetAgentRequest): Writer = js.native
  def encodeDelimited(message: ISetAgentRequest, writer: Writer): Writer = js.native
  /**
    * Creates a SetAgentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SetAgentRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): SetAgentRequest = js.native
  /**
    * Creates a plain object from a SetAgentRequest message. Also converts values to other types if specified.
    * @param message SetAgentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: SetAgentRequest): StringDictionary[js.Any] = js.native
  def toObject(message: SetAgentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SetAgentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

