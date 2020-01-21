package typings.googleCloudPubsub.iamMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GetIamPolicyRequest. */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.iam.v1.GetIamPolicyRequest")
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

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.iam.v1.GetIamPolicyRequest")
@js.native
object GetIamPolicyRequest extends js.Object {
  /**
    * Creates a new GetIamPolicyRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetIamPolicyRequest instance
    */
  def create(): GetIamPolicyRequest = js.native
  def create(properties: IGetIamPolicyRequest): GetIamPolicyRequest = js.native
  /**
    * Decodes a GetIamPolicyRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetIamPolicyRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GetIamPolicyRequest = js.native
  def decode(reader: Reader, length: Double): GetIamPolicyRequest = js.native
  def decode(reader: Uint8Array): GetIamPolicyRequest = js.native
  def decode(reader: Uint8Array, length: Double): GetIamPolicyRequest = js.native
  /**
    * Decodes a GetIamPolicyRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetIamPolicyRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GetIamPolicyRequest = js.native
  def decodeDelimited(reader: Uint8Array): GetIamPolicyRequest = js.native
  /**
    * Encodes the specified GetIamPolicyRequest message. Does not implicitly {@link google.iam.v1.GetIamPolicyRequest.verify|verify} messages.
    * @param message GetIamPolicyRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGetIamPolicyRequest): Writer = js.native
  def encode(message: IGetIamPolicyRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GetIamPolicyRequest message, length delimited. Does not implicitly {@link google.iam.v1.GetIamPolicyRequest.verify|verify} messages.
    * @param message GetIamPolicyRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGetIamPolicyRequest): Writer = js.native
  def encodeDelimited(message: IGetIamPolicyRequest, writer: Writer): Writer = js.native
  /**
    * Creates a GetIamPolicyRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetIamPolicyRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): GetIamPolicyRequest = js.native
  /**
    * Creates a plain object from a GetIamPolicyRequest message. Also converts values to other types if specified.
    * @param message GetIamPolicyRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GetIamPolicyRequest): StringDictionary[js.Any] = js.native
  def toObject(message: GetIamPolicyRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GetIamPolicyRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

