package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.api.IResourceDescriptor
import typings.googleGax.iamServiceMod.google.api.ResourceDescriptor
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofResourceDescriptor extends StObject {
  
  /**
    * Creates a new ResourceDescriptor instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ResourceDescriptor instance
    */
  /* static member */
  def create(): ResourceDescriptor = js.native
  def create(properties: IResourceDescriptor): ResourceDescriptor = js.native
  
  def decode(reader: js.typedarray.Uint8Array): ResourceDescriptor = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ResourceDescriptor = js.native
  /**
    * Decodes a ResourceDescriptor message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ResourceDescriptor
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): ResourceDescriptor = js.native
  def decode(reader: Reader, length: Double): ResourceDescriptor = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): ResourceDescriptor = js.native
  /**
    * Decodes a ResourceDescriptor message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ResourceDescriptor
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): ResourceDescriptor = js.native
  
  /**
    * Encodes the specified ResourceDescriptor message. Does not implicitly {@link google.api.ResourceDescriptor.verify|verify} messages.
    * @param message ResourceDescriptor message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IResourceDescriptor): Writer = js.native
  def encode(message: IResourceDescriptor, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ResourceDescriptor message, length delimited. Does not implicitly {@link google.api.ResourceDescriptor.verify|verify} messages.
    * @param message ResourceDescriptor message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IResourceDescriptor): Writer = js.native
  def encodeDelimited(message: IResourceDescriptor, writer: Writer): Writer = js.native
  
  /**
    * Creates a ResourceDescriptor message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ResourceDescriptor
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): ResourceDescriptor = js.native
  
  /**
    * Creates a plain object from a ResourceDescriptor message. Also converts values to other types if specified.
    * @param message ResourceDescriptor
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: ResourceDescriptor): StringDictionary[Any] = js.native
  def toObject(message: ResourceDescriptor, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a ResourceDescriptor message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
