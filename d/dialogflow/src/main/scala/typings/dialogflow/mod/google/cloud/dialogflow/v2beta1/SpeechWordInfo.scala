package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SpeechWordInfo. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo")
@js.native
/**
  * Constructs a new SpeechWordInfo.
  * @param [properties] Properties to set
  */
class SpeechWordInfo () extends ISpeechWordInfo {
  def this(properties: ISpeechWordInfo) = this()
  
  /** SpeechWordInfo confidence. */
  @JSName("confidence")
  var confidence_SpeechWordInfo: Double = js.native
  
  /**
    * Converts this SpeechWordInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** SpeechWordInfo word. */
  @JSName("word")
  var word_SpeechWordInfo: String = js.native
}
object SpeechWordInfo {
  
  /**
    * Creates a new SpeechWordInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SpeechWordInfo instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.create")
  @js.native
  def create(): SpeechWordInfo = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.create")
  @js.native
  def create(properties: ISpeechWordInfo): SpeechWordInfo = js.native
  
  /**
    * Decodes a SpeechWordInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SpeechWordInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.decode")
  @js.native
  def decode(reader: Reader): SpeechWordInfo = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.decode")
  @js.native
  def decode(reader: Reader, length: Double): SpeechWordInfo = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.decode")
  @js.native
  def decode(reader: Uint8Array): SpeechWordInfo = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): SpeechWordInfo = js.native
  
  /**
    * Decodes a SpeechWordInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SpeechWordInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SpeechWordInfo = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): SpeechWordInfo = js.native
  
  /**
    * Encodes the specified SpeechWordInfo message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SpeechWordInfo.verify|verify} messages.
    * @param message SpeechWordInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.encode")
  @js.native
  def encode(message: ISpeechWordInfo): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.encode")
  @js.native
  def encode(message: ISpeechWordInfo, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SpeechWordInfo message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SpeechWordInfo.verify|verify} messages.
    * @param message SpeechWordInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISpeechWordInfo): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISpeechWordInfo, writer: Writer): Writer = js.native
  
  /**
    * Creates a SpeechWordInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SpeechWordInfo
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SpeechWordInfo = js.native
  
  /**
    * Creates a plain object from a SpeechWordInfo message. Also converts values to other types if specified.
    * @param message SpeechWordInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.toObject")
  @js.native
  def toObject(message: SpeechWordInfo): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.toObject")
  @js.native
  def toObject(message: SpeechWordInfo, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SpeechWordInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechWordInfo.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
