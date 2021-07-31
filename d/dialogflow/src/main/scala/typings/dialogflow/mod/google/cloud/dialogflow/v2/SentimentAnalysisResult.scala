package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SentimentAnalysisResult. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult")
@js.native
/**
  * Constructs a new SentimentAnalysisResult.
  * @param [properties] Properties to set
  */
class SentimentAnalysisResult ()
  extends StObject
     with ISentimentAnalysisResult {
  def this(properties: ISentimentAnalysisResult) = this()
  
  /**
    * Converts this SentimentAnalysisResult to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SentimentAnalysisResult {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SentimentAnalysisResult instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SentimentAnalysisResult instance
    */
  /* static member */
  @scala.inline
  def create(): SentimentAnalysisResult = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SentimentAnalysisResult]
  @scala.inline
  def create(properties: ISentimentAnalysisResult): SentimentAnalysisResult = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisResult]
  
  /**
    * Decodes a SentimentAnalysisResult message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SentimentAnalysisResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): SentimentAnalysisResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisResult]
  @scala.inline
  def decode(reader: Reader, length: Double): SentimentAnalysisResult = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SentimentAnalysisResult]
  @scala.inline
  def decode(reader: Uint8Array): SentimentAnalysisResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisResult]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): SentimentAnalysisResult = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SentimentAnalysisResult]
  
  /**
    * Decodes a SentimentAnalysisResult message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SentimentAnalysisResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): SentimentAnalysisResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisResult]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): SentimentAnalysisResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisResult]
  
  /**
    * Encodes the specified SentimentAnalysisResult message. Does not implicitly {@link google.cloud.dialogflow.v2.SentimentAnalysisResult.verify|verify} messages.
    * @param message SentimentAnalysisResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ISentimentAnalysisResult): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ISentimentAnalysisResult, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SentimentAnalysisResult message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.SentimentAnalysisResult.verify|verify} messages.
    * @param message SentimentAnalysisResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ISentimentAnalysisResult): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ISentimentAnalysisResult, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SentimentAnalysisResult message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SentimentAnalysisResult
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): SentimentAnalysisResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisResult]
  
  /**
    * Creates a plain object from a SentimentAnalysisResult message. Also converts values to other types if specified.
    * @param message SentimentAnalysisResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: SentimentAnalysisResult): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: SentimentAnalysisResult, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a SentimentAnalysisResult message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
