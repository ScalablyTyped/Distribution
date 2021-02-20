package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListIntentsRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest")
@js.native
/**
  * Constructs a new ListIntentsRequest.
  * @param [properties] Properties to set
  */
class ListIntentsRequest () extends IListIntentsRequest {
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
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListIntentsRequest {
  
  /**
    * Creates a new ListIntentsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListIntentsRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.create")
  @js.native
  def create(): ListIntentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.create")
  @js.native
  def create(properties: IListIntentsRequest): ListIntentsRequest = js.native
  
  /**
    * Decodes a ListIntentsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListIntentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.decode")
  @js.native
  def decode(reader: Reader): ListIntentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListIntentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ListIntentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ListIntentsRequest = js.native
  
  /**
    * Decodes a ListIntentsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListIntentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListIntentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ListIntentsRequest = js.native
  
  /**
    * Encodes the specified ListIntentsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.ListIntentsRequest.verify|verify} messages.
    * @param message ListIntentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.encode")
  @js.native
  def encode(message: IListIntentsRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.encode")
  @js.native
  def encode(message: IListIntentsRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListIntentsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.ListIntentsRequest.verify|verify} messages.
    * @param message ListIntentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListIntentsRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListIntentsRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListIntentsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListIntentsRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListIntentsRequest = js.native
  
  /**
    * Creates a plain object from a ListIntentsRequest message. Also converts values to other types if specified.
    * @param message ListIntentsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.toObject")
  @js.native
  def toObject(message: ListIntentsRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.toObject")
  @js.native
  def toObject(message: ListIntentsRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListIntentsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListIntentsRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
