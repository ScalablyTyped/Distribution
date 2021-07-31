package typings.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FileDescriptorProto. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileDescriptorProto")
@js.native
/**
  * Constructs a new FileDescriptorProto.
  * @param [properties] Properties to set
  */
class FileDescriptorProto ()
  extends StObject
     with IFileDescriptorProto {
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
  
  /**
    * Converts this FileDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** FileDescriptorProto weakDependency. */
  @JSName("weakDependency")
  var weakDependency_FileDescriptorProto: js.Array[Double] = js.native
}
object FileDescriptorProto {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new FileDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileDescriptorProto instance
    */
  /* static member */
  @scala.inline
  def create(): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FileDescriptorProto]
  @scala.inline
  def create(properties: IFileDescriptorProto): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  
  /**
    * Decodes a FileDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  @scala.inline
  def decode(reader: Reader, length: Double): FileDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FileDescriptorProto]
  @scala.inline
  def decode(reader: Uint8Array): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): FileDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FileDescriptorProto]
  
  /**
    * Decodes a FileDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  
  /**
    * Encodes the specified FileDescriptorProto message. Does not implicitly {@link google.protobuf.FileDescriptorProto.verify|verify} messages.
    * @param message FileDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IFileDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IFileDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified FileDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.FileDescriptorProto.verify|verify} messages.
    * @param message FileDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IFileDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IFileDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a FileDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileDescriptorProto
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  
  /**
    * Creates a plain object from a FileDescriptorProto message. Also converts values to other types if specified.
    * @param message FileDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: FileDescriptorProto): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: FileDescriptorProto, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a FileDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
