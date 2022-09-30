package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.longrunning.IOperation
import typings.googleGax.operationsMod.google.longrunning.Operation
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofOperation extends StObject {
  
  /**
    * Creates a new Operation instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Operation instance
    */
  /* static member */
  def create(): Operation = js.native
  def create(properties: IOperation): Operation = js.native
  
  def decode(reader: js.typedarray.Uint8Array): Operation = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): Operation = js.native
  /**
    * Decodes an Operation message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Operation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): Operation = js.native
  def decode(reader: Reader, length: Double): Operation = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): Operation = js.native
  /**
    * Decodes an Operation message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Operation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): Operation = js.native
  
  /**
    * Encodes the specified Operation message. Does not implicitly {@link google.longrunning.Operation.verify|verify} messages.
    * @param message Operation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IOperation): Writer = js.native
  def encode(message: IOperation, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Operation message, length delimited. Does not implicitly {@link google.longrunning.Operation.verify|verify} messages.
    * @param message Operation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IOperation): Writer = js.native
  def encodeDelimited(message: IOperation, writer: Writer): Writer = js.native
  
  /**
    * Creates an Operation message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Operation
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): Operation = js.native
  
  /**
    * Creates a plain object from an Operation message. Also converts values to other types if specified.
    * @param message Operation
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: Operation): StringDictionary[Any] = js.native
  def toObject(message: Operation, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies an Operation message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
