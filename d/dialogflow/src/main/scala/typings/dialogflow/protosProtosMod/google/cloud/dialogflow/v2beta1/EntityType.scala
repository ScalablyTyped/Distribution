package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.EntityType.IEntity
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.EntityType.Kind
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EntityType. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType")
@js.native
/**
  * Constructs a new EntityType.
  * @param [properties] Properties to set
  */
open class EntityType ()
  extends StObject
     with IEntityType {
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
  def toJSON(): StringDictionary[Any] = js.native
}
object EntityType {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait AutoExpansionMode extends StObject
  /** AutoExpansionMode enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode")
  @js.native
  object AutoExpansionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AutoExpansionMode & Double] = js.native
    
    @js.native
    sealed trait AUTO_EXPANSION_MODE_DEFAULT
      extends StObject
         with AutoExpansionMode
    /* 1 */ val AUTO_EXPANSION_MODE_DEFAULT: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode.AUTO_EXPANSION_MODE_DEFAULT & Double = js.native
    
    @js.native
    sealed trait AUTO_EXPANSION_MODE_UNSPECIFIED
      extends StObject
         with AutoExpansionMode
    /* 0 */ val AUTO_EXPANSION_MODE_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode.AUTO_EXPANSION_MODE_UNSPECIFIED & Double = js.native
  }
  
  /** Represents an Entity. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity")
  @js.native
  /**
    * Constructs a new Entity.
    * @param [properties] Properties to set
    */
  open class Entity ()
    extends StObject
       with IEntity {
    def this(properties: IEntity) = this()
    
    /** Entity synonyms. */
    @JSName("synonyms")
    var synonyms_Entity: js.Array[String] = js.native
    
    /**
      * Converts this Entity to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** Entity value. */
    @JSName("value")
    var value_Entity: String = js.native
  }
  object Entity {
    
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Entity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Entity instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Entity instance
      */
    /* static member */
    inline def create(): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Entity]
    inline def create(properties: IEntity): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Entity]
    
    inline def decode(reader: js.typedarray.Uint8Array): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Entity]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Entity = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Entity]
    /**
      * Decodes an Entity message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Entity
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Entity]
    inline def decode(reader: Reader, length: Double): Entity = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Entity]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Entity]
    /**
      * Decodes an Entity message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Entity
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Entity]
    
    /**
      * Encodes the specified Entity message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.EntityType.Entity.verify|verify} messages.
      * @param message Entity message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IEntity): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IEntity, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Entity message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.EntityType.Entity.verify|verify} messages.
      * @param message Entity message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IEntity): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IEntity, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an Entity message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Entity
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Entity]
    
    /**
      * Creates a plain object from an Entity message. Also converts values to other types if specified.
      * @param message Entity
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Entity): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Entity, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies an Entity message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  @js.native
  sealed trait Kind extends StObject
  /** Kind enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Kind")
  @js.native
  object Kind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Kind & Double] = js.native
    
    @js.native
    sealed trait KIND_LIST
      extends StObject
         with Kind
    /* 2 */ val KIND_LIST: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.EntityType.Kind.KIND_LIST & Double = js.native
    
    @js.native
    sealed trait KIND_MAP
      extends StObject
         with Kind
    /* 1 */ val KIND_MAP: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.EntityType.Kind.KIND_MAP & Double = js.native
    
    @js.native
    sealed trait KIND_REGEXP
      extends StObject
         with Kind
    /* 3 */ val KIND_REGEXP: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.EntityType.Kind.KIND_REGEXP & Double = js.native
    
    @js.native
    sealed trait KIND_UNSPECIFIED
      extends StObject
         with Kind
    /* 0 */ val KIND_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.EntityType.Kind.KIND_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new EntityType instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EntityType instance
    */
  /* static member */
  inline def create(): EntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[EntityType]
  inline def create(properties: IEntityType): EntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[EntityType]
  
  inline def decode(reader: js.typedarray.Uint8Array): EntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EntityType]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): EntityType = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EntityType]
  /**
    * Decodes an EntityType message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EntityType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): EntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EntityType]
  inline def decode(reader: Reader, length: Double): EntityType = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EntityType]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): EntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EntityType]
  /**
    * Decodes an EntityType message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EntityType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): EntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EntityType]
  
  /**
    * Encodes the specified EntityType message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.EntityType.verify|verify} messages.
    * @param message EntityType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IEntityType): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IEntityType, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified EntityType message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.EntityType.verify|verify} messages.
    * @param message EntityType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IEntityType): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IEntityType, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an EntityType message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EntityType
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): EntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[EntityType]
  
  /**
    * Creates a plain object from an EntityType message. Also converts values to other types if specified.
    * @param message EntityType
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: EntityType): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: EntityType, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an EntityType message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of an Entity. */
  trait IEntity extends StObject {
    
    /** Entity synonyms */
    var synonyms: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /** Entity value */
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object IEntity {
    
    inline def apply(): IEntity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEntity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEntity] (val x: Self) extends AnyVal {
      
      inline def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
      
      inline def setSynonymsNull: Self = StObject.set(x, "synonyms", null)
      
      inline def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
      
      inline def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
