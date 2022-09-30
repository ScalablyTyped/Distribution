package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta
import typings.googleGax.iamServiceMod.google.iam.v1.IBindingDelta
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBindingDelta extends StObject {
  
  /**
    * Creates a new BindingDelta instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BindingDelta instance
    */
  /* static member */
  def create(): BindingDelta = js.native
  def create(properties: IBindingDelta): BindingDelta = js.native
  
  def decode(reader: js.typedarray.Uint8Array): BindingDelta = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): BindingDelta = js.native
  /**
    * Decodes a BindingDelta message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BindingDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): BindingDelta = js.native
  def decode(reader: Reader, length: Double): BindingDelta = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): BindingDelta = js.native
  /**
    * Decodes a BindingDelta message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BindingDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): BindingDelta = js.native
  
  /**
    * Encodes the specified BindingDelta message. Does not implicitly {@link google.iam.v1.BindingDelta.verify|verify} messages.
    * @param message BindingDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IBindingDelta): Writer = js.native
  def encode(message: IBindingDelta, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified BindingDelta message, length delimited. Does not implicitly {@link google.iam.v1.BindingDelta.verify|verify} messages.
    * @param message BindingDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IBindingDelta): Writer = js.native
  def encodeDelimited(message: IBindingDelta, writer: Writer): Writer = js.native
  
  /**
    * Creates a BindingDelta message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BindingDelta
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): BindingDelta = js.native
  
  /**
    * Creates a plain object from a BindingDelta message. Also converts values to other types if specified.
    * @param message BindingDelta
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: BindingDelta): StringDictionary[Any] = js.native
  def toObject(message: BindingDelta, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a BindingDelta message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
