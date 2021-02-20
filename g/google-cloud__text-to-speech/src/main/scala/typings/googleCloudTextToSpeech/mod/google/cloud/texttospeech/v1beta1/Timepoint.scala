package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Timepoint. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint")
@js.native
/**
  * Constructs a new Timepoint.
  * @param [properties] Properties to set
  */
class Timepoint () extends ITimepoint {
  def this(properties: ITimepoint) = this()
  
  /** Timepoint markName. */
  @JSName("markName")
  var markName_Timepoint: String = js.native
  
  /** Timepoint timeSeconds. */
  @JSName("timeSeconds")
  var timeSeconds_Timepoint: Double = js.native
  
  /**
    * Converts this Timepoint to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Timepoint {
  
  /**
    * Creates a new Timepoint instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Timepoint instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.create")
  @js.native
  def create(): Timepoint = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.create")
  @js.native
  def create(properties: ITimepoint): Timepoint = js.native
  
  /**
    * Decodes a Timepoint message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Timepoint
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.decode")
  @js.native
  def decode(reader: Reader): Timepoint = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.decode")
  @js.native
  def decode(reader: Reader, length: Double): Timepoint = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.decode")
  @js.native
  def decode(reader: Uint8Array): Timepoint = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Timepoint = js.native
  
  /**
    * Decodes a Timepoint message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Timepoint
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Timepoint = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Timepoint = js.native
  
  /**
    * Encodes the specified Timepoint message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.Timepoint.verify|verify} messages.
    * @param message Timepoint message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.encode")
  @js.native
  def encode(message: ITimepoint): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.encode")
  @js.native
  def encode(message: ITimepoint, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Timepoint message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.Timepoint.verify|verify} messages.
    * @param message Timepoint message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITimepoint): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITimepoint, writer: Writer): Writer = js.native
  
  /**
    * Creates a Timepoint message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Timepoint
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Timepoint = js.native
  
  /**
    * Creates a plain object from a Timepoint message. Also converts values to other types if specified.
    * @param message Timepoint
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.toObject")
  @js.native
  def toObject(message: Timepoint): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.toObject")
  @js.native
  def toObject(message: Timepoint, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Timepoint message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
