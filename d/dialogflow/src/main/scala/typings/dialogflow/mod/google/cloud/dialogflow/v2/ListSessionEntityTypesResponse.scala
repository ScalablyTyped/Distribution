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

/** Represents a ListSessionEntityTypesResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse")
@js.native
/**
  * Constructs a new ListSessionEntityTypesResponse.
  * @param [properties] Properties to set
  */
class ListSessionEntityTypesResponse () extends IListSessionEntityTypesResponse {
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
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListSessionEntityTypesResponse {
  
  /**
    * Creates a new ListSessionEntityTypesResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSessionEntityTypesResponse instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.create")
  @js.native
  def create(): ListSessionEntityTypesResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.create")
  @js.native
  def create(properties: IListSessionEntityTypesResponse): ListSessionEntityTypesResponse = js.native
  
  /**
    * Decodes a ListSessionEntityTypesResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSessionEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.decode")
  @js.native
  def decode(reader: Reader): ListSessionEntityTypesResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListSessionEntityTypesResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ListSessionEntityTypesResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ListSessionEntityTypesResponse = js.native
  
  /**
    * Decodes a ListSessionEntityTypesResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSessionEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListSessionEntityTypesResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ListSessionEntityTypesResponse = js.native
  
  /**
    * Encodes the specified ListSessionEntityTypesResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.verify|verify} messages.
    * @param message ListSessionEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.encode")
  @js.native
  def encode(message: IListSessionEntityTypesResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.encode")
  @js.native
  def encode(message: IListSessionEntityTypesResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListSessionEntityTypesResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.verify|verify} messages.
    * @param message ListSessionEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListSessionEntityTypesResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListSessionEntityTypesResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListSessionEntityTypesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSessionEntityTypesResponse
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListSessionEntityTypesResponse = js.native
  
  /**
    * Creates a plain object from a ListSessionEntityTypesResponse message. Also converts values to other types if specified.
    * @param message ListSessionEntityTypesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.toObject")
  @js.native
  def toObject(message: ListSessionEntityTypesResponse): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.toObject")
  @js.native
  def toObject(message: ListSessionEntityTypesResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListSessionEntityTypesResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
