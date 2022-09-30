package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.locationsMod.google.cloud.location.IListLocationsResponse
import typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofListLocationsRespon extends StObject {
  
  /**
    * Creates a new ListLocationsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListLocationsResponse instance
    */
  /* static member */
  def create(): ListLocationsResponse = js.native
  def create(properties: IListLocationsResponse): ListLocationsResponse = js.native
  
  def decode(reader: js.typedarray.Uint8Array): ListLocationsResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ListLocationsResponse = js.native
  /**
    * Decodes a ListLocationsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListLocationsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): ListLocationsResponse = js.native
  def decode(reader: Reader, length: Double): ListLocationsResponse = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): ListLocationsResponse = js.native
  /**
    * Decodes a ListLocationsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListLocationsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): ListLocationsResponse = js.native
  
  /**
    * Encodes the specified ListLocationsResponse message. Does not implicitly {@link google.cloud.location.ListLocationsResponse.verify|verify} messages.
    * @param message ListLocationsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IListLocationsResponse): Writer = js.native
  def encode(message: IListLocationsResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListLocationsResponse message, length delimited. Does not implicitly {@link google.cloud.location.ListLocationsResponse.verify|verify} messages.
    * @param message ListLocationsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IListLocationsResponse): Writer = js.native
  def encodeDelimited(message: IListLocationsResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListLocationsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListLocationsResponse
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): ListLocationsResponse = js.native
  
  /**
    * Creates a plain object from a ListLocationsResponse message. Also converts values to other types if specified.
    * @param message ListLocationsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: ListLocationsResponse): StringDictionary[Any] = js.native
  def toObject(message: ListLocationsResponse, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a ListLocationsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
