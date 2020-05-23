package typings.googleCloudPubsub.protosMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GetPolicyOptions. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.iam.v1.GetPolicyOptions")
@js.native
/**
  * Constructs a new GetPolicyOptions.
  * @param [properties] Properties to set
  */
class GetPolicyOptions () extends IGetPolicyOptions {
  def this(properties: IGetPolicyOptions) = this()
  /** GetPolicyOptions requestedPolicyVersion. */
  @JSName("requestedPolicyVersion")
  var requestedPolicyVersion_GetPolicyOptions: Double = js.native
  /**
    * Converts this GetPolicyOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.iam.v1.GetPolicyOptions")
@js.native
object GetPolicyOptions extends js.Object {
  /**
    * Creates a new GetPolicyOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetPolicyOptions instance
    */
  def create(): GetPolicyOptions = js.native
  def create(properties: IGetPolicyOptions): GetPolicyOptions = js.native
  /**
    * Decodes a GetPolicyOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetPolicyOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GetPolicyOptions = js.native
  def decode(reader: Reader, length: Double): GetPolicyOptions = js.native
  def decode(reader: Uint8Array): GetPolicyOptions = js.native
  def decode(reader: Uint8Array, length: Double): GetPolicyOptions = js.native
  /**
    * Decodes a GetPolicyOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetPolicyOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GetPolicyOptions = js.native
  def decodeDelimited(reader: Uint8Array): GetPolicyOptions = js.native
  /**
    * Encodes the specified GetPolicyOptions message. Does not implicitly {@link google.iam.v1.GetPolicyOptions.verify|verify} messages.
    * @param message GetPolicyOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGetPolicyOptions): Writer = js.native
  def encode(message: IGetPolicyOptions, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GetPolicyOptions message, length delimited. Does not implicitly {@link google.iam.v1.GetPolicyOptions.verify|verify} messages.
    * @param message GetPolicyOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGetPolicyOptions): Writer = js.native
  def encodeDelimited(message: IGetPolicyOptions, writer: Writer): Writer = js.native
  /**
    * Creates a GetPolicyOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetPolicyOptions
    */
  def fromObject(`object`: StringDictionary[js.Any]): GetPolicyOptions = js.native
  /**
    * Creates a plain object from a GetPolicyOptions message. Also converts values to other types if specified.
    * @param message GetPolicyOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GetPolicyOptions): StringDictionary[js.Any] = js.native
  def toObject(message: GetPolicyOptions, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GetPolicyOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

