package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SentimentAnalysisResult. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SentimentAnalysisResult")
@js.native
/**
  * Constructs a new SentimentAnalysisResult.
  * @param [properties] Properties to set
  */
open class SentimentAnalysisResult ()
  extends StObject
     with ISentimentAnalysisResult {
  def this(properties: ISentimentAnalysisResult) = this()
  
  /**
    * Converts this SentimentAnalysisResult to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object SentimentAnalysisResult {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SentimentAnalysisResult")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SentimentAnalysisResult instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SentimentAnalysisResult instance
    */
  /* static member */
  inline def create(): SentimentAnalysisResult = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SentimentAnalysisResult]
  inline def create(properties: ISentimentAnalysisResult): SentimentAnalysisResult = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisResult]
  
  inline def decode(reader: js.typedarray.Uint8Array): SentimentAnalysisResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisResult]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): SentimentAnalysisResult = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SentimentAnalysisResult]
  /**
    * Decodes a SentimentAnalysisResult message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SentimentAnalysisResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): SentimentAnalysisResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisResult]
  inline def decode(reader: Reader, length: Double): SentimentAnalysisResult = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SentimentAnalysisResult]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): SentimentAnalysisResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisResult]
  /**
    * Decodes a SentimentAnalysisResult message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SentimentAnalysisResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): SentimentAnalysisResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisResult]
  
  /**
    * Encodes the specified SentimentAnalysisResult message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SentimentAnalysisResult.verify|verify} messages.
    * @param message SentimentAnalysisResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISentimentAnalysisResult): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISentimentAnalysisResult, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SentimentAnalysisResult message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SentimentAnalysisResult.verify|verify} messages.
    * @param message SentimentAnalysisResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISentimentAnalysisResult): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISentimentAnalysisResult, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SentimentAnalysisResult message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SentimentAnalysisResult
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): SentimentAnalysisResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SentimentAnalysisResult]
  
  /**
    * Creates a plain object from a SentimentAnalysisResult message. Also converts values to other types if specified.
    * @param message SentimentAnalysisResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: SentimentAnalysisResult): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: SentimentAnalysisResult, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a SentimentAnalysisResult message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
