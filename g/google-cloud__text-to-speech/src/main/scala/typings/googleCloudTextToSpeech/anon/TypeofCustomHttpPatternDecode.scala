package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.api.CustomHttpPattern
import typings.googleGax.operationsMod.google.api.ICustomHttpPattern
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCustomHttpPatternDecode extends StObject {
  
  /**
    * Creates a new CustomHttpPattern instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CustomHttpPattern instance
    */
  /* static member */
  def create(): CustomHttpPattern = js.native
  def create(properties: ICustomHttpPattern): CustomHttpPattern = js.native
  
  def decode(reader: js.typedarray.Uint8Array): CustomHttpPattern = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): CustomHttpPattern = js.native
  /**
    * Decodes a CustomHttpPattern message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CustomHttpPattern
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): CustomHttpPattern = js.native
  def decode(reader: Reader, length: Double): CustomHttpPattern = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): CustomHttpPattern = js.native
  /**
    * Decodes a CustomHttpPattern message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CustomHttpPattern
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): CustomHttpPattern = js.native
  
  /**
    * Encodes the specified CustomHttpPattern message. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
    * @param message CustomHttpPattern message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: ICustomHttpPattern): Writer = js.native
  def encode(message: ICustomHttpPattern, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CustomHttpPattern message, length delimited. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
    * @param message CustomHttpPattern message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: ICustomHttpPattern): Writer = js.native
  def encodeDelimited(message: ICustomHttpPattern, writer: Writer): Writer = js.native
  
  /**
    * Creates a CustomHttpPattern message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CustomHttpPattern
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): CustomHttpPattern = js.native
  
  /**
    * Creates a plain object from a CustomHttpPattern message. Also converts values to other types if specified.
    * @param message CustomHttpPattern
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: CustomHttpPattern): StringDictionary[Any] = js.native
  def toObject(message: CustomHttpPattern, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a CustomHttpPattern message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
