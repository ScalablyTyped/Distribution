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

/** Represents a CreateDocumentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest")
@js.native
/**
  * Constructs a new CreateDocumentRequest.
  * @param [properties] Properties to set
  */
class CreateDocumentRequest () extends ICreateDocumentRequest {
  def this(properties: ICreateDocumentRequest) = this()
  
  /** CreateDocumentRequest parent. */
  @JSName("parent")
  var parent_CreateDocumentRequest: String = js.native
  
  /**
    * Converts this CreateDocumentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CreateDocumentRequest {
  
  /**
    * Creates a new CreateDocumentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateDocumentRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.create")
  @js.native
  def create(): CreateDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.create")
  @js.native
  def create(properties: ICreateDocumentRequest): CreateDocumentRequest = js.native
  
  /**
    * Decodes a CreateDocumentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.decode")
  @js.native
  def decode(reader: Reader): CreateDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): CreateDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.decode")
  @js.native
  def decode(reader: Uint8Array): CreateDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): CreateDocumentRequest = js.native
  
  /**
    * Decodes a CreateDocumentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): CreateDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): CreateDocumentRequest = js.native
  
  /**
    * Encodes the specified CreateDocumentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateDocumentRequest.verify|verify} messages.
    * @param message CreateDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.encode")
  @js.native
  def encode(message: ICreateDocumentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.encode")
  @js.native
  def encode(message: ICreateDocumentRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CreateDocumentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateDocumentRequest.verify|verify} messages.
    * @param message CreateDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICreateDocumentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICreateDocumentRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a CreateDocumentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateDocumentRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): CreateDocumentRequest = js.native
  
  /**
    * Creates a plain object from a CreateDocumentRequest message. Also converts values to other types if specified.
    * @param message CreateDocumentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.toObject")
  @js.native
  def toObject(message: CreateDocumentRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.toObject")
  @js.native
  def toObject(message: CreateDocumentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CreateDocumentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
