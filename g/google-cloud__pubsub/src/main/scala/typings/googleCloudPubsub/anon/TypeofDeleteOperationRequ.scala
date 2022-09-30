package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest
import typings.googleGax.operationsMod.google.longrunning.IDeleteOperationRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDeleteOperationRequ extends StObject {
  
  /**
    * Creates a new DeleteOperationRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteOperationRequest instance
    */
  /* static member */
  def create(): DeleteOperationRequest = js.native
  def create(properties: IDeleteOperationRequest): DeleteOperationRequest = js.native
  
  def decode(reader: js.typedarray.Uint8Array): DeleteOperationRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): DeleteOperationRequest = js.native
  /**
    * Decodes a DeleteOperationRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): DeleteOperationRequest = js.native
  def decode(reader: Reader, length: Double): DeleteOperationRequest = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): DeleteOperationRequest = js.native
  /**
    * Decodes a DeleteOperationRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): DeleteOperationRequest = js.native
  
  /**
    * Encodes the specified DeleteOperationRequest message. Does not implicitly {@link google.longrunning.DeleteOperationRequest.verify|verify} messages.
    * @param message DeleteOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IDeleteOperationRequest): Writer = js.native
  def encode(message: IDeleteOperationRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DeleteOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.DeleteOperationRequest.verify|verify} messages.
    * @param message DeleteOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IDeleteOperationRequest): Writer = js.native
  def encodeDelimited(message: IDeleteOperationRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a DeleteOperationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteOperationRequest
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): DeleteOperationRequest = js.native
  
  /**
    * Creates a plain object from a DeleteOperationRequest message. Also converts values to other types if specified.
    * @param message DeleteOperationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: DeleteOperationRequest): StringDictionary[Any] = js.native
  def toObject(message: DeleteOperationRequest, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a DeleteOperationRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
