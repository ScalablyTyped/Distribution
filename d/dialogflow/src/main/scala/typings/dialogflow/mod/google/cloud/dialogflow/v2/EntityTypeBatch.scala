package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object EntityTypeBatch {
  
  /**
    * Creates a new EntityTypeBatch instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EntityTypeBatch instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.create")
  @js.native
  def create(): EntityTypeBatch = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.create")
  @js.native
  def create(properties: IEntityTypeBatch): EntityTypeBatch = js.native
  
  /**
    * Decodes an EntityTypeBatch message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EntityTypeBatch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.decode")
  @js.native
  def decode(reader: Reader): EntityTypeBatch = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.decode")
  @js.native
  def decode(reader: Reader, length: Double): EntityTypeBatch = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.decode")
  @js.native
  def decode(reader: Uint8Array): EntityTypeBatch = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): EntityTypeBatch = js.native
  
  /**
    * Decodes an EntityTypeBatch message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EntityTypeBatch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): EntityTypeBatch = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): EntityTypeBatch = js.native
  
  /**
    * Encodes the specified EntityTypeBatch message. Does not implicitly {@link google.cloud.dialogflow.v2.EntityTypeBatch.verify|verify} messages.
    * @param message EntityTypeBatch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.encode")
  @js.native
  def encode(message: IEntityTypeBatch): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.encode")
  @js.native
  def encode(message: IEntityTypeBatch, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EntityTypeBatch message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.EntityTypeBatch.verify|verify} messages.
    * @param message EntityTypeBatch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEntityTypeBatch): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEntityTypeBatch, writer: Writer): Writer = js.native
  
  /**
    * Creates an EntityTypeBatch message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EntityTypeBatch
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): EntityTypeBatch = js.native
  
  /**
    * Creates a plain object from an EntityTypeBatch message. Also converts values to other types if specified.
    * @param message EntityTypeBatch
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.toObject")
  @js.native
  def toObject(message: EntityTypeBatch): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.toObject")
  @js.native
  def toObject(message: EntityTypeBatch, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an EntityTypeBatch message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityTypeBatch.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
