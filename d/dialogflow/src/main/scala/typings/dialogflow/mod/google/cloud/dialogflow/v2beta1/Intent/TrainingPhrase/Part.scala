package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Part. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Part")
@js.native
/**
  * Constructs a new Part.
  * @param [properties] Properties to set
  */
class Part () extends IPart {
  def this(properties: IPart) = this()
  /** Part alias. */
  @JSName("alias")
  var alias_Part: String = js.native
  /** Part entityType. */
  @JSName("entityType")
  var entityType_Part: String = js.native
  /** Part text. */
  @JSName("text")
  var text_Part: String = js.native
  /** Part userDefined. */
  @JSName("userDefined")
  var userDefined_Part: Boolean = js.native
  /**
    * Converts this Part to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Part")
@js.native
object Part extends js.Object {
  /**
    * Creates a new Part instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Part instance
    */
  def create(): Part = js.native
  def create(properties: IPart): Part = js.native
  /**
    * Decodes a Part message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Part
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Part = js.native
  def decode(reader: Reader, length: Double): Part = js.native
  def decode(reader: Uint8Array): Part = js.native
  def decode(reader: Uint8Array, length: Double): Part = js.native
  /**
    * Decodes a Part message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Part
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Part = js.native
  def decodeDelimited(reader: Uint8Array): Part = js.native
  /**
    * Encodes the specified Part message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Part.verify|verify} messages.
    * @param message Part message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPart): Writer = js.native
  def encode(message: IPart, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Part message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Part.verify|verify} messages.
    * @param message Part message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPart): Writer = js.native
  def encodeDelimited(message: IPart, writer: Writer): Writer = js.native
  /**
    * Creates a Part message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Part
    */
  def fromObject(`object`: StringDictionary[js.Any]): Part = js.native
  /**
    * Creates a plain object from a Part message. Also converts values to other types if specified.
    * @param message Part
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Part): StringDictionary[js.Any] = js.native
  def toObject(message: Part, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Part message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

