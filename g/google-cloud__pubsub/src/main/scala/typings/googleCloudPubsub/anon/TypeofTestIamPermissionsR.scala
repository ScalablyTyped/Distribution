package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.iam.v1.ITestIamPermissionsRequest
import typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTestIamPermissionsR extends StObject {
  
  /**
    * Creates a new TestIamPermissionsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestIamPermissionsRequest instance
    */
  /* static member */
  def create(): TestIamPermissionsRequest = js.native
  def create(properties: ITestIamPermissionsRequest): TestIamPermissionsRequest = js.native
  
  def decode(reader: js.typedarray.Uint8Array): TestIamPermissionsRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): TestIamPermissionsRequest = js.native
  /**
    * Decodes a TestIamPermissionsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestIamPermissionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): TestIamPermissionsRequest = js.native
  def decode(reader: Reader, length: Double): TestIamPermissionsRequest = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): TestIamPermissionsRequest = js.native
  /**
    * Decodes a TestIamPermissionsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestIamPermissionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): TestIamPermissionsRequest = js.native
  
  /**
    * Encodes the specified TestIamPermissionsRequest message. Does not implicitly {@link google.iam.v1.TestIamPermissionsRequest.verify|verify} messages.
    * @param message TestIamPermissionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: ITestIamPermissionsRequest): Writer = js.native
  def encode(message: ITestIamPermissionsRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestIamPermissionsRequest message, length delimited. Does not implicitly {@link google.iam.v1.TestIamPermissionsRequest.verify|verify} messages.
    * @param message TestIamPermissionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: ITestIamPermissionsRequest): Writer = js.native
  def encodeDelimited(message: ITestIamPermissionsRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestIamPermissionsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestIamPermissionsRequest
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): TestIamPermissionsRequest = js.native
  
  /**
    * Creates a plain object from a TestIamPermissionsRequest message. Also converts values to other types if specified.
    * @param message TestIamPermissionsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: TestIamPermissionsRequest): StringDictionary[Any] = js.native
  def toObject(message: TestIamPermissionsRequest, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a TestIamPermissionsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
