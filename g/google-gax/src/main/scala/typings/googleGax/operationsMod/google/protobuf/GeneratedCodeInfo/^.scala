package typings.googleGax.operationsMod.google.protobuf.GeneratedCodeInfo

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.protobuf.IGeneratedCodeInfo
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/protos/operations", "google.protobuf.GeneratedCodeInfo")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new GeneratedCodeInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GeneratedCodeInfo instance
    */
  def create(): typings.googleGax.operationsMod.google.protobuf.GeneratedCodeInfo = js.native
  def create(properties: IGeneratedCodeInfo): typings.googleGax.operationsMod.google.protobuf.GeneratedCodeInfo = js.native
  /**
    * Decodes a GeneratedCodeInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GeneratedCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleGax.operationsMod.google.protobuf.GeneratedCodeInfo = js.native
  def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.protobuf.GeneratedCodeInfo = js.native
  def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.GeneratedCodeInfo = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.protobuf.GeneratedCodeInfo = js.native
  /**
    * Decodes a GeneratedCodeInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GeneratedCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.protobuf.GeneratedCodeInfo = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.GeneratedCodeInfo = js.native
  /**
    * Encodes the specified GeneratedCodeInfo message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
    * @param message GeneratedCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGeneratedCodeInfo): Writer = js.native
  def encode(message: IGeneratedCodeInfo, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GeneratedCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
    * @param message GeneratedCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGeneratedCodeInfo): Writer = js.native
  def encodeDelimited(message: IGeneratedCodeInfo, writer: Writer): Writer = js.native
  /**
    * Creates a GeneratedCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GeneratedCodeInfo
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.protobuf.GeneratedCodeInfo = js.native
  /**
    * Creates a plain object from a GeneratedCodeInfo message. Also converts values to other types if specified.
    * @param message GeneratedCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleGax.operationsMod.google.protobuf.GeneratedCodeInfo): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleGax.operationsMod.google.protobuf.GeneratedCodeInfo,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GeneratedCodeInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

