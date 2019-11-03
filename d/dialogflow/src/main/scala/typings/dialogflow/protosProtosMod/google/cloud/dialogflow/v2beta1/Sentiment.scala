package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Sentiment. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment")
@js.native
/**
  * Constructs a new Sentiment.
  * @param [properties] Properties to set
  */
class Sentiment () extends ISentiment {
  def this(properties: ISentiment) = this()
  /** Sentiment magnitude. */
  @JSName("magnitude")
  var magnitude_Sentiment: Double = js.native
  /** Sentiment score. */
  @JSName("score")
  var score_Sentiment: Double = js.native
  /**
    * Converts this Sentiment to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment")
@js.native
object Sentiment extends js.Object {
  /**
    * Creates a new Sentiment instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Sentiment instance
    */
  def create(): Sentiment = js.native
  def create(properties: ISentiment): Sentiment = js.native
  /**
    * Decodes a Sentiment message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Sentiment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Sentiment = js.native
  def decode(reader: Reader, length: Double): Sentiment = js.native
  def decode(reader: Uint8Array): Sentiment = js.native
  def decode(reader: Uint8Array, length: Double): Sentiment = js.native
  /**
    * Decodes a Sentiment message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Sentiment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Sentiment = js.native
  def decodeDelimited(reader: Uint8Array): Sentiment = js.native
  /**
    * Encodes the specified Sentiment message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Sentiment.verify|verify} messages.
    * @param message Sentiment message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISentiment): Writer = js.native
  def encode(message: ISentiment, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Sentiment message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Sentiment.verify|verify} messages.
    * @param message Sentiment message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISentiment): Writer = js.native
  def encodeDelimited(message: ISentiment, writer: Writer): Writer = js.native
  /**
    * Creates a Sentiment message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Sentiment
    */
  def fromObject(`object`: StringDictionary[js.Any]): Sentiment = js.native
  /**
    * Creates a plain object from a Sentiment message. Also converts values to other types if specified.
    * @param message Sentiment
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Sentiment): StringDictionary[js.Any] = js.native
  def toObject(message: Sentiment, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Sentiment message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

