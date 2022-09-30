package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.iam.v1.Binding
import typings.googleGax.iamServiceMod.google.iam.v1.IBinding
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBinding extends StObject {
  
  /**
    * Creates a new Binding instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Binding instance
    */
  /* static member */
  def create(): Binding = js.native
  def create(properties: IBinding): Binding = js.native
  
  def decode(reader: js.typedarray.Uint8Array): Binding = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): Binding = js.native
  /**
    * Decodes a Binding message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Binding
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): Binding = js.native
  def decode(reader: Reader, length: Double): Binding = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): Binding = js.native
  /**
    * Decodes a Binding message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Binding
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): Binding = js.native
  
  /**
    * Encodes the specified Binding message. Does not implicitly {@link google.iam.v1.Binding.verify|verify} messages.
    * @param message Binding message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IBinding): Writer = js.native
  def encode(message: IBinding, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Binding message, length delimited. Does not implicitly {@link google.iam.v1.Binding.verify|verify} messages.
    * @param message Binding message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IBinding): Writer = js.native
  def encodeDelimited(message: IBinding, writer: Writer): Writer = js.native
  
  /**
    * Creates a Binding message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Binding
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): Binding = js.native
  
  /**
    * Creates a plain object from a Binding message. Also converts values to other types if specified.
    * @param message Binding
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: Binding): StringDictionary[Any] = js.native
  def toObject(message: Binding, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a Binding message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
