package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange
import typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.IExtensionRange
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofExtensionRange extends StObject {
  
  /**
    * Creates a new ExtensionRange instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExtensionRange instance
    */
  /* static member */
  def create(): ExtensionRange = js.native
  def create(properties: IExtensionRange): ExtensionRange = js.native
  
  def decode(reader: js.typedarray.Uint8Array): ExtensionRange = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ExtensionRange = js.native
  /**
    * Decodes an ExtensionRange message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExtensionRange
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): ExtensionRange = js.native
  def decode(reader: Reader, length: Double): ExtensionRange = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): ExtensionRange = js.native
  /**
    * Decodes an ExtensionRange message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExtensionRange
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): ExtensionRange = js.native
  
  /**
    * Encodes the specified ExtensionRange message. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
    * @param message ExtensionRange message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IExtensionRange): Writer = js.native
  def encode(message: IExtensionRange, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ExtensionRange message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
    * @param message ExtensionRange message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IExtensionRange): Writer = js.native
  def encodeDelimited(message: IExtensionRange, writer: Writer): Writer = js.native
  
  /**
    * Creates an ExtensionRange message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExtensionRange
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): ExtensionRange = js.native
  
  /**
    * Creates a plain object from an ExtensionRange message. Also converts values to other types if specified.
    * @param message ExtensionRange
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: ExtensionRange): StringDictionary[Any] = js.native
  def toObject(message: ExtensionRange, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies an ExtensionRange message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
