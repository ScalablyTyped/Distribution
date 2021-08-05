package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListEntityTypesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListEntityTypesRequest")
@js.native
/**
  * Constructs a new ListEntityTypesRequest.
  * @param [properties] Properties to set
  */
class ListEntityTypesRequest ()
  extends StObject
     with IListEntityTypesRequest {
  def this(properties: IListEntityTypesRequest) = this()
  
  /** ListEntityTypesRequest languageCode. */
  @JSName("languageCode")
  var languageCode_ListEntityTypesRequest: String = js.native
  
  /** ListEntityTypesRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListEntityTypesRequest: Double = js.native
  
  /** ListEntityTypesRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListEntityTypesRequest: String = js.native
  
  /** ListEntityTypesRequest parent. */
  @JSName("parent")
  var parent_ListEntityTypesRequest: String = js.native
  
  /**
    * Converts this ListEntityTypesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListEntityTypesRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListEntityTypesRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListEntityTypesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListEntityTypesRequest instance
    */
  /* static member */
  inline def create(): ListEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListEntityTypesRequest]
  inline def create(properties: IListEntityTypesRequest): ListEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListEntityTypesRequest]
  
  /**
    * Decodes a ListEntityTypesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListEntityTypesRequest]
  inline def decode(reader: Reader, length: Double): ListEntityTypesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListEntityTypesRequest]
  inline def decode(reader: Uint8Array): ListEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListEntityTypesRequest]
  inline def decode(reader: Uint8Array, length: Double): ListEntityTypesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListEntityTypesRequest]
  
  /**
    * Decodes a ListEntityTypesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListEntityTypesRequest]
  inline def decodeDelimited(reader: Uint8Array): ListEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListEntityTypesRequest]
  
  /**
    * Encodes the specified ListEntityTypesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.ListEntityTypesRequest.verify|verify} messages.
    * @param message ListEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListEntityTypesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListEntityTypesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListEntityTypesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.ListEntityTypesRequest.verify|verify} messages.
    * @param message ListEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListEntityTypesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListEntityTypesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListEntityTypesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListEntityTypesRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): ListEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListEntityTypesRequest]
  
  /**
    * Creates a plain object from a ListEntityTypesRequest message. Also converts values to other types if specified.
    * @param message ListEntityTypesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListEntityTypesRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ListEntityTypesRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ListEntityTypesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
