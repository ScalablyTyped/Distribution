package typings.googleGax.operationsMod.google.protobuf.DescriptorProto

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an ExtensionRange. */
@JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange")
@js.native
/**
  * Constructs a new ExtensionRange.
  * @param [properties] Properties to set
  */
class ExtensionRange () extends IExtensionRange {
  def this(properties: IExtensionRange) = this()
  /** ExtensionRange end. */
  @JSName("end")
  var end_ExtensionRange: Double = js.native
  /** ExtensionRange start. */
  @JSName("start")
  var start_ExtensionRange: Double = js.native
  /**
    * Converts this ExtensionRange to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange")
@js.native
object ExtensionRange extends js.Object {
  /**
    * Creates a new ExtensionRange instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExtensionRange instance
    */
  def create(): ExtensionRange = js.native
  def create(properties: IExtensionRange): ExtensionRange = js.native
  /**
    * Decodes an ExtensionRange message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExtensionRange
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ExtensionRange = js.native
  def decode(reader: Reader, length: Double): ExtensionRange = js.native
  def decode(reader: Uint8Array): ExtensionRange = js.native
  def decode(reader: Uint8Array, length: Double): ExtensionRange = js.native
  /**
    * Decodes an ExtensionRange message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExtensionRange
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ExtensionRange = js.native
  def decodeDelimited(reader: Uint8Array): ExtensionRange = js.native
  /**
    * Encodes the specified ExtensionRange message. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
    * @param message ExtensionRange message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IExtensionRange): Writer = js.native
  def encode(message: IExtensionRange, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ExtensionRange message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
    * @param message ExtensionRange message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IExtensionRange): Writer = js.native
  def encodeDelimited(message: IExtensionRange, writer: Writer): Writer = js.native
  /**
    * Creates an ExtensionRange message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExtensionRange
    */
  def fromObject(`object`: StringDictionary[js.Any]): ExtensionRange = js.native
  /**
    * Creates a plain object from an ExtensionRange message. Also converts values to other types if specified.
    * @param message ExtensionRange
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ExtensionRange): StringDictionary[js.Any] = js.native
  def toObject(message: ExtensionRange, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an ExtensionRange message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

