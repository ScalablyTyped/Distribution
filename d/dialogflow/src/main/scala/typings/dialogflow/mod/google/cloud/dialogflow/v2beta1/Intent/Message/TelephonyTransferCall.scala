package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a TelephonyTransferCall. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyTransferCall")
@js.native
/**
  * Constructs a new TelephonyTransferCall.
  * @param [properties] Properties to set
  */
class TelephonyTransferCall () extends ITelephonyTransferCall {
  def this(properties: ITelephonyTransferCall) = this()
  /** TelephonyTransferCall phoneNumber. */
  @JSName("phoneNumber")
  var phoneNumber_TelephonyTransferCall: String = js.native
  /**
    * Converts this TelephonyTransferCall to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyTransferCall")
@js.native
object TelephonyTransferCall extends js.Object {
  /**
    * Creates a new TelephonyTransferCall instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TelephonyTransferCall instance
    */
  def create(): TelephonyTransferCall = js.native
  def create(properties: ITelephonyTransferCall): TelephonyTransferCall = js.native
  /**
    * Decodes a TelephonyTransferCall message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TelephonyTransferCall
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TelephonyTransferCall = js.native
  def decode(reader: Reader, length: Double): TelephonyTransferCall = js.native
  def decode(reader: Uint8Array): TelephonyTransferCall = js.native
  def decode(reader: Uint8Array, length: Double): TelephonyTransferCall = js.native
  /**
    * Decodes a TelephonyTransferCall message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TelephonyTransferCall
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TelephonyTransferCall = js.native
  def decodeDelimited(reader: Uint8Array): TelephonyTransferCall = js.native
  /**
    * Encodes the specified TelephonyTransferCall message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyTransferCall.verify|verify} messages.
    * @param message TelephonyTransferCall message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITelephonyTransferCall): Writer = js.native
  def encode(message: ITelephonyTransferCall, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TelephonyTransferCall message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyTransferCall.verify|verify} messages.
    * @param message TelephonyTransferCall message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITelephonyTransferCall): Writer = js.native
  def encodeDelimited(message: ITelephonyTransferCall, writer: Writer): Writer = js.native
  /**
    * Creates a TelephonyTransferCall message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TelephonyTransferCall
    */
  def fromObject(`object`: StringDictionary[js.Any]): TelephonyTransferCall = js.native
  /**
    * Creates a plain object from a TelephonyTransferCall message. Also converts values to other types if specified.
    * @param message TelephonyTransferCall
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TelephonyTransferCall): StringDictionary[js.Any] = js.native
  def toObject(message: TelephonyTransferCall, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TelephonyTransferCall message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

