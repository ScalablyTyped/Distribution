package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.arrayConfig
import typings.googleCloudFirestore.googleCloudFirestoreStrings.order
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.IIndexField
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.IndexField.ArrayConfig
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.IndexField.Order
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.QueryScope
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.State
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Index. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Index")
@js.native
/**
  * Constructs a new Index.
  * @param [properties] Properties to set
  */
open class Index ()
  extends StObject
     with IIndex {
  def this(properties: IIndex) = this()
  
  /** Index fields. */
  @JSName("fields")
  var fields_Index: js.Array[IIndexField] = js.native
  
  /** Index name. */
  @JSName("name")
  var name_Index: String = js.native
  
  /** Index queryScope. */
  @JSName("queryScope")
  var queryScope_Index: QueryScope = js.native
  
  /** Index state. */
  @JSName("state")
  var state_Index: State = js.native
  
  /**
    * Converts this Index to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Index {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Index")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an IndexField. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Index.IndexField")
  @js.native
  /**
    * Constructs a new IndexField.
    * @param [properties] Properties to set
    */
  open class IndexField ()
    extends StObject
       with IIndexField {
    def this(properties: IIndexField) = this()
    
    /** IndexField fieldPath. */
    @JSName("fieldPath")
    var fieldPath_IndexField: String = js.native
    
    /**
      * Converts this IndexField to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** IndexField valueMode. */
    var valueMode: js.UndefOr[order | arrayConfig] = js.native
  }
  object IndexField {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Index.IndexField")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an IndexField message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns IndexField
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): IndexField = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[IndexField]
    
    /**
      * Creates a plain object from an IndexField message. Also converts values to other types if specified.
      * @param message IndexField
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: IndexField): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: IndexField, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /** ArrayConfig enum. */
    /* Rewritten from type alias, can be one of: 
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.ARRAY_CONFIG_UNSPECIFIED
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.CONTAINS
    */
    trait ArrayConfig extends StObject
    object ArrayConfig {
      
      inline def ARRAY_CONFIG_UNSPECIFIED: typings.googleCloudFirestore.googleCloudFirestoreStrings.ARRAY_CONFIG_UNSPECIFIED = "ARRAY_CONFIG_UNSPECIFIED".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.ARRAY_CONFIG_UNSPECIFIED]
      
      inline def CONTAINS: typings.googleCloudFirestore.googleCloudFirestoreStrings.CONTAINS = "CONTAINS".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.CONTAINS]
    }
    
    /** Order enum. */
    /* Rewritten from type alias, can be one of: 
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.ORDER_UNSPECIFIED
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.ASCENDING
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.DESCENDING
    */
    trait Order extends StObject
    object Order {
      
      inline def ASCENDING: typings.googleCloudFirestore.googleCloudFirestoreStrings.ASCENDING = "ASCENDING".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.ASCENDING]
      
      inline def DESCENDING: typings.googleCloudFirestore.googleCloudFirestoreStrings.DESCENDING = "DESCENDING".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.DESCENDING]
      
      inline def ORDER_UNSPECIFIED: typings.googleCloudFirestore.googleCloudFirestoreStrings.ORDER_UNSPECIFIED = "ORDER_UNSPECIFIED".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.ORDER_UNSPECIFIED]
    }
  }
  
  /**
    * Creates an Index message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Index
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Index = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Index]
  
  /**
    * Creates a plain object from an Index message. Also converts values to other types if specified.
    * @param message Index
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Index): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Index, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /** Properties of an IndexField. */
  trait IIndexField extends StObject {
    
    /** IndexField arrayConfig */
    var arrayConfig: js.UndefOr[ArrayConfig | Null] = js.undefined
    
    /** IndexField fieldPath */
    var fieldPath: js.UndefOr[String | Null] = js.undefined
    
    /** IndexField order */
    var order: js.UndefOr[Order | Null] = js.undefined
  }
  object IIndexField {
    
    inline def apply(): IIndexField = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIndexField]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IIndexField] (val x: Self) extends AnyVal {
      
      inline def setArrayConfig(value: ArrayConfig): Self = StObject.set(x, "arrayConfig", value.asInstanceOf[js.Any])
      
      inline def setArrayConfigNull: Self = StObject.set(x, "arrayConfig", null)
      
      inline def setArrayConfigUndefined: Self = StObject.set(x, "arrayConfig", js.undefined)
      
      inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
      
      inline def setFieldPathNull: Self = StObject.set(x, "fieldPath", null)
      
      inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
      
      inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /** QueryScope enum. */
  /* Rewritten from type alias, can be one of: 
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.QUERY_SCOPE_UNSPECIFIED
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.COLLECTION
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.COLLECTION_GROUP
  */
  trait QueryScope extends StObject
  object QueryScope {
    
    inline def COLLECTION: typings.googleCloudFirestore.googleCloudFirestoreStrings.COLLECTION = "COLLECTION".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.COLLECTION]
    
    inline def COLLECTION_GROUP: typings.googleCloudFirestore.googleCloudFirestoreStrings.COLLECTION_GROUP = "COLLECTION_GROUP".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.COLLECTION_GROUP]
    
    inline def QUERY_SCOPE_UNSPECIFIED: typings.googleCloudFirestore.googleCloudFirestoreStrings.QUERY_SCOPE_UNSPECIFIED = "QUERY_SCOPE_UNSPECIFIED".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.QUERY_SCOPE_UNSPECIFIED]
  }
  
  /** State enum. */
  /* Rewritten from type alias, can be one of: 
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.STATE_UNSPECIFIED
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.CREATING
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.READY
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.NEEDS_REPAIR
  */
  trait State extends StObject
  object State {
    
    inline def CREATING: typings.googleCloudFirestore.googleCloudFirestoreStrings.CREATING = "CREATING".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.CREATING]
    
    inline def NEEDS_REPAIR: typings.googleCloudFirestore.googleCloudFirestoreStrings.NEEDS_REPAIR = "NEEDS_REPAIR".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.NEEDS_REPAIR]
    
    inline def READY: typings.googleCloudFirestore.googleCloudFirestoreStrings.READY = "READY".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.READY]
    
    inline def STATE_UNSPECIFIED: typings.googleCloudFirestore.googleCloudFirestoreStrings.STATE_UNSPECIFIED = "STATE_UNSPECIFIED".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.STATE_UNSPECIFIED]
  }
}
