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

/** Represents an UpdateContextRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest")
@js.native
/**
  * Constructs a new UpdateContextRequest.
  * @param [properties] Properties to set
  */
class UpdateContextRequest () extends IUpdateContextRequest {
  def this(properties: IUpdateContextRequest) = this()
  
  /**
    * Converts this UpdateContextRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object UpdateContextRequest {
  
  /**
    * Creates a new UpdateContextRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateContextRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.create")
  @js.native
  def create(): UpdateContextRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.create")
  @js.native
  def create(properties: IUpdateContextRequest): UpdateContextRequest = js.native
  
  /**
    * Decodes an UpdateContextRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.decode")
  @js.native
  def decode(reader: Reader): UpdateContextRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): UpdateContextRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.decode")
  @js.native
  def decode(reader: Uint8Array): UpdateContextRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): UpdateContextRequest = js.native
  
  /**
    * Decodes an UpdateContextRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): UpdateContextRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): UpdateContextRequest = js.native
  
  /**
    * Encodes the specified UpdateContextRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateContextRequest.verify|verify} messages.
    * @param message UpdateContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.encode")
  @js.native
  def encode(message: IUpdateContextRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.encode")
  @js.native
  def encode(message: IUpdateContextRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified UpdateContextRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateContextRequest.verify|verify} messages.
    * @param message UpdateContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUpdateContextRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUpdateContextRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates an UpdateContextRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateContextRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): UpdateContextRequest = js.native
  
  /**
    * Creates a plain object from an UpdateContextRequest message. Also converts values to other types if specified.
    * @param message UpdateContextRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.toObject")
  @js.native
  def toObject(message: UpdateContextRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.toObject")
  @js.native
  def toObject(message: UpdateContextRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an UpdateContextRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateContextRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
