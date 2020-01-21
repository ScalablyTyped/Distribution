package typings.googleCloudPubsub.iamMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a TestIamPermissionsRequest. */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.iam.v1.TestIamPermissionsRequest")
@js.native
/**
  * Constructs a new TestIamPermissionsRequest.
  * @param [properties] Properties to set
  */
class TestIamPermissionsRequest () extends ITestIamPermissionsRequest {
  def this(properties: ITestIamPermissionsRequest) = this()
  /** TestIamPermissionsRequest permissions. */
  @JSName("permissions")
  var permissions_TestIamPermissionsRequest: js.Array[String] = js.native
  /** TestIamPermissionsRequest resource. */
  @JSName("resource")
  var resource_TestIamPermissionsRequest: String = js.native
  /**
    * Converts this TestIamPermissionsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.iam.v1.TestIamPermissionsRequest")
@js.native
object TestIamPermissionsRequest extends js.Object {
  /**
    * Creates a new TestIamPermissionsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestIamPermissionsRequest instance
    */
  def create(): TestIamPermissionsRequest = js.native
  def create(properties: ITestIamPermissionsRequest): TestIamPermissionsRequest = js.native
  /**
    * Decodes a TestIamPermissionsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestIamPermissionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TestIamPermissionsRequest = js.native
  def decode(reader: Reader, length: Double): TestIamPermissionsRequest = js.native
  def decode(reader: Uint8Array): TestIamPermissionsRequest = js.native
  def decode(reader: Uint8Array, length: Double): TestIamPermissionsRequest = js.native
  /**
    * Decodes a TestIamPermissionsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestIamPermissionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TestIamPermissionsRequest = js.native
  def decodeDelimited(reader: Uint8Array): TestIamPermissionsRequest = js.native
  /**
    * Encodes the specified TestIamPermissionsRequest message. Does not implicitly {@link google.iam.v1.TestIamPermissionsRequest.verify|verify} messages.
    * @param message TestIamPermissionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITestIamPermissionsRequest): Writer = js.native
  def encode(message: ITestIamPermissionsRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TestIamPermissionsRequest message, length delimited. Does not implicitly {@link google.iam.v1.TestIamPermissionsRequest.verify|verify} messages.
    * @param message TestIamPermissionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITestIamPermissionsRequest): Writer = js.native
  def encodeDelimited(message: ITestIamPermissionsRequest, writer: Writer): Writer = js.native
  /**
    * Creates a TestIamPermissionsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestIamPermissionsRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): TestIamPermissionsRequest = js.native
  /**
    * Creates a plain object from a TestIamPermissionsRequest message. Also converts values to other types if specified.
    * @param message TestIamPermissionsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TestIamPermissionsRequest): StringDictionary[js.Any] = js.native
  def toObject(message: TestIamPermissionsRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TestIamPermissionsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

