package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.rpc.IStatus
import typings.googleGax.operationsMod.google.rpc.Status
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofStatus extends StObject {
  
  /**
    * Creates a new Status instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Status instance
    */
  /* static member */
  def create(): Status = js.native
  def create(properties: IStatus): Status = js.native
  
  def decode(reader: js.typedarray.Uint8Array): Status = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): Status = js.native
  /**
    * Decodes a Status message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Status
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): Status = js.native
  def decode(reader: Reader, length: Double): Status = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): Status = js.native
  /**
    * Decodes a Status message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Status
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): Status = js.native
  
  /**
    * Encodes the specified Status message. Does not implicitly {@link google.rpc.Status.verify|verify} messages.
    * @param message Status message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IStatus): Writer = js.native
  def encode(message: IStatus, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Status message, length delimited. Does not implicitly {@link google.rpc.Status.verify|verify} messages.
    * @param message Status message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IStatus): Writer = js.native
  def encodeDelimited(message: IStatus, writer: Writer): Writer = js.native
  
  /**
    * Creates a Status message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Status
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): Status = js.native
  
  /**
    * Creates a plain object from a Status message. Also converts values to other types if specified.
    * @param message Status
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: Status): StringDictionary[Any] = js.native
  def toObject(message: Status, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a Status message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
