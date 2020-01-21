package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig")
@js.native
object SentimentAnalysisRequestConfig extends js.Object {
  /**
    * Creates a new SentimentAnalysisRequestConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SentimentAnalysisRequestConfig instance
    */
  def create(): SentimentAnalysisRequestConfig = js.native
  def create(properties: ISentimentAnalysisRequestConfig): SentimentAnalysisRequestConfig = js.native
  /**
    * Decodes a SentimentAnalysisRequestConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SentimentAnalysisRequestConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): SentimentAnalysisRequestConfig = js.native
  def decode(reader: Reader, length: Double): SentimentAnalysisRequestConfig = js.native
  def decode(reader: Uint8Array): SentimentAnalysisRequestConfig = js.native
  def decode(reader: Uint8Array, length: Double): SentimentAnalysisRequestConfig = js.native
  /**
    * Decodes a SentimentAnalysisRequestConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SentimentAnalysisRequestConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): SentimentAnalysisRequestConfig = js.native
  def decodeDelimited(reader: Uint8Array): SentimentAnalysisRequestConfig = js.native
  /**
    * Encodes the specified SentimentAnalysisRequestConfig message. Does not implicitly {@link google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.verify|verify} messages.
    * @param message SentimentAnalysisRequestConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISentimentAnalysisRequestConfig): Writer = js.native
  def encode(message: ISentimentAnalysisRequestConfig, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SentimentAnalysisRequestConfig message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.verify|verify} messages.
    * @param message SentimentAnalysisRequestConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISentimentAnalysisRequestConfig): Writer = js.native
  def encodeDelimited(message: ISentimentAnalysisRequestConfig, writer: Writer): Writer = js.native
  /**
    * Creates a SentimentAnalysisRequestConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SentimentAnalysisRequestConfig
    */
  def fromObject(`object`: StringDictionary[js.Any]): SentimentAnalysisRequestConfig = js.native
  /**
    * Creates a plain object from a SentimentAnalysisRequestConfig message. Also converts values to other types if specified.
    * @param message SentimentAnalysisRequestConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: SentimentAnalysisRequestConfig): StringDictionary[js.Any] = js.native
  def toObject(message: SentimentAnalysisRequestConfig, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SentimentAnalysisRequestConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

