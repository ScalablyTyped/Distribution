package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SearchAgentsRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsRequest")
@js.native
/**
  * Constructs a new SearchAgentsRequest.
  * @param [properties] Properties to set
  */
open class SearchAgentsRequest ()
  extends StObject
     with ISearchAgentsRequest {
  def this(properties: ISearchAgentsRequest) = this()
  
  /** SearchAgentsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_SearchAgentsRequest: Double = js.native
  
  /** SearchAgentsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_SearchAgentsRequest: String = js.native
  
  /** SearchAgentsRequest parent. */
  @JSName("parent")
  var parent_SearchAgentsRequest: String = js.native
  
  /**
    * Converts this SearchAgentsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object SearchAgentsRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SearchAgentsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SearchAgentsRequest instance
    */
  /* static member */
  inline def create(): SearchAgentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SearchAgentsRequest]
  inline def create(properties: ISearchAgentsRequest): SearchAgentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SearchAgentsRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): SearchAgentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SearchAgentsRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): SearchAgentsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SearchAgentsRequest]
  /**
    * Decodes a SearchAgentsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SearchAgentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): SearchAgentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SearchAgentsRequest]
  inline def decode(reader: Reader, length: Double): SearchAgentsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SearchAgentsRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): SearchAgentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SearchAgentsRequest]
  /**
    * Decodes a SearchAgentsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SearchAgentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): SearchAgentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SearchAgentsRequest]
  
  /**
    * Encodes the specified SearchAgentsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SearchAgentsRequest.verify|verify} messages.
    * @param message SearchAgentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISearchAgentsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISearchAgentsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SearchAgentsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SearchAgentsRequest.verify|verify} messages.
    * @param message SearchAgentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISearchAgentsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISearchAgentsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SearchAgentsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SearchAgentsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): SearchAgentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SearchAgentsRequest]
  
  /**
    * Creates a plain object from a SearchAgentsRequest message. Also converts values to other types if specified.
    * @param message SearchAgentsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: SearchAgentsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: SearchAgentsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a SearchAgentsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
