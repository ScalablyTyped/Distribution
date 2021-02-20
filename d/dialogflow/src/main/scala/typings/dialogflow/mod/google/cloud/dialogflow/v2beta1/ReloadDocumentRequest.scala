package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.gcsSource
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ReloadDocumentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest")
@js.native
/**
  * Constructs a new ReloadDocumentRequest.
  * @param [properties] Properties to set
  */
class ReloadDocumentRequest () extends IReloadDocumentRequest {
  def this(properties: IReloadDocumentRequest) = this()
  
  /** ReloadDocumentRequest name. */
  @JSName("name")
  var name_ReloadDocumentRequest: String = js.native
  
  /** ReloadDocumentRequest source. */
  var source: js.UndefOr[gcsSource] = js.native
  
  /**
    * Converts this ReloadDocumentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ReloadDocumentRequest {
  
  /**
    * Creates a new ReloadDocumentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ReloadDocumentRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.create")
  @js.native
  def create(): ReloadDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.create")
  @js.native
  def create(properties: IReloadDocumentRequest): ReloadDocumentRequest = js.native
  
  /**
    * Decodes a ReloadDocumentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ReloadDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.decode")
  @js.native
  def decode(reader: Reader): ReloadDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ReloadDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ReloadDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ReloadDocumentRequest = js.native
  
  /**
    * Decodes a ReloadDocumentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ReloadDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ReloadDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ReloadDocumentRequest = js.native
  
  /**
    * Encodes the specified ReloadDocumentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.verify|verify} messages.
    * @param message ReloadDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.encode")
  @js.native
  def encode(message: IReloadDocumentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.encode")
  @js.native
  def encode(message: IReloadDocumentRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ReloadDocumentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.verify|verify} messages.
    * @param message ReloadDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IReloadDocumentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IReloadDocumentRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ReloadDocumentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ReloadDocumentRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ReloadDocumentRequest = js.native
  
  /**
    * Creates a plain object from a ReloadDocumentRequest message. Also converts values to other types if specified.
    * @param message ReloadDocumentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.toObject")
  @js.native
  def toObject(message: ReloadDocumentRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.toObject")
  @js.native
  def toObject(message: ReloadDocumentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ReloadDocumentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
