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

/** Represents a DeleteDocumentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest")
@js.native
/**
  * Constructs a new DeleteDocumentRequest.
  * @param [properties] Properties to set
  */
class DeleteDocumentRequest () extends IDeleteDocumentRequest {
  def this(properties: IDeleteDocumentRequest) = this()
  
  /** DeleteDocumentRequest name. */
  @JSName("name")
  var name_DeleteDocumentRequest: String = js.native
  
  /**
    * Converts this DeleteDocumentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DeleteDocumentRequest {
  
  /**
    * Creates a new DeleteDocumentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteDocumentRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.create")
  @js.native
  def create(): DeleteDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.create")
  @js.native
  def create(properties: IDeleteDocumentRequest): DeleteDocumentRequest = js.native
  
  /**
    * Decodes a DeleteDocumentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.decode")
  @js.native
  def decode(reader: Reader): DeleteDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): DeleteDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.decode")
  @js.native
  def decode(reader: Uint8Array): DeleteDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): DeleteDocumentRequest = js.native
  
  /**
    * Decodes a DeleteDocumentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): DeleteDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): DeleteDocumentRequest = js.native
  
  /**
    * Encodes the specified DeleteDocumentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.verify|verify} messages.
    * @param message DeleteDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.encode")
  @js.native
  def encode(message: IDeleteDocumentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.encode")
  @js.native
  def encode(message: IDeleteDocumentRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DeleteDocumentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.verify|verify} messages.
    * @param message DeleteDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteDocumentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteDocumentRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a DeleteDocumentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteDocumentRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): DeleteDocumentRequest = js.native
  
  /**
    * Creates a plain object from a DeleteDocumentRequest message. Also converts values to other types if specified.
    * @param message DeleteDocumentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.toObject")
  @js.native
  def toObject(message: DeleteDocumentRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.toObject")
  @js.native
  def toObject(message: DeleteDocumentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DeleteDocumentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
