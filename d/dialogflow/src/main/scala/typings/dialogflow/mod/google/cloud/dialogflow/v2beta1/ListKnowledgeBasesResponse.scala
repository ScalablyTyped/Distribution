package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListKnowledgeBasesResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse")
@js.native
/**
  * Constructs a new ListKnowledgeBasesResponse.
  * @param [properties] Properties to set
  */
open class ListKnowledgeBasesResponse ()
  extends StObject
     with IListKnowledgeBasesResponse {
  def this(properties: IListKnowledgeBasesResponse) = this()
  
  /** ListKnowledgeBasesResponse knowledgeBases. */
  @JSName("knowledgeBases")
  var knowledgeBases_ListKnowledgeBasesResponse: js.Array[IKnowledgeBase] = js.native
  
  /** ListKnowledgeBasesResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListKnowledgeBasesResponse: String = js.native
  
  /**
    * Converts this ListKnowledgeBasesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListKnowledgeBasesResponse {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListKnowledgeBasesResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListKnowledgeBasesResponse instance
    */
  /* static member */
  inline def create(): ListKnowledgeBasesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListKnowledgeBasesResponse]
  inline def create(properties: IListKnowledgeBasesResponse): ListKnowledgeBasesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListKnowledgeBasesResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListKnowledgeBasesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListKnowledgeBasesResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListKnowledgeBasesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListKnowledgeBasesResponse]
  /**
    * Decodes a ListKnowledgeBasesResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListKnowledgeBasesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListKnowledgeBasesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListKnowledgeBasesResponse]
  inline def decode(reader: Reader, length: Double): ListKnowledgeBasesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListKnowledgeBasesResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListKnowledgeBasesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListKnowledgeBasesResponse]
  /**
    * Decodes a ListKnowledgeBasesResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListKnowledgeBasesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListKnowledgeBasesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListKnowledgeBasesResponse]
  
  /**
    * Encodes the specified ListKnowledgeBasesResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse.verify|verify} messages.
    * @param message ListKnowledgeBasesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListKnowledgeBasesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListKnowledgeBasesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListKnowledgeBasesResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse.verify|verify} messages.
    * @param message ListKnowledgeBasesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListKnowledgeBasesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListKnowledgeBasesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListKnowledgeBasesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListKnowledgeBasesResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListKnowledgeBasesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListKnowledgeBasesResponse]
  
  /**
    * Creates a plain object from a ListKnowledgeBasesResponse message. Also converts values to other types if specified.
    * @param message ListKnowledgeBasesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListKnowledgeBasesResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListKnowledgeBasesResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListKnowledgeBasesResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
