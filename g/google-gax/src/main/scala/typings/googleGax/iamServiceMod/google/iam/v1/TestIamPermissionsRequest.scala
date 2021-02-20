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

/** Represents a TestIamPermissionsRequest. */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest")
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
object TestIamPermissionsRequest {
  
  /**
    * Creates a new TestIamPermissionsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestIamPermissionsRequest instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.create")
  @js.native
  def create(): TestIamPermissionsRequest = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.create")
  @js.native
  def create(properties: ITestIamPermissionsRequest): TestIamPermissionsRequest = js.native
  
  /**
    * Decodes a TestIamPermissionsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestIamPermissionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.decode")
  @js.native
  def decode(reader: Reader): TestIamPermissionsRequest = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): TestIamPermissionsRequest = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.decode")
  @js.native
  def decode(reader: Uint8Array): TestIamPermissionsRequest = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): TestIamPermissionsRequest = js.native
  
  /**
    * Decodes a TestIamPermissionsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestIamPermissionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TestIamPermissionsRequest = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): TestIamPermissionsRequest = js.native
  
  /**
    * Encodes the specified TestIamPermissionsRequest message. Does not implicitly {@link google.iam.v1.TestIamPermissionsRequest.verify|verify} messages.
    * @param message TestIamPermissionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.encode")
  @js.native
  def encode(message: ITestIamPermissionsRequest): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.encode")
  @js.native
  def encode(message: ITestIamPermissionsRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestIamPermissionsRequest message, length delimited. Does not implicitly {@link google.iam.v1.TestIamPermissionsRequest.verify|verify} messages.
    * @param message TestIamPermissionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestIamPermissionsRequest): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestIamPermissionsRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestIamPermissionsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestIamPermissionsRequest
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TestIamPermissionsRequest = js.native
  
  /**
    * Creates a plain object from a TestIamPermissionsRequest message. Also converts values to other types if specified.
    * @param message TestIamPermissionsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.toObject")
  @js.native
  def toObject(message: TestIamPermissionsRequest): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.toObject")
  @js.native
  def toObject(message: TestIamPermissionsRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestIamPermissionsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
