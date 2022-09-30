package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.iam.v1.GetIamPolicyRequest
import typings.googleGax.iamServiceMod.google.iam.v1.IGetIamPolicyRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGetIamPolicyRequest extends StObject {
  
  /**
    * Creates a new GetIamPolicyRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetIamPolicyRequest instance
    */
  /* static member */
  def create(): GetIamPolicyRequest = js.native
  def create(properties: IGetIamPolicyRequest): GetIamPolicyRequest = js.native
  
  def decode(reader: js.typedarray.Uint8Array): GetIamPolicyRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): GetIamPolicyRequest = js.native
  /**
    * Decodes a GetIamPolicyRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetIamPolicyRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): GetIamPolicyRequest = js.native
  def decode(reader: Reader, length: Double): GetIamPolicyRequest = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): GetIamPolicyRequest = js.native
  /**
    * Decodes a GetIamPolicyRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetIamPolicyRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): GetIamPolicyRequest = js.native
  
  /**
    * Encodes the specified GetIamPolicyRequest message. Does not implicitly {@link google.iam.v1.GetIamPolicyRequest.verify|verify} messages.
    * @param message GetIamPolicyRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IGetIamPolicyRequest): Writer = js.native
  def encode(message: IGetIamPolicyRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetIamPolicyRequest message, length delimited. Does not implicitly {@link google.iam.v1.GetIamPolicyRequest.verify|verify} messages.
    * @param message GetIamPolicyRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IGetIamPolicyRequest): Writer = js.native
  def encodeDelimited(message: IGetIamPolicyRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetIamPolicyRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetIamPolicyRequest
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): GetIamPolicyRequest = js.native
  
  /**
    * Creates a plain object from a GetIamPolicyRequest message. Also converts values to other types if specified.
    * @param message GetIamPolicyRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: GetIamPolicyRequest): StringDictionary[Any] = js.native
  def toObject(message: GetIamPolicyRequest, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a GetIamPolicyRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
