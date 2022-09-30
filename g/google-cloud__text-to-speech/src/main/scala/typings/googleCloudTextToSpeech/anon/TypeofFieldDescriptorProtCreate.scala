package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.locationsMod.google.protobuf.FieldDescriptorProto
import typings.googleGax.locationsMod.google.protobuf.IFieldDescriptorProto
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFieldDescriptorProtCreate extends StObject {
  
  /**
    * Creates a new FieldDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldDescriptorProto instance
    */
  /* static member */
  def create(): FieldDescriptorProto = js.native
  def create(properties: IFieldDescriptorProto): FieldDescriptorProto = js.native
  
  def decode(reader: js.typedarray.Uint8Array): FieldDescriptorProto = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): FieldDescriptorProto = js.native
  /**
    * Decodes a FieldDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): FieldDescriptorProto = js.native
  def decode(reader: Reader, length: Double): FieldDescriptorProto = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): FieldDescriptorProto = js.native
  /**
    * Decodes a FieldDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): FieldDescriptorProto = js.native
  
  /**
    * Encodes the specified FieldDescriptorProto message. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
    * @param message FieldDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IFieldDescriptorProto): Writer = js.native
  def encode(message: IFieldDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FieldDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
    * @param message FieldDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IFieldDescriptorProto): Writer = js.native
  def encodeDelimited(message: IFieldDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates a FieldDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldDescriptorProto
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): FieldDescriptorProto = js.native
  
  /**
    * Creates a plain object from a FieldDescriptorProto message. Also converts values to other types if specified.
    * @param message FieldDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: FieldDescriptorProto): StringDictionary[Any] = js.native
  def toObject(message: FieldDescriptorProto, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a FieldDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
