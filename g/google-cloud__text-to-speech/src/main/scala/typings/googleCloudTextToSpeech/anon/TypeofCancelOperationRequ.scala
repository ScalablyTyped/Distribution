package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest
import typings.googleGax.operationsMod.google.longrunning.ICancelOperationRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCancelOperationRequ extends StObject {
  
  /**
    * Creates a new CancelOperationRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CancelOperationRequest instance
    */
  /* static member */
  def create(): CancelOperationRequest = js.native
  def create(properties: ICancelOperationRequest): CancelOperationRequest = js.native
  
  def decode(reader: js.typedarray.Uint8Array): CancelOperationRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): CancelOperationRequest = js.native
  /**
    * Decodes a CancelOperationRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CancelOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): CancelOperationRequest = js.native
  def decode(reader: Reader, length: Double): CancelOperationRequest = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): CancelOperationRequest = js.native
  /**
    * Decodes a CancelOperationRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CancelOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): CancelOperationRequest = js.native
  
  /**
    * Encodes the specified CancelOperationRequest message. Does not implicitly {@link google.longrunning.CancelOperationRequest.verify|verify} messages.
    * @param message CancelOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: ICancelOperationRequest): Writer = js.native
  def encode(message: ICancelOperationRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CancelOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.CancelOperationRequest.verify|verify} messages.
    * @param message CancelOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: ICancelOperationRequest): Writer = js.native
  def encodeDelimited(message: ICancelOperationRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a CancelOperationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CancelOperationRequest
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): CancelOperationRequest = js.native
  
  /**
    * Creates a plain object from a CancelOperationRequest message. Also converts values to other types if specified.
    * @param message CancelOperationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: CancelOperationRequest): StringDictionary[Any] = js.native
  def toObject(message: CancelOperationRequest, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a CancelOperationRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
