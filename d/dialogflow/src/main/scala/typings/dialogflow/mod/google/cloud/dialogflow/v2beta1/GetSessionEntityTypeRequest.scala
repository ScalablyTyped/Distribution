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

/** Represents a GetSessionEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest")
@js.native
/**
  * Constructs a new GetSessionEntityTypeRequest.
  * @param [properties] Properties to set
  */
class GetSessionEntityTypeRequest () extends IGetSessionEntityTypeRequest {
  def this(properties: IGetSessionEntityTypeRequest) = this()
  
  /** GetSessionEntityTypeRequest name. */
  @JSName("name")
  var name_GetSessionEntityTypeRequest: String = js.native
  
  /**
    * Converts this GetSessionEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object GetSessionEntityTypeRequest {
  
  /**
    * Creates a new GetSessionEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetSessionEntityTypeRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.create")
  @js.native
  def create(): GetSessionEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.create")
  @js.native
  def create(properties: IGetSessionEntityTypeRequest): GetSessionEntityTypeRequest = js.native
  
  /**
    * Decodes a GetSessionEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.decode")
  @js.native
  def decode(reader: Reader): GetSessionEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): GetSessionEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.decode")
  @js.native
  def decode(reader: Uint8Array): GetSessionEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): GetSessionEntityTypeRequest = js.native
  
  /**
    * Decodes a GetSessionEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): GetSessionEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): GetSessionEntityTypeRequest = js.native
  
  /**
    * Encodes the specified GetSessionEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.verify|verify} messages.
    * @param message GetSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.encode")
  @js.native
  def encode(message: IGetSessionEntityTypeRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.encode")
  @js.native
  def encode(message: IGetSessionEntityTypeRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetSessionEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.verify|verify} messages.
    * @param message GetSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetSessionEntityTypeRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetSessionEntityTypeRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetSessionEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetSessionEntityTypeRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): GetSessionEntityTypeRequest = js.native
  
  /**
    * Creates a plain object from a GetSessionEntityTypeRequest message. Also converts values to other types if specified.
    * @param message GetSessionEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.toObject")
  @js.native
  def toObject(message: GetSessionEntityTypeRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.toObject")
  @js.native
  def toObject(message: GetSessionEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetSessionEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
