package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListSessionEntityTypesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesRequest")
@js.native
/**
  * Constructs a new ListSessionEntityTypesRequest.
  * @param [properties] Properties to set
  */
class ListSessionEntityTypesRequest ()
  extends StObject
     with IListSessionEntityTypesRequest {
  def this(properties: IListSessionEntityTypesRequest) = this()
  
  /** ListSessionEntityTypesRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListSessionEntityTypesRequest: Double = js.native
  
  /** ListSessionEntityTypesRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListSessionEntityTypesRequest: String = js.native
  
  /** ListSessionEntityTypesRequest parent. */
  @JSName("parent")
  var parent_ListSessionEntityTypesRequest: String = js.native
  
  /**
    * Converts this ListSessionEntityTypesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListSessionEntityTypesRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListSessionEntityTypesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSessionEntityTypesRequest instance
    */
  /* static member */
  inline def create(): ListSessionEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListSessionEntityTypesRequest]
  inline def create(properties: IListSessionEntityTypesRequest): ListSessionEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListSessionEntityTypesRequest]
  
  /**
    * Decodes a ListSessionEntityTypesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSessionEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListSessionEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSessionEntityTypesRequest]
  inline def decode(reader: Reader, length: Double): ListSessionEntityTypesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListSessionEntityTypesRequest]
  inline def decode(reader: Uint8Array): ListSessionEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSessionEntityTypesRequest]
  inline def decode(reader: Uint8Array, length: Double): ListSessionEntityTypesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListSessionEntityTypesRequest]
  
  /**
    * Decodes a ListSessionEntityTypesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSessionEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListSessionEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSessionEntityTypesRequest]
  inline def decodeDelimited(reader: Uint8Array): ListSessionEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSessionEntityTypesRequest]
  
  /**
    * Encodes the specified ListSessionEntityTypesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.ListSessionEntityTypesRequest.verify|verify} messages.
    * @param message ListSessionEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListSessionEntityTypesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListSessionEntityTypesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListSessionEntityTypesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.ListSessionEntityTypesRequest.verify|verify} messages.
    * @param message ListSessionEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListSessionEntityTypesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListSessionEntityTypesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListSessionEntityTypesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSessionEntityTypesRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): ListSessionEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListSessionEntityTypesRequest]
  
  /**
    * Creates a plain object from a ListSessionEntityTypesRequest message. Also converts values to other types if specified.
    * @param message ListSessionEntityTypesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListSessionEntityTypesRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ListSessionEntityTypesRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ListSessionEntityTypesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
