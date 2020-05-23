package typings.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.IFileDescriptorProto
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a FileDescriptorProto. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileDescriptorProto")
@js.native
/**
  * Constructs a new FileDescriptorProto.
  * @param [properties] Properties to set
  */
class FileDescriptorProto ()
  extends typings.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorProto {
  def this(properties: IFileDescriptorProto) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileDescriptorProto")
@js.native
object FileDescriptorProto extends js.Object {
  /**
    * Creates a new FileDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileDescriptorProto instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorProto = js.native
  def create(properties: IFileDescriptorProto): typings.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorProto = js.native
  /**
    * Decodes a FileDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorProto = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorProto = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorProto = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorProto = js.native
  /**
    * Decodes a FileDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorProto = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorProto = js.native
  /**
    * Encodes the specified FileDescriptorProto message. Does not implicitly {@link google.protobuf.FileDescriptorProto.verify|verify} messages.
    * @param message FileDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IFileDescriptorProto): Writer = js.native
  def encode(message: IFileDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Encodes the specified FileDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.FileDescriptorProto.verify|verify} messages.
    * @param message FileDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IFileDescriptorProto): Writer = js.native
  def encodeDelimited(message: IFileDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Creates a FileDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileDescriptorProto
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorProto = js.native
  /**
    * Creates a plain object from a FileDescriptorProto message. Also converts values to other types if specified.
    * @param message FileDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorProto): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a FileDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

