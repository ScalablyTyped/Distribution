package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SentimentAnalysisRequestConfig. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig")
@js.native
/**
  * Constructs a new SentimentAnalysisRequestConfig.
  * @param [properties] Properties to set
  */
class SentimentAnalysisRequestConfig () extends ISentimentAnalysisRequestConfig {
  def this(properties: ISentimentAnalysisRequestConfig) = this()
  
  /** SentimentAnalysisRequestConfig analyzeQueryTextSentiment. */
  @JSName("analyzeQueryTextSentiment")
  var analyzeQueryTextSentiment_SentimentAnalysisRequestConfig: Boolean = js.native
  
  /**
    * Converts this SentimentAnalysisRequestConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SentimentAnalysisRequestConfig {
  
  /**
    * Creates a new SentimentAnalysisRequestConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SentimentAnalysisRequestConfig instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.create")
  @js.native
  def create(): SentimentAnalysisRequestConfig = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.create")
  @js.native
  def create(properties: ISentimentAnalysisRequestConfig): SentimentAnalysisRequestConfig = js.native
  
  /**
    * Decodes a SentimentAnalysisRequestConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SentimentAnalysisRequestConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.decode")
  @js.native
  def decode(reader: Reader): SentimentAnalysisRequestConfig = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.decode")
  @js.native
  def decode(reader: Reader, length: Double): SentimentAnalysisRequestConfig = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.decode")
  @js.native
  def decode(reader: Uint8Array): SentimentAnalysisRequestConfig = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): SentimentAnalysisRequestConfig = js.native
  
  /**
    * Decodes a SentimentAnalysisRequestConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SentimentAnalysisRequestConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SentimentAnalysisRequestConfig = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): SentimentAnalysisRequestConfig = js.native
  
  /**
    * Encodes the specified SentimentAnalysisRequestConfig message. Does not implicitly {@link google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.verify|verify} messages.
    * @param message SentimentAnalysisRequestConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.encode")
  @js.native
  def encode(message: ISentimentAnalysisRequestConfig): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.encode")
  @js.native
  def encode(message: ISentimentAnalysisRequestConfig, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SentimentAnalysisRequestConfig message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.verify|verify} messages.
    * @param message SentimentAnalysisRequestConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISentimentAnalysisRequestConfig): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISentimentAnalysisRequestConfig, writer: Writer): Writer = js.native
  
  /**
    * Creates a SentimentAnalysisRequestConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SentimentAnalysisRequestConfig
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SentimentAnalysisRequestConfig = js.native
  
  /**
    * Creates a plain object from a SentimentAnalysisRequestConfig message. Also converts values to other types if specified.
    * @param message SentimentAnalysisRequestConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.toObject")
  @js.native
  def toObject(message: SentimentAnalysisRequestConfig): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.toObject")
  @js.native
  def toObject(message: SentimentAnalysisRequestConfig, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SentimentAnalysisRequestConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
