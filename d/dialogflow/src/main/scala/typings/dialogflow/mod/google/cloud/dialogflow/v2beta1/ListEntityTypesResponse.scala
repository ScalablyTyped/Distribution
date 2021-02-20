package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListEntityTypesResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse")
@js.native
/**
  * Constructs a new ListEntityTypesResponse.
  * @param [properties] Properties to set
  */
class ListEntityTypesResponse () extends IListEntityTypesResponse {
  def this(properties: IListEntityTypesResponse) = this()
  
  /** ListEntityTypesResponse entityTypes. */
  @JSName("entityTypes")
  var entityTypes_ListEntityTypesResponse: js.Array[IEntityType] = js.native
  
  /** ListEntityTypesResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListEntityTypesResponse: String = js.native
  
  /**
    * Converts this ListEntityTypesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListEntityTypesResponse {
  
  /**
    * Creates a new ListEntityTypesResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListEntityTypesResponse instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.create")
  @js.native
  def create(): ListEntityTypesResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.create")
  @js.native
  def create(properties: IListEntityTypesResponse): ListEntityTypesResponse = js.native
  
  /**
    * Decodes a ListEntityTypesResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.decode")
  @js.native
  def decode(reader: Reader): ListEntityTypesResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListEntityTypesResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ListEntityTypesResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ListEntityTypesResponse = js.native
  
  /**
    * Decodes a ListEntityTypesResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListEntityTypesResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ListEntityTypesResponse = js.native
  
  /**
    * Encodes the specified ListEntityTypesResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.verify|verify} messages.
    * @param message ListEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.encode")
  @js.native
  def encode(message: IListEntityTypesResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.encode")
  @js.native
  def encode(message: IListEntityTypesResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListEntityTypesResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.verify|verify} messages.
    * @param message ListEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListEntityTypesResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListEntityTypesResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListEntityTypesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListEntityTypesResponse
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListEntityTypesResponse = js.native
  
  /**
    * Creates a plain object from a ListEntityTypesResponse message. Also converts values to other types if specified.
    * @param message ListEntityTypesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.toObject")
  @js.native
  def toObject(message: ListEntityTypesResponse): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.toObject")
  @js.native
  def toObject(message: ListEntityTypesResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListEntityTypesResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
