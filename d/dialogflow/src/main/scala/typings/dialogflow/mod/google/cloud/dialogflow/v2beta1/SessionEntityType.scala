package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.IEntity
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.SessionEntityType.EntityOverrideMode
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SessionEntityType. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SessionEntityType")
@js.native
/**
  * Constructs a new SessionEntityType.
  * @param [properties] Properties to set
  */
class SessionEntityType () extends ISessionEntityType {
  def this(properties: ISessionEntityType) = this()
  /** SessionEntityType entities. */
  @JSName("entities")
  var entities_SessionEntityType: js.Array[IEntity] = js.native
  /** SessionEntityType entityOverrideMode. */
  @JSName("entityOverrideMode")
  var entityOverrideMode_SessionEntityType: EntityOverrideMode = js.native
  /** SessionEntityType name. */
  @JSName("name")
  var name_SessionEntityType: String = js.native
  /**
    * Converts this SessionEntityType to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SessionEntityType")
@js.native
object SessionEntityType extends js.Object {
  @js.native
  sealed trait EntityOverrideMode extends js.Object
  
  /**
    * Creates a new SessionEntityType instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SessionEntityType instance
    */
  def create(): SessionEntityType = js.native
  def create(properties: ISessionEntityType): SessionEntityType = js.native
  /**
    * Decodes a SessionEntityType message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SessionEntityType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): SessionEntityType = js.native
  def decode(reader: Reader, length: Double): SessionEntityType = js.native
  def decode(reader: Uint8Array): SessionEntityType = js.native
  def decode(reader: Uint8Array, length: Double): SessionEntityType = js.native
  /**
    * Decodes a SessionEntityType message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SessionEntityType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): SessionEntityType = js.native
  def decodeDelimited(reader: Uint8Array): SessionEntityType = js.native
  /**
    * Encodes the specified SessionEntityType message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SessionEntityType.verify|verify} messages.
    * @param message SessionEntityType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISessionEntityType): Writer = js.native
  def encode(message: ISessionEntityType, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SessionEntityType message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SessionEntityType.verify|verify} messages.
    * @param message SessionEntityType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISessionEntityType): Writer = js.native
  def encodeDelimited(message: ISessionEntityType, writer: Writer): Writer = js.native
  /**
    * Creates a SessionEntityType message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SessionEntityType
    */
  def fromObject(`object`: StringDictionary[js.Any]): SessionEntityType = js.native
  /**
    * Creates a plain object from a SessionEntityType message. Also converts values to other types if specified.
    * @param message SessionEntityType
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: SessionEntityType): StringDictionary[js.Any] = js.native
  def toObject(message: SessionEntityType, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SessionEntityType message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** EntityOverrideMode enum. */
  @js.native
  object EntityOverrideMode extends js.Object {
    @js.native
    sealed trait ENTITY_OVERRIDE_MODE_OVERRIDE extends EntityOverrideMode
    
    @js.native
    sealed trait ENTITY_OVERRIDE_MODE_SUPPLEMENT extends EntityOverrideMode
    
    @js.native
    sealed trait ENTITY_OVERRIDE_MODE_UNSPECIFIED extends EntityOverrideMode
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EntityOverrideMode with Double] = js.native
    /* 1 */ @js.native
    object ENTITY_OVERRIDE_MODE_OVERRIDE extends TopLevel[ENTITY_OVERRIDE_MODE_OVERRIDE with Double]
    
    /* 2 */ @js.native
    object ENTITY_OVERRIDE_MODE_SUPPLEMENT extends TopLevel[ENTITY_OVERRIDE_MODE_SUPPLEMENT with Double]
    
    /* 0 */ @js.native
    object ENTITY_OVERRIDE_MODE_UNSPECIFIED extends TopLevel[ENTITY_OVERRIDE_MODE_UNSPECIFIED with Double]
    
  }
  
}

