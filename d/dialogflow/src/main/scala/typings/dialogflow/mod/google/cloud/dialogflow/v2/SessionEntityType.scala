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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SessionEntityType. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType")
@js.native
/**
  * Constructs a new SessionEntityType.
  * @param [properties] Properties to set
  */
class SessionEntityType ()
  extends StObject
     with ISessionEntityType {
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
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait EntityOverrideMode extends StObject
  /** EntityOverrideMode enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode")
  @js.native
  object EntityOverrideMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EntityOverrideMode & Double] = js.native
    
    @js.native
    sealed trait ENTITY_OVERRIDE_MODE_OVERRIDE
      extends StObject
         with EntityOverrideMode
    /* 1 */ val ENTITY_OVERRIDE_MODE_OVERRIDE: typings.dialogflow.mod.google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode.ENTITY_OVERRIDE_MODE_OVERRIDE & Double = js.native
    
    @js.native
    sealed trait ENTITY_OVERRIDE_MODE_SUPPLEMENT
      extends StObject
         with EntityOverrideMode
    /* 2 */ val ENTITY_OVERRIDE_MODE_SUPPLEMENT: typings.dialogflow.mod.google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode.ENTITY_OVERRIDE_MODE_SUPPLEMENT & Double = js.native
    
    @js.native
    sealed trait ENTITY_OVERRIDE_MODE_UNSPECIFIED
      extends StObject
         with EntityOverrideMode
    /* 0 */ val ENTITY_OVERRIDE_MODE_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode.ENTITY_OVERRIDE_MODE_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new SessionEntityType instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SessionEntityType instance
    */
  /* static member */
  @scala.inline
  def create(): SessionEntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SessionEntityType]
  @scala.inline
  def create(properties: ISessionEntityType): SessionEntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SessionEntityType]
  
  /**
    * Decodes a SessionEntityType message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SessionEntityType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): SessionEntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SessionEntityType]
  @scala.inline
  def decode(reader: Reader, length: Double): SessionEntityType = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SessionEntityType]
  @scala.inline
  def decode(reader: Uint8Array): SessionEntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SessionEntityType]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): SessionEntityType = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SessionEntityType]
  
  /**
    * Decodes a SessionEntityType message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SessionEntityType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): SessionEntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SessionEntityType]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): SessionEntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SessionEntityType]
  
  /**
    * Encodes the specified SessionEntityType message. Does not implicitly {@link google.cloud.dialogflow.v2.SessionEntityType.verify|verify} messages.
    * @param message SessionEntityType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ISessionEntityType): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ISessionEntityType, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SessionEntityType message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.SessionEntityType.verify|verify} messages.
    * @param message SessionEntityType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ISessionEntityType): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ISessionEntityType, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SessionEntityType message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SessionEntityType
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): SessionEntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SessionEntityType]
  
  /**
    * Creates a plain object from a SessionEntityType message. Also converts values to other types if specified.
    * @param message SessionEntityType
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: SessionEntityType): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: SessionEntityType, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a SessionEntityType message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
