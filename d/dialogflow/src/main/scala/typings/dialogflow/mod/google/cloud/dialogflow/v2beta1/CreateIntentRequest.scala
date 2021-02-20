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

/** Represents a CreateIntentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest")
@js.native
/**
  * Constructs a new CreateIntentRequest.
  * @param [properties] Properties to set
  */
class CreateIntentRequest () extends ICreateIntentRequest {
  def this(properties: ICreateIntentRequest) = this()
  
  /** CreateIntentRequest intentView. */
  @JSName("intentView")
  var intentView_CreateIntentRequest: IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.IntentView * / any */ String) = js.native
  
  /** CreateIntentRequest languageCode. */
  @JSName("languageCode")
  var languageCode_CreateIntentRequest: String = js.native
  
  /** CreateIntentRequest parent. */
  @JSName("parent")
  var parent_CreateIntentRequest: String = js.native
  
  /**
    * Converts this CreateIntentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CreateIntentRequest {
  
  /**
    * Creates a new CreateIntentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateIntentRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.create")
  @js.native
  def create(): CreateIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.create")
  @js.native
  def create(properties: ICreateIntentRequest): CreateIntentRequest = js.native
  
  /**
    * Decodes a CreateIntentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.decode")
  @js.native
  def decode(reader: Reader): CreateIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): CreateIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.decode")
  @js.native
  def decode(reader: Uint8Array): CreateIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): CreateIntentRequest = js.native
  
  /**
    * Decodes a CreateIntentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): CreateIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): CreateIntentRequest = js.native
  
  /**
    * Encodes the specified CreateIntentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateIntentRequest.verify|verify} messages.
    * @param message CreateIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.encode")
  @js.native
  def encode(message: ICreateIntentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.encode")
  @js.native
  def encode(message: ICreateIntentRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CreateIntentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateIntentRequest.verify|verify} messages.
    * @param message CreateIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICreateIntentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICreateIntentRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a CreateIntentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateIntentRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): CreateIntentRequest = js.native
  
  /**
    * Creates a plain object from a CreateIntentRequest message. Also converts values to other types if specified.
    * @param message CreateIntentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.toObject")
  @js.native
  def toObject(message: CreateIntentRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.toObject")
  @js.native
  def toObject(message: CreateIntentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CreateIntentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
