package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestIamPermissionsResponse. */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsResponse")
@js.native
/**
  * Constructs a new TestIamPermissionsResponse.
  * @param [properties] Properties to set
  */
class TestIamPermissionsResponse ()
  extends StObject
     with ITestIamPermissionsResponse {
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
object TestIamPermissionsResponse {
  
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.TestIamPermissionsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TestIamPermissionsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestIamPermissionsResponse instance
    */
  /* static member */
  @scala.inline
  def create(): TestIamPermissionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TestIamPermissionsResponse]
  @scala.inline
  def create(properties: ITestIamPermissionsResponse): TestIamPermissionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TestIamPermissionsResponse]
  
  /**
    * Decodes a TestIamPermissionsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestIamPermissionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): TestIamPermissionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestIamPermissionsResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): TestIamPermissionsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestIamPermissionsResponse]
  @scala.inline
  def decode(reader: Uint8Array): TestIamPermissionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TestIamPermissionsResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): TestIamPermissionsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TestIamPermissionsResponse]
  
  /**
    * Decodes a TestIamPermissionsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestIamPermissionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): TestIamPermissionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestIamPermissionsResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): TestIamPermissionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TestIamPermissionsResponse]
  
  /**
    * Encodes the specified TestIamPermissionsResponse message. Does not implicitly {@link google.iam.v1.TestIamPermissionsResponse.verify|verify} messages.
    * @param message TestIamPermissionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ITestIamPermissionsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ITestIamPermissionsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TestIamPermissionsResponse message, length delimited. Does not implicitly {@link google.iam.v1.TestIamPermissionsResponse.verify|verify} messages.
    * @param message TestIamPermissionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ITestIamPermissionsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ITestIamPermissionsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TestIamPermissionsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestIamPermissionsResponse
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): TestIamPermissionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TestIamPermissionsResponse]
  
  /**
    * Creates a plain object from a TestIamPermissionsResponse message. Also converts values to other types if specified.
    * @param message TestIamPermissionsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: TestIamPermissionsResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: TestIamPermissionsResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TestIamPermissionsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
