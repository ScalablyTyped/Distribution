package typings.googleGax.mod.IamProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.protobuf.IFileDescriptorSet
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FileDescriptorSet. */
@JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet")
@js.native
/**
  * Constructs a new FileDescriptorSet.
  * @param [properties] Properties to set
  */
class FileDescriptorSet ()
  extends typings.googleGax.iamServiceMod.google.protobuf.FileDescriptorSet {
  def this(properties: IFileDescriptorSet) = this()
}
object FileDescriptorSet {
  
  /**
    * Creates a new FileDescriptorSet instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileDescriptorSet instance
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.create")
  @js.native
  def create(): typings.googleGax.iamServiceMod.google.protobuf.FileDescriptorSet = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.create")
  @js.native
  def create(properties: IFileDescriptorSet): typings.googleGax.iamServiceMod.google.protobuf.FileDescriptorSet = js.native
  
  /**
    * Decodes a FileDescriptorSet message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileDescriptorSet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.decode")
  @js.native
  def decode(reader: Reader): typings.googleGax.iamServiceMod.google.protobuf.FileDescriptorSet = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.protobuf.FileDescriptorSet = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.protobuf.FileDescriptorSet = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.protobuf.FileDescriptorSet = js.native
  
  /**
    * Decodes a FileDescriptorSet message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileDescriptorSet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.protobuf.FileDescriptorSet = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.protobuf.FileDescriptorSet = js.native
  
  /**
    * Encodes the specified FileDescriptorSet message. Does not implicitly {@link google.protobuf.FileDescriptorSet.verify|verify} messages.
    * @param message FileDescriptorSet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.encode")
  @js.native
  def encode(message: IFileDescriptorSet): Writer = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.encode")
  @js.native
  def encode(message: IFileDescriptorSet, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FileDescriptorSet message, length delimited. Does not implicitly {@link google.protobuf.FileDescriptorSet.verify|verify} messages.
    * @param message FileDescriptorSet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFileDescriptorSet): Writer = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFileDescriptorSet, writer: Writer): Writer = js.native
  
  /**
    * Creates a FileDescriptorSet message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileDescriptorSet
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.protobuf.FileDescriptorSet = js.native
  
  /**
    * Creates a plain object from a FileDescriptorSet message. Also converts values to other types if specified.
    * @param message FileDescriptorSet
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.toObject")
  @js.native
  def toObject(message: typings.googleGax.iamServiceMod.google.protobuf.FileDescriptorSet): StringDictionary[js.Any] = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.toObject")
  @js.native
  def toObject(
    message: typings.googleGax.iamServiceMod.google.protobuf.FileDescriptorSet,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a FileDescriptorSet message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.FileDescriptorSet.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
