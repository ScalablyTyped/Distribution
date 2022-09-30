package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.iam.v1.ITestIamPermissionsResponse
import typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsResponse
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTestIamPermissionsRCreate extends StObject {
  
  /**
    * Creates a new TestIamPermissionsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestIamPermissionsResponse instance
    */
  /* static member */
  def create(): TestIamPermissionsResponse = js.native
  def create(properties: ITestIamPermissionsResponse): TestIamPermissionsResponse = js.native
  
  def decode(reader: js.typedarray.Uint8Array): TestIamPermissionsResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): TestIamPermissionsResponse = js.native
  /**
    * Decodes a TestIamPermissionsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestIamPermissionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): TestIamPermissionsResponse = js.native
  def decode(reader: Reader, length: Double): TestIamPermissionsResponse = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): TestIamPermissionsResponse = js.native
  /**
    * Decodes a TestIamPermissionsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestIamPermissionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): TestIamPermissionsResponse = js.native
  
  /**
    * Encodes the specified TestIamPermissionsResponse message. Does not implicitly {@link google.iam.v1.TestIamPermissionsResponse.verify|verify} messages.
    * @param message TestIamPermissionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: ITestIamPermissionsResponse): Writer = js.native
  def encode(message: ITestIamPermissionsResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestIamPermissionsResponse message, length delimited. Does not implicitly {@link google.iam.v1.TestIamPermissionsResponse.verify|verify} messages.
    * @param message TestIamPermissionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: ITestIamPermissionsResponse): Writer = js.native
  def encodeDelimited(message: ITestIamPermissionsResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestIamPermissionsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestIamPermissionsResponse
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): TestIamPermissionsResponse = js.native
  
  /**
    * Creates a plain object from a TestIamPermissionsResponse message. Also converts values to other types if specified.
    * @param message TestIamPermissionsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: TestIamPermissionsResponse): StringDictionary[Any] = js.native
  def toObject(message: TestIamPermissionsResponse, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a TestIamPermissionsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
