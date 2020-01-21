package typings.dialogflow.mod.google.rpc

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.protobuf.IAny
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Status. */
@JSImport("dialogflow/protos/protos", "google.rpc.Status")
@js.native
/**
  * Constructs a new Status.
  * @param [properties] Properties to set
  */
class Status () extends IStatus {
  def this(properties: IStatus) = this()
  /** Status code. */
  @JSName("code")
  var code_Status: Double = js.native
  /** Status details. */
  @JSName("details")
  var details_Status: js.Array[IAny] = js.native
  /** Status message. */
  @JSName("message")
  var message_Status: String = js.native
  /**
    * Converts this Status to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.rpc.Status")
@js.native
object Status extends js.Object {
  /**
    * Creates a new Status instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Status instance
    */
  def create(): Status = js.native
  def create(properties: IStatus): Status = js.native
  /**
    * Decodes a Status message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Status
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Status = js.native
  def decode(reader: Reader, length: Double): Status = js.native
  def decode(reader: Uint8Array): Status = js.native
  def decode(reader: Uint8Array, length: Double): Status = js.native
  /**
    * Decodes a Status message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Status
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Status = js.native
  def decodeDelimited(reader: Uint8Array): Status = js.native
  /**
    * Encodes the specified Status message. Does not implicitly {@link google.rpc.Status.verify|verify} messages.
    * @param message Status message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IStatus): Writer = js.native
  def encode(message: IStatus, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Status message, length delimited. Does not implicitly {@link google.rpc.Status.verify|verify} messages.
    * @param message Status message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IStatus): Writer = js.native
  def encodeDelimited(message: IStatus, writer: Writer): Writer = js.native
  /**
    * Creates a Status message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Status
    */
  def fromObject(`object`: StringDictionary[js.Any]): Status = js.native
  /**
    * Creates a plain object from a Status message. Also converts values to other types if specified.
    * @param message Status
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Status): StringDictionary[js.Any] = js.native
  def toObject(message: Status, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Status message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

