package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.locationsMod.google.protobuf.EnumDescriptorProto
import typings.googleGax.locationsMod.google.protobuf.IEnumDescriptorProto
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEnumDescriptorProtoDecode extends StObject {
  
  /** Represents an EnumReservedRange. */
  var EnumReservedRange: (Instantiable0[
    typings.googleGax.mod.fallback.LocationProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange
  ]) & TypeofEnumReservedRangeCreate = js.native
  
  /**
    * Creates a new EnumDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumDescriptorProto instance
    */
  /* static member */
  def create(): EnumDescriptorProto = js.native
  def create(properties: IEnumDescriptorProto): EnumDescriptorProto = js.native
  
  def decode(reader: js.typedarray.Uint8Array): EnumDescriptorProto = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): EnumDescriptorProto = js.native
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): EnumDescriptorProto = js.native
  def decode(reader: Reader, length: Double): EnumDescriptorProto = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): EnumDescriptorProto = js.native
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): EnumDescriptorProto = js.native
  
  /**
    * Encodes the specified EnumDescriptorProto message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IEnumDescriptorProto): Writer = js.native
  def encode(message: IEnumDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EnumDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IEnumDescriptorProto): Writer = js.native
  def encodeDelimited(message: IEnumDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates an EnumDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumDescriptorProto
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): EnumDescriptorProto = js.native
  
  /**
    * Creates a plain object from an EnumDescriptorProto message. Also converts values to other types if specified.
    * @param message EnumDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: EnumDescriptorProto): StringDictionary[Any] = js.native
  def toObject(message: EnumDescriptorProto, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies an EnumDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
