package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestIamPermissionsRequest. */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest")
@js.native
/**
  * Constructs a new TestIamPermissionsRequest.
  * @param [properties] Properties to set
  */
class TestIamPermissionsRequest ()
  extends StObject
     with ITestIamPermissionsRequest {
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
  
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TestIamPermissionsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestIamPermissionsRequest instance
    */
  /* static member */
  @scala.inline
  def create(): TestIamPermissionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TestIamPermissionsRequest]
  @scala.inline
  def create(properties: ITestIamPermissionsRequest): TestIamPermissionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TestIamPermissionsRequest]
  
  /**
    * Decodes a TestIamPermissionsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestIamPermissionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): TestIamPermissionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestIamPermissionsRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): TestIamPermissionsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestIamPermissionsRequest]
  @scala.inline
  def decode(reader: Uint8Array): TestIamPermissionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestIamPermissionsRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): TestIamPermissionsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestIamPermissionsRequest]
  
  /**
    * Decodes a TestIamPermissionsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestIamPermissionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): TestIamPermissionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestIamPermissionsRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): TestIamPermissionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestIamPermissionsRequest]
  
  /**
    * Encodes the specified TestIamPermissionsRequest message. Does not implicitly {@link google.iam.v1.TestIamPermissionsRequest.verify|verify} messages.
    * @param message TestIamPermissionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ITestIamPermissionsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ITestIamPermissionsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TestIamPermissionsRequest message, length delimited. Does not implicitly {@link google.iam.v1.TestIamPermissionsRequest.verify|verify} messages.
    * @param message TestIamPermissionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ITestIamPermissionsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ITestIamPermissionsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TestIamPermissionsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestIamPermissionsRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): TestIamPermissionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TestIamPermissionsRequest]
  
  /**
    * Creates a plain object from a TestIamPermissionsRequest message. Also converts values to other types if specified.
    * @param message TestIamPermissionsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: TestIamPermissionsRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: TestIamPermissionsRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TestIamPermissionsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
