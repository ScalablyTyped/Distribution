package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.longrunning.IOperationInfo
import typings.googleGax.operationsMod.google.longrunning.OperationInfo
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofOperationInfo extends StObject {
  
  /**
    * Creates a new OperationInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OperationInfo instance
    */
  /* static member */
  def create(): OperationInfo = js.native
  def create(properties: IOperationInfo): OperationInfo = js.native
  
  def decode(reader: js.typedarray.Uint8Array): OperationInfo = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): OperationInfo = js.native
  /**
    * Decodes an OperationInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OperationInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): OperationInfo = js.native
  def decode(reader: Reader, length: Double): OperationInfo = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): OperationInfo = js.native
  /**
    * Decodes an OperationInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OperationInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): OperationInfo = js.native
  
  /**
    * Encodes the specified OperationInfo message. Does not implicitly {@link google.longrunning.OperationInfo.verify|verify} messages.
    * @param message OperationInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IOperationInfo): Writer = js.native
  def encode(message: IOperationInfo, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified OperationInfo message, length delimited. Does not implicitly {@link google.longrunning.OperationInfo.verify|verify} messages.
    * @param message OperationInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IOperationInfo): Writer = js.native
  def encodeDelimited(message: IOperationInfo, writer: Writer): Writer = js.native
  
  /**
    * Creates an OperationInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OperationInfo
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): OperationInfo = js.native
  
  /**
    * Creates a plain object from an OperationInfo message. Also converts values to other types if specified.
    * @param message OperationInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: OperationInfo): StringDictionary[Any] = js.native
  def toObject(message: OperationInfo, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies an OperationInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
