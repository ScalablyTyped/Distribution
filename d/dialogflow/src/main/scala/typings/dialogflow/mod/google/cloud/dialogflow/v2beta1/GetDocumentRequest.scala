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

/** Represents a GetDocumentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest")
@js.native
/**
  * Constructs a new GetDocumentRequest.
  * @param [properties] Properties to set
  */
class GetDocumentRequest () extends IGetDocumentRequest {
  def this(properties: IGetDocumentRequest) = this()
  
  /** GetDocumentRequest name. */
  @JSName("name")
  var name_GetDocumentRequest: String = js.native
  
  /**
    * Converts this GetDocumentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object GetDocumentRequest {
  
  /**
    * Creates a new GetDocumentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetDocumentRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.create")
  @js.native
  def create(): GetDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.create")
  @js.native
  def create(properties: IGetDocumentRequest): GetDocumentRequest = js.native
  
  /**
    * Decodes a GetDocumentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.decode")
  @js.native
  def decode(reader: Reader): GetDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): GetDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.decode")
  @js.native
  def decode(reader: Uint8Array): GetDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): GetDocumentRequest = js.native
  
  /**
    * Decodes a GetDocumentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): GetDocumentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): GetDocumentRequest = js.native
  
  /**
    * Encodes the specified GetDocumentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetDocumentRequest.verify|verify} messages.
    * @param message GetDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.encode")
  @js.native
  def encode(message: IGetDocumentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.encode")
  @js.native
  def encode(message: IGetDocumentRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetDocumentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetDocumentRequest.verify|verify} messages.
    * @param message GetDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetDocumentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetDocumentRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetDocumentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetDocumentRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): GetDocumentRequest = js.native
  
  /**
    * Creates a plain object from a GetDocumentRequest message. Also converts values to other types if specified.
    * @param message GetDocumentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.toObject")
  @js.native
  def toObject(message: GetDocumentRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.toObject")
  @js.native
  def toObject(message: GetDocumentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetDocumentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
