package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an EntityTypeBatch. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch")
@js.native
/**
  * Constructs a new EntityTypeBatch.
  * @param [properties] Properties to set
  */
class EntityTypeBatch () extends IEntityTypeBatch {
  def this(properties: IEntityTypeBatch) = this()
  /** EntityTypeBatch entityTypes. */
  @JSName("entityTypes")
  var entityTypes_EntityTypeBatch: js.Array[IEntityType] = js.native
  /**
    * Converts this EntityTypeBatch to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch")
@js.native
object EntityTypeBatch extends js.Object {
  /**
    * Creates a new EntityTypeBatch instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EntityTypeBatch instance
    */
  def create(): EntityTypeBatch = js.native
  def create(properties: IEntityTypeBatch): EntityTypeBatch = js.native
  /**
    * Decodes an EntityTypeBatch message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EntityTypeBatch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): EntityTypeBatch = js.native
  def decode(reader: Reader, length: Double): EntityTypeBatch = js.native
  def decode(reader: Uint8Array): EntityTypeBatch = js.native
  def decode(reader: Uint8Array, length: Double): EntityTypeBatch = js.native
  /**
    * Decodes an EntityTypeBatch message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EntityTypeBatch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): EntityTypeBatch = js.native
  def decodeDelimited(reader: Uint8Array): EntityTypeBatch = js.native
  /**
    * Encodes the specified EntityTypeBatch message. Does not implicitly {@link google.cloud.dialogflow.v2.EntityTypeBatch.verify|verify} messages.
    * @param message EntityTypeBatch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEntityTypeBatch): Writer = js.native
  def encode(message: IEntityTypeBatch, writer: Writer): Writer = js.native
  /**
    * Encodes the specified EntityTypeBatch message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.EntityTypeBatch.verify|verify} messages.
    * @param message EntityTypeBatch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEntityTypeBatch): Writer = js.native
  def encodeDelimited(message: IEntityTypeBatch, writer: Writer): Writer = js.native
  /**
    * Creates an EntityTypeBatch message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EntityTypeBatch
    */
  def fromObject(`object`: StringDictionary[js.Any]): EntityTypeBatch = js.native
  /**
    * Creates a plain object from an EntityTypeBatch message. Also converts values to other types if specified.
    * @param message EntityTypeBatch
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: EntityTypeBatch): StringDictionary[js.Any] = js.native
  def toObject(message: EntityTypeBatch, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an EntityTypeBatch message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

