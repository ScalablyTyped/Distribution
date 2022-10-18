package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SearchAgentsResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse")
@js.native
/**
  * Constructs a new SearchAgentsResponse.
  * @param [properties] Properties to set
  */
open class SearchAgentsResponse ()
  extends StObject
     with ISearchAgentsResponse {
  def this(properties: ISearchAgentsResponse) = this()
  
  /** SearchAgentsResponse agents. */
  @JSName("agents")
  var agents_SearchAgentsResponse: js.Array[IAgent] = js.native
  
  /** SearchAgentsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_SearchAgentsResponse: String = js.native
  
  /**
    * Converts this SearchAgentsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object SearchAgentsResponse {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SearchAgentsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SearchAgentsResponse instance
    */
  /* static member */
  inline def create(): SearchAgentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SearchAgentsResponse]
  inline def create(properties: ISearchAgentsResponse): SearchAgentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SearchAgentsResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): SearchAgentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SearchAgentsResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): SearchAgentsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SearchAgentsResponse]
  /**
    * Decodes a SearchAgentsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SearchAgentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): SearchAgentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SearchAgentsResponse]
  inline def decode(reader: Reader, length: Double): SearchAgentsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SearchAgentsResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): SearchAgentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SearchAgentsResponse]
  /**
    * Decodes a SearchAgentsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SearchAgentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): SearchAgentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SearchAgentsResponse]
  
  /**
    * Encodes the specified SearchAgentsResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SearchAgentsResponse.verify|verify} messages.
    * @param message SearchAgentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISearchAgentsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISearchAgentsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SearchAgentsResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SearchAgentsResponse.verify|verify} messages.
    * @param message SearchAgentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISearchAgentsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISearchAgentsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SearchAgentsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SearchAgentsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): SearchAgentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SearchAgentsResponse]
  
  /**
    * Creates a plain object from a SearchAgentsResponse message. Also converts values to other types if specified.
    * @param message SearchAgentsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: SearchAgentsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: SearchAgentsResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a SearchAgentsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
