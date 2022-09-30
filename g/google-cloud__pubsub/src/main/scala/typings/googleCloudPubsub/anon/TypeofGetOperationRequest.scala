package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.longrunning.GetOperationRequest
import typings.googleGax.operationsMod.google.longrunning.IGetOperationRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGetOperationRequest extends StObject {
  
  /**
    * Creates a new GetOperationRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetOperationRequest instance
    */
  /* static member */
  def create(): GetOperationRequest = js.native
  def create(properties: IGetOperationRequest): GetOperationRequest = js.native
  
  def decode(reader: js.typedarray.Uint8Array): GetOperationRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): GetOperationRequest = js.native
  /**
    * Decodes a GetOperationRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): GetOperationRequest = js.native
  def decode(reader: Reader, length: Double): GetOperationRequest = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): GetOperationRequest = js.native
  /**
    * Decodes a GetOperationRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): GetOperationRequest = js.native
  
  /**
    * Encodes the specified GetOperationRequest message. Does not implicitly {@link google.longrunning.GetOperationRequest.verify|verify} messages.
    * @param message GetOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IGetOperationRequest): Writer = js.native
  def encode(message: IGetOperationRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.GetOperationRequest.verify|verify} messages.
    * @param message GetOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IGetOperationRequest): Writer = js.native
  def encodeDelimited(message: IGetOperationRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetOperationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetOperationRequest
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): GetOperationRequest = js.native
  
  /**
    * Creates a plain object from a GetOperationRequest message. Also converts values to other types if specified.
    * @param message GetOperationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: GetOperationRequest): StringDictionary[Any] = js.native
  def toObject(message: GetOperationRequest, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a GetOperationRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
