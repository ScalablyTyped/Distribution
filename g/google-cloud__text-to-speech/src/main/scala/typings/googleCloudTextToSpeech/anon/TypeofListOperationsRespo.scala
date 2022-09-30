package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.longrunning.IListOperationsResponse
import typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofListOperationsRespo extends StObject {
  
  /**
    * Creates a new ListOperationsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListOperationsResponse instance
    */
  /* static member */
  def create(): ListOperationsResponse = js.native
  def create(properties: IListOperationsResponse): ListOperationsResponse = js.native
  
  def decode(reader: js.typedarray.Uint8Array): ListOperationsResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ListOperationsResponse = js.native
  /**
    * Decodes a ListOperationsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListOperationsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): ListOperationsResponse = js.native
  def decode(reader: Reader, length: Double): ListOperationsResponse = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): ListOperationsResponse = js.native
  /**
    * Decodes a ListOperationsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListOperationsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): ListOperationsResponse = js.native
  
  /**
    * Encodes the specified ListOperationsResponse message. Does not implicitly {@link google.longrunning.ListOperationsResponse.verify|verify} messages.
    * @param message ListOperationsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IListOperationsResponse): Writer = js.native
  def encode(message: IListOperationsResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListOperationsResponse message, length delimited. Does not implicitly {@link google.longrunning.ListOperationsResponse.verify|verify} messages.
    * @param message ListOperationsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IListOperationsResponse): Writer = js.native
  def encodeDelimited(message: IListOperationsResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListOperationsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListOperationsResponse
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): ListOperationsResponse = js.native
  
  /**
    * Creates a plain object from a ListOperationsResponse message. Also converts values to other types if specified.
    * @param message ListOperationsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: ListOperationsResponse): StringDictionary[Any] = js.native
  def toObject(message: ListOperationsResponse, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a ListOperationsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
