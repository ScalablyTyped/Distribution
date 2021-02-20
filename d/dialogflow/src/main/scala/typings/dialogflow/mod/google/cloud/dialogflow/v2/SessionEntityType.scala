package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2.EntityType.IEntity
import typings.dialogflow.mod.google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SessionEntityType. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType")
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
  var entityOverrideMode_SessionEntityType: EntityOverrideMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode * / any */ String) = js.native
  
  /** SessionEntityType name. */
  @JSName("name")
  var name_SessionEntityType: String = js.native
  
  /**
    * Converts this SessionEntityType to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SessionEntityType {
  
  @js.native
  sealed trait EntityOverrideMode extends StObject
  /** EntityOverrideMode enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode")
  @js.native
  object EntityOverrideMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EntityOverrideMode with Double] = js.native
    
    @js.native
    sealed trait ENTITY_OVERRIDE_MODE_OVERRIDE extends EntityOverrideMode
    /* 1 */ val ENTITY_OVERRIDE_MODE_OVERRIDE: typings.dialogflow.mod.google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode.ENTITY_OVERRIDE_MODE_OVERRIDE with Double = js.native
    
    @js.native
    sealed trait ENTITY_OVERRIDE_MODE_SUPPLEMENT extends EntityOverrideMode
    /* 2 */ val ENTITY_OVERRIDE_MODE_SUPPLEMENT: typings.dialogflow.mod.google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode.ENTITY_OVERRIDE_MODE_SUPPLEMENT with Double = js.native
    
    @js.native
    sealed trait ENTITY_OVERRIDE_MODE_UNSPECIFIED extends EntityOverrideMode
    /* 0 */ val ENTITY_OVERRIDE_MODE_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode.ENTITY_OVERRIDE_MODE_UNSPECIFIED with Double = js.native
  }
  
  /**
    * Creates a new SessionEntityType instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SessionEntityType instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.create")
  @js.native
  def create(): SessionEntityType = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.create")
  @js.native
  def create(properties: ISessionEntityType): SessionEntityType = js.native
  
  /**
    * Decodes a SessionEntityType message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SessionEntityType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.decode")
  @js.native
  def decode(reader: Reader): SessionEntityType = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.decode")
  @js.native
  def decode(reader: Reader, length: Double): SessionEntityType = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.decode")
  @js.native
  def decode(reader: Uint8Array): SessionEntityType = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): SessionEntityType = js.native
  
  /**
    * Decodes a SessionEntityType message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SessionEntityType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SessionEntityType = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): SessionEntityType = js.native
  
  /**
    * Encodes the specified SessionEntityType message. Does not implicitly {@link google.cloud.dialogflow.v2.SessionEntityType.verify|verify} messages.
    * @param message SessionEntityType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.encode")
  @js.native
  def encode(message: ISessionEntityType): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.encode")
  @js.native
  def encode(message: ISessionEntityType, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SessionEntityType message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.SessionEntityType.verify|verify} messages.
    * @param message SessionEntityType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISessionEntityType): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISessionEntityType, writer: Writer): Writer = js.native
  
  /**
    * Creates a SessionEntityType message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SessionEntityType
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SessionEntityType = js.native
  
  /**
    * Creates a plain object from a SessionEntityType message. Also converts values to other types if specified.
    * @param message SessionEntityType
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.toObject")
  @js.native
  def toObject(message: SessionEntityType): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.toObject")
  @js.native
  def toObject(message: SessionEntityType, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SessionEntityType message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
