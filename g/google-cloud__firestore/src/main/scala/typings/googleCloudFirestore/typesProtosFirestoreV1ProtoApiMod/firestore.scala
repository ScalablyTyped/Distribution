package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.document
import typings.googleCloudFirestore.googleCloudFirestoreStrings.documentMetadata
import typings.googleCloudFirestore.googleCloudFirestoreStrings.metadata
import typings.googleCloudFirestore.googleCloudFirestoreStrings.namedQuery
import typings.googleCloudFirestore.googleCloudFirestoreStrings.structuredQuery
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.firestore.BundledQuery.LimitType
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.IDocument
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.IStructuredQuery
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf.ITimestamp
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestore {
  
  /** Represents a BundleElement. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "firestore.BundleElement")
  @js.native
  /**
    * Constructs a new BundleElement.
    * @param [properties] Properties to set
    */
  open class BundleElement ()
    extends StObject
       with IBundleElement {
    def this(properties: IBundleElement) = this()
    
    /** BundleElement elementType. */
    var elementType: js.UndefOr[metadata | namedQuery | documentMetadata | document] = js.native
    
    /**
      * Converts this BundleElement to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object BundleElement {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "firestore.BundleElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a BundleElement message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns BundleElement
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): BundleElement = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BundleElement]
    
    /**
      * Creates a plain object from a BundleElement message. Also converts values to other types if specified.
      * @param message BundleElement
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: BundleElement): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: BundleElement, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a BundleMetadata. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "firestore.BundleMetadata")
  @js.native
  /**
    * Constructs a new BundleMetadata.
    * @param [properties] Properties to set
    */
  open class BundleMetadata ()
    extends StObject
       with IBundleMetadata {
    def this(properties: IBundleMetadata) = this()
    
    /** BundleMetadata id. */
    @JSName("id")
    var id_BundleMetadata: String = js.native
    
    /**
      * Converts this BundleMetadata to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** BundleMetadata totalBytes. */
    @JSName("totalBytes")
    var totalBytes_BundleMetadata: Double | String = js.native
    
    /** BundleMetadata totalDocuments. */
    @JSName("totalDocuments")
    var totalDocuments_BundleMetadata: Double = js.native
    
    /** BundleMetadata version. */
    @JSName("version")
    var version_BundleMetadata: Double = js.native
  }
  object BundleMetadata {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "firestore.BundleMetadata")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a BundleMetadata message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns BundleMetadata
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): BundleMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BundleMetadata]
    
    /**
      * Creates a plain object from a BundleMetadata message. Also converts values to other types if specified.
      * @param message BundleMetadata
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: BundleMetadata): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: BundleMetadata, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a BundledDocumentMetadata. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "firestore.BundledDocumentMetadata")
  @js.native
  /**
    * Constructs a new BundledDocumentMetadata.
    * @param [properties] Properties to set
    */
  open class BundledDocumentMetadata ()
    extends StObject
       with IBundledDocumentMetadata {
    def this(properties: IBundledDocumentMetadata) = this()
    
    /** BundledDocumentMetadata exists. */
    @JSName("exists")
    var exists_BundledDocumentMetadata: Boolean = js.native
    
    /** BundledDocumentMetadata name. */
    @JSName("name")
    var name_BundledDocumentMetadata: String = js.native
    
    /** BundledDocumentMetadata queries. */
    @JSName("queries")
    var queries_BundledDocumentMetadata: js.Array[String] = js.native
    
    /**
      * Converts this BundledDocumentMetadata to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object BundledDocumentMetadata {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "firestore.BundledDocumentMetadata")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a BundledDocumentMetadata message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns BundledDocumentMetadata
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): BundledDocumentMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BundledDocumentMetadata]
    
    /**
      * Creates a plain object from a BundledDocumentMetadata message. Also converts values to other types if specified.
      * @param message BundledDocumentMetadata
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: BundledDocumentMetadata): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: BundledDocumentMetadata, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a BundledQuery. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "firestore.BundledQuery")
  @js.native
  /**
    * Constructs a new BundledQuery.
    * @param [properties] Properties to set
    */
  open class BundledQuery ()
    extends StObject
       with IBundledQuery {
    def this(properties: IBundledQuery) = this()
    
    /** BundledQuery limitType. */
    @JSName("limitType")
    var limitType_BundledQuery: LimitType = js.native
    
    /** BundledQuery parent. */
    @JSName("parent")
    var parent_BundledQuery: String = js.native
    
    /** BundledQuery queryType. */
    var queryType: js.UndefOr[structuredQuery] = js.native
    
    /**
      * Converts this BundledQuery to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object BundledQuery {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "firestore.BundledQuery")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a BundledQuery message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns BundledQuery
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): BundledQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BundledQuery]
    
    /**
      * Creates a plain object from a BundledQuery message. Also converts values to other types if specified.
      * @param message BundledQuery
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: BundledQuery): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: BundledQuery, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /** LimitType enum. */
    /* Rewritten from type alias, can be one of: 
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.FIRST
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.LAST
    */
    trait LimitType extends StObject
    object LimitType {
      
      inline def FIRST: typings.googleCloudFirestore.googleCloudFirestoreStrings.FIRST = "FIRST".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.FIRST]
      
      inline def LAST: typings.googleCloudFirestore.googleCloudFirestoreStrings.LAST = "LAST".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.LAST]
    }
  }
  
  /** Represents a NamedQuery. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "firestore.NamedQuery")
  @js.native
  /**
    * Constructs a new NamedQuery.
    * @param [properties] Properties to set
    */
  open class NamedQuery ()
    extends StObject
       with INamedQuery {
    def this(properties: INamedQuery) = this()
    
    /** NamedQuery name. */
    @JSName("name")
    var name_NamedQuery: String = js.native
    
    /**
      * Converts this NamedQuery to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object NamedQuery {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "firestore.NamedQuery")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a NamedQuery message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns NamedQuery
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): NamedQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[NamedQuery]
    
    /**
      * Creates a plain object from a NamedQuery message. Also converts values to other types if specified.
      * @param message NamedQuery
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: NamedQuery): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: NamedQuery, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Properties of a BundleElement. */
  trait IBundleElement extends StObject {
    
    /** BundleElement document */
    var document: js.UndefOr[IDocument | Null] = js.undefined
    
    /** BundleElement documentMetadata */
    var documentMetadata: js.UndefOr[IBundledDocumentMetadata | Null] = js.undefined
    
    /** BundleElement metadata */
    var metadata: js.UndefOr[IBundleMetadata | Null] = js.undefined
    
    /** BundleElement namedQuery */
    var namedQuery: js.UndefOr[INamedQuery | Null] = js.undefined
  }
  object IBundleElement {
    
    inline def apply(): IBundleElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBundleElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBundleElement] (val x: Self) extends AnyVal {
      
      inline def setDocument(value: IDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentMetadata(value: IBundledDocumentMetadata): Self = StObject.set(x, "documentMetadata", value.asInstanceOf[js.Any])
      
      inline def setDocumentMetadataNull: Self = StObject.set(x, "documentMetadata", null)
      
      inline def setDocumentMetadataUndefined: Self = StObject.set(x, "documentMetadata", js.undefined)
      
      inline def setDocumentNull: Self = StObject.set(x, "document", null)
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setMetadata(value: IBundleMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setNamedQuery(value: INamedQuery): Self = StObject.set(x, "namedQuery", value.asInstanceOf[js.Any])
      
      inline def setNamedQueryNull: Self = StObject.set(x, "namedQuery", null)
      
      inline def setNamedQueryUndefined: Self = StObject.set(x, "namedQuery", js.undefined)
    }
  }
  
  /** Properties of a BundleMetadata. */
  trait IBundleMetadata extends StObject {
    
    /** BundleMetadata createTime */
    var createTime: js.UndefOr[ITimestamp | Null] = js.undefined
    
    /** BundleMetadata id */
    var id: js.UndefOr[String | Null] = js.undefined
    
    /** BundleMetadata totalBytes */
    var totalBytes: js.UndefOr[Double | String | Null] = js.undefined
    
    /** BundleMetadata totalDocuments */
    var totalDocuments: js.UndefOr[Double | Null] = js.undefined
    
    /** BundleMetadata version */
    var version: js.UndefOr[Double | Null] = js.undefined
  }
  object IBundleMetadata {
    
    inline def apply(): IBundleMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBundleMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBundleMetadata] (val x: Self) extends AnyVal {
      
      inline def setCreateTime(value: ITimestamp): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
      
      inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setTotalBytes(value: Double | String): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
      
      inline def setTotalBytesNull: Self = StObject.set(x, "totalBytes", null)
      
      inline def setTotalBytesUndefined: Self = StObject.set(x, "totalBytes", js.undefined)
      
      inline def setTotalDocuments(value: Double): Self = StObject.set(x, "totalDocuments", value.asInstanceOf[js.Any])
      
      inline def setTotalDocumentsNull: Self = StObject.set(x, "totalDocuments", null)
      
      inline def setTotalDocumentsUndefined: Self = StObject.set(x, "totalDocuments", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /** Properties of a BundledDocumentMetadata. */
  trait IBundledDocumentMetadata extends StObject {
    
    /** BundledDocumentMetadata exists */
    var exists: js.UndefOr[Boolean | Null] = js.undefined
    
    /** BundledDocumentMetadata name */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /** BundledDocumentMetadata queries */
    var queries: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /** BundledDocumentMetadata readTime */
    var readTime: js.UndefOr[ITimestamp | Null] = js.undefined
  }
  object IBundledDocumentMetadata {
    
    inline def apply(): IBundledDocumentMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBundledDocumentMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBundledDocumentMetadata] (val x: Self) extends AnyVal {
      
      inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setExistsNull: Self = StObject.set(x, "exists", null)
      
      inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setQueries(value: js.Array[String]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setQueriesNull: Self = StObject.set(x, "queries", null)
      
      inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
      
      inline def setQueriesVarargs(value: String*): Self = StObject.set(x, "queries", js.Array(value*))
      
      inline def setReadTime(value: ITimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
      
      inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
      
      inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    }
  }
  
  /** Properties of a BundledQuery. */
  trait IBundledQuery extends StObject {
    
    /** BundledQuery limitType */
    var limitType: js.UndefOr[LimitType | Null] = js.undefined
    
    /** BundledQuery parent */
    var parent: js.UndefOr[String | Null] = js.undefined
    
    /** BundledQuery structuredQuery */
    var structuredQuery: js.UndefOr[IStructuredQuery | Null] = js.undefined
  }
  object IBundledQuery {
    
    inline def apply(): IBundledQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBundledQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBundledQuery] (val x: Self) extends AnyVal {
      
      inline def setLimitType(value: LimitType): Self = StObject.set(x, "limitType", value.asInstanceOf[js.Any])
      
      inline def setLimitTypeNull: Self = StObject.set(x, "limitType", null)
      
      inline def setLimitTypeUndefined: Self = StObject.set(x, "limitType", js.undefined)
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setStructuredQuery(value: IStructuredQuery): Self = StObject.set(x, "structuredQuery", value.asInstanceOf[js.Any])
      
      inline def setStructuredQueryNull: Self = StObject.set(x, "structuredQuery", null)
      
      inline def setStructuredQueryUndefined: Self = StObject.set(x, "structuredQuery", js.undefined)
    }
  }
  
  /** Properties of a NamedQuery. */
  trait INamedQuery extends StObject {
    
    /** NamedQuery bundledQuery */
    var bundledQuery: js.UndefOr[IBundledQuery | Null] = js.undefined
    
    /** NamedQuery name */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /** NamedQuery readTime */
    var readTime: js.UndefOr[ITimestamp | Null] = js.undefined
  }
  object INamedQuery {
    
    inline def apply(): INamedQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INamedQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INamedQuery] (val x: Self) extends AnyVal {
      
      inline def setBundledQuery(value: IBundledQuery): Self = StObject.set(x, "bundledQuery", value.asInstanceOf[js.Any])
      
      inline def setBundledQueryNull: Self = StObject.set(x, "bundledQuery", null)
      
      inline def setBundledQueryUndefined: Self = StObject.set(x, "bundledQuery", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReadTime(value: ITimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
      
      inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
      
      inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    }
  }
}
