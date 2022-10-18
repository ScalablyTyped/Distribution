package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.documents
import typings.googleCloudFirestore.googleCloudFirestoreStrings.query
import typings.googleCloudFirestore.googleCloudFirestoreStrings.readTime
import typings.googleCloudFirestore.googleCloudFirestoreStrings.resumeToken
import typings.googleCloudFirestore.googleCloudFirestoreStrings.structuredQuery
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Target. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.Target")
@js.native
/**
  * Constructs a new Target.
  * @param [properties] Properties to set
  */
open class Target ()
  extends StObject
     with ITarget {
  def this(properties: ITarget) = this()
  
  /** Target once. */
  @JSName("once")
  var once_Target: Boolean = js.native
  
  /** Target resumeType. */
  var resumeType: js.UndefOr[resumeToken | readTime] = js.native
  
  /** Target targetId. */
  @JSName("targetId")
  var targetId_Target: Double = js.native
  
  /** Target targetType. */
  var targetType: js.UndefOr[query | documents] = js.native
  
  /**
    * Converts this Target to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Target {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.Target")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a DocumentsTarget. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.Target.DocumentsTarget")
  @js.native
  /**
    * Constructs a new DocumentsTarget.
    * @param [properties] Properties to set
    */
  open class DocumentsTarget ()
    extends StObject
       with IDocumentsTarget {
    def this(properties: IDocumentsTarget) = this()
    
    /** DocumentsTarget documents. */
    @JSName("documents")
    var documents_DocumentsTarget: js.Array[String] = js.native
    
    /**
      * Converts this DocumentsTarget to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object DocumentsTarget {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.Target.DocumentsTarget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a DocumentsTarget message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns DocumentsTarget
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): DocumentsTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DocumentsTarget]
    
    /**
      * Creates a plain object from a DocumentsTarget message. Also converts values to other types if specified.
      * @param message DocumentsTarget
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: DocumentsTarget): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: DocumentsTarget, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a QueryTarget. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.Target.QueryTarget")
  @js.native
  /**
    * Constructs a new QueryTarget.
    * @param [properties] Properties to set
    */
  open class QueryTarget ()
    extends StObject
       with IQueryTarget {
    def this(properties: IQueryTarget) = this()
    
    /** QueryTarget parent. */
    @JSName("parent")
    var parent_QueryTarget: String = js.native
    
    /** QueryTarget queryType. */
    var queryType: js.UndefOr[structuredQuery] = js.native
    
    /**
      * Converts this QueryTarget to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object QueryTarget {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.Target.QueryTarget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a QueryTarget message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns QueryTarget
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): QueryTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[QueryTarget]
    
    /**
      * Creates a plain object from a QueryTarget message. Also converts values to other types if specified.
      * @param message QueryTarget
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: QueryTarget): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: QueryTarget, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /**
    * Creates a Target message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Target
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Target = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Target]
  
  /**
    * Creates a plain object from a Target message. Also converts values to other types if specified.
    * @param message Target
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Target): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Target, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /** Properties of a DocumentsTarget. */
  trait IDocumentsTarget extends StObject {
    
    /** DocumentsTarget documents */
    var documents: js.UndefOr[js.Array[String] | Null] = js.undefined
  }
  object IDocumentsTarget {
    
    inline def apply(): IDocumentsTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentsTarget]
    }
    
    extension [Self <: IDocumentsTarget](x: Self) {
      
      inline def setDocuments(value: js.Array[String]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
      
      inline def setDocumentsNull: Self = StObject.set(x, "documents", null)
      
      inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
      
      inline def setDocumentsVarargs(value: String*): Self = StObject.set(x, "documents", js.Array(value*))
    }
  }
  
  /** Properties of a QueryTarget. */
  trait IQueryTarget extends StObject {
    
    /** QueryTarget parent */
    var parent: js.UndefOr[String | Null] = js.undefined
    
    /** QueryTarget structuredQuery */
    var structuredQuery: js.UndefOr[IStructuredQuery | Null] = js.undefined
  }
  object IQueryTarget {
    
    inline def apply(): IQueryTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IQueryTarget]
    }
    
    extension [Self <: IQueryTarget](x: Self) {
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setStructuredQuery(value: IStructuredQuery): Self = StObject.set(x, "structuredQuery", value.asInstanceOf[js.Any])
      
      inline def setStructuredQueryNull: Self = StObject.set(x, "structuredQuery", null)
      
      inline def setStructuredQueryUndefined: Self = StObject.set(x, "structuredQuery", js.undefined)
    }
  }
}
