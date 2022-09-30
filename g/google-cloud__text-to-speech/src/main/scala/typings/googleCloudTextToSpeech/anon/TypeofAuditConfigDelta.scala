package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta
import typings.googleGax.iamServiceMod.google.iam.v1.IAuditConfigDelta
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAuditConfigDelta extends StObject {
  
  /**
    * Creates a new AuditConfigDelta instance using the specified properties.
    * @param [properties] Properties to set
    * @returns AuditConfigDelta instance
    */
  /* static member */
  def create(): AuditConfigDelta = js.native
  def create(properties: IAuditConfigDelta): AuditConfigDelta = js.native
  
  def decode(reader: js.typedarray.Uint8Array): AuditConfigDelta = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): AuditConfigDelta = js.native
  /**
    * Decodes an AuditConfigDelta message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns AuditConfigDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): AuditConfigDelta = js.native
  def decode(reader: Reader, length: Double): AuditConfigDelta = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): AuditConfigDelta = js.native
  /**
    * Decodes an AuditConfigDelta message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns AuditConfigDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): AuditConfigDelta = js.native
  
  /**
    * Encodes the specified AuditConfigDelta message. Does not implicitly {@link google.iam.v1.AuditConfigDelta.verify|verify} messages.
    * @param message AuditConfigDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IAuditConfigDelta): Writer = js.native
  def encode(message: IAuditConfigDelta, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified AuditConfigDelta message, length delimited. Does not implicitly {@link google.iam.v1.AuditConfigDelta.verify|verify} messages.
    * @param message AuditConfigDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IAuditConfigDelta): Writer = js.native
  def encodeDelimited(message: IAuditConfigDelta, writer: Writer): Writer = js.native
  
  /**
    * Creates an AuditConfigDelta message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns AuditConfigDelta
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): AuditConfigDelta = js.native
  
  /**
    * Creates a plain object from an AuditConfigDelta message. Also converts values to other types if specified.
    * @param message AuditConfigDelta
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: AuditConfigDelta): StringDictionary[Any] = js.native
  def toObject(message: AuditConfigDelta, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies an AuditConfigDelta message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
