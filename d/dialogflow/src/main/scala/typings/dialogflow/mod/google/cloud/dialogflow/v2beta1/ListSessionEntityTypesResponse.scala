package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListSessionEntityTypesResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse")
@js.native
/**
  * Constructs a new ListSessionEntityTypesResponse.
  * @param [properties] Properties to set
  */
open class ListSessionEntityTypesResponse ()
  extends StObject
     with IListSessionEntityTypesResponse {
  def this(properties: IListSessionEntityTypesResponse) = this()
  
  /** ListSessionEntityTypesResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListSessionEntityTypesResponse: String = js.native
  
  /** ListSessionEntityTypesResponse sessionEntityTypes. */
  @JSName("sessionEntityTypes")
  var sessionEntityTypes_ListSessionEntityTypesResponse: js.Array[ISessionEntityType] = js.native
  
  /**
    * Converts this ListSessionEntityTypesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListSessionEntityTypesResponse {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListSessionEntityTypesResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSessionEntityTypesResponse instance
    */
  /* static member */
  inline def create(): ListSessionEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListSessionEntityTypesResponse]
  inline def create(properties: IListSessionEntityTypesResponse): ListSessionEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListSessionEntityTypesResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListSessionEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSessionEntityTypesResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListSessionEntityTypesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListSessionEntityTypesResponse]
  /**
    * Decodes a ListSessionEntityTypesResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSessionEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListSessionEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSessionEntityTypesResponse]
  inline def decode(reader: Reader, length: Double): ListSessionEntityTypesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListSessionEntityTypesResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListSessionEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSessionEntityTypesResponse]
  /**
    * Decodes a ListSessionEntityTypesResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSessionEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListSessionEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSessionEntityTypesResponse]
  
  /**
    * Encodes the specified ListSessionEntityTypesResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse.verify|verify} messages.
    * @param message ListSessionEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListSessionEntityTypesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListSessionEntityTypesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListSessionEntityTypesResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse.verify|verify} messages.
    * @param message ListSessionEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListSessionEntityTypesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListSessionEntityTypesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListSessionEntityTypesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSessionEntityTypesResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListSessionEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListSessionEntityTypesResponse]
  
  /**
    * Creates a plain object from a ListSessionEntityTypesResponse message. Also converts values to other types if specified.
    * @param message ListSessionEntityTypesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListSessionEntityTypesResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListSessionEntityTypesResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListSessionEntityTypesResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
