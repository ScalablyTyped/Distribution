package typings.dialogflow.mod.google.cloud.dialogflow.v2.EntityType

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Entity. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityType.Entity")
@js.native
/**
  * Constructs a new Entity.
  * @param [properties] Properties to set
  */
class Entity () extends IEntity {
  def this(properties: IEntity) = this()
  /** Entity synonyms. */
  @JSName("synonyms")
  var synonyms_Entity: js.Array[String] = js.native
  /** Entity value. */
  @JSName("value")
  var value_Entity: String = js.native
  /**
    * Converts this Entity to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityType.Entity")
@js.native
object Entity extends js.Object {
  /**
    * Creates a new Entity instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Entity instance
    */
  def create(): Entity = js.native
  def create(properties: IEntity): Entity = js.native
  /**
    * Decodes an Entity message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Entity
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Entity = js.native
  def decode(reader: Reader, length: Double): Entity = js.native
  def decode(reader: Uint8Array): Entity = js.native
  def decode(reader: Uint8Array, length: Double): Entity = js.native
  /**
    * Decodes an Entity message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Entity
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Entity = js.native
  def decodeDelimited(reader: Uint8Array): Entity = js.native
  /**
    * Encodes the specified Entity message. Does not implicitly {@link google.cloud.dialogflow.v2.EntityType.Entity.verify|verify} messages.
    * @param message Entity message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEntity): Writer = js.native
  def encode(message: IEntity, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Entity message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.EntityType.Entity.verify|verify} messages.
    * @param message Entity message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEntity): Writer = js.native
  def encodeDelimited(message: IEntity, writer: Writer): Writer = js.native
  /**
    * Creates an Entity message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Entity
    */
  def fromObject(`object`: StringDictionary[js.Any]): Entity = js.native
  /**
    * Creates a plain object from an Entity message. Also converts values to other types if specified.
    * @param message Entity
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Entity): StringDictionary[js.Any] = js.native
  def toObject(message: Entity, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Entity message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

