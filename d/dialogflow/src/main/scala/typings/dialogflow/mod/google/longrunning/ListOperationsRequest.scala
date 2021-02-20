package typings.dialogflow.mod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListOperationsRequest. */
@JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest")
@js.native
/**
  * Constructs a new ListOperationsRequest.
  * @param [properties] Properties to set
  */
class ListOperationsRequest () extends IListOperationsRequest {
  def this(properties: IListOperationsRequest) = this()
  
  /** ListOperationsRequest filter. */
  @JSName("filter")
  var filter_ListOperationsRequest: String = js.native
  
  /** ListOperationsRequest name. */
  @JSName("name")
  var name_ListOperationsRequest: String = js.native
  
  /** ListOperationsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListOperationsRequest: Double = js.native
  
  /** ListOperationsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListOperationsRequest: String = js.native
  
  /**
    * Converts this ListOperationsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListOperationsRequest {
  
  /**
    * Creates a new ListOperationsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListOperationsRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.create")
  @js.native
  def create(): ListOperationsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.create")
  @js.native
  def create(properties: IListOperationsRequest): ListOperationsRequest = js.native
  
  /**
    * Decodes a ListOperationsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListOperationsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.decode")
  @js.native
  def decode(reader: Reader): ListOperationsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListOperationsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ListOperationsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ListOperationsRequest = js.native
  
  /**
    * Decodes a ListOperationsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListOperationsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListOperationsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ListOperationsRequest = js.native
  
  /**
    * Encodes the specified ListOperationsRequest message. Does not implicitly {@link google.longrunning.ListOperationsRequest.verify|verify} messages.
    * @param message ListOperationsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.encode")
  @js.native
  def encode(message: IListOperationsRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.encode")
  @js.native
  def encode(message: IListOperationsRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListOperationsRequest message, length delimited. Does not implicitly {@link google.longrunning.ListOperationsRequest.verify|verify} messages.
    * @param message ListOperationsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListOperationsRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListOperationsRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListOperationsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListOperationsRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListOperationsRequest = js.native
  
  /**
    * Creates a plain object from a ListOperationsRequest message. Also converts values to other types if specified.
    * @param message ListOperationsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.toObject")
  @js.native
  def toObject(message: ListOperationsRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.toObject")
  @js.native
  def toObject(message: ListOperationsRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListOperationsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
