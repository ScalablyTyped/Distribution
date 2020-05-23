package typings.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a FileDescriptorSet. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileDescriptorSet")
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

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileDescriptorSet")
@js.native
object FileDescriptorSet extends js.Object {
  /**
    * Creates a new FileDescriptorSet instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileDescriptorSet instance
    */
  def create(): FileDescriptorSet = js.native
  def create(properties: IFileDescriptorSet): FileDescriptorSet = js.native
  /**
    * Decodes a FileDescriptorSet message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileDescriptorSet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): FileDescriptorSet = js.native
  def decode(reader: Reader, length: Double): FileDescriptorSet = js.native
  def decode(reader: Uint8Array): FileDescriptorSet = js.native
  def decode(reader: Uint8Array, length: Double): FileDescriptorSet = js.native
  /**
    * Decodes a FileDescriptorSet message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileDescriptorSet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): FileDescriptorSet = js.native
  def decodeDelimited(reader: Uint8Array): FileDescriptorSet = js.native
  /**
    * Encodes the specified FileDescriptorSet message. Does not implicitly {@link google.protobuf.FileDescriptorSet.verify|verify} messages.
    * @param message FileDescriptorSet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IFileDescriptorSet): Writer = js.native
  def encode(message: IFileDescriptorSet, writer: Writer): Writer = js.native
  /**
    * Encodes the specified FileDescriptorSet message, length delimited. Does not implicitly {@link google.protobuf.FileDescriptorSet.verify|verify} messages.
    * @param message FileDescriptorSet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IFileDescriptorSet): Writer = js.native
  def encodeDelimited(message: IFileDescriptorSet, writer: Writer): Writer = js.native
  /**
    * Creates a FileDescriptorSet message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileDescriptorSet
    */
  def fromObject(`object`: StringDictionary[js.Any]): FileDescriptorSet = js.native
  /**
    * Creates a plain object from a FileDescriptorSet message. Also converts values to other types if specified.
    * @param message FileDescriptorSet
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: FileDescriptorSet): StringDictionary[js.Any] = js.native
  def toObject(message: FileDescriptorSet, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a FileDescriptorSet message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

