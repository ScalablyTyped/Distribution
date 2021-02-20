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

/** Represents a DetectIntentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest")
@js.native
/**
  * Constructs a new DetectIntentRequest.
  * @param [properties] Properties to set
  */
class DetectIntentRequest () extends IDetectIntentRequest {
  def this(properties: IDetectIntentRequest) = this()
  
  /** DetectIntentRequest inputAudio. */
  @JSName("inputAudio")
  var inputAudio_DetectIntentRequest: Uint8Array | String = js.native
  
  /** DetectIntentRequest session. */
  @JSName("session")
  var session_DetectIntentRequest: String = js.native
  
  /**
    * Converts this DetectIntentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DetectIntentRequest {
  
  /**
    * Creates a new DetectIntentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DetectIntentRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.create")
  @js.native
  def create(): DetectIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.create")
  @js.native
  def create(properties: IDetectIntentRequest): DetectIntentRequest = js.native
  
  /**
    * Decodes a DetectIntentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DetectIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.decode")
  @js.native
  def decode(reader: Reader): DetectIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): DetectIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.decode")
  @js.native
  def decode(reader: Uint8Array): DetectIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): DetectIntentRequest = js.native
  
  /**
    * Decodes a DetectIntentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DetectIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): DetectIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): DetectIntentRequest = js.native
  
  /**
    * Encodes the specified DetectIntentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DetectIntentRequest.verify|verify} messages.
    * @param message DetectIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.encode")
  @js.native
  def encode(message: IDetectIntentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.encode")
  @js.native
  def encode(message: IDetectIntentRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DetectIntentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DetectIntentRequest.verify|verify} messages.
    * @param message DetectIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDetectIntentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDetectIntentRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a DetectIntentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DetectIntentRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): DetectIntentRequest = js.native
  
  /**
    * Creates a plain object from a DetectIntentRequest message. Also converts values to other types if specified.
    * @param message DetectIntentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.toObject")
  @js.native
  def toObject(message: DetectIntentRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.toObject")
  @js.native
  def toObject(message: DetectIntentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DetectIntentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
