package typings.googleGax.mod.operationsProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.protobuf.IFileDescriptorSet
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FileDescriptorSet. */
@JSImport("google-gax", "operationsProtos.google.protobuf.FileDescriptorSet")
@js.native
/**
  * Constructs a new FileDescriptorSet.
  * @param [properties] Properties to set
  */
class FileDescriptorSet ()
  extends typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet {
  def this(properties: IFileDescriptorSet) = this()
}
object FileDescriptorSet {
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.FileDescriptorSet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new FileDescriptorSet instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileDescriptorSet instance
    */
  /* static member */
  @scala.inline
  def create(): typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet]
  @scala.inline
  def create(properties: IFileDescriptorSet): typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet]
  
  /**
    * Decodes a FileDescriptorSet message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileDescriptorSet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet]
  @scala.inline
  def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet]
  
  /**
    * Decodes a FileDescriptorSet message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileDescriptorSet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet]
  
  /**
    * Encodes the specified FileDescriptorSet message. Does not implicitly {@link google.protobuf.FileDescriptorSet.verify|verify} messages.
    * @param message FileDescriptorSet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IFileDescriptorSet): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IFileDescriptorSet, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified FileDescriptorSet message, length delimited. Does not implicitly {@link google.protobuf.FileDescriptorSet.verify|verify} messages.
    * @param message FileDescriptorSet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IFileDescriptorSet): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IFileDescriptorSet, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a FileDescriptorSet message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileDescriptorSet
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet]
  
  /**
    * Creates a plain object from a FileDescriptorSet message. Also converts values to other types if specified.
    * @param message FileDescriptorSet
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(
    message: typings.googleGax.operationsMod.google.protobuf.FileDescriptorSet,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a FileDescriptorSet message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
