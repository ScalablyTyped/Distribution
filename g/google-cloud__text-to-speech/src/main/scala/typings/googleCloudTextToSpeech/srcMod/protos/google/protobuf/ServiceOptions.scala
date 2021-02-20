package typings.googleCloudTextToSpeech.srcMod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.mod.google.protobuf.IServiceOptions
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ServiceOptions. */
@JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions")
@js.native
/**
  * Constructs a new ServiceOptions.
  * @param [properties] Properties to set
  */
class ServiceOptions ()
  extends typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceOptions {
  def this(properties: IServiceOptions) = this()
}
object ServiceOptions {
  
  /**
    * Creates a new ServiceOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ServiceOptions instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.create")
  @js.native
  def create(): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.create")
  @js.native
  def create(properties: IServiceOptions): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceOptions = js.native
  
  /**
    * Decodes a ServiceOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ServiceOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceOptions = js.native
  
  /**
    * Decodes a ServiceOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ServiceOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceOptions = js.native
  
  /**
    * Encodes the specified ServiceOptions message. Does not implicitly {@link google.protobuf.ServiceOptions.verify|verify} messages.
    * @param message ServiceOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.encode")
  @js.native
  def encode(message: IServiceOptions): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.encode")
  @js.native
  def encode(message: IServiceOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ServiceOptions message, length delimited. Does not implicitly {@link google.protobuf.ServiceOptions.verify|verify} messages.
    * @param message ServiceOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IServiceOptions): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IServiceOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates a ServiceOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ServiceOptions
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceOptions = js.native
  
  /**
    * Creates a plain object from a ServiceOptions message. Also converts values to other types if specified.
    * @param message ServiceOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.toObject")
  @js.native
  def toObject(message: typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceOptions): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudTextToSpeech.mod.google.protobuf.ServiceOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ServiceOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.ServiceOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
