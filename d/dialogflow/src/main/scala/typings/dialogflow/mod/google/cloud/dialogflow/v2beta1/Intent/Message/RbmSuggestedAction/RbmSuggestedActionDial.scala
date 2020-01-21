package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a RbmSuggestedActionDial. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionDial")
@js.native
/**
  * Constructs a new RbmSuggestedActionDial.
  * @param [properties] Properties to set
  */
class RbmSuggestedActionDial () extends IRbmSuggestedActionDial {
  def this(properties: IRbmSuggestedActionDial) = this()
  /** RbmSuggestedActionDial phoneNumber. */
  @JSName("phoneNumber")
  var phoneNumber_RbmSuggestedActionDial: String = js.native
  /**
    * Converts this RbmSuggestedActionDial to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionDial")
@js.native
object RbmSuggestedActionDial extends js.Object {
  /**
    * Creates a new RbmSuggestedActionDial instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RbmSuggestedActionDial instance
    */
  def create(): RbmSuggestedActionDial = js.native
  def create(properties: IRbmSuggestedActionDial): RbmSuggestedActionDial = js.native
  /**
    * Decodes a RbmSuggestedActionDial message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RbmSuggestedActionDial
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): RbmSuggestedActionDial = js.native
  def decode(reader: Reader, length: Double): RbmSuggestedActionDial = js.native
  def decode(reader: Uint8Array): RbmSuggestedActionDial = js.native
  def decode(reader: Uint8Array, length: Double): RbmSuggestedActionDial = js.native
  /**
    * Decodes a RbmSuggestedActionDial message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RbmSuggestedActionDial
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): RbmSuggestedActionDial = js.native
  def decodeDelimited(reader: Uint8Array): RbmSuggestedActionDial = js.native
  /**
    * Encodes the specified RbmSuggestedActionDial message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionDial.verify|verify} messages.
    * @param message RbmSuggestedActionDial message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRbmSuggestedActionDial): Writer = js.native
  def encode(message: IRbmSuggestedActionDial, writer: Writer): Writer = js.native
  /**
    * Encodes the specified RbmSuggestedActionDial message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionDial.verify|verify} messages.
    * @param message RbmSuggestedActionDial message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRbmSuggestedActionDial): Writer = js.native
  def encodeDelimited(message: IRbmSuggestedActionDial, writer: Writer): Writer = js.native
  /**
    * Creates a RbmSuggestedActionDial message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RbmSuggestedActionDial
    */
  def fromObject(`object`: StringDictionary[js.Any]): RbmSuggestedActionDial = js.native
  /**
    * Creates a plain object from a RbmSuggestedActionDial message. Also converts values to other types if specified.
    * @param message RbmSuggestedActionDial
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: RbmSuggestedActionDial): StringDictionary[js.Any] = js.native
  def toObject(message: RbmSuggestedActionDial, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a RbmSuggestedActionDial message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

