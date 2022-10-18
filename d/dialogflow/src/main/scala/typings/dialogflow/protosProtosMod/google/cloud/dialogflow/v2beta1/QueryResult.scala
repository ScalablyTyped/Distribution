package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.IMessage
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a QueryResult. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.QueryResult")
@js.native
/**
  * Constructs a new QueryResult.
  * @param [properties] Properties to set
  */
open class QueryResult ()
  extends StObject
     with IQueryResult {
  def this(properties: IQueryResult) = this()
  
  /** QueryResult action. */
  @JSName("action")
  var action_QueryResult: String = js.native
  
  /** QueryResult allRequiredParamsPresent. */
  @JSName("allRequiredParamsPresent")
  var allRequiredParamsPresent_QueryResult: Boolean = js.native
  
  /** QueryResult fulfillmentMessages. */
  @JSName("fulfillmentMessages")
  var fulfillmentMessages_QueryResult: js.Array[IMessage] = js.native
  
  /** QueryResult fulfillmentText. */
  @JSName("fulfillmentText")
  var fulfillmentText_QueryResult: String = js.native
  
  /** QueryResult intentDetectionConfidence. */
  @JSName("intentDetectionConfidence")
  var intentDetectionConfidence_QueryResult: Double = js.native
  
  /** QueryResult languageCode. */
  @JSName("languageCode")
  var languageCode_QueryResult: String = js.native
  
  /** QueryResult outputContexts. */
  @JSName("outputContexts")
  var outputContexts_QueryResult: js.Array[IContext] = js.native
  
  /** QueryResult queryText. */
  @JSName("queryText")
  var queryText_QueryResult: String = js.native
  
  /** QueryResult speechRecognitionConfidence. */
  @JSName("speechRecognitionConfidence")
  var speechRecognitionConfidence_QueryResult: Double = js.native
  
  /**
    * Converts this QueryResult to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** QueryResult webhookSource. */
  @JSName("webhookSource")
  var webhookSource_QueryResult: String = js.native
}
object QueryResult {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.QueryResult")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new QueryResult instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryResult instance
    */
  /* static member */
  inline def create(): QueryResult = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[QueryResult]
  inline def create(properties: IQueryResult): QueryResult = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[QueryResult]
  
  inline def decode(reader: js.typedarray.Uint8Array): QueryResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryResult]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): QueryResult = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QueryResult]
  /**
    * Decodes a QueryResult message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): QueryResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryResult]
  inline def decode(reader: Reader, length: Double): QueryResult = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QueryResult]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): QueryResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryResult]
  /**
    * Decodes a QueryResult message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): QueryResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryResult]
  
  /**
    * Encodes the specified QueryResult message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.QueryResult.verify|verify} messages.
    * @param message QueryResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IQueryResult): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IQueryResult, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified QueryResult message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.QueryResult.verify|verify} messages.
    * @param message QueryResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IQueryResult): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IQueryResult, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a QueryResult message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns QueryResult
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): QueryResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[QueryResult]
  
  /**
    * Creates a plain object from a QueryResult message. Also converts values to other types if specified.
    * @param message QueryResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: QueryResult): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: QueryResult, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a QueryResult message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
