package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.protobuf.Empty
import typings.googleGax.operationsMod.google.protobuf.IEmpty
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEmpty extends StObject {
  
  /**
    * Creates a new Empty instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Empty instance
    */
  /* static member */
  def create(): Empty = js.native
  def create(properties: IEmpty): Empty = js.native
  
  def decode(reader: js.typedarray.Uint8Array): Empty = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): Empty = js.native
  /**
    * Decodes an Empty message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Empty
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): Empty = js.native
  def decode(reader: Reader, length: Double): Empty = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): Empty = js.native
  /**
    * Decodes an Empty message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Empty
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): Empty = js.native
  
  /**
    * Encodes the specified Empty message. Does not implicitly {@link google.protobuf.Empty.verify|verify} messages.
    * @param message Empty message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IEmpty): Writer = js.native
  def encode(message: IEmpty, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Empty message, length delimited. Does not implicitly {@link google.protobuf.Empty.verify|verify} messages.
    * @param message Empty message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IEmpty): Writer = js.native
  def encodeDelimited(message: IEmpty, writer: Writer): Writer = js.native
  
  /**
    * Creates an Empty message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Empty
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): Empty = js.native
  
  /**
    * Creates a plain object from an Empty message. Also converts values to other types if specified.
    * @param message Empty
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: Empty): StringDictionary[Any] = js.native
  def toObject(message: Empty, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies an Empty message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
