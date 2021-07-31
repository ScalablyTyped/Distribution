package typings.googleGax.mod.IamProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.protobuf.IEnumValueOptions
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EnumValueOptions. */
@JSImport("google-gax", "IamProtos.google.protobuf.EnumValueOptions")
@js.native
/**
  * Constructs a new EnumValueOptions.
  * @param [properties] Properties to set
  */
class EnumValueOptions ()
  extends typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions {
  def this(properties: IEnumValueOptions) = this()
}
object EnumValueOptions {
  
  @JSImport("google-gax", "IamProtos.google.protobuf.EnumValueOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new EnumValueOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumValueOptions instance
    */
  /* static member */
  @scala.inline
  def create(): typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions]
  @scala.inline
  def create(properties: IEnumValueOptions): typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions]
  
  /**
    * Decodes an EnumValueOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumValueOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions]
  @scala.inline
  def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions]
  
  /**
    * Decodes an EnumValueOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumValueOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions]
  
  /**
    * Encodes the specified EnumValueOptions message. Does not implicitly {@link google.protobuf.EnumValueOptions.verify|verify} messages.
    * @param message EnumValueOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IEnumValueOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IEnumValueOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified EnumValueOptions message, length delimited. Does not implicitly {@link google.protobuf.EnumValueOptions.verify|verify} messages.
    * @param message EnumValueOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IEnumValueOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IEnumValueOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an EnumValueOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumValueOptions
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions]
  
  /**
    * Creates a plain object from an EnumValueOptions message. Also converts values to other types if specified.
    * @param message EnumValueOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(
    message: typings.googleGax.iamServiceMod.google.protobuf.EnumValueOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an EnumValueOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
