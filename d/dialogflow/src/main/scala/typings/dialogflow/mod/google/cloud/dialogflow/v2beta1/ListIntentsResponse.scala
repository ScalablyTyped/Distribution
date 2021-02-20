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

/** Represents a ListIntentsResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse")
@js.native
/**
  * Constructs a new ListIntentsResponse.
  * @param [properties] Properties to set
  */
class ListIntentsResponse () extends IListIntentsResponse {
  def this(properties: IListIntentsResponse) = this()
  
  /** ListIntentsResponse intents. */
  @JSName("intents")
  var intents_ListIntentsResponse: js.Array[IIntent] = js.native
  
  /** ListIntentsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListIntentsResponse: String = js.native
  
  /**
    * Converts this ListIntentsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListIntentsResponse {
  
  /**
    * Creates a new ListIntentsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListIntentsResponse instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.create")
  @js.native
  def create(): ListIntentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.create")
  @js.native
  def create(properties: IListIntentsResponse): ListIntentsResponse = js.native
  
  /**
    * Decodes a ListIntentsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListIntentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.decode")
  @js.native
  def decode(reader: Reader): ListIntentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListIntentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ListIntentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ListIntentsResponse = js.native
  
  /**
    * Decodes a ListIntentsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListIntentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListIntentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ListIntentsResponse = js.native
  
  /**
    * Encodes the specified ListIntentsResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListIntentsResponse.verify|verify} messages.
    * @param message ListIntentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.encode")
  @js.native
  def encode(message: IListIntentsResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.encode")
  @js.native
  def encode(message: IListIntentsResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListIntentsResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListIntentsResponse.verify|verify} messages.
    * @param message ListIntentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListIntentsResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListIntentsResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListIntentsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListIntentsResponse
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListIntentsResponse = js.native
  
  /**
    * Creates a plain object from a ListIntentsResponse message. Also converts values to other types if specified.
    * @param message ListIntentsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.toObject")
  @js.native
  def toObject(message: ListIntentsResponse): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.toObject")
  @js.native
  def toObject(message: ListIntentsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListIntentsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
