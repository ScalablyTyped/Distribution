package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListDocumentsRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest")
@js.native
/**
  * Constructs a new ListDocumentsRequest.
  * @param [properties] Properties to set
  */
open class ListDocumentsRequest ()
  extends StObject
     with IListDocumentsRequest {
  def this(properties: IListDocumentsRequest) = this()
  
  /** ListDocumentsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListDocumentsRequest: Double = js.native
  
  /** ListDocumentsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListDocumentsRequest: String = js.native
  
  /** ListDocumentsRequest parent. */
  @JSName("parent")
  var parent_ListDocumentsRequest: String = js.native
  
  /**
    * Converts this ListDocumentsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListDocumentsRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListDocumentsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListDocumentsRequest instance
    */
  /* static member */
  inline def create(): ListDocumentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListDocumentsRequest]
  inline def create(properties: IListDocumentsRequest): ListDocumentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListDocumentsRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListDocumentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDocumentsRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListDocumentsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListDocumentsRequest]
  /**
    * Decodes a ListDocumentsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListDocumentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListDocumentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDocumentsRequest]
  inline def decode(reader: Reader, length: Double): ListDocumentsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListDocumentsRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListDocumentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDocumentsRequest]
  /**
    * Decodes a ListDocumentsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListDocumentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListDocumentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDocumentsRequest]
  
  /**
    * Encodes the specified ListDocumentsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListDocumentsRequest.verify|verify} messages.
    * @param message ListDocumentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListDocumentsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListDocumentsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListDocumentsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListDocumentsRequest.verify|verify} messages.
    * @param message ListDocumentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListDocumentsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListDocumentsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListDocumentsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListDocumentsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListDocumentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListDocumentsRequest]
  
  /**
    * Creates a plain object from a ListDocumentsRequest message. Also converts values to other types if specified.
    * @param message ListDocumentsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListDocumentsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListDocumentsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListDocumentsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
