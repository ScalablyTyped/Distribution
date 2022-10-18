package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SentimentAnalysisRequestConfig. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SentimentAnalysisRequestConfig")
@js.native
/**
  * Constructs a new SentimentAnalysisRequestConfig.
  * @param [properties] Properties to set
  */
open class SentimentAnalysisRequestConfig ()
  extends StObject
     with ISentimentAnalysisRequestConfig {
  def this(properties: ISentimentAnalysisRequestConfig) = this()
  
  /** SentimentAnalysisRequestConfig analyzeQueryTextSentiment. */
  @JSName("analyzeQueryTextSentiment")
  var analyzeQueryTextSentiment_SentimentAnalysisRequestConfig: Boolean = js.native
  
  /**
    * Converts this SentimentAnalysisRequestConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object SentimentAnalysisRequestConfig {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SentimentAnalysisRequestConfig")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SentimentAnalysisRequestConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SentimentAnalysisRequestConfig instance
    */
  /* static member */
  inline def create(): SentimentAnalysisRequestConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SentimentAnalysisRequestConfig]
  inline def create(properties: ISentimentAnalysisRequestConfig): SentimentAnalysisRequestConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisRequestConfig]
  
  inline def decode(reader: js.typedarray.Uint8Array): SentimentAnalysisRequestConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisRequestConfig]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): SentimentAnalysisRequestConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SentimentAnalysisRequestConfig]
  /**
    * Decodes a SentimentAnalysisRequestConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SentimentAnalysisRequestConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): SentimentAnalysisRequestConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisRequestConfig]
  inline def decode(reader: Reader, length: Double): SentimentAnalysisRequestConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SentimentAnalysisRequestConfig]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): SentimentAnalysisRequestConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisRequestConfig]
  /**
    * Decodes a SentimentAnalysisRequestConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SentimentAnalysisRequestConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): SentimentAnalysisRequestConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisRequestConfig]
  
  /**
    * Encodes the specified SentimentAnalysisRequestConfig message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SentimentAnalysisRequestConfig.verify|verify} messages.
    * @param message SentimentAnalysisRequestConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISentimentAnalysisRequestConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISentimentAnalysisRequestConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SentimentAnalysisRequestConfig message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SentimentAnalysisRequestConfig.verify|verify} messages.
    * @param message SentimentAnalysisRequestConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISentimentAnalysisRequestConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISentimentAnalysisRequestConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SentimentAnalysisRequestConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SentimentAnalysisRequestConfig
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): SentimentAnalysisRequestConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisRequestConfig]
  
  /**
    * Creates a plain object from a SentimentAnalysisRequestConfig message. Also converts values to other types if specified.
    * @param message SentimentAnalysisRequestConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: SentimentAnalysisRequestConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: SentimentAnalysisRequestConfig, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a SentimentAnalysisRequestConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
