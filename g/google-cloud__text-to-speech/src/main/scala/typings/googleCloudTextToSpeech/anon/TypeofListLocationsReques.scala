package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.locationsMod.google.cloud.location.IListLocationsRequest
import typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofListLocationsReques extends StObject {
  
  /**
    * Creates a new ListLocationsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListLocationsRequest instance
    */
  /* static member */
  def create(): ListLocationsRequest = js.native
  def create(properties: IListLocationsRequest): ListLocationsRequest = js.native
  
  def decode(reader: js.typedarray.Uint8Array): ListLocationsRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ListLocationsRequest = js.native
  /**
    * Decodes a ListLocationsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListLocationsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): ListLocationsRequest = js.native
  def decode(reader: Reader, length: Double): ListLocationsRequest = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): ListLocationsRequest = js.native
  /**
    * Decodes a ListLocationsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListLocationsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): ListLocationsRequest = js.native
  
  /**
    * Encodes the specified ListLocationsRequest message. Does not implicitly {@link google.cloud.location.ListLocationsRequest.verify|verify} messages.
    * @param message ListLocationsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IListLocationsRequest): Writer = js.native
  def encode(message: IListLocationsRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListLocationsRequest message, length delimited. Does not implicitly {@link google.cloud.location.ListLocationsRequest.verify|verify} messages.
    * @param message ListLocationsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IListLocationsRequest): Writer = js.native
  def encodeDelimited(message: IListLocationsRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListLocationsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListLocationsRequest
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): ListLocationsRequest = js.native
  
  /**
    * Creates a plain object from a ListLocationsRequest message. Also converts values to other types if specified.
    * @param message ListLocationsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: ListLocationsRequest): StringDictionary[Any] = js.native
  def toObject(message: ListLocationsRequest, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a ListLocationsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
