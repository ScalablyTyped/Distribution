package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SentimentAnalysisResult. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult")
@js.native
/**
  * Constructs a new SentimentAnalysisResult.
  * @param [properties] Properties to set
  */
class SentimentAnalysisResult () extends ISentimentAnalysisResult {
  def this(properties: ISentimentAnalysisResult) = this()
  /**
    * Converts this SentimentAnalysisResult to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult")
@js.native
object SentimentAnalysisResult extends js.Object {
  /**
    * Creates a new SentimentAnalysisResult instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SentimentAnalysisResult instance
    */
  def create(): SentimentAnalysisResult = js.native
  def create(properties: ISentimentAnalysisResult): SentimentAnalysisResult = js.native
  /**
    * Decodes a SentimentAnalysisResult message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SentimentAnalysisResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): SentimentAnalysisResult = js.native
  def decode(reader: Reader, length: Double): SentimentAnalysisResult = js.native
  def decode(reader: Uint8Array): SentimentAnalysisResult = js.native
  def decode(reader: Uint8Array, length: Double): SentimentAnalysisResult = js.native
  /**
    * Decodes a SentimentAnalysisResult message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SentimentAnalysisResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): SentimentAnalysisResult = js.native
  def decodeDelimited(reader: Uint8Array): SentimentAnalysisResult = js.native
  /**
    * Encodes the specified SentimentAnalysisResult message. Does not implicitly {@link google.cloud.dialogflow.v2.SentimentAnalysisResult.verify|verify} messages.
    * @param message SentimentAnalysisResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISentimentAnalysisResult): Writer = js.native
  def encode(message: ISentimentAnalysisResult, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SentimentAnalysisResult message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.SentimentAnalysisResult.verify|verify} messages.
    * @param message SentimentAnalysisResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISentimentAnalysisResult): Writer = js.native
  def encodeDelimited(message: ISentimentAnalysisResult, writer: Writer): Writer = js.native
  /**
    * Creates a SentimentAnalysisResult message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SentimentAnalysisResult
    */
  def fromObject(`object`: StringDictionary[js.Any]): SentimentAnalysisResult = js.native
  /**
    * Creates a plain object from a SentimentAnalysisResult message. Also converts values to other types if specified.
    * @param message SentimentAnalysisResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: SentimentAnalysisResult): StringDictionary[js.Any] = js.native
  def toObject(message: SentimentAnalysisResult, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SentimentAnalysisResult message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

