package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.iam.v1.GetPolicyOptions
import typings.googleGax.iamServiceMod.google.iam.v1.IGetPolicyOptions
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGetPolicyOptions extends StObject {
  
  /**
    * Creates a new GetPolicyOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetPolicyOptions instance
    */
  /* static member */
  def create(): GetPolicyOptions = js.native
  def create(properties: IGetPolicyOptions): GetPolicyOptions = js.native
  
  def decode(reader: js.typedarray.Uint8Array): GetPolicyOptions = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): GetPolicyOptions = js.native
  /**
    * Decodes a GetPolicyOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetPolicyOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): GetPolicyOptions = js.native
  def decode(reader: Reader, length: Double): GetPolicyOptions = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): GetPolicyOptions = js.native
  /**
    * Decodes a GetPolicyOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetPolicyOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): GetPolicyOptions = js.native
  
  /**
    * Encodes the specified GetPolicyOptions message. Does not implicitly {@link google.iam.v1.GetPolicyOptions.verify|verify} messages.
    * @param message GetPolicyOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IGetPolicyOptions): Writer = js.native
  def encode(message: IGetPolicyOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetPolicyOptions message, length delimited. Does not implicitly {@link google.iam.v1.GetPolicyOptions.verify|verify} messages.
    * @param message GetPolicyOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IGetPolicyOptions): Writer = js.native
  def encodeDelimited(message: IGetPolicyOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetPolicyOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetPolicyOptions
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): GetPolicyOptions = js.native
  
  /**
    * Creates a plain object from a GetPolicyOptions message. Also converts values to other types if specified.
    * @param message GetPolicyOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: GetPolicyOptions): StringDictionary[Any] = js.native
  def toObject(message: GetPolicyOptions, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a GetPolicyOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
