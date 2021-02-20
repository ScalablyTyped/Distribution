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
object Sentiment {
  
  /**
    * Creates a new Sentiment instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Sentiment instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.create")
  @js.native
  def create(): Sentiment = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.create")
  @js.native
  def create(properties: ISentiment): Sentiment = js.native
  
  /**
    * Decodes a Sentiment message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Sentiment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.decode")
  @js.native
  def decode(reader: Reader): Sentiment = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.decode")
  @js.native
  def decode(reader: Reader, length: Double): Sentiment = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.decode")
  @js.native
  def decode(reader: Uint8Array): Sentiment = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Sentiment = js.native
  
  /**
    * Decodes a Sentiment message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Sentiment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Sentiment = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Sentiment = js.native
  
  /**
    * Encodes the specified Sentiment message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Sentiment.verify|verify} messages.
    * @param message Sentiment message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.encode")
  @js.native
  def encode(message: ISentiment): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.encode")
  @js.native
  def encode(message: ISentiment, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Sentiment message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Sentiment.verify|verify} messages.
    * @param message Sentiment message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISentiment): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISentiment, writer: Writer): Writer = js.native
  
  /**
    * Creates a Sentiment message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Sentiment
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Sentiment = js.native
  
  /**
    * Creates a plain object from a Sentiment message. Also converts values to other types if specified.
    * @param message Sentiment
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.toObject")
  @js.native
  def toObject(message: Sentiment): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.toObject")
  @js.native
  def toObject(message: Sentiment, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Sentiment message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Sentiment.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
