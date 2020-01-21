package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.IKnowledgeAnswers
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new KnowledgeAnswers instance using the specified properties.
    * @param [properties] Properties to set
    * @returns KnowledgeAnswers instance
    */
  def create(): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers = js.native
  def create(properties: IKnowledgeAnswers): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers = js.native
  /**
    * Decodes a KnowledgeAnswers message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns KnowledgeAnswers
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers = js.native
  def decode(reader: Reader, length: Double): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers = js.native
  def decode(reader: Uint8Array): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers = js.native
  def decode(reader: Uint8Array, length: Double): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers = js.native
  /**
    * Decodes a KnowledgeAnswers message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns KnowledgeAnswers
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers = js.native
  def decodeDelimited(reader: Uint8Array): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers = js.native
  /**
    * Encodes the specified KnowledgeAnswers message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeAnswers.verify|verify} messages.
    * @param message KnowledgeAnswers message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IKnowledgeAnswers): Writer = js.native
  def encode(message: IKnowledgeAnswers, writer: Writer): Writer = js.native
  /**
    * Encodes the specified KnowledgeAnswers message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeAnswers.verify|verify} messages.
    * @param message KnowledgeAnswers message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IKnowledgeAnswers): Writer = js.native
  def encodeDelimited(message: IKnowledgeAnswers, writer: Writer): Writer = js.native
  /**
    * Creates a KnowledgeAnswers message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns KnowledgeAnswers
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers = js.native
  /**
    * Creates a plain object from a KnowledgeAnswers message. Also converts values to other types if specified.
    * @param message KnowledgeAnswers
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a KnowledgeAnswers message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

