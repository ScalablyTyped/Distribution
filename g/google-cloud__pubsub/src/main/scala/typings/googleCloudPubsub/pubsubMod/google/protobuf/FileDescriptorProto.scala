package typings.googleCloudPubsub.pubsubMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a FileDescriptorProto. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.FileDescriptorProto")
@js.native
/**
  * Constructs a new FileDescriptorProto.
  * @param [properties] Properties to set
  */
class FileDescriptorProto () extends IFileDescriptorProto {
  def this(properties: IFileDescriptorProto) = this()
  /** FileDescriptorProto package. */
  @JSName("package")
  var _package_FileDescriptorProto: String = js.native
  /** FileDescriptorProto dependency. */
  @JSName("dependency")
  var dependency_FileDescriptorProto: js.Array[String] = js.native
  /** FileDescriptorProto enumType. */
  @JSName("enumType")
  var enumType_FileDescriptorProto: js.Array[IEnumDescriptorProto] = js.native
  /** FileDescriptorProto extension. */
  @JSName("extension")
  var extension_FileDescriptorProto: js.Array[IFieldDescriptorProto] = js.native
  /** FileDescriptorProto messageType. */
  @JSName("messageType")
  var messageType_FileDescriptorProto: js.Array[IDescriptorProto] = js.native
  /** FileDescriptorProto name. */
  @JSName("name")
  var name_FileDescriptorProto: String = js.native
  /** FileDescriptorProto publicDependency. */
  @JSName("publicDependency")
  var publicDependency_FileDescriptorProto: js.Array[Double] = js.native
  /** FileDescriptorProto service. */
  @JSName("service")
  var service_FileDescriptorProto: js.Array[IServiceDescriptorProto] = js.native
  /** FileDescriptorProto syntax. */
  @JSName("syntax")
  var syntax_FileDescriptorProto: String = js.native
  /** FileDescriptorProto weakDependency. */
  @JSName("weakDependency")
  var weakDependency_FileDescriptorProto: js.Array[Double] = js.native
  /**
    * Converts this FileDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.FileDescriptorProto")
@js.native
object FileDescriptorProto extends js.Object {
  /**
    * Creates a new FileDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileDescriptorProto instance
    */
  def create(): FileDescriptorProto = js.native
  def create(properties: IFileDescriptorProto): FileDescriptorProto = js.native
  /**
    * Decodes a FileDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): FileDescriptorProto = js.native
  def decode(reader: Reader, length: Double): FileDescriptorProto = js.native
  def decode(reader: Uint8Array): FileDescriptorProto = js.native
  def decode(reader: Uint8Array, length: Double): FileDescriptorProto = js.native
  /**
    * Decodes a FileDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): FileDescriptorProto = js.native
  def decodeDelimited(reader: Uint8Array): FileDescriptorProto = js.native
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
  def fromObject(`object`: StringDictionary[js.Any]): FileDescriptorProto = js.native
  /**
    * Creates a plain object from a FileDescriptorProto message. Also converts values to other types if specified.
    * @param message FileDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: FileDescriptorProto): StringDictionary[js.Any] = js.native
  def toObject(message: FileDescriptorProto, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a FileDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

