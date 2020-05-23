package typings.googleCloudPubsub.protosMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a TestIamPermissionsResponse. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.iam.v1.TestIamPermissionsResponse")
@js.native
/**
  * Constructs a new TestIamPermissionsResponse.
  * @param [properties] Properties to set
  */
class TestIamPermissionsResponse () extends ITestIamPermissionsResponse {
  def this(properties: ITestIamPermissionsResponse) = this()
  /** TestIamPermissionsResponse permissions. */
  @JSName("permissions")
  var permissions_TestIamPermissionsResponse: js.Array[String] = js.native
  /**
    * Converts this TestIamPermissionsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.iam.v1.TestIamPermissionsResponse")
@js.native
object TestIamPermissionsResponse extends js.Object {
  /**
    * Creates a new TestIamPermissionsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestIamPermissionsResponse instance
    */
  def create(): TestIamPermissionsResponse = js.native
  def create(properties: ITestIamPermissionsResponse): TestIamPermissionsResponse = js.native
  /**
    * Decodes a TestIamPermissionsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestIamPermissionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TestIamPermissionsResponse = js.native
  def decode(reader: Reader, length: Double): TestIamPermissionsResponse = js.native
  def decode(reader: Uint8Array): TestIamPermissionsResponse = js.native
  def decode(reader: Uint8Array, length: Double): TestIamPermissionsResponse = js.native
  /**
    * Decodes a TestIamPermissionsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestIamPermissionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TestIamPermissionsResponse = js.native
  def decodeDelimited(reader: Uint8Array): TestIamPermissionsResponse = js.native
  /**
    * Encodes the specified TestIamPermissionsResponse message. Does not implicitly {@link google.iam.v1.TestIamPermissionsResponse.verify|verify} messages.
    * @param message TestIamPermissionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITestIamPermissionsResponse): Writer = js.native
  def encode(message: ITestIamPermissionsResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TestIamPermissionsResponse message, length delimited. Does not implicitly {@link google.iam.v1.TestIamPermissionsResponse.verify|verify} messages.
    * @param message TestIamPermissionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITestIamPermissionsResponse): Writer = js.native
  def encodeDelimited(message: ITestIamPermissionsResponse, writer: Writer): Writer = js.native
  /**
    * Creates a TestIamPermissionsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestIamPermissionsResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): TestIamPermissionsResponse = js.native
  /**
    * Creates a plain object from a TestIamPermissionsResponse message. Also converts values to other types if specified.
    * @param message TestIamPermissionsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TestIamPermissionsResponse): StringDictionary[js.Any] = js.native
  def toObject(message: TestIamPermissionsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TestIamPermissionsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

