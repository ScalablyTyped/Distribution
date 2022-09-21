package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListIntentsRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest")
@js.native
/**
  * Constructs a new ListIntentsRequest.
  * @param [properties] Properties to set
  */
open class ListIntentsRequest ()
  extends StObject
     with IListIntentsRequest {
  def this(properties: IListIntentsRequest) = this()
  
  /** ListIntentsRequest intentView. */
  @JSName("intentView")
  var intentView_ListIntentsRequest: IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String) = js.native
  
  /** ListIntentsRequest languageCode. */
  @JSName("languageCode")
  var languageCode_ListIntentsRequest: String = js.native
  
  /** ListIntentsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListIntentsRequest: Double = js.native
  
  /** ListIntentsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListIntentsRequest: String = js.native
  
  /** ListIntentsRequest parent. */
  @JSName("parent")
  var parent_ListIntentsRequest: String = js.native
  
  /**
    * Converts this ListIntentsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListIntentsRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListIntentsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListIntentsRequest instance
    */
  /* static member */
  inline def create(): ListIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListIntentsRequest]
  inline def create(properties: IListIntentsRequest): ListIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListIntentsRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListIntentsRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListIntentsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListIntentsRequest]
  /**
    * Decodes a ListIntentsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListIntentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListIntentsRequest]
  inline def decode(reader: Reader, length: Double): ListIntentsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListIntentsRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListIntentsRequest]
  /**
    * Decodes a ListIntentsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListIntentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListIntentsRequest]
  
  /**
    * Encodes the specified ListIntentsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.ListIntentsRequest.verify|verify} messages.
    * @param message ListIntentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListIntentsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListIntentsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListIntentsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.ListIntentsRequest.verify|verify} messages.
    * @param message ListIntentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListIntentsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListIntentsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListIntentsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListIntentsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListIntentsRequest]
  
  /**
    * Creates a plain object from a ListIntentsRequest message. Also converts values to other types if specified.
    * @param message ListIntentsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListIntentsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListIntentsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListIntentsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
