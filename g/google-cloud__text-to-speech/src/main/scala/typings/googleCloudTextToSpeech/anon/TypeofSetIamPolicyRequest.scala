package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.iam.v1.ISetIamPolicyRequest
import typings.googleGax.iamServiceMod.google.iam.v1.SetIamPolicyRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSetIamPolicyRequest extends StObject {
  
  /**
    * Creates a new SetIamPolicyRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SetIamPolicyRequest instance
    */
  /* static member */
  def create(): SetIamPolicyRequest = js.native
  def create(properties: ISetIamPolicyRequest): SetIamPolicyRequest = js.native
  
  def decode(reader: js.typedarray.Uint8Array): SetIamPolicyRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): SetIamPolicyRequest = js.native
  /**
    * Decodes a SetIamPolicyRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SetIamPolicyRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): SetIamPolicyRequest = js.native
  def decode(reader: Reader, length: Double): SetIamPolicyRequest = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): SetIamPolicyRequest = js.native
  /**
    * Decodes a SetIamPolicyRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SetIamPolicyRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): SetIamPolicyRequest = js.native
  
  /**
    * Encodes the specified SetIamPolicyRequest message. Does not implicitly {@link google.iam.v1.SetIamPolicyRequest.verify|verify} messages.
    * @param message SetIamPolicyRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: ISetIamPolicyRequest): Writer = js.native
  def encode(message: ISetIamPolicyRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SetIamPolicyRequest message, length delimited. Does not implicitly {@link google.iam.v1.SetIamPolicyRequest.verify|verify} messages.
    * @param message SetIamPolicyRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: ISetIamPolicyRequest): Writer = js.native
  def encodeDelimited(message: ISetIamPolicyRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a SetIamPolicyRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SetIamPolicyRequest
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): SetIamPolicyRequest = js.native
  
  /**
    * Creates a plain object from a SetIamPolicyRequest message. Also converts values to other types if specified.
    * @param message SetIamPolicyRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: SetIamPolicyRequest): StringDictionary[Any] = js.native
  def toObject(message: SetIamPolicyRequest, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a SetIamPolicyRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
