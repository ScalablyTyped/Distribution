package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.protobuf.EnumValueOptions
import typings.googleGax.operationsMod.google.protobuf.IEnumValueOptions
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEnumValueOptionsDecode extends StObject {
  
  /**
    * Creates a new EnumValueOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumValueOptions instance
    */
  /* static member */
  def create(): EnumValueOptions = js.native
  def create(properties: IEnumValueOptions): EnumValueOptions = js.native
  
  def decode(reader: js.typedarray.Uint8Array): EnumValueOptions = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): EnumValueOptions = js.native
  /**
    * Decodes an EnumValueOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumValueOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): EnumValueOptions = js.native
  def decode(reader: Reader, length: Double): EnumValueOptions = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): EnumValueOptions = js.native
  /**
    * Decodes an EnumValueOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumValueOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): EnumValueOptions = js.native
  
  /**
    * Encodes the specified EnumValueOptions message. Does not implicitly {@link google.protobuf.EnumValueOptions.verify|verify} messages.
    * @param message EnumValueOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IEnumValueOptions): Writer = js.native
  def encode(message: IEnumValueOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EnumValueOptions message, length delimited. Does not implicitly {@link google.protobuf.EnumValueOptions.verify|verify} messages.
    * @param message EnumValueOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IEnumValueOptions): Writer = js.native
  def encodeDelimited(message: IEnumValueOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates an EnumValueOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumValueOptions
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): EnumValueOptions = js.native
  
  /**
    * Creates a plain object from an EnumValueOptions message. Also converts values to other types if specified.
    * @param message EnumValueOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: EnumValueOptions): StringDictionary[Any] = js.native
  def toObject(message: EnumValueOptions, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies an EnumValueOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
