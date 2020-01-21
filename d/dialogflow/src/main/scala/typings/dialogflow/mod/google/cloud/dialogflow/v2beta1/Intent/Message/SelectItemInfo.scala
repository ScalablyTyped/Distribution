package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SelectItemInfo. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.SelectItemInfo")
@js.native
/**
  * Constructs a new SelectItemInfo.
  * @param [properties] Properties to set
  */
class SelectItemInfo () extends ISelectItemInfo {
  def this(properties: ISelectItemInfo) = this()
  /** SelectItemInfo key. */
  @JSName("key")
  var key_SelectItemInfo: String = js.native
  /** SelectItemInfo synonyms. */
  @JSName("synonyms")
  var synonyms_SelectItemInfo: js.Array[String] = js.native
  /**
    * Converts this SelectItemInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.SelectItemInfo")
@js.native
object SelectItemInfo extends js.Object {
  /**
    * Creates a new SelectItemInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SelectItemInfo instance
    */
  def create(): SelectItemInfo = js.native
  def create(properties: ISelectItemInfo): SelectItemInfo = js.native
  /**
    * Decodes a SelectItemInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SelectItemInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): SelectItemInfo = js.native
  def decode(reader: Reader, length: Double): SelectItemInfo = js.native
  def decode(reader: Uint8Array): SelectItemInfo = js.native
  def decode(reader: Uint8Array, length: Double): SelectItemInfo = js.native
  /**
    * Decodes a SelectItemInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SelectItemInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): SelectItemInfo = js.native
  def decodeDelimited(reader: Uint8Array): SelectItemInfo = js.native
  /**
    * Encodes the specified SelectItemInfo message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.SelectItemInfo.verify|verify} messages.
    * @param message SelectItemInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISelectItemInfo): Writer = js.native
  def encode(message: ISelectItemInfo, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SelectItemInfo message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.SelectItemInfo.verify|verify} messages.
    * @param message SelectItemInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISelectItemInfo): Writer = js.native
  def encodeDelimited(message: ISelectItemInfo, writer: Writer): Writer = js.native
  /**
    * Creates a SelectItemInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SelectItemInfo
    */
  def fromObject(`object`: StringDictionary[js.Any]): SelectItemInfo = js.native
  /**
    * Creates a plain object from a SelectItemInfo message. Also converts values to other types if specified.
    * @param message SelectItemInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: SelectItemInfo): StringDictionary[js.Any] = js.native
  def toObject(message: SelectItemInfo, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SelectItemInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

