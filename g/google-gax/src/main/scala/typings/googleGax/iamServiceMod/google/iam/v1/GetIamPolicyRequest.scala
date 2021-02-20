package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetIamPolicyRequest. */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest")
@js.native
/**
  * Constructs a new GetIamPolicyRequest.
  * @param [properties] Properties to set
  */
class GetIamPolicyRequest () extends IGetIamPolicyRequest {
  def this(properties: IGetIamPolicyRequest) = this()
  
  /** GetIamPolicyRequest resource. */
  @JSName("resource")
  var resource_GetIamPolicyRequest: String = js.native
  
  /**
    * Converts this GetIamPolicyRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object GetIamPolicyRequest {
  
  /**
    * Creates a new GetIamPolicyRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetIamPolicyRequest instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.create")
  @js.native
  def create(): GetIamPolicyRequest = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.create")
  @js.native
  def create(properties: IGetIamPolicyRequest): GetIamPolicyRequest = js.native
  
  /**
    * Decodes a GetIamPolicyRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetIamPolicyRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.decode")
  @js.native
  def decode(reader: Reader): GetIamPolicyRequest = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): GetIamPolicyRequest = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.decode")
  @js.native
  def decode(reader: Uint8Array): GetIamPolicyRequest = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): GetIamPolicyRequest = js.native
  
  /**
    * Decodes a GetIamPolicyRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetIamPolicyRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): GetIamPolicyRequest = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): GetIamPolicyRequest = js.native
  
  /**
    * Encodes the specified GetIamPolicyRequest message. Does not implicitly {@link google.iam.v1.GetIamPolicyRequest.verify|verify} messages.
    * @param message GetIamPolicyRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.encode")
  @js.native
  def encode(message: IGetIamPolicyRequest): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.encode")
  @js.native
  def encode(message: IGetIamPolicyRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetIamPolicyRequest message, length delimited. Does not implicitly {@link google.iam.v1.GetIamPolicyRequest.verify|verify} messages.
    * @param message GetIamPolicyRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetIamPolicyRequest): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetIamPolicyRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetIamPolicyRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetIamPolicyRequest
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): GetIamPolicyRequest = js.native
  
  /**
    * Creates a plain object from a GetIamPolicyRequest message. Also converts values to other types if specified.
    * @param message GetIamPolicyRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.toObject")
  @js.native
  def toObject(message: GetIamPolicyRequest): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.toObject")
  @js.native
  def toObject(message: GetIamPolicyRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetIamPolicyRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetIamPolicyRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
