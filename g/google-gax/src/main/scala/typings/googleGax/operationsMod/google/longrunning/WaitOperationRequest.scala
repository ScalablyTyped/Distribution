package typings.googleGax.operationsMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a WaitOperationRequest. */
@JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest")
@js.native
/**
  * Constructs a new WaitOperationRequest.
  * @param [properties] Properties to set
  */
class WaitOperationRequest () extends IWaitOperationRequest {
  def this(properties: IWaitOperationRequest) = this()
  /** WaitOperationRequest name. */
  @JSName("name")
  var name_WaitOperationRequest: String = js.native
  /**
    * Converts this WaitOperationRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest")
@js.native
object WaitOperationRequest extends js.Object {
  /**
    * Creates a new WaitOperationRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns WaitOperationRequest instance
    */
  def create(): WaitOperationRequest = js.native
  def create(properties: IWaitOperationRequest): WaitOperationRequest = js.native
  /**
    * Decodes a WaitOperationRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns WaitOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): WaitOperationRequest = js.native
  def decode(reader: Reader, length: Double): WaitOperationRequest = js.native
  def decode(reader: Uint8Array): WaitOperationRequest = js.native
  def decode(reader: Uint8Array, length: Double): WaitOperationRequest = js.native
  /**
    * Decodes a WaitOperationRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns WaitOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): WaitOperationRequest = js.native
  def decodeDelimited(reader: Uint8Array): WaitOperationRequest = js.native
  /**
    * Encodes the specified WaitOperationRequest message. Does not implicitly {@link google.longrunning.WaitOperationRequest.verify|verify} messages.
    * @param message WaitOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IWaitOperationRequest): Writer = js.native
  def encode(message: IWaitOperationRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified WaitOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.WaitOperationRequest.verify|verify} messages.
    * @param message WaitOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IWaitOperationRequest): Writer = js.native
  def encodeDelimited(message: IWaitOperationRequest, writer: Writer): Writer = js.native
  /**
    * Creates a WaitOperationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns WaitOperationRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): WaitOperationRequest = js.native
  /**
    * Creates a plain object from a WaitOperationRequest message. Also converts values to other types if specified.
    * @param message WaitOperationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: WaitOperationRequest): StringDictionary[js.Any] = js.native
  def toObject(message: WaitOperationRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a WaitOperationRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

