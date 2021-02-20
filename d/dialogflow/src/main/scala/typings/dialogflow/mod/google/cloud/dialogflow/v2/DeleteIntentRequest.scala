package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteIntentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest")
@js.native
/**
  * Constructs a new DeleteIntentRequest.
  * @param [properties] Properties to set
  */
class DeleteIntentRequest () extends IDeleteIntentRequest {
  def this(properties: IDeleteIntentRequest) = this()
  
  /** DeleteIntentRequest name. */
  @JSName("name")
  var name_DeleteIntentRequest: String = js.native
  
  /**
    * Converts this DeleteIntentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DeleteIntentRequest {
  
  /**
    * Creates a new DeleteIntentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteIntentRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.create")
  @js.native
  def create(): DeleteIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.create")
  @js.native
  def create(properties: IDeleteIntentRequest): DeleteIntentRequest = js.native
  
  /**
    * Decodes a DeleteIntentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.decode")
  @js.native
  def decode(reader: Reader): DeleteIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): DeleteIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.decode")
  @js.native
  def decode(reader: Uint8Array): DeleteIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): DeleteIntentRequest = js.native
  
  /**
    * Decodes a DeleteIntentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): DeleteIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): DeleteIntentRequest = js.native
  
  /**
    * Encodes the specified DeleteIntentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteIntentRequest.verify|verify} messages.
    * @param message DeleteIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.encode")
  @js.native
  def encode(message: IDeleteIntentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.encode")
  @js.native
  def encode(message: IDeleteIntentRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DeleteIntentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteIntentRequest.verify|verify} messages.
    * @param message DeleteIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteIntentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteIntentRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a DeleteIntentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteIntentRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): DeleteIntentRequest = js.native
  
  /**
    * Creates a plain object from a DeleteIntentRequest message. Also converts values to other types if specified.
    * @param message DeleteIntentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.toObject")
  @js.native
  def toObject(message: DeleteIntentRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.toObject")
  @js.native
  def toObject(message: DeleteIntentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DeleteIntentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
