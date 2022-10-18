package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Sentiment. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Sentiment")
@js.native
/**
  * Constructs a new Sentiment.
  * @param [properties] Properties to set
  */
open class Sentiment ()
  extends StObject
     with ISentiment {
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
  def toJSON(): StringDictionary[Any] = js.native
}
object Sentiment {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Sentiment")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Sentiment instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Sentiment instance
    */
  /* static member */
  inline def create(): Sentiment = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Sentiment]
  inline def create(properties: ISentiment): Sentiment = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Sentiment]
  
  inline def decode(reader: js.typedarray.Uint8Array): Sentiment = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Sentiment]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Sentiment = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Sentiment]
  /**
    * Decodes a Sentiment message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Sentiment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Sentiment = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Sentiment]
  inline def decode(reader: Reader, length: Double): Sentiment = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Sentiment]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Sentiment = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Sentiment]
  /**
    * Decodes a Sentiment message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Sentiment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Sentiment = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Sentiment]
  
  /**
    * Encodes the specified Sentiment message. Does not implicitly {@link google.cloud.dialogflow.v2.Sentiment.verify|verify} messages.
    * @param message Sentiment message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISentiment): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISentiment, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Sentiment message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Sentiment.verify|verify} messages.
    * @param message Sentiment message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISentiment): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISentiment, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Sentiment message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Sentiment
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Sentiment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Sentiment]
  
  /**
    * Creates a plain object from a Sentiment message. Also converts values to other types if specified.
    * @param message Sentiment
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Sentiment): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Sentiment, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Sentiment message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
