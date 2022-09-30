package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.locationsMod.google.protobuf.DescriptorProto
import typings.googleGax.locationsMod.google.protobuf.IDescriptorProto
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDescriptorProtoEncode extends StObject {
  
  /** Represents an ExtensionRange. */
  var ExtensionRange: (Instantiable0[
    typings.googleGax.mod.LocationProtos.google.protobuf.DescriptorProto.ExtensionRange
  ]) & TypeofExtensionRangeCreate = js.native
  
  /** Represents a ReservedRange. */
  var ReservedRange: (Instantiable0[
    typings.googleGax.mod.LocationProtos.google.protobuf.DescriptorProto.ReservedRange
  ]) & TypeofReservedRangeCreate = js.native
  
  /**
    * Creates a new DescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DescriptorProto instance
    */
  /* static member */
  def create(): DescriptorProto = js.native
  def create(properties: IDescriptorProto): DescriptorProto = js.native
  
  def decode(reader: js.typedarray.Uint8Array): DescriptorProto = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): DescriptorProto = js.native
  /**
    * Decodes a DescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): DescriptorProto = js.native
  def decode(reader: Reader, length: Double): DescriptorProto = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): DescriptorProto = js.native
  /**
    * Decodes a DescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): DescriptorProto = js.native
  
  /**
    * Encodes the specified DescriptorProto message. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
    * @param message DescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IDescriptorProto): Writer = js.native
  def encode(message: IDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
    * @param message DescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IDescriptorProto): Writer = js.native
  def encodeDelimited(message: IDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates a DescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DescriptorProto
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): DescriptorProto = js.native
  
  /**
    * Creates a plain object from a DescriptorProto message. Also converts values to other types if specified.
    * @param message DescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: DescriptorProto): StringDictionary[Any] = js.native
  def toObject(message: DescriptorProto, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a DescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
