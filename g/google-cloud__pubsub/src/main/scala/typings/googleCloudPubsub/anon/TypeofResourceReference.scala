package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.api.IResourceReference
import typings.googleGax.iamServiceMod.google.api.ResourceReference
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofResourceReference extends StObject {
  
  /**
    * Creates a new ResourceReference instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ResourceReference instance
    */
  /* static member */
  def create(): ResourceReference = js.native
  def create(properties: IResourceReference): ResourceReference = js.native
  
  def decode(reader: js.typedarray.Uint8Array): ResourceReference = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ResourceReference = js.native
  /**
    * Decodes a ResourceReference message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ResourceReference
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): ResourceReference = js.native
  def decode(reader: Reader, length: Double): ResourceReference = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): ResourceReference = js.native
  /**
    * Decodes a ResourceReference message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ResourceReference
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): ResourceReference = js.native
  
  /**
    * Encodes the specified ResourceReference message. Does not implicitly {@link google.api.ResourceReference.verify|verify} messages.
    * @param message ResourceReference message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IResourceReference): Writer = js.native
  def encode(message: IResourceReference, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ResourceReference message, length delimited. Does not implicitly {@link google.api.ResourceReference.verify|verify} messages.
    * @param message ResourceReference message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IResourceReference): Writer = js.native
  def encodeDelimited(message: IResourceReference, writer: Writer): Writer = js.native
  
  /**
    * Creates a ResourceReference message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ResourceReference
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): ResourceReference = js.native
  
  /**
    * Creates a plain object from a ResourceReference message. Also converts values to other types if specified.
    * @param message ResourceReference
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: ResourceReference): StringDictionary[Any] = js.native
  def toObject(message: ResourceReference, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a ResourceReference message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
