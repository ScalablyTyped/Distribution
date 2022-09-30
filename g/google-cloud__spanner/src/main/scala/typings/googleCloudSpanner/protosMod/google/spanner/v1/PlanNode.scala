package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.spanner.v1.PlanNode.IChildLink
import typings.googleCloudSpanner.protosMod.google.spanner.v1.PlanNode.Kind
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PlanNode. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.PlanNode")
@js.native
/**
  * Constructs a new PlanNode.
  * @param [properties] Properties to set
  */
open class PlanNode ()
  extends StObject
     with IPlanNode {
  def this(properties: IPlanNode) = this()
  
  /** PlanNode childLinks. */
  @JSName("childLinks")
  var childLinks_PlanNode: js.Array[IChildLink] = js.native
  
  /** PlanNode displayName. */
  @JSName("displayName")
  var displayName_PlanNode: String = js.native
  
  /** PlanNode index. */
  @JSName("index")
  var index_PlanNode: Double = js.native
  
  /** PlanNode kind. */
  @JSName("kind")
  var kind_PlanNode: Kind | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.v1.PlanNode.Kind * / any */ String) = js.native
  
  /**
    * Converts this PlanNode to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object PlanNode {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.PlanNode")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a ChildLink. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.PlanNode.ChildLink")
  @js.native
  /**
    * Constructs a new ChildLink.
    * @param [properties] Properties to set
    */
  open class ChildLink ()
    extends StObject
       with IChildLink {
    def this(properties: IChildLink) = this()
    
    /** ChildLink childIndex. */
    @JSName("childIndex")
    var childIndex_ChildLink: Double = js.native
    
    /**
      * Converts this ChildLink to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** ChildLink type. */
    @JSName("type")
    var type_ChildLink: String = js.native
    
    /** ChildLink variable. */
    @JSName("variable")
    var variable_ChildLink: String = js.native
  }
  object ChildLink {
    
    @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.PlanNode.ChildLink")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ChildLink instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ChildLink instance
      */
    /* static member */
    inline def create(): ChildLink = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ChildLink]
    inline def create(properties: IChildLink): ChildLink = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ChildLink]
    
    inline def decode(reader: js.typedarray.Uint8Array): ChildLink = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ChildLink]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): ChildLink = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ChildLink]
    /**
      * Decodes a ChildLink message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ChildLink
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): ChildLink = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ChildLink]
    inline def decode(reader: Reader, length: Double): ChildLink = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ChildLink]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): ChildLink = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ChildLink]
    /**
      * Decodes a ChildLink message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ChildLink
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): ChildLink = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ChildLink]
    
    /**
      * Encodes the specified ChildLink message. Does not implicitly {@link google.spanner.v1.PlanNode.ChildLink.verify|verify} messages.
      * @param message ChildLink message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IChildLink): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IChildLink, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ChildLink message, length delimited. Does not implicitly {@link google.spanner.v1.PlanNode.ChildLink.verify|verify} messages.
      * @param message ChildLink message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IChildLink): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IChildLink, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ChildLink message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ChildLink
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): ChildLink = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ChildLink]
    
    /**
      * Gets the default type url for ChildLink
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a ChildLink message. Also converts values to other types if specified.
      * @param message ChildLink
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ChildLink): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: ChildLink, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a ChildLink message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  @js.native
  sealed trait Kind extends StObject
  /** Kind enum. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.PlanNode.Kind")
  @js.native
  object Kind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Kind & Double] = js.native
    
    @js.native
    sealed trait KIND_UNSPECIFIED
      extends StObject
         with Kind
    /* 0 */ val KIND_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.v1.PlanNode.Kind.KIND_UNSPECIFIED & Double = js.native
    
    @js.native
    sealed trait RELATIONAL
      extends StObject
         with Kind
    /* 1 */ val RELATIONAL: typings.googleCloudSpanner.protosMod.google.spanner.v1.PlanNode.Kind.RELATIONAL & Double = js.native
    
    @js.native
    sealed trait SCALAR
      extends StObject
         with Kind
    /* 2 */ val SCALAR: typings.googleCloudSpanner.protosMod.google.spanner.v1.PlanNode.Kind.SCALAR & Double = js.native
  }
  
  /** Represents a ShortRepresentation. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.PlanNode.ShortRepresentation")
  @js.native
  /**
    * Constructs a new ShortRepresentation.
    * @param [properties] Properties to set
    */
  open class ShortRepresentation ()
    extends StObject
       with IShortRepresentation {
    def this(properties: IShortRepresentation) = this()
    
    /** ShortRepresentation description. */
    @JSName("description")
    var description_ShortRepresentation: String = js.native
    
    /** ShortRepresentation subqueries. */
    @JSName("subqueries")
    var subqueries_ShortRepresentation: StringDictionary[Double] = js.native
    
    /**
      * Converts this ShortRepresentation to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object ShortRepresentation {
    
    @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.PlanNode.ShortRepresentation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ShortRepresentation instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ShortRepresentation instance
      */
    /* static member */
    inline def create(): ShortRepresentation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ShortRepresentation]
    inline def create(properties: IShortRepresentation): ShortRepresentation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ShortRepresentation]
    
    inline def decode(reader: js.typedarray.Uint8Array): ShortRepresentation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ShortRepresentation]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): ShortRepresentation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ShortRepresentation]
    /**
      * Decodes a ShortRepresentation message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ShortRepresentation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): ShortRepresentation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ShortRepresentation]
    inline def decode(reader: Reader, length: Double): ShortRepresentation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ShortRepresentation]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): ShortRepresentation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ShortRepresentation]
    /**
      * Decodes a ShortRepresentation message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ShortRepresentation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): ShortRepresentation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ShortRepresentation]
    
    /**
      * Encodes the specified ShortRepresentation message. Does not implicitly {@link google.spanner.v1.PlanNode.ShortRepresentation.verify|verify} messages.
      * @param message ShortRepresentation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IShortRepresentation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IShortRepresentation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ShortRepresentation message, length delimited. Does not implicitly {@link google.spanner.v1.PlanNode.ShortRepresentation.verify|verify} messages.
      * @param message ShortRepresentation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IShortRepresentation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IShortRepresentation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ShortRepresentation message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ShortRepresentation
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): ShortRepresentation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ShortRepresentation]
    
    /**
      * Gets the default type url for ShortRepresentation
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a ShortRepresentation message. Also converts values to other types if specified.
      * @param message ShortRepresentation
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ShortRepresentation): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: ShortRepresentation, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a ShortRepresentation message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new PlanNode instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PlanNode instance
    */
  /* static member */
  inline def create(): PlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PlanNode]
  inline def create(properties: IPlanNode): PlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PlanNode]
  
  inline def decode(reader: js.typedarray.Uint8Array): PlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PlanNode]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): PlanNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PlanNode]
  /**
    * Decodes a PlanNode message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PlanNode
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): PlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PlanNode]
  inline def decode(reader: Reader, length: Double): PlanNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PlanNode]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): PlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PlanNode]
  /**
    * Decodes a PlanNode message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PlanNode
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): PlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PlanNode]
  
  /**
    * Encodes the specified PlanNode message. Does not implicitly {@link google.spanner.v1.PlanNode.verify|verify} messages.
    * @param message PlanNode message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IPlanNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPlanNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PlanNode message, length delimited. Does not implicitly {@link google.spanner.v1.PlanNode.verify|verify} messages.
    * @param message PlanNode message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IPlanNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPlanNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PlanNode message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PlanNode
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): PlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PlanNode]
  
  /**
    * Gets the default type url for PlanNode
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a PlanNode message. Also converts values to other types if specified.
    * @param message PlanNode
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: PlanNode): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: PlanNode, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a PlanNode message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a ChildLink. */
  trait IChildLink extends StObject {
    
    /** ChildLink childIndex */
    var childIndex: js.UndefOr[Double | Null] = js.undefined
    
    /** ChildLink type */
    var `type`: js.UndefOr[String | Null] = js.undefined
    
    /** ChildLink variable */
    var variable: js.UndefOr[String | Null] = js.undefined
  }
  object IChildLink {
    
    inline def apply(): IChildLink = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IChildLink]
    }
    
    extension [Self <: IChildLink](x: Self) {
      
      inline def setChildIndex(value: Double): Self = StObject.set(x, "childIndex", value.asInstanceOf[js.Any])
      
      inline def setChildIndexNull: Self = StObject.set(x, "childIndex", null)
      
      inline def setChildIndexUndefined: Self = StObject.set(x, "childIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
      
      inline def setVariableNull: Self = StObject.set(x, "variable", null)
      
      inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    }
  }
  
  /** Properties of a ShortRepresentation. */
  trait IShortRepresentation extends StObject {
    
    /** ShortRepresentation description */
    var description: js.UndefOr[String | Null] = js.undefined
    
    /** ShortRepresentation subqueries */
    var subqueries: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
  }
  object IShortRepresentation {
    
    inline def apply(): IShortRepresentation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShortRepresentation]
    }
    
    extension [Self <: IShortRepresentation](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setSubqueries(value: StringDictionary[Double]): Self = StObject.set(x, "subqueries", value.asInstanceOf[js.Any])
      
      inline def setSubqueriesNull: Self = StObject.set(x, "subqueries", null)
      
      inline def setSubqueriesUndefined: Self = StObject.set(x, "subqueries", js.undefined)
    }
  }
}
