package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.locationsMod.google.protobuf.EnumDescriptorProto.EnumReservedRange
import typings.googleGax.locationsMod.google.protobuf.EnumDescriptorProto.IEnumReservedRange
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEnumReservedRangeCreate extends StObject {
  
  /**
    * Creates a new EnumReservedRange instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumReservedRange instance
    */
  /* static member */
  def create(): EnumReservedRange = js.native
  def create(properties: IEnumReservedRange): EnumReservedRange = js.native
  
  def decode(reader: js.typedarray.Uint8Array): EnumReservedRange = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): EnumReservedRange = js.native
  /**
    * Decodes an EnumReservedRange message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumReservedRange
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): EnumReservedRange = js.native
  def decode(reader: Reader, length: Double): EnumReservedRange = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): EnumReservedRange = js.native
  /**
    * Decodes an EnumReservedRange message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumReservedRange
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): EnumReservedRange = js.native
  
  /**
    * Encodes the specified EnumReservedRange message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
    * @param message EnumReservedRange message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IEnumReservedRange): Writer = js.native
  def encode(message: IEnumReservedRange, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EnumReservedRange message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
    * @param message EnumReservedRange message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IEnumReservedRange): Writer = js.native
  def encodeDelimited(message: IEnumReservedRange, writer: Writer): Writer = js.native
  
  /**
    * Creates an EnumReservedRange message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumReservedRange
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): EnumReservedRange = js.native
  
  /**
    * Creates a plain object from an EnumReservedRange message. Also converts values to other types if specified.
    * @param message EnumReservedRange
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: EnumReservedRange): StringDictionary[Any] = js.native
  def toObject(message: EnumReservedRange, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies an EnumReservedRange message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
