package typings.googleCloudPubsub.mod.protos.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.iam.v1.ISetIamPolicyRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SetIamPolicyRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.iam.v1.SetIamPolicyRequest")
@js.native
/**
  * Constructs a new SetIamPolicyRequest.
  * @param [properties] Properties to set
  */
class SetIamPolicyRequest ()
  extends typings.googleCloudPubsub.protosMod.google.iam.v1.SetIamPolicyRequest {
  def this(properties: ISetIamPolicyRequest) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.iam.v1.SetIamPolicyRequest")
@js.native
object SetIamPolicyRequest extends js.Object {
  /**
    * Creates a new SetIamPolicyRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SetIamPolicyRequest instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.iam.v1.SetIamPolicyRequest = js.native
  def create(properties: ISetIamPolicyRequest): typings.googleCloudPubsub.protosMod.google.iam.v1.SetIamPolicyRequest = js.native
  /**
    * Decodes a SetIamPolicyRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SetIamPolicyRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.iam.v1.SetIamPolicyRequest = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.iam.v1.SetIamPolicyRequest = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.iam.v1.SetIamPolicyRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.iam.v1.SetIamPolicyRequest = js.native
  /**
    * Decodes a SetIamPolicyRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SetIamPolicyRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.iam.v1.SetIamPolicyRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.iam.v1.SetIamPolicyRequest = js.native
  /**
    * Encodes the specified SetIamPolicyRequest message. Does not implicitly {@link google.iam.v1.SetIamPolicyRequest.verify|verify} messages.
    * @param message SetIamPolicyRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISetIamPolicyRequest): Writer = js.native
  def encode(message: ISetIamPolicyRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SetIamPolicyRequest message, length delimited. Does not implicitly {@link google.iam.v1.SetIamPolicyRequest.verify|verify} messages.
    * @param message SetIamPolicyRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISetIamPolicyRequest): Writer = js.native
  def encodeDelimited(message: ISetIamPolicyRequest, writer: Writer): Writer = js.native
  /**
    * Creates a SetIamPolicyRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SetIamPolicyRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.iam.v1.SetIamPolicyRequest = js.native
  /**
    * Creates a plain object from a SetIamPolicyRequest message. Also converts values to other types if specified.
    * @param message SetIamPolicyRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.iam.v1.SetIamPolicyRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.iam.v1.SetIamPolicyRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SetIamPolicyRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

