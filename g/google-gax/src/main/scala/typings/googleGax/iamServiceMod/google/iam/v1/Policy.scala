package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Policy. */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy")
@js.native
/**
  * Constructs a new Policy.
  * @param [properties] Properties to set
  */
class Policy ()
  extends StObject
     with IPolicy {
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
  
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.Policy")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Policy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Policy instance
    */
  /* static member */
  @scala.inline
  def create(): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Policy]
  @scala.inline
  def create(properties: IPolicy): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Policy]
  
  /**
    * Decodes a Policy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Policy]
  @scala.inline
  def decode(reader: Reader, length: Double): Policy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Policy]
  @scala.inline
  def decode(reader: Uint8Array): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Policy]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): Policy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Policy]
  
  /**
    * Decodes a Policy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Policy]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Policy]
  
  /**
    * Encodes the specified Policy message. Does not implicitly {@link google.iam.v1.Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IPolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IPolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Policy message, length delimited. Does not implicitly {@link google.iam.v1.Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IPolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IPolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Policy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Policy
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Policy]
  
  /**
    * Creates a plain object from a Policy message. Also converts values to other types if specified.
    * @param message Policy
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: Policy): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: Policy, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Policy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
