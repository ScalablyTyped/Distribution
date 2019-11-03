package typings.dialogflow.protosProtosMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.error
import typings.dialogflow.dialogflowStrings.response
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Operation. */
@JSImport("dialogflow/protos/protos", "google.longrunning.Operation")
@js.native
/**
  * Constructs a new Operation.
  * @param [properties] Properties to set
  */
class Operation () extends IOperation {
  def this(properties: IOperation) = this()
  /** Operation done. */
  @JSName("done")
  var done_Operation: Boolean = js.native
  /** Operation name. */
  @JSName("name")
  var name_Operation: String = js.native
  /** Operation result. */
  var result: js.UndefOr[error | response] = js.native
  /**
    * Converts this Operation to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.longrunning.Operation")
@js.native
object Operation extends js.Object {
  /**
    * Creates a new Operation instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Operation instance
    */
  def create(): Operation = js.native
  def create(properties: IOperation): Operation = js.native
  /**
    * Decodes an Operation message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Operation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Operation = js.native
  def decode(reader: Reader, length: Double): Operation = js.native
  def decode(reader: Uint8Array): Operation = js.native
  def decode(reader: Uint8Array, length: Double): Operation = js.native
  /**
    * Decodes an Operation message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Operation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Operation = js.native
  def decodeDelimited(reader: Uint8Array): Operation = js.native
  /**
    * Encodes the specified Operation message. Does not implicitly {@link google.longrunning.Operation.verify|verify} messages.
    * @param message Operation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IOperation): Writer = js.native
  def encode(message: IOperation, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Operation message, length delimited. Does not implicitly {@link google.longrunning.Operation.verify|verify} messages.
    * @param message Operation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IOperation): Writer = js.native
  def encodeDelimited(message: IOperation, writer: Writer): Writer = js.native
  /**
    * Creates an Operation message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Operation
    */
  def fromObject(`object`: StringDictionary[js.Any]): Operation = js.native
  /**
    * Creates a plain object from an Operation message. Also converts values to other types if specified.
    * @param message Operation
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Operation): StringDictionary[js.Any] = js.native
  def toObject(message: Operation, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Operation message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

