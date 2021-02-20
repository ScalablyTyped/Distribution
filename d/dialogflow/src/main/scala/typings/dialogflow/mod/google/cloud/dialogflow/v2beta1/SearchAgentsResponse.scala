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

/** Represents a SearchAgentsResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse")
@js.native
/**
  * Constructs a new SearchAgentsResponse.
  * @param [properties] Properties to set
  */
class SearchAgentsResponse () extends ISearchAgentsResponse {
  def this(properties: ISearchAgentsResponse) = this()
  
  /** SearchAgentsResponse agents. */
  @JSName("agents")
  var agents_SearchAgentsResponse: js.Array[IAgent] = js.native
  
  /** SearchAgentsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_SearchAgentsResponse: String = js.native
  
  /**
    * Converts this SearchAgentsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SearchAgentsResponse {
  
  /**
    * Creates a new SearchAgentsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SearchAgentsResponse instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.create")
  @js.native
  def create(): SearchAgentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.create")
  @js.native
  def create(properties: ISearchAgentsResponse): SearchAgentsResponse = js.native
  
  /**
    * Decodes a SearchAgentsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SearchAgentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.decode")
  @js.native
  def decode(reader: Reader): SearchAgentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): SearchAgentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.decode")
  @js.native
  def decode(reader: Uint8Array): SearchAgentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): SearchAgentsResponse = js.native
  
  /**
    * Decodes a SearchAgentsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SearchAgentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SearchAgentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): SearchAgentsResponse = js.native
  
  /**
    * Encodes the specified SearchAgentsResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SearchAgentsResponse.verify|verify} messages.
    * @param message SearchAgentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.encode")
  @js.native
  def encode(message: ISearchAgentsResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.encode")
  @js.native
  def encode(message: ISearchAgentsResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SearchAgentsResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SearchAgentsResponse.verify|verify} messages.
    * @param message SearchAgentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISearchAgentsResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISearchAgentsResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a SearchAgentsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SearchAgentsResponse
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SearchAgentsResponse = js.native
  
  /**
    * Creates a plain object from a SearchAgentsResponse message. Also converts values to other types if specified.
    * @param message SearchAgentsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.toObject")
  @js.native
  def toObject(message: SearchAgentsResponse): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.toObject")
  @js.native
  def toObject(message: SearchAgentsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SearchAgentsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
