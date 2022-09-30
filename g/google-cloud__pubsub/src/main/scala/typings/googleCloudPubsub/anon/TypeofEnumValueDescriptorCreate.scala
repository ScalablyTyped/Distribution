package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.locationsMod.google.protobuf.EnumValueDescriptorProto
import typings.googleGax.locationsMod.google.protobuf.IEnumValueDescriptorProto
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEnumValueDescriptorCreate extends StObject {
  
  /**
    * Creates a new EnumValueDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumValueDescriptorProto instance
    */
  /* static member */
  def create(): EnumValueDescriptorProto = js.native
  def create(properties: IEnumValueDescriptorProto): EnumValueDescriptorProto = js.native
  
  def decode(reader: js.typedarray.Uint8Array): EnumValueDescriptorProto = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): EnumValueDescriptorProto = js.native
  /**
    * Decodes an EnumValueDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumValueDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): EnumValueDescriptorProto = js.native
  def decode(reader: Reader, length: Double): EnumValueDescriptorProto = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): EnumValueDescriptorProto = js.native
  /**
    * Decodes an EnumValueDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumValueDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): EnumValueDescriptorProto = js.native
  
  /**
    * Encodes the specified EnumValueDescriptorProto message. Does not implicitly {@link google.protobuf.EnumValueDescriptorProto.verify|verify} messages.
    * @param message EnumValueDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IEnumValueDescriptorProto): Writer = js.native
  def encode(message: IEnumValueDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EnumValueDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.EnumValueDescriptorProto.verify|verify} messages.
    * @param message EnumValueDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IEnumValueDescriptorProto): Writer = js.native
  def encodeDelimited(message: IEnumValueDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates an EnumValueDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumValueDescriptorProto
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): EnumValueDescriptorProto = js.native
  
  /**
    * Creates a plain object from an EnumValueDescriptorProto message. Also converts values to other types if specified.
    * @param message EnumValueDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: EnumValueDescriptorProto): StringDictionary[Any] = js.native
  def toObject(message: EnumValueDescriptorProto, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies an EnumValueDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
