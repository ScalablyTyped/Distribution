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

/** Represents a Policy. */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy")
@js.native
/**
  * Constructs a new Policy.
  * @param [properties] Properties to set
  */
class Policy () extends IPolicy {
  def this(properties: IPolicy) = this()
  
  /** Policy bindings. */
  @JSName("bindings")
  var bindings_Policy: js.Array[IBinding] = js.native
  
  /** Policy etag. */
  @JSName("etag")
  var etag_Policy: Uint8Array = js.native
  
  /**
    * Converts this Policy to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** Policy version. */
  @JSName("version")
  var version_Policy: Double = js.native
}
object Policy {
  
  /**
    * Creates a new Policy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Policy instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.create")
  @js.native
  def create(): Policy = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.create")
  @js.native
  def create(properties: IPolicy): Policy = js.native
  
  /**
    * Decodes a Policy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.decode")
  @js.native
  def decode(reader: Reader): Policy = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.decode")
  @js.native
  def decode(reader: Reader, length: Double): Policy = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.decode")
  @js.native
  def decode(reader: Uint8Array): Policy = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Policy = js.native
  
  /**
    * Decodes a Policy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Policy = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Policy = js.native
  
  /**
    * Encodes the specified Policy message. Does not implicitly {@link google.iam.v1.Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.encode")
  @js.native
  def encode(message: IPolicy): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.encode")
  @js.native
  def encode(message: IPolicy, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Policy message, length delimited. Does not implicitly {@link google.iam.v1.Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPolicy): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPolicy, writer: Writer): Writer = js.native
  
  /**
    * Creates a Policy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Policy
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Policy = js.native
  
  /**
    * Creates a plain object from a Policy message. Also converts values to other types if specified.
    * @param message Policy
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.toObject")
  @js.native
  def toObject(message: Policy): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.toObject")
  @js.native
  def toObject(message: Policy, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Policy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
