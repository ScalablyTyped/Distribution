package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an IntentBatch. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch")
@js.native
/**
  * Constructs a new IntentBatch.
  * @param [properties] Properties to set
  */
class IntentBatch () extends IIntentBatch {
  def this(properties: IIntentBatch) = this()
  /** IntentBatch intents. */
  @JSName("intents")
  var intents_IntentBatch: js.Array[IIntent] = js.native
  /**
    * Converts this IntentBatch to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch")
@js.native
object IntentBatch extends js.Object {
  /**
    * Creates a new IntentBatch instance using the specified properties.
    * @param [properties] Properties to set
    * @returns IntentBatch instance
    */
  def create(): IntentBatch = js.native
  def create(properties: IIntentBatch): IntentBatch = js.native
  /**
    * Decodes an IntentBatch message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns IntentBatch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): IntentBatch = js.native
  def decode(reader: Reader, length: Double): IntentBatch = js.native
  def decode(reader: Uint8Array): IntentBatch = js.native
  def decode(reader: Uint8Array, length: Double): IntentBatch = js.native
  /**
    * Decodes an IntentBatch message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns IntentBatch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): IntentBatch = js.native
  def decodeDelimited(reader: Uint8Array): IntentBatch = js.native
  /**
    * Encodes the specified IntentBatch message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.IntentBatch.verify|verify} messages.
    * @param message IntentBatch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IIntentBatch): Writer = js.native
  def encode(message: IIntentBatch, writer: Writer): Writer = js.native
  /**
    * Encodes the specified IntentBatch message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.IntentBatch.verify|verify} messages.
    * @param message IntentBatch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IIntentBatch): Writer = js.native
  def encodeDelimited(message: IIntentBatch, writer: Writer): Writer = js.native
  /**
    * Creates an IntentBatch message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns IntentBatch
    */
  def fromObject(`object`: StringDictionary[js.Any]): IntentBatch = js.native
  /**
    * Creates a plain object from an IntentBatch message. Also converts values to other types if specified.
    * @param message IntentBatch
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: IntentBatch): StringDictionary[js.Any] = js.native
  def toObject(message: IntentBatch, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an IntentBatch message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

