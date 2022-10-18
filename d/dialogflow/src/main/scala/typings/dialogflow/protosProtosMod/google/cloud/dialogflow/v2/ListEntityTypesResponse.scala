package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListEntityTypesResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListEntityTypesResponse")
@js.native
/**
  * Constructs a new ListEntityTypesResponse.
  * @param [properties] Properties to set
  */
open class ListEntityTypesResponse ()
  extends StObject
     with IListEntityTypesResponse {
  def this(properties: IListEntityTypesResponse) = this()
  
  /** ListEntityTypesResponse entityTypes. */
  @JSName("entityTypes")
  var entityTypes_ListEntityTypesResponse: js.Array[IEntityType] = js.native
  
  /** ListEntityTypesResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListEntityTypesResponse: String = js.native
  
  /**
    * Converts this ListEntityTypesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListEntityTypesResponse {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListEntityTypesResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListEntityTypesResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListEntityTypesResponse instance
    */
  /* static member */
  inline def create(): ListEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListEntityTypesResponse]
  inline def create(properties: IListEntityTypesResponse): ListEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListEntityTypesResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListEntityTypesResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListEntityTypesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListEntityTypesResponse]
  /**
    * Decodes a ListEntityTypesResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListEntityTypesResponse]
  inline def decode(reader: Reader, length: Double): ListEntityTypesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListEntityTypesResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListEntityTypesResponse]
  /**
    * Decodes a ListEntityTypesResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListEntityTypesResponse]
  
  /**
    * Encodes the specified ListEntityTypesResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.ListEntityTypesResponse.verify|verify} messages.
    * @param message ListEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListEntityTypesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListEntityTypesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListEntityTypesResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.ListEntityTypesResponse.verify|verify} messages.
    * @param message ListEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListEntityTypesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListEntityTypesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListEntityTypesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListEntityTypesResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListEntityTypesResponse]
  
  /**
    * Creates a plain object from a ListEntityTypesResponse message. Also converts values to other types if specified.
    * @param message ListEntityTypesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListEntityTypesResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListEntityTypesResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListEntityTypesResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
