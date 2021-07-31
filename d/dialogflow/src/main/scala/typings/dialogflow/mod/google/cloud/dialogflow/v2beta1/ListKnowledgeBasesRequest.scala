package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListKnowledgeBasesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest")
@js.native
/**
  * Constructs a new ListKnowledgeBasesRequest.
  * @param [properties] Properties to set
  */
class ListKnowledgeBasesRequest ()
  extends StObject
     with IListKnowledgeBasesRequest {
  def this(properties: IListKnowledgeBasesRequest) = this()
  
  /** ListKnowledgeBasesRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListKnowledgeBasesRequest: Double = js.native
  
  /** ListKnowledgeBasesRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListKnowledgeBasesRequest: String = js.native
  
  /** ListKnowledgeBasesRequest parent. */
  @JSName("parent")
  var parent_ListKnowledgeBasesRequest: String = js.native
  
  /**
    * Converts this ListKnowledgeBasesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListKnowledgeBasesRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListKnowledgeBasesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListKnowledgeBasesRequest instance
    */
  /* static member */
  @scala.inline
  def create(): ListKnowledgeBasesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListKnowledgeBasesRequest]
  @scala.inline
  def create(properties: IListKnowledgeBasesRequest): ListKnowledgeBasesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListKnowledgeBasesRequest]
  
  /**
    * Decodes a ListKnowledgeBasesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListKnowledgeBasesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): ListKnowledgeBasesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListKnowledgeBasesRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): ListKnowledgeBasesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListKnowledgeBasesRequest]
  @scala.inline
  def decode(reader: Uint8Array): ListKnowledgeBasesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListKnowledgeBasesRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ListKnowledgeBasesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListKnowledgeBasesRequest]
  
  /**
    * Decodes a ListKnowledgeBasesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListKnowledgeBasesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): ListKnowledgeBasesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListKnowledgeBasesRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ListKnowledgeBasesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListKnowledgeBasesRequest]
  
  /**
    * Encodes the specified ListKnowledgeBasesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.verify|verify} messages.
    * @param message ListKnowledgeBasesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IListKnowledgeBasesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IListKnowledgeBasesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListKnowledgeBasesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.verify|verify} messages.
    * @param message ListKnowledgeBasesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IListKnowledgeBasesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IListKnowledgeBasesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListKnowledgeBasesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListKnowledgeBasesRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ListKnowledgeBasesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListKnowledgeBasesRequest]
  
  /**
    * Creates a plain object from a ListKnowledgeBasesRequest message. Also converts values to other types if specified.
    * @param message ListKnowledgeBasesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: ListKnowledgeBasesRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ListKnowledgeBasesRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ListKnowledgeBasesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
