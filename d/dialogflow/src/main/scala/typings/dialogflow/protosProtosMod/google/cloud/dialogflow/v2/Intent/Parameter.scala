package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Parameter. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter")
@js.native
/**
  * Constructs a new Parameter.
  * @param [properties] Properties to set
  */
class Parameter () extends IParameter {
  def this(properties: IParameter) = this()
  /** Parameter defaultValue. */
  @JSName("defaultValue")
  var defaultValue_Parameter: String = js.native
  /** Parameter displayName. */
  @JSName("displayName")
  var displayName_Parameter: String = js.native
  /** Parameter entityTypeDisplayName. */
  @JSName("entityTypeDisplayName")
  var entityTypeDisplayName_Parameter: String = js.native
  /** Parameter isList. */
  @JSName("isList")
  var isList_Parameter: Boolean = js.native
  /** Parameter mandatory. */
  @JSName("mandatory")
  var mandatory_Parameter: Boolean = js.native
  /** Parameter name. */
  @JSName("name")
  var name_Parameter: String = js.native
  /** Parameter prompts. */
  @JSName("prompts")
  var prompts_Parameter: js.Array[String] = js.native
  /** Parameter value. */
  @JSName("value")
  var value_Parameter: String = js.native
  /**
    * Converts this Parameter to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter")
@js.native
object Parameter extends js.Object {
  /**
    * Creates a new Parameter instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Parameter instance
    */
  def create(): Parameter = js.native
  def create(properties: IParameter): Parameter = js.native
  /**
    * Decodes a Parameter message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Parameter
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Parameter = js.native
  def decode(reader: Reader, length: Double): Parameter = js.native
  def decode(reader: Uint8Array): Parameter = js.native
  def decode(reader: Uint8Array, length: Double): Parameter = js.native
  /**
    * Decodes a Parameter message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Parameter
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Parameter = js.native
  def decodeDelimited(reader: Uint8Array): Parameter = js.native
  /**
    * Encodes the specified Parameter message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Parameter.verify|verify} messages.
    * @param message Parameter message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IParameter): Writer = js.native
  def encode(message: IParameter, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Parameter message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Parameter.verify|verify} messages.
    * @param message Parameter message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IParameter): Writer = js.native
  def encodeDelimited(message: IParameter, writer: Writer): Writer = js.native
  /**
    * Creates a Parameter message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Parameter
    */
  def fromObject(`object`: StringDictionary[js.Any]): Parameter = js.native
  /**
    * Creates a plain object from a Parameter message. Also converts values to other types if specified.
    * @param message Parameter
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Parameter): StringDictionary[js.Any] = js.native
  def toObject(message: Parameter, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Parameter message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

