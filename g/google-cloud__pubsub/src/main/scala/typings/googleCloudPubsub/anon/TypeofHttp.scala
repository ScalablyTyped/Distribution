package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.api.Http
import typings.googleGax.iamServiceMod.google.api.IHttp
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHttp extends StObject {
  
  /**
    * Creates a new Http instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Http instance
    */
  /* static member */
  def create(): Http = js.native
  def create(properties: IHttp): Http = js.native
  
  def decode(reader: js.typedarray.Uint8Array): Http = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): Http = js.native
  /**
    * Decodes a Http message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Http
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): Http = js.native
  def decode(reader: Reader, length: Double): Http = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): Http = js.native
  /**
    * Decodes a Http message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Http
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): Http = js.native
  
  /**
    * Encodes the specified Http message. Does not implicitly {@link google.api.Http.verify|verify} messages.
    * @param message Http message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IHttp): Writer = js.native
  def encode(message: IHttp, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Http message, length delimited. Does not implicitly {@link google.api.Http.verify|verify} messages.
    * @param message Http message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IHttp): Writer = js.native
  def encodeDelimited(message: IHttp, writer: Writer): Writer = js.native
  
  /**
    * Creates a Http message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Http
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): Http = js.native
  
  /**
    * Creates a plain object from a Http message. Also converts values to other types if specified.
    * @param message Http
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: Http): StringDictionary[Any] = js.native
  def toObject(message: Http, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a Http message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
