package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.IEntity
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.Kind
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EntityType. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType")
@js.native
/**
  * Constructs a new EntityType.
  * @param [properties] Properties to set
  */
class EntityType () extends IEntityType {
  def this(properties: IEntityType) = this()
  
  /** EntityType autoExpansionMode. */
  @JSName("autoExpansionMode")
  var autoExpansionMode_EntityType: AutoExpansionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode * / any */ String) = js.native
  
  /** EntityType displayName. */
  @JSName("displayName")
  var displayName_EntityType: String = js.native
  
  /** EntityType enableFuzzyExtraction. */
  @JSName("enableFuzzyExtraction")
  var enableFuzzyExtraction_EntityType: Boolean = js.native
  
  /** EntityType entities. */
  @JSName("entities")
  var entities_EntityType: js.Array[IEntity] = js.native
  
  /** EntityType kind. */
  @JSName("kind")
  var kind_EntityType: Kind | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.EntityType.Kind * / any */ String) = js.native
  
  /** EntityType name. */
  @JSName("name")
  var name_EntityType: String = js.native
  
  /**
    * Converts this EntityType to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object EntityType {
  
  @js.native
  sealed trait AutoExpansionMode extends StObject
  /** AutoExpansionMode enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode")
  @js.native
  object AutoExpansionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AutoExpansionMode with Double] = js.native
    
    @js.native
    sealed trait AUTO_EXPANSION_MODE_DEFAULT extends AutoExpansionMode
    /* 1 */ val AUTO_EXPANSION_MODE_DEFAULT: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode.AUTO_EXPANSION_MODE_DEFAULT with Double = js.native
    
    @js.native
    sealed trait AUTO_EXPANSION_MODE_UNSPECIFIED extends AutoExpansionMode
    /* 0 */ val AUTO_EXPANSION_MODE_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode.AUTO_EXPANSION_MODE_UNSPECIFIED with Double = js.native
  }
  
  /** Represents an Entity. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity")
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
    
    /**
      * Converts this Entity to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /** Entity value. */
    @JSName("value")
    var value_Entity: String = js.native
  }
  object Entity {
    
    /**
      * Creates a new Entity instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Entity instance
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.create")
    @js.native
    def create(): Entity = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.create")
    @js.native
    def create(properties: IEntity): Entity = js.native
    
    /**
      * Decodes an Entity message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Entity
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.decode")
    @js.native
    def decode(reader: Reader): Entity = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.decode")
    @js.native
    def decode(reader: Reader, length: Double): Entity = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.decode")
    @js.native
    def decode(reader: Uint8Array): Entity = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Entity = js.native
    
    /**
      * Decodes an Entity message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Entity
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Entity = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Entity = js.native
    
    /**
      * Encodes the specified Entity message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.EntityType.Entity.verify|verify} messages.
      * @param message Entity message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.encode")
    @js.native
    def encode(message: IEntity): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.encode")
    @js.native
    def encode(message: IEntity, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Entity message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.EntityType.Entity.verify|verify} messages.
      * @param message Entity message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.encodeDelimited")
    @js.native
    def encodeDelimited(message: IEntity): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.encodeDelimited")
    @js.native
    def encodeDelimited(message: IEntity, writer: Writer): Writer = js.native
    
    /**
      * Creates an Entity message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Entity
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Entity = js.native
    
    /**
      * Creates a plain object from an Entity message. Also converts values to other types if specified.
      * @param message Entity
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.toObject")
    @js.native
    def toObject(message: Entity): StringDictionary[js.Any] = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.toObject")
    @js.native
    def toObject(message: Entity, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an Entity message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  @js.native
  sealed trait Kind extends StObject
  /** Kind enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Kind")
  @js.native
  object Kind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Kind with Double] = js.native
    
    @js.native
    sealed trait KIND_LIST extends Kind
    /* 2 */ val KIND_LIST: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.Kind.KIND_LIST with Double = js.native
    
    @js.native
    sealed trait KIND_MAP extends Kind
    /* 1 */ val KIND_MAP: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.Kind.KIND_MAP with Double = js.native
    
    @js.native
    sealed trait KIND_REGEXP extends Kind
    /* 3 */ val KIND_REGEXP: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.Kind.KIND_REGEXP with Double = js.native
    
    @js.native
    sealed trait KIND_UNSPECIFIED extends Kind
    /* 0 */ val KIND_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.Kind.KIND_UNSPECIFIED with Double = js.native
  }
  
  /**
    * Creates a new EntityType instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EntityType instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.create")
  @js.native
  def create(): EntityType = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.create")
  @js.native
  def create(properties: IEntityType): EntityType = js.native
  
  /**
    * Decodes an EntityType message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EntityType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.decode")
  @js.native
  def decode(reader: Reader): EntityType = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.decode")
  @js.native
  def decode(reader: Reader, length: Double): EntityType = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.decode")
  @js.native
  def decode(reader: Uint8Array): EntityType = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): EntityType = js.native
  
  /**
    * Decodes an EntityType message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EntityType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): EntityType = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): EntityType = js.native
  
  /**
    * Encodes the specified EntityType message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.EntityType.verify|verify} messages.
    * @param message EntityType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.encode")
  @js.native
  def encode(message: IEntityType): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.encode")
  @js.native
  def encode(message: IEntityType, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EntityType message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.EntityType.verify|verify} messages.
    * @param message EntityType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEntityType): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEntityType, writer: Writer): Writer = js.native
  
  /**
    * Creates an EntityType message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EntityType
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): EntityType = js.native
  
  /**
    * Creates a plain object from an EntityType message. Also converts values to other types if specified.
    * @param message EntityType
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.toObject")
  @js.native
  def toObject(message: EntityType): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.toObject")
  @js.native
  def toObject(message: EntityType, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an EntityType message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of an Entity. */
  @js.native
  trait IEntity extends StObject {
    
    /** Entity synonyms */
    var synonyms: js.UndefOr[js.Array[String] | Null] = js.native
    
    /** Entity value */
    var value: js.UndefOr[String | Null] = js.native
  }
  object IEntity {
    
    @scala.inline
    def apply(): IEntity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEntity]
    }
    
    @scala.inline
    implicit class IEntityMutableBuilder[Self <: IEntity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynonymsNull: Self = StObject.set(x, "synonyms", null)
      
      @scala.inline
      def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
      
      @scala.inline
      def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
