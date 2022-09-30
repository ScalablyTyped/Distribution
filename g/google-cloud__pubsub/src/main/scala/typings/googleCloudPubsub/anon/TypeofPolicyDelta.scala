package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.iam.v1.IPolicyDelta
import typings.googleGax.iamServiceMod.google.iam.v1.PolicyDelta
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPolicyDelta extends StObject {
  
  /**
    * Creates a new PolicyDelta instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PolicyDelta instance
    */
  /* static member */
  def create(): PolicyDelta = js.native
  def create(properties: IPolicyDelta): PolicyDelta = js.native
  
  def decode(reader: js.typedarray.Uint8Array): PolicyDelta = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): PolicyDelta = js.native
  /**
    * Decodes a PolicyDelta message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PolicyDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): PolicyDelta = js.native
  def decode(reader: Reader, length: Double): PolicyDelta = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): PolicyDelta = js.native
  /**
    * Decodes a PolicyDelta message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PolicyDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): PolicyDelta = js.native
  
  /**
    * Encodes the specified PolicyDelta message. Does not implicitly {@link google.iam.v1.PolicyDelta.verify|verify} messages.
    * @param message PolicyDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IPolicyDelta): Writer = js.native
  def encode(message: IPolicyDelta, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PolicyDelta message, length delimited. Does not implicitly {@link google.iam.v1.PolicyDelta.verify|verify} messages.
    * @param message PolicyDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IPolicyDelta): Writer = js.native
  def encodeDelimited(message: IPolicyDelta, writer: Writer): Writer = js.native
  
  /**
    * Creates a PolicyDelta message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PolicyDelta
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): PolicyDelta = js.native
  
  /**
    * Creates a plain object from a PolicyDelta message. Also converts values to other types if specified.
    * @param message PolicyDelta
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: PolicyDelta): StringDictionary[Any] = js.native
  def toObject(message: PolicyDelta, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a PolicyDelta message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
