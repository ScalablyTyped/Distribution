package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListContextsResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListContextsResponse")
@js.native
/**
  * Constructs a new ListContextsResponse.
  * @param [properties] Properties to set
  */
open class ListContextsResponse ()
  extends StObject
     with IListContextsResponse {
  def this(properties: IListContextsResponse) = this()
  
  /** ListContextsResponse contexts. */
  @JSName("contexts")
  var contexts_ListContextsResponse: js.Array[IContext] = js.native
  
  /** ListContextsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListContextsResponse: String = js.native
  
  /**
    * Converts this ListContextsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListContextsResponse {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListContextsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListContextsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListContextsResponse instance
    */
  /* static member */
  inline def create(): ListContextsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListContextsResponse]
  inline def create(properties: IListContextsResponse): ListContextsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListContextsResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListContextsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListContextsResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListContextsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListContextsResponse]
  /**
    * Decodes a ListContextsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListContextsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListContextsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListContextsResponse]
  inline def decode(reader: Reader, length: Double): ListContextsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListContextsResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListContextsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListContextsResponse]
  /**
    * Decodes a ListContextsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListContextsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListContextsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListContextsResponse]
  
  /**
    * Encodes the specified ListContextsResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.ListContextsResponse.verify|verify} messages.
    * @param message ListContextsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListContextsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListContextsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListContextsResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.ListContextsResponse.verify|verify} messages.
    * @param message ListContextsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListContextsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListContextsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListContextsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListContextsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListContextsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListContextsResponse]
  
  /**
    * Creates a plain object from a ListContextsResponse message. Also converts values to other types if specified.
    * @param message ListContextsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListContextsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListContextsResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListContextsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
