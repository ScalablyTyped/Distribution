package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.iam.v1.logging.AuditData
import typings.googleGax.iamServiceMod.google.iam.v1.logging.IAuditData
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAuditData extends StObject {
  
  /**
    * Creates a new AuditData instance using the specified properties.
    * @param [properties] Properties to set
    * @returns AuditData instance
    */
  /* static member */
  def create(): AuditData = js.native
  def create(properties: IAuditData): AuditData = js.native
  
  def decode(reader: js.typedarray.Uint8Array): AuditData = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): AuditData = js.native
  /**
    * Decodes an AuditData message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns AuditData
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): AuditData = js.native
  def decode(reader: Reader, length: Double): AuditData = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): AuditData = js.native
  /**
    * Decodes an AuditData message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns AuditData
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): AuditData = js.native
  
  /**
    * Encodes the specified AuditData message. Does not implicitly {@link google.iam.v1.logging.AuditData.verify|verify} messages.
    * @param message AuditData message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IAuditData): Writer = js.native
  def encode(message: IAuditData, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified AuditData message, length delimited. Does not implicitly {@link google.iam.v1.logging.AuditData.verify|verify} messages.
    * @param message AuditData message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IAuditData): Writer = js.native
  def encodeDelimited(message: IAuditData, writer: Writer): Writer = js.native
  
  /**
    * Creates an AuditData message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns AuditData
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): AuditData = js.native
  
  /**
    * Creates a plain object from an AuditData message. Also converts values to other types if specified.
    * @param message AuditData
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: AuditData): StringDictionary[Any] = js.native
  def toObject(message: AuditData, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies an AuditData message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
