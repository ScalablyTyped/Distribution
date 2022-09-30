package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.locationsMod.google.api.HttpRule
import typings.googleGax.locationsMod.google.api.IHttpRule
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHttpRuleCreate extends StObject {
  
  /**
    * Creates a new HttpRule instance using the specified properties.
    * @param [properties] Properties to set
    * @returns HttpRule instance
    */
  /* static member */
  def create(): HttpRule = js.native
  def create(properties: IHttpRule): HttpRule = js.native
  
  def decode(reader: js.typedarray.Uint8Array): HttpRule = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): HttpRule = js.native
  /**
    * Decodes a HttpRule message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns HttpRule
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): HttpRule = js.native
  def decode(reader: Reader, length: Double): HttpRule = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): HttpRule = js.native
  /**
    * Decodes a HttpRule message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns HttpRule
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): HttpRule = js.native
  
  /**
    * Encodes the specified HttpRule message. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
    * @param message HttpRule message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IHttpRule): Writer = js.native
  def encode(message: IHttpRule, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified HttpRule message, length delimited. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
    * @param message HttpRule message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IHttpRule): Writer = js.native
  def encodeDelimited(message: IHttpRule, writer: Writer): Writer = js.native
  
  /**
    * Creates a HttpRule message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns HttpRule
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): HttpRule = js.native
  
  /**
    * Creates a plain object from a HttpRule message. Also converts values to other types if specified.
    * @param message HttpRule
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: HttpRule): StringDictionary[Any] = js.native
  def toObject(message: HttpRule, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a HttpRule message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
