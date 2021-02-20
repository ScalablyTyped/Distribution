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

/** Represents a GetPolicyOptions. */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions")
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
object GetPolicyOptions {
  
  /**
    * Creates a new GetPolicyOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetPolicyOptions instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.create")
  @js.native
  def create(): GetPolicyOptions = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.create")
  @js.native
  def create(properties: IGetPolicyOptions): GetPolicyOptions = js.native
  
  /**
    * Decodes a GetPolicyOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetPolicyOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.decode")
  @js.native
  def decode(reader: Reader): GetPolicyOptions = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): GetPolicyOptions = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.decode")
  @js.native
  def decode(reader: Uint8Array): GetPolicyOptions = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): GetPolicyOptions = js.native
  
  /**
    * Decodes a GetPolicyOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetPolicyOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): GetPolicyOptions = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): GetPolicyOptions = js.native
  
  /**
    * Encodes the specified GetPolicyOptions message. Does not implicitly {@link google.iam.v1.GetPolicyOptions.verify|verify} messages.
    * @param message GetPolicyOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.encode")
  @js.native
  def encode(message: IGetPolicyOptions): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.encode")
  @js.native
  def encode(message: IGetPolicyOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetPolicyOptions message, length delimited. Does not implicitly {@link google.iam.v1.GetPolicyOptions.verify|verify} messages.
    * @param message GetPolicyOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetPolicyOptions): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetPolicyOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetPolicyOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetPolicyOptions
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): GetPolicyOptions = js.native
  
  /**
    * Creates a plain object from a GetPolicyOptions message. Also converts values to other types if specified.
    * @param message GetPolicyOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.toObject")
  @js.native
  def toObject(message: GetPolicyOptions): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.toObject")
  @js.native
  def toObject(message: GetPolicyOptions, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetPolicyOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.GetPolicyOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
