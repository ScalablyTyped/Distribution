package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.protobuf.IServiceDescriptorProto
import typings.googleGax.iamServiceMod.google.protobuf.ServiceDescriptorProto
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofServiceDescriptorPr extends StObject {
  
  /**
    * Creates a new ServiceDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ServiceDescriptorProto instance
    */
  /* static member */
  def create(): ServiceDescriptorProto = js.native
  def create(properties: IServiceDescriptorProto): ServiceDescriptorProto = js.native
  
  def decode(reader: js.typedarray.Uint8Array): ServiceDescriptorProto = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ServiceDescriptorProto = js.native
  /**
    * Decodes a ServiceDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ServiceDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): ServiceDescriptorProto = js.native
  def decode(reader: Reader, length: Double): ServiceDescriptorProto = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): ServiceDescriptorProto = js.native
  /**
    * Decodes a ServiceDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ServiceDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): ServiceDescriptorProto = js.native
  
  /**
    * Encodes the specified ServiceDescriptorProto message. Does not implicitly {@link google.protobuf.ServiceDescriptorProto.verify|verify} messages.
    * @param message ServiceDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IServiceDescriptorProto): Writer = js.native
  def encode(message: IServiceDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ServiceDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.ServiceDescriptorProto.verify|verify} messages.
    * @param message ServiceDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IServiceDescriptorProto): Writer = js.native
  def encodeDelimited(message: IServiceDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates a ServiceDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ServiceDescriptorProto
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): ServiceDescriptorProto = js.native
  
  /**
    * Creates a plain object from a ServiceDescriptorProto message. Also converts values to other types if specified.
    * @param message ServiceDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: ServiceDescriptorProto): StringDictionary[Any] = js.native
  def toObject(message: ServiceDescriptorProto, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a ServiceDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
