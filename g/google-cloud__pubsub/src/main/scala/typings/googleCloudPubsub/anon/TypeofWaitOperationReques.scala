package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.longrunning.IWaitOperationRequest
import typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWaitOperationReques extends StObject {
  
  /**
    * Creates a new WaitOperationRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns WaitOperationRequest instance
    */
  /* static member */
  def create(): WaitOperationRequest = js.native
  def create(properties: IWaitOperationRequest): WaitOperationRequest = js.native
  
  def decode(reader: js.typedarray.Uint8Array): WaitOperationRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): WaitOperationRequest = js.native
  /**
    * Decodes a WaitOperationRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns WaitOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): WaitOperationRequest = js.native
  def decode(reader: Reader, length: Double): WaitOperationRequest = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): WaitOperationRequest = js.native
  /**
    * Decodes a WaitOperationRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns WaitOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): WaitOperationRequest = js.native
  
  /**
    * Encodes the specified WaitOperationRequest message. Does not implicitly {@link google.longrunning.WaitOperationRequest.verify|verify} messages.
    * @param message WaitOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IWaitOperationRequest): Writer = js.native
  def encode(message: IWaitOperationRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified WaitOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.WaitOperationRequest.verify|verify} messages.
    * @param message WaitOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IWaitOperationRequest): Writer = js.native
  def encodeDelimited(message: IWaitOperationRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a WaitOperationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns WaitOperationRequest
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): WaitOperationRequest = js.native
  
  /**
    * Creates a plain object from a WaitOperationRequest message. Also converts values to other types if specified.
    * @param message WaitOperationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: WaitOperationRequest): StringDictionary[Any] = js.native
  def toObject(message: WaitOperationRequest, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a WaitOperationRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
