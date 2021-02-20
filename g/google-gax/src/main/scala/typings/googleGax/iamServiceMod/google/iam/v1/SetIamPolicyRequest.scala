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

/** Represents a SetIamPolicyRequest. */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest")
@js.native
/**
  * Constructs a new SetIamPolicyRequest.
  * @param [properties] Properties to set
  */
class SetIamPolicyRequest () extends ISetIamPolicyRequest {
  def this(properties: ISetIamPolicyRequest) = this()
  
  /** SetIamPolicyRequest resource. */
  @JSName("resource")
  var resource_SetIamPolicyRequest: String = js.native
  
  /**
    * Converts this SetIamPolicyRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SetIamPolicyRequest {
  
  /**
    * Creates a new SetIamPolicyRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SetIamPolicyRequest instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.create")
  @js.native
  def create(): SetIamPolicyRequest = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.create")
  @js.native
  def create(properties: ISetIamPolicyRequest): SetIamPolicyRequest = js.native
  
  /**
    * Decodes a SetIamPolicyRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SetIamPolicyRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.decode")
  @js.native
  def decode(reader: Reader): SetIamPolicyRequest = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): SetIamPolicyRequest = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.decode")
  @js.native
  def decode(reader: Uint8Array): SetIamPolicyRequest = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): SetIamPolicyRequest = js.native
  
  /**
    * Decodes a SetIamPolicyRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SetIamPolicyRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SetIamPolicyRequest = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): SetIamPolicyRequest = js.native
  
  /**
    * Encodes the specified SetIamPolicyRequest message. Does not implicitly {@link google.iam.v1.SetIamPolicyRequest.verify|verify} messages.
    * @param message SetIamPolicyRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.encode")
  @js.native
  def encode(message: ISetIamPolicyRequest): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.encode")
  @js.native
  def encode(message: ISetIamPolicyRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SetIamPolicyRequest message, length delimited. Does not implicitly {@link google.iam.v1.SetIamPolicyRequest.verify|verify} messages.
    * @param message SetIamPolicyRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISetIamPolicyRequest): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISetIamPolicyRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a SetIamPolicyRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SetIamPolicyRequest
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SetIamPolicyRequest = js.native
  
  /**
    * Creates a plain object from a SetIamPolicyRequest message. Also converts values to other types if specified.
    * @param message SetIamPolicyRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.toObject")
  @js.native
  def toObject(message: SetIamPolicyRequest): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.toObject")
  @js.native
  def toObject(message: SetIamPolicyRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SetIamPolicyRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
