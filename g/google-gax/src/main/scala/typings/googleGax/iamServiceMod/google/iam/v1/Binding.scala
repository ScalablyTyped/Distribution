package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Binding. */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding")
@js.native
/**
  * Constructs a new Binding.
  * @param [properties] Properties to set
  */
class Binding ()
  extends StObject
     with IBinding {
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
  
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Binding")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Binding instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Binding instance
    */
  /* static member */
  @scala.inline
  def create(): Binding = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Binding]
  @scala.inline
  def create(properties: IBinding): Binding = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Binding]
  
  /**
    * Decodes a Binding message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Binding
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): Binding = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Binding]
  @scala.inline
  def decode(reader: Reader, length: Double): Binding = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Binding]
  @scala.inline
  def decode(reader: Uint8Array): Binding = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Binding]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): Binding = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Binding]
  
  /**
    * Decodes a Binding message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Binding
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): Binding = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Binding]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): Binding = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Binding]
  
  /**
    * Encodes the specified Binding message. Does not implicitly {@link google.iam.v1.Binding.verify|verify} messages.
    * @param message Binding message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IBinding): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IBinding, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Binding message, length delimited. Does not implicitly {@link google.iam.v1.Binding.verify|verify} messages.
    * @param message Binding message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IBinding): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IBinding, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Binding message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Binding
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): Binding = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Binding]
  
  /**
    * Creates a plain object from a Binding message. Also converts values to other types if specified.
    * @param message Binding
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: Binding): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: Binding, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Binding message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
