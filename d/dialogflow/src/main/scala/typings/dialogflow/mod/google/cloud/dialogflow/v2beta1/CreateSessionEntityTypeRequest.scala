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

/** Represents a CreateSessionEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest")
@js.native
/**
  * Constructs a new CreateSessionEntityTypeRequest.
  * @param [properties] Properties to set
  */
class CreateSessionEntityTypeRequest () extends ICreateSessionEntityTypeRequest {
  def this(properties: ICreateSessionEntityTypeRequest) = this()
  
  /** CreateSessionEntityTypeRequest parent. */
  @JSName("parent")
  var parent_CreateSessionEntityTypeRequest: String = js.native
  
  /**
    * Converts this CreateSessionEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CreateSessionEntityTypeRequest {
  
  /**
    * Creates a new CreateSessionEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateSessionEntityTypeRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.create")
  @js.native
  def create(): CreateSessionEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.create")
  @js.native
  def create(properties: ICreateSessionEntityTypeRequest): CreateSessionEntityTypeRequest = js.native
  
  /**
    * Decodes a CreateSessionEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.decode")
  @js.native
  def decode(reader: Reader): CreateSessionEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): CreateSessionEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.decode")
  @js.native
  def decode(reader: Uint8Array): CreateSessionEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): CreateSessionEntityTypeRequest = js.native
  
  /**
    * Decodes a CreateSessionEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): CreateSessionEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): CreateSessionEntityTypeRequest = js.native
  
  /**
    * Encodes the specified CreateSessionEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.verify|verify} messages.
    * @param message CreateSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.encode")
  @js.native
  def encode(message: ICreateSessionEntityTypeRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.encode")
  @js.native
  def encode(message: ICreateSessionEntityTypeRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CreateSessionEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.verify|verify} messages.
    * @param message CreateSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICreateSessionEntityTypeRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICreateSessionEntityTypeRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a CreateSessionEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateSessionEntityTypeRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): CreateSessionEntityTypeRequest = js.native
  
  /**
    * Creates a plain object from a CreateSessionEntityTypeRequest message. Also converts values to other types if specified.
    * @param message CreateSessionEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.toObject")
  @js.native
  def toObject(message: CreateSessionEntityTypeRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.toObject")
  @js.native
  def toObject(message: CreateSessionEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CreateSessionEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
