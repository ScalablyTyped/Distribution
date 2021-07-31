package typings.googleGax.mod.operationsProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.protobuf.IExtensionRangeOptions
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ExtensionRangeOptions. */
@JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions")
@js.native
/**
  * Constructs a new ExtensionRangeOptions.
  * @param [properties] Properties to set
  */
class ExtensionRangeOptions ()
  extends typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions {
  def this(properties: IExtensionRangeOptions) = this()
}
object ExtensionRangeOptions {
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ExtensionRangeOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExtensionRangeOptions instance
    */
  /* static member */
  @scala.inline
  def create(): typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions]
  @scala.inline
  def create(properties: IExtensionRangeOptions): typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions]
  
  /**
    * Decodes an ExtensionRangeOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExtensionRangeOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions]
  @scala.inline
  def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions]
  
  /**
    * Decodes an ExtensionRangeOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExtensionRangeOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions]
  
  /**
    * Encodes the specified ExtensionRangeOptions message. Does not implicitly {@link google.protobuf.ExtensionRangeOptions.verify|verify} messages.
    * @param message ExtensionRangeOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IExtensionRangeOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IExtensionRangeOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ExtensionRangeOptions message, length delimited. Does not implicitly {@link google.protobuf.ExtensionRangeOptions.verify|verify} messages.
    * @param message ExtensionRangeOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IExtensionRangeOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IExtensionRangeOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an ExtensionRangeOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExtensionRangeOptions
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions]
  
  /**
    * Creates a plain object from an ExtensionRangeOptions message. Also converts values to other types if specified.
    * @param message ExtensionRangeOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(
    message: typings.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an ExtensionRangeOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
