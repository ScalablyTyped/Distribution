package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListDocumentsResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse")
@js.native
/**
  * Constructs a new ListDocumentsResponse.
  * @param [properties] Properties to set
  */
open class ListDocumentsResponse ()
  extends StObject
     with IListDocumentsResponse {
  def this(properties: IListDocumentsResponse) = this()
  
  /** ListDocumentsResponse documents. */
  @JSName("documents")
  var documents_ListDocumentsResponse: js.Array[IDocument] = js.native
  
  /** ListDocumentsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListDocumentsResponse: String = js.native
  
  /**
    * Converts this ListDocumentsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListDocumentsResponse {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListDocumentsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListDocumentsResponse instance
    */
  /* static member */
  inline def create(): ListDocumentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListDocumentsResponse]
  inline def create(properties: IListDocumentsResponse): ListDocumentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListDocumentsResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListDocumentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDocumentsResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListDocumentsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListDocumentsResponse]
  /**
    * Decodes a ListDocumentsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListDocumentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListDocumentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDocumentsResponse]
  inline def decode(reader: Reader, length: Double): ListDocumentsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListDocumentsResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListDocumentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDocumentsResponse]
  /**
    * Decodes a ListDocumentsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListDocumentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListDocumentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDocumentsResponse]
  
  /**
    * Encodes the specified ListDocumentsResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListDocumentsResponse.verify|verify} messages.
    * @param message ListDocumentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListDocumentsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListDocumentsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListDocumentsResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListDocumentsResponse.verify|verify} messages.
    * @param message ListDocumentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListDocumentsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListDocumentsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListDocumentsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListDocumentsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListDocumentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListDocumentsResponse]
  
  /**
    * Creates a plain object from a ListDocumentsResponse message. Also converts values to other types if specified.
    * @param message ListDocumentsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListDocumentsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListDocumentsResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListDocumentsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
