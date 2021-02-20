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

/** Represents a Binding. */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding")
@js.native
/**
  * Constructs a new Binding.
  * @param [properties] Properties to set
  */
class Binding () extends IBinding {
  def this(properties: IBinding) = this()
  
  /** Binding members. */
  @JSName("members")
  var members_Binding: js.Array[String] = js.native
  
  /** Binding role. */
  @JSName("role")
  var role_Binding: String = js.native
  
  /**
    * Converts this Binding to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Binding {
  
  /**
    * Creates a new Binding instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Binding instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.create")
  @js.native
  def create(): Binding = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.create")
  @js.native
  def create(properties: IBinding): Binding = js.native
  
  /**
    * Decodes a Binding message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Binding
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.decode")
  @js.native
  def decode(reader: Reader): Binding = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.decode")
  @js.native
  def decode(reader: Reader, length: Double): Binding = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.decode")
  @js.native
  def decode(reader: Uint8Array): Binding = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Binding = js.native
  
  /**
    * Decodes a Binding message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Binding
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Binding = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Binding = js.native
  
  /**
    * Encodes the specified Binding message. Does not implicitly {@link google.iam.v1.Binding.verify|verify} messages.
    * @param message Binding message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.encode")
  @js.native
  def encode(message: IBinding): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.encode")
  @js.native
  def encode(message: IBinding, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Binding message, length delimited. Does not implicitly {@link google.iam.v1.Binding.verify|verify} messages.
    * @param message Binding message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBinding): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBinding, writer: Writer): Writer = js.native
  
  /**
    * Creates a Binding message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Binding
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Binding = js.native
  
  /**
    * Creates a plain object from a Binding message. Also converts values to other types if specified.
    * @param message Binding
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.toObject")
  @js.native
  def toObject(message: Binding): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.toObject")
  @js.native
  def toObject(message: Binding, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Binding message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
