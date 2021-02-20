package typings.googleCloudTextToSpeech.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MethodDescriptorProto. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto")
@js.native
/**
  * Constructs a new MethodDescriptorProto.
  * @param [properties] Properties to set
  */
class MethodDescriptorProto () extends IMethodDescriptorProto {
  def this(properties: IMethodDescriptorProto) = this()
  
  /** MethodDescriptorProto clientStreaming. */
  @JSName("clientStreaming")
  var clientStreaming_MethodDescriptorProto: Boolean = js.native
  
  /** MethodDescriptorProto inputType. */
  @JSName("inputType")
  var inputType_MethodDescriptorProto: String = js.native
  
  /** MethodDescriptorProto name. */
  @JSName("name")
  var name_MethodDescriptorProto: String = js.native
  
  /** MethodDescriptorProto outputType. */
  @JSName("outputType")
  var outputType_MethodDescriptorProto: String = js.native
  
  /** MethodDescriptorProto serverStreaming. */
  @JSName("serverStreaming")
  var serverStreaming_MethodDescriptorProto: Boolean = js.native
  
  /**
    * Converts this MethodDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object MethodDescriptorProto {
  
  /**
    * Creates a new MethodDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MethodDescriptorProto instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.create")
  @js.native
  def create(): MethodDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.create")
  @js.native
  def create(properties: IMethodDescriptorProto): MethodDescriptorProto = js.native
  
  /**
    * Decodes a MethodDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MethodDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.decode")
  @js.native
  def decode(reader: Reader): MethodDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.decode")
  @js.native
  def decode(reader: Reader, length: Double): MethodDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array): MethodDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): MethodDescriptorProto = js.native
  
  /**
    * Decodes a MethodDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MethodDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): MethodDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): MethodDescriptorProto = js.native
  
  /**
    * Encodes the specified MethodDescriptorProto message. Does not implicitly {@link google.protobuf.MethodDescriptorProto.verify|verify} messages.
    * @param message MethodDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.encode")
  @js.native
  def encode(message: IMethodDescriptorProto): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.encode")
  @js.native
  def encode(message: IMethodDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified MethodDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.MethodDescriptorProto.verify|verify} messages.
    * @param message MethodDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMethodDescriptorProto): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMethodDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates a MethodDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MethodDescriptorProto
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): MethodDescriptorProto = js.native
  
  /**
    * Creates a plain object from a MethodDescriptorProto message. Also converts values to other types if specified.
    * @param message MethodDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.toObject")
  @js.native
  def toObject(message: MethodDescriptorProto): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.toObject")
  @js.native
  def toObject(message: MethodDescriptorProto, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a MethodDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodDescriptorProto.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
