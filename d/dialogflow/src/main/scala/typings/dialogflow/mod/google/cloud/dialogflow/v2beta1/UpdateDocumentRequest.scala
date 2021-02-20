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

/** Represents an UpdateDocumentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest")
@js.native
/**
  * Constructs a new UpdateDocumentRequest.
  * @param [properties] Properties to set
  */
class UpdateDocumentRequest () extends IUpdateDocumentRequest {
  def this(properties: IUpdateDocumentRequest) = this()
  
  /**
    * Converts this UpdateDocumentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object UpdateDocumentRequest {
  
  /**
    * Creates a new UpdateDocumentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateDocumentRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.create")
  @js.native
  def create(): UpdateDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.create")
  @js.native
  def create(properties: IUpdateDocumentRequest): UpdateDocumentRequest = js.native
  
  /**
    * Decodes an UpdateDocumentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.decode")
  @js.native
  def decode(reader: Reader): UpdateDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): UpdateDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.decode")
  @js.native
  def decode(reader: Uint8Array): UpdateDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): UpdateDocumentRequest = js.native
  
  /**
    * Decodes an UpdateDocumentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): UpdateDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): UpdateDocumentRequest = js.native
  
  /**
    * Encodes the specified UpdateDocumentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.verify|verify} messages.
    * @param message UpdateDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.encode")
  @js.native
  def encode(message: IUpdateDocumentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.encode")
  @js.native
  def encode(message: IUpdateDocumentRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified UpdateDocumentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.verify|verify} messages.
    * @param message UpdateDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUpdateDocumentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUpdateDocumentRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates an UpdateDocumentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateDocumentRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): UpdateDocumentRequest = js.native
  
  /**
    * Creates a plain object from an UpdateDocumentRequest message. Also converts values to other types if specified.
    * @param message UpdateDocumentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.toObject")
  @js.native
  def toObject(message: UpdateDocumentRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.toObject")
  @js.native
  def toObject(message: UpdateDocumentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an UpdateDocumentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateDocumentRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
