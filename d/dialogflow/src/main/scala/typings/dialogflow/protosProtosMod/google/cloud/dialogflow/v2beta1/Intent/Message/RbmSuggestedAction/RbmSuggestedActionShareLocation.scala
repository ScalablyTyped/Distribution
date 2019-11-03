package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a RbmSuggestedActionShareLocation. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionShareLocation")
@js.native
/**
  * Constructs a new RbmSuggestedActionShareLocation.
  * @param [properties] Properties to set
  */
class RbmSuggestedActionShareLocation () extends IRbmSuggestedActionShareLocation {
  def this(properties: IRbmSuggestedActionShareLocation) = this()
  /**
    * Converts this RbmSuggestedActionShareLocation to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionShareLocation")
@js.native
object RbmSuggestedActionShareLocation extends js.Object {
  /**
    * Creates a new RbmSuggestedActionShareLocation instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RbmSuggestedActionShareLocation instance
    */
  def create(): RbmSuggestedActionShareLocation = js.native
  def create(properties: IRbmSuggestedActionShareLocation): RbmSuggestedActionShareLocation = js.native
  /**
    * Decodes a RbmSuggestedActionShareLocation message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RbmSuggestedActionShareLocation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): RbmSuggestedActionShareLocation = js.native
  def decode(reader: Reader, length: Double): RbmSuggestedActionShareLocation = js.native
  def decode(reader: Uint8Array): RbmSuggestedActionShareLocation = js.native
  def decode(reader: Uint8Array, length: Double): RbmSuggestedActionShareLocation = js.native
  /**
    * Decodes a RbmSuggestedActionShareLocation message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RbmSuggestedActionShareLocation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): RbmSuggestedActionShareLocation = js.native
  def decodeDelimited(reader: Uint8Array): RbmSuggestedActionShareLocation = js.native
  /**
    * Encodes the specified RbmSuggestedActionShareLocation message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionShareLocation.verify|verify} messages.
    * @param message RbmSuggestedActionShareLocation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRbmSuggestedActionShareLocation): Writer = js.native
  def encode(message: IRbmSuggestedActionShareLocation, writer: Writer): Writer = js.native
  /**
    * Encodes the specified RbmSuggestedActionShareLocation message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionShareLocation.verify|verify} messages.
    * @param message RbmSuggestedActionShareLocation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRbmSuggestedActionShareLocation): Writer = js.native
  def encodeDelimited(message: IRbmSuggestedActionShareLocation, writer: Writer): Writer = js.native
  /**
    * Creates a RbmSuggestedActionShareLocation message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RbmSuggestedActionShareLocation
    */
  def fromObject(`object`: StringDictionary[js.Any]): RbmSuggestedActionShareLocation = js.native
  /**
    * Creates a plain object from a RbmSuggestedActionShareLocation message. Also converts values to other types if specified.
    * @param message RbmSuggestedActionShareLocation
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: RbmSuggestedActionShareLocation): StringDictionary[js.Any] = js.native
  def toObject(message: RbmSuggestedActionShareLocation, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a RbmSuggestedActionShareLocation message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

