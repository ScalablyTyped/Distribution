package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FileDescriptorSet. */
@JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet")
@js.native
/**
  * Constructs a new FileDescriptorSet.
  * @param [properties] Properties to set
  */
class FileDescriptorSet () extends IFileDescriptorSet {
  def this(properties: IFileDescriptorSet) = this()
  
  /** FileDescriptorSet file. */
  @JSName("file")
  var file_FileDescriptorSet: js.Array[IFileDescriptorProto] = js.native
  
  /**
    * Converts this FileDescriptorSet to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object FileDescriptorSet {
  
  /**
    * Creates a new FileDescriptorSet instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileDescriptorSet instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.create")
  @js.native
  def create(): FileDescriptorSet = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.create")
  @js.native
  def create(properties: IFileDescriptorSet): FileDescriptorSet = js.native
  
  /**
    * Decodes a FileDescriptorSet message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileDescriptorSet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.decode")
  @js.native
  def decode(reader: Reader): FileDescriptorSet = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.decode")
  @js.native
  def decode(reader: Reader, length: Double): FileDescriptorSet = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.decode")
  @js.native
  def decode(reader: Uint8Array): FileDescriptorSet = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): FileDescriptorSet = js.native
  
  /**
    * Decodes a FileDescriptorSet message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileDescriptorSet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): FileDescriptorSet = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): FileDescriptorSet = js.native
  
  /**
    * Encodes the specified FileDescriptorSet message. Does not implicitly {@link google.protobuf.FileDescriptorSet.verify|verify} messages.
    * @param message FileDescriptorSet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.encode")
  @js.native
  def encode(message: IFileDescriptorSet): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.encode")
  @js.native
  def encode(message: IFileDescriptorSet, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FileDescriptorSet message, length delimited. Does not implicitly {@link google.protobuf.FileDescriptorSet.verify|verify} messages.
    * @param message FileDescriptorSet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFileDescriptorSet): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFileDescriptorSet, writer: Writer): Writer = js.native
  
  /**
    * Creates a FileDescriptorSet message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileDescriptorSet
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): FileDescriptorSet = js.native
  
  /**
    * Creates a plain object from a FileDescriptorSet message. Also converts values to other types if specified.
    * @param message FileDescriptorSet
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.toObject")
  @js.native
  def toObject(message: FileDescriptorSet): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.toObject")
  @js.native
  def toObject(message: FileDescriptorSet, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a FileDescriptorSet message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.FileDescriptorSet.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
