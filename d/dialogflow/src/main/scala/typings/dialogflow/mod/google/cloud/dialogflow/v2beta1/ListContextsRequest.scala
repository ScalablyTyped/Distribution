package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListContextsRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest")
@js.native
/**
  * Constructs a new ListContextsRequest.
  * @param [properties] Properties to set
  */
open class ListContextsRequest ()
  extends StObject
     with IListContextsRequest {
  def this(properties: IListContextsRequest) = this()
  
  /** ListContextsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListContextsRequest: Double = js.native
  
  /** ListContextsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListContextsRequest: String = js.native
  
  /** ListContextsRequest parent. */
  @JSName("parent")
  var parent_ListContextsRequest: String = js.native
  
  /**
    * Converts this ListContextsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListContextsRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListContextsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListContextsRequest instance
    */
  /* static member */
  inline def create(): ListContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListContextsRequest]
  inline def create(properties: IListContextsRequest): ListContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListContextsRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListContextsRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListContextsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListContextsRequest]
  /**
    * Decodes a ListContextsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListContextsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListContextsRequest]
  inline def decode(reader: Reader, length: Double): ListContextsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListContextsRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListContextsRequest]
  /**
    * Decodes a ListContextsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListContextsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListContextsRequest]
  
  /**
    * Encodes the specified ListContextsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListContextsRequest.verify|verify} messages.
    * @param message ListContextsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListContextsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListContextsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListContextsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListContextsRequest.verify|verify} messages.
    * @param message ListContextsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListContextsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListContextsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListContextsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListContextsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListContextsRequest]
  
  /**
    * Creates a plain object from a ListContextsRequest message. Also converts values to other types if specified.
    * @param message ListContextsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListContextsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListContextsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListContextsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
