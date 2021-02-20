package typings.googleCloudTextToSpeech.srcMod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.mod.google.protobuf.IFileDescriptorProto
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FileDescriptorProto. */
@JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto")
@js.native
/**
  * Constructs a new FileDescriptorProto.
  * @param [properties] Properties to set
  */
class FileDescriptorProto ()
  extends typings.googleCloudTextToSpeech.mod.google.protobuf.FileDescriptorProto {
  def this(properties: IFileDescriptorProto) = this()
}
object FileDescriptorProto {
  
  /**
    * Creates a new FileDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileDescriptorProto instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.create")
  @js.native
  def create(): typings.googleCloudTextToSpeech.mod.google.protobuf.FileDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.create")
  @js.native
  def create(properties: IFileDescriptorProto): typings.googleCloudTextToSpeech.mod.google.protobuf.FileDescriptorProto = js.native
  
  /**
    * Decodes a FileDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.FileDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.FileDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.FileDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.FileDescriptorProto = js.native
  
  /**
    * Decodes a FileDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.FileDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.FileDescriptorProto = js.native
  
  /**
    * Encodes the specified FileDescriptorProto message. Does not implicitly {@link google.protobuf.FileDescriptorProto.verify|verify} messages.
    * @param message FileDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.encode")
  @js.native
  def encode(message: IFileDescriptorProto): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.encode")
  @js.native
  def encode(message: IFileDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FileDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.FileDescriptorProto.verify|verify} messages.
    * @param message FileDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFileDescriptorProto): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFileDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates a FileDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileDescriptorProto
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.protobuf.FileDescriptorProto = js.native
  
  /**
    * Creates a plain object from a FileDescriptorProto message. Also converts values to other types if specified.
    * @param message FileDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.toObject")
  @js.native
  def toObject(message: typings.googleCloudTextToSpeech.mod.google.protobuf.FileDescriptorProto): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudTextToSpeech.mod.google.protobuf.FileDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a FileDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileDescriptorProto.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
