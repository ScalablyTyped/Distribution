package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.protobuf.UninterpretedOption.INamePart
import typings.googleGax.iamServiceMod.google.protobuf.UninterpretedOption.NamePart
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNamePart extends StObject {
  
  /**
    * Creates a new NamePart instance using the specified properties.
    * @param [properties] Properties to set
    * @returns NamePart instance
    */
  /* static member */
  def create(): NamePart = js.native
  def create(properties: INamePart): NamePart = js.native
  
  def decode(reader: js.typedarray.Uint8Array): NamePart = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): NamePart = js.native
  /**
    * Decodes a NamePart message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns NamePart
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): NamePart = js.native
  def decode(reader: Reader, length: Double): NamePart = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): NamePart = js.native
  /**
    * Decodes a NamePart message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns NamePart
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): NamePart = js.native
  
  /**
    * Encodes the specified NamePart message. Does not implicitly {@link google.protobuf.UninterpretedOption.NamePart.verify|verify} messages.
    * @param message NamePart message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: INamePart): Writer = js.native
  def encode(message: INamePart, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified NamePart message, length delimited. Does not implicitly {@link google.protobuf.UninterpretedOption.NamePart.verify|verify} messages.
    * @param message NamePart message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: INamePart): Writer = js.native
  def encodeDelimited(message: INamePart, writer: Writer): Writer = js.native
  
  /**
    * Creates a NamePart message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns NamePart
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): NamePart = js.native
  
  /**
    * Creates a plain object from a NamePart message. Also converts values to other types if specified.
    * @param message NamePart
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: NamePart): StringDictionary[Any] = js.native
  def toObject(message: NamePart, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a NamePart message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
