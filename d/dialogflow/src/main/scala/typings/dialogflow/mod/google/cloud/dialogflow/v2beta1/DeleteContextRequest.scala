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

/** Represents a DeleteContextRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest")
@js.native
/**
  * Constructs a new DeleteContextRequest.
  * @param [properties] Properties to set
  */
class DeleteContextRequest () extends IDeleteContextRequest {
  def this(properties: IDeleteContextRequest) = this()
  
  /** DeleteContextRequest name. */
  @JSName("name")
  var name_DeleteContextRequest: String = js.native
  
  /**
    * Converts this DeleteContextRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DeleteContextRequest {
  
  /**
    * Creates a new DeleteContextRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteContextRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.create")
  @js.native
  def create(): DeleteContextRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.create")
  @js.native
  def create(properties: IDeleteContextRequest): DeleteContextRequest = js.native
  
  /**
    * Decodes a DeleteContextRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.decode")
  @js.native
  def decode(reader: Reader): DeleteContextRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): DeleteContextRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.decode")
  @js.native
  def decode(reader: Uint8Array): DeleteContextRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): DeleteContextRequest = js.native
  
  /**
    * Decodes a DeleteContextRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): DeleteContextRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): DeleteContextRequest = js.native
  
  /**
    * Encodes the specified DeleteContextRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteContextRequest.verify|verify} messages.
    * @param message DeleteContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.encode")
  @js.native
  def encode(message: IDeleteContextRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.encode")
  @js.native
  def encode(message: IDeleteContextRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DeleteContextRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteContextRequest.verify|verify} messages.
    * @param message DeleteContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteContextRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteContextRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a DeleteContextRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteContextRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): DeleteContextRequest = js.native
  
  /**
    * Creates a plain object from a DeleteContextRequest message. Also converts values to other types if specified.
    * @param message DeleteContextRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.toObject")
  @js.native
  def toObject(message: DeleteContextRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.toObject")
  @js.native
  def toObject(message: DeleteContextRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DeleteContextRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
