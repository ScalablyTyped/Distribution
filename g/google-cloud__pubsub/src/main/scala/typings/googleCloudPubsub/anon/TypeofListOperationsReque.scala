package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.longrunning.IListOperationsRequest
import typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofListOperationsReque extends StObject {
  
  /**
    * Creates a new ListOperationsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListOperationsRequest instance
    */
  /* static member */
  def create(): ListOperationsRequest = js.native
  def create(properties: IListOperationsRequest): ListOperationsRequest = js.native
  
  def decode(reader: js.typedarray.Uint8Array): ListOperationsRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ListOperationsRequest = js.native
  /**
    * Decodes a ListOperationsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListOperationsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): ListOperationsRequest = js.native
  def decode(reader: Reader, length: Double): ListOperationsRequest = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): ListOperationsRequest = js.native
  /**
    * Decodes a ListOperationsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListOperationsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): ListOperationsRequest = js.native
  
  /**
    * Encodes the specified ListOperationsRequest message. Does not implicitly {@link google.longrunning.ListOperationsRequest.verify|verify} messages.
    * @param message ListOperationsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IListOperationsRequest): Writer = js.native
  def encode(message: IListOperationsRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListOperationsRequest message, length delimited. Does not implicitly {@link google.longrunning.ListOperationsRequest.verify|verify} messages.
    * @param message ListOperationsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IListOperationsRequest): Writer = js.native
  def encodeDelimited(message: IListOperationsRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListOperationsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListOperationsRequest
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): ListOperationsRequest = js.native
  
  /**
    * Creates a plain object from a ListOperationsRequest message. Also converts values to other types if specified.
    * @param message ListOperationsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: ListOperationsRequest): StringDictionary[Any] = js.native
  def toObject(message: ListOperationsRequest, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a ListOperationsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
