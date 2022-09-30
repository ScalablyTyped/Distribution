package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest
import typings.googleGax.locationsMod.google.cloud.location.IGetLocationRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGetLocationRequest extends StObject {
  
  /**
    * Creates a new GetLocationRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetLocationRequest instance
    */
  /* static member */
  def create(): GetLocationRequest = js.native
  def create(properties: IGetLocationRequest): GetLocationRequest = js.native
  
  def decode(reader: js.typedarray.Uint8Array): GetLocationRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): GetLocationRequest = js.native
  /**
    * Decodes a GetLocationRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetLocationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): GetLocationRequest = js.native
  def decode(reader: Reader, length: Double): GetLocationRequest = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): GetLocationRequest = js.native
  /**
    * Decodes a GetLocationRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetLocationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): GetLocationRequest = js.native
  
  /**
    * Encodes the specified GetLocationRequest message. Does not implicitly {@link google.cloud.location.GetLocationRequest.verify|verify} messages.
    * @param message GetLocationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IGetLocationRequest): Writer = js.native
  def encode(message: IGetLocationRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetLocationRequest message, length delimited. Does not implicitly {@link google.cloud.location.GetLocationRequest.verify|verify} messages.
    * @param message GetLocationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IGetLocationRequest): Writer = js.native
  def encodeDelimited(message: IGetLocationRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetLocationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetLocationRequest
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): GetLocationRequest = js.native
  
  /**
    * Creates a plain object from a GetLocationRequest message. Also converts values to other types if specified.
    * @param message GetLocationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: GetLocationRequest): StringDictionary[Any] = js.native
  def toObject(message: GetLocationRequest, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a GetLocationRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
