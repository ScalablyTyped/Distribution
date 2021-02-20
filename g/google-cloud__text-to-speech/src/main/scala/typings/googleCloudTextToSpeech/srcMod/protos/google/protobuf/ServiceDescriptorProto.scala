package typings.googleCloudTextToSpeech.srcMod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.mod.google.protobuf.IServiceDescriptorProto
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ServiceDescriptorProto. */
@JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto")
@js.native
/**
  * Constructs a new ServiceDescriptorProto.
  * @param [properties] Properties to set
  */
class ServiceDescriptorProto ()
  extends typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceDescriptorProto {
  def this(properties: IServiceDescriptorProto) = this()
}
object ServiceDescriptorProto {
  
  /**
    * Creates a new ServiceDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ServiceDescriptorProto instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.create")
  @js.native
  def create(): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.create")
  @js.native
  def create(properties: IServiceDescriptorProto): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceDescriptorProto = js.native
  
  /**
    * Decodes a ServiceDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ServiceDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceDescriptorProto = js.native
  
  /**
    * Decodes a ServiceDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ServiceDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceDescriptorProto = js.native
  
  /**
    * Encodes the specified ServiceDescriptorProto message. Does not implicitly {@link google.protobuf.ServiceDescriptorProto.verify|verify} messages.
    * @param message ServiceDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.encode")
  @js.native
  def encode(message: IServiceDescriptorProto): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.encode")
  @js.native
  def encode(message: IServiceDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ServiceDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.ServiceDescriptorProto.verify|verify} messages.
    * @param message ServiceDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IServiceDescriptorProto): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IServiceDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates a ServiceDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ServiceDescriptorProto
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceDescriptorProto = js.native
  
  /**
    * Creates a plain object from a ServiceDescriptorProto message. Also converts values to other types if specified.
    * @param message ServiceDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.toObject")
  @js.native
  def toObject(message: typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceDescriptorProto): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ServiceDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceDescriptorProto.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
