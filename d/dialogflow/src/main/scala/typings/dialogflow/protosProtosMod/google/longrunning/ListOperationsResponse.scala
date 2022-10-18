package typings.dialogflow.protosProtosMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListOperationsResponse. */
@JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsResponse")
@js.native
/**
  * Constructs a new ListOperationsResponse.
  * @param [properties] Properties to set
  */
open class ListOperationsResponse ()
  extends StObject
     with IListOperationsResponse {
  def this(properties: IListOperationsResponse) = this()
  
  /** ListOperationsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListOperationsResponse: String = js.native
  
  /** ListOperationsResponse operations. */
  @JSName("operations")
  var operations_ListOperationsResponse: js.Array[IOperation] = js.native
  
  /**
    * Converts this ListOperationsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListOperationsResponse {
  
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListOperationsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListOperationsResponse instance
    */
  /* static member */
  inline def create(): ListOperationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListOperationsResponse]
  inline def create(properties: IListOperationsResponse): ListOperationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListOperationsResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListOperationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListOperationsResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListOperationsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListOperationsResponse]
  /**
    * Decodes a ListOperationsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListOperationsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListOperationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListOperationsResponse]
  inline def decode(reader: Reader, length: Double): ListOperationsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListOperationsResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListOperationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListOperationsResponse]
  /**
    * Decodes a ListOperationsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListOperationsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListOperationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListOperationsResponse]
  
  /**
    * Encodes the specified ListOperationsResponse message. Does not implicitly {@link google.longrunning.ListOperationsResponse.verify|verify} messages.
    * @param message ListOperationsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListOperationsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListOperationsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListOperationsResponse message, length delimited. Does not implicitly {@link google.longrunning.ListOperationsResponse.verify|verify} messages.
    * @param message ListOperationsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListOperationsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListOperationsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListOperationsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListOperationsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListOperationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListOperationsResponse]
  
  /**
    * Creates a plain object from a ListOperationsResponse message. Also converts values to other types if specified.
    * @param message ListOperationsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListOperationsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListOperationsResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListOperationsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
