package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.compositeFilter
import typings.googleCloudFirestore.googleCloudFirestoreStrings.field
import typings.googleCloudFirestore.googleCloudFirestoreStrings.fieldFilter
import typings.googleCloudFirestore.googleCloudFirestoreStrings.unaryFilter
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.CompositeFilter.Operator
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.ICollectionSelector
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.IOrder
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StructuredQuery. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery")
@js.native
/**
  * Constructs a new StructuredQuery.
  * @param [properties] Properties to set
  */
open class StructuredQuery ()
  extends StObject
     with IStructuredQuery {
  def this(properties: IStructuredQuery) = this()
  
  /** StructuredQuery from. */
  @JSName("from")
  var from_StructuredQuery: js.Array[ICollectionSelector] = js.native
  
  /** StructuredQuery offset. */
  @JSName("offset")
  var offset_StructuredQuery: Double = js.native
  
  /** StructuredQuery orderBy. */
  @JSName("orderBy")
  var orderBy_StructuredQuery: js.Array[IOrder] = js.native
  
  /**
    * Converts this StructuredQuery to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object StructuredQuery {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a CollectionSelector. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.CollectionSelector")
  @js.native
  /**
    * Constructs a new CollectionSelector.
    * @param [properties] Properties to set
    */
  open class CollectionSelector ()
    extends StObject
       with ICollectionSelector {
    def this(properties: ICollectionSelector) = this()
    
    /** CollectionSelector allDescendants. */
    @JSName("allDescendants")
    var allDescendants_CollectionSelector: Boolean = js.native
    
    /** CollectionSelector collectionId. */
    @JSName("collectionId")
    var collectionId_CollectionSelector: String = js.native
    
    /**
      * Converts this CollectionSelector to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object CollectionSelector {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.CollectionSelector")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a CollectionSelector message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CollectionSelector
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): CollectionSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CollectionSelector]
    
    /**
      * Creates a plain object from a CollectionSelector message. Also converts values to other types if specified.
      * @param message CollectionSelector
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: CollectionSelector): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: CollectionSelector, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a CompositeFilter. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.CompositeFilter")
  @js.native
  /**
    * Constructs a new CompositeFilter.
    * @param [properties] Properties to set
    */
  open class CompositeFilter ()
    extends StObject
       with ICompositeFilter {
    def this(properties: ICompositeFilter) = this()
    
    /** CompositeFilter filters. */
    @JSName("filters")
    var filters_CompositeFilter: js.Array[IFilter] = js.native
    
    /** CompositeFilter op. */
    @JSName("op")
    var op_CompositeFilter: Operator = js.native
    
    /**
      * Converts this CompositeFilter to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object CompositeFilter {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.CompositeFilter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a CompositeFilter message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CompositeFilter
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): CompositeFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CompositeFilter]
    
    /**
      * Creates a plain object from a CompositeFilter message. Also converts values to other types if specified.
      * @param message CompositeFilter
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: CompositeFilter): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: CompositeFilter, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /** Operator enum. */
    /* Rewritten from type alias, can be one of: 
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.OPERATOR_UNSPECIFIED
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.AND
    */
    trait Operator extends StObject
    object Operator {
      
      inline def AND: typings.googleCloudFirestore.googleCloudFirestoreStrings.AND = "AND".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.AND]
      
      inline def OPERATOR_UNSPECIFIED: typings.googleCloudFirestore.googleCloudFirestoreStrings.OPERATOR_UNSPECIFIED = "OPERATOR_UNSPECIFIED".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.OPERATOR_UNSPECIFIED]
    }
  }
  
  /** Represents a FieldFilter. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.FieldFilter")
  @js.native
  /**
    * Constructs a new FieldFilter.
    * @param [properties] Properties to set
    */
  open class FieldFilter ()
    extends StObject
       with IFieldFilter {
    def this(properties: IFieldFilter) = this()
    
    /** FieldFilter op. */
    @JSName("op")
    var op_FieldFilter: typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.FieldFilter.Operator = js.native
    
    /**
      * Converts this FieldFilter to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object FieldFilter {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.FieldFilter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a FieldFilter message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns FieldFilter
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): FieldFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FieldFilter]
    
    /**
      * Creates a plain object from a FieldFilter message. Also converts values to other types if specified.
      * @param message FieldFilter
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: FieldFilter): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: FieldFilter, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /** Operator enum. */
    /* Rewritten from type alias, can be one of: 
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.OPERATOR_UNSPECIFIED
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.LESS_THAN
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.LESS_THAN_OR_EQUAL
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.GREATER_THAN
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.GREATER_THAN_OR_EQUAL
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.EQUAL
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.NOT_EQUAL
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.ARRAY_CONTAINS
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.IN
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.ARRAY_CONTAINS_ANY
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.NOT_IN
    */
    trait Operator extends StObject
    object Operator {
      
      inline def ARRAY_CONTAINS: typings.googleCloudFirestore.googleCloudFirestoreStrings.ARRAY_CONTAINS = "ARRAY_CONTAINS".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.ARRAY_CONTAINS]
      
      inline def ARRAY_CONTAINS_ANY: typings.googleCloudFirestore.googleCloudFirestoreStrings.ARRAY_CONTAINS_ANY = "ARRAY_CONTAINS_ANY".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.ARRAY_CONTAINS_ANY]
      
      inline def EQUAL: typings.googleCloudFirestore.googleCloudFirestoreStrings.EQUAL = "EQUAL".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.EQUAL]
      
      inline def GREATER_THAN: typings.googleCloudFirestore.googleCloudFirestoreStrings.GREATER_THAN = "GREATER_THAN".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.GREATER_THAN]
      
      inline def GREATER_THAN_OR_EQUAL: typings.googleCloudFirestore.googleCloudFirestoreStrings.GREATER_THAN_OR_EQUAL = "GREATER_THAN_OR_EQUAL".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.GREATER_THAN_OR_EQUAL]
      
      inline def IN: typings.googleCloudFirestore.googleCloudFirestoreStrings.IN = "IN".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.IN]
      
      inline def LESS_THAN: typings.googleCloudFirestore.googleCloudFirestoreStrings.LESS_THAN = "LESS_THAN".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.LESS_THAN]
      
      inline def LESS_THAN_OR_EQUAL: typings.googleCloudFirestore.googleCloudFirestoreStrings.LESS_THAN_OR_EQUAL = "LESS_THAN_OR_EQUAL".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.LESS_THAN_OR_EQUAL]
      
      inline def NOT_EQUAL: typings.googleCloudFirestore.googleCloudFirestoreStrings.NOT_EQUAL = "NOT_EQUAL".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.NOT_EQUAL]
      
      inline def NOT_IN: typings.googleCloudFirestore.googleCloudFirestoreStrings.NOT_IN = "NOT_IN".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.NOT_IN]
      
      inline def OPERATOR_UNSPECIFIED: typings.googleCloudFirestore.googleCloudFirestoreStrings.OPERATOR_UNSPECIFIED = "OPERATOR_UNSPECIFIED".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.OPERATOR_UNSPECIFIED]
    }
  }
  
  /** Represents a FieldReference. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.FieldReference")
  @js.native
  /**
    * Constructs a new FieldReference.
    * @param [properties] Properties to set
    */
  open class FieldReference ()
    extends StObject
       with IFieldReference {
    def this(properties: IFieldReference) = this()
    
    /** FieldReference fieldPath. */
    @JSName("fieldPath")
    var fieldPath_FieldReference: String = js.native
    
    /**
      * Converts this FieldReference to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object FieldReference {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.FieldReference")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a FieldReference message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns FieldReference
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): FieldReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FieldReference]
    
    /**
      * Creates a plain object from a FieldReference message. Also converts values to other types if specified.
      * @param message FieldReference
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: FieldReference): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: FieldReference, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a Filter. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.Filter")
  @js.native
  /**
    * Constructs a new Filter.
    * @param [properties] Properties to set
    */
  open class Filter ()
    extends StObject
       with IFilter {
    def this(properties: IFilter) = this()
    
    /** Filter filterType. */
    var filterType: js.UndefOr[compositeFilter | fieldFilter | unaryFilter] = js.native
    
    /**
      * Converts this Filter to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Filter {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.Filter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a Filter message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Filter
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Filter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Filter]
    
    /**
      * Creates a plain object from a Filter message. Also converts values to other types if specified.
      * @param message Filter
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Filter): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Filter, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents an Order. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.Order")
  @js.native
  /**
    * Constructs a new Order.
    * @param [properties] Properties to set
    */
  open class Order ()
    extends StObject
       with IOrder {
    def this(properties: IOrder) = this()
    
    /** Order direction. */
    @JSName("direction")
    var direction_Order: Direction = js.native
    
    /**
      * Converts this Order to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Order {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.Order")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an Order message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Order
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Order = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Order]
    
    /**
      * Creates a plain object from an Order message. Also converts values to other types if specified.
      * @param message Order
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Order): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Order, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a Projection. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.Projection")
  @js.native
  /**
    * Constructs a new Projection.
    * @param [properties] Properties to set
    */
  open class Projection ()
    extends StObject
       with IProjection {
    def this(properties: IProjection) = this()
    
    /** Projection fields. */
    @JSName("fields")
    var fields_Projection: js.Array[IFieldReference] = js.native
    
    /**
      * Converts this Projection to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Projection {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.Projection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a Projection message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Projection
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Projection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Projection]
    
    /**
      * Creates a plain object from a Projection message. Also converts values to other types if specified.
      * @param message Projection
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Projection): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Projection, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents an UnaryFilter. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.UnaryFilter")
  @js.native
  /**
    * Constructs a new UnaryFilter.
    * @param [properties] Properties to set
    */
  open class UnaryFilter ()
    extends StObject
       with IUnaryFilter {
    def this(properties: IUnaryFilter) = this()
    
    /** UnaryFilter op. */
    @JSName("op")
    var op_UnaryFilter: typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.UnaryFilter.Operator = js.native
    
    /** UnaryFilter operandType. */
    var operandType: js.UndefOr[field] = js.native
    
    /**
      * Converts this UnaryFilter to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object UnaryFilter {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.StructuredQuery.UnaryFilter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an UnaryFilter message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns UnaryFilter
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): UnaryFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UnaryFilter]
    
    /**
      * Creates a plain object from an UnaryFilter message. Also converts values to other types if specified.
      * @param message UnaryFilter
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: UnaryFilter): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: UnaryFilter, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /** Operator enum. */
    /* Rewritten from type alias, can be one of: 
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.OPERATOR_UNSPECIFIED
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.IS_NAN
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.IS_NULL
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.IS_NOT_NAN
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.IS_NOT_NULL
    */
    trait Operator extends StObject
    object Operator {
      
      inline def IS_NAN: typings.googleCloudFirestore.googleCloudFirestoreStrings.IS_NAN = "IS_NAN".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.IS_NAN]
      
      inline def IS_NOT_NAN: typings.googleCloudFirestore.googleCloudFirestoreStrings.IS_NOT_NAN = "IS_NOT_NAN".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.IS_NOT_NAN]
      
      inline def IS_NOT_NULL: typings.googleCloudFirestore.googleCloudFirestoreStrings.IS_NOT_NULL = "IS_NOT_NULL".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.IS_NOT_NULL]
      
      inline def IS_NULL: typings.googleCloudFirestore.googleCloudFirestoreStrings.IS_NULL = "IS_NULL".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.IS_NULL]
      
      inline def OPERATOR_UNSPECIFIED: typings.googleCloudFirestore.googleCloudFirestoreStrings.OPERATOR_UNSPECIFIED = "OPERATOR_UNSPECIFIED".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.OPERATOR_UNSPECIFIED]
    }
  }
  
  /**
    * Creates a StructuredQuery message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StructuredQuery
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): StructuredQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StructuredQuery]
  
  /**
    * Creates a plain object from a StructuredQuery message. Also converts values to other types if specified.
    * @param message StructuredQuery
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: StructuredQuery): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: StructuredQuery, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /** Direction enum. */
  /* Rewritten from type alias, can be one of: 
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.DIRECTION_UNSPECIFIED
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.ASCENDING
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.DESCENDING
  */
  trait Direction extends StObject
  object Direction {
    
    inline def ASCENDING: typings.googleCloudFirestore.googleCloudFirestoreStrings.ASCENDING = "ASCENDING".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.ASCENDING]
    
    inline def DESCENDING: typings.googleCloudFirestore.googleCloudFirestoreStrings.DESCENDING = "DESCENDING".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.DESCENDING]
    
    inline def DIRECTION_UNSPECIFIED: typings.googleCloudFirestore.googleCloudFirestoreStrings.DIRECTION_UNSPECIFIED = "DIRECTION_UNSPECIFIED".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.DIRECTION_UNSPECIFIED]
  }
  
  /** Properties of a CollectionSelector. */
  trait ICollectionSelector extends StObject {
    
    /** CollectionSelector allDescendants */
    var allDescendants: js.UndefOr[Boolean | Null] = js.undefined
    
    /** CollectionSelector collectionId */
    var collectionId: js.UndefOr[String | Null] = js.undefined
  }
  object ICollectionSelector {
    
    inline def apply(): ICollectionSelector = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICollectionSelector]
    }
    
    extension [Self <: ICollectionSelector](x: Self) {
      
      inline def setAllDescendants(value: Boolean): Self = StObject.set(x, "allDescendants", value.asInstanceOf[js.Any])
      
      inline def setAllDescendantsNull: Self = StObject.set(x, "allDescendants", null)
      
      inline def setAllDescendantsUndefined: Self = StObject.set(x, "allDescendants", js.undefined)
      
      inline def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
      
      inline def setCollectionIdNull: Self = StObject.set(x, "collectionId", null)
      
      inline def setCollectionIdUndefined: Self = StObject.set(x, "collectionId", js.undefined)
    }
  }
  
  /** Properties of a CompositeFilter. */
  trait ICompositeFilter extends StObject {
    
    /** CompositeFilter filters */
    var filters: js.UndefOr[js.Array[IFilter] | Null] = js.undefined
    
    /** CompositeFilter op */
    var op: js.UndefOr[Operator | Null] = js.undefined
  }
  object ICompositeFilter {
    
    inline def apply(): ICompositeFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICompositeFilter]
    }
    
    extension [Self <: ICompositeFilter](x: Self) {
      
      inline def setFilters(value: js.Array[IFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersNull: Self = StObject.set(x, "filters", null)
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: IFilter*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setOp(value: Operator): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setOpNull: Self = StObject.set(x, "op", null)
      
      inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    }
  }
  
  /** Properties of a FieldFilter. */
  trait IFieldFilter extends StObject {
    
    /** FieldFilter field */
    var field: js.UndefOr[IFieldReference | Null] = js.undefined
    
    /** FieldFilter op */
    var op: js.UndefOr[
        typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.FieldFilter.Operator | Null
      ] = js.undefined
    
    /** FieldFilter value */
    var value: js.UndefOr[IValue | Null] = js.undefined
  }
  object IFieldFilter {
    
    inline def apply(): IFieldFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFieldFilter]
    }
    
    extension [Self <: IFieldFilter](x: Self) {
      
      inline def setField(value: IFieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldNull: Self = StObject.set(x, "field", null)
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setOp(
        value: typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.FieldFilter.Operator
      ): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setOpNull: Self = StObject.set(x, "op", null)
      
      inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
      
      inline def setValue(value: IValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /** Properties of a FieldReference. */
  trait IFieldReference extends StObject {
    
    /** FieldReference fieldPath */
    var fieldPath: js.UndefOr[String | Null] = js.undefined
  }
  object IFieldReference {
    
    inline def apply(): IFieldReference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFieldReference]
    }
    
    extension [Self <: IFieldReference](x: Self) {
      
      inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
      
      inline def setFieldPathNull: Self = StObject.set(x, "fieldPath", null)
      
      inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
    }
  }
  
  /** Properties of a Filter. */
  trait IFilter extends StObject {
    
    /** Filter compositeFilter */
    var compositeFilter: js.UndefOr[ICompositeFilter | Null] = js.undefined
    
    /** Filter fieldFilter */
    var fieldFilter: js.UndefOr[IFieldFilter | Null] = js.undefined
    
    /** Filter unaryFilter */
    var unaryFilter: js.UndefOr[IUnaryFilter | Null] = js.undefined
  }
  object IFilter {
    
    inline def apply(): IFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFilter]
    }
    
    extension [Self <: IFilter](x: Self) {
      
      inline def setCompositeFilter(value: ICompositeFilter): Self = StObject.set(x, "compositeFilter", value.asInstanceOf[js.Any])
      
      inline def setCompositeFilterNull: Self = StObject.set(x, "compositeFilter", null)
      
      inline def setCompositeFilterUndefined: Self = StObject.set(x, "compositeFilter", js.undefined)
      
      inline def setFieldFilter(value: IFieldFilter): Self = StObject.set(x, "fieldFilter", value.asInstanceOf[js.Any])
      
      inline def setFieldFilterNull: Self = StObject.set(x, "fieldFilter", null)
      
      inline def setFieldFilterUndefined: Self = StObject.set(x, "fieldFilter", js.undefined)
      
      inline def setUnaryFilter(value: IUnaryFilter): Self = StObject.set(x, "unaryFilter", value.asInstanceOf[js.Any])
      
      inline def setUnaryFilterNull: Self = StObject.set(x, "unaryFilter", null)
      
      inline def setUnaryFilterUndefined: Self = StObject.set(x, "unaryFilter", js.undefined)
    }
  }
  
  /** Properties of an Order. */
  trait IOrder extends StObject {
    
    /** Order direction */
    var direction: js.UndefOr[Direction | Null] = js.undefined
    
    /** Order field */
    var field: js.UndefOr[IFieldReference | Null] = js.undefined
  }
  object IOrder {
    
    inline def apply(): IOrder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOrder]
    }
    
    extension [Self <: IOrder](x: Self) {
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionNull: Self = StObject.set(x, "direction", null)
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setField(value: IFieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldNull: Self = StObject.set(x, "field", null)
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    }
  }
  
  /** Properties of a Projection. */
  trait IProjection extends StObject {
    
    /** Projection fields */
    var fields: js.UndefOr[js.Array[IFieldReference] | Null] = js.undefined
  }
  object IProjection {
    
    inline def apply(): IProjection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProjection]
    }
    
    extension [Self <: IProjection](x: Self) {
      
      inline def setFields(value: js.Array[IFieldReference]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsNull: Self = StObject.set(x, "fields", null)
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: IFieldReference*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
  
  /** Properties of an UnaryFilter. */
  trait IUnaryFilter extends StObject {
    
    /** UnaryFilter field */
    var field: js.UndefOr[IFieldReference | Null] = js.undefined
    
    /** UnaryFilter op */
    var op: js.UndefOr[
        typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.UnaryFilter.Operator | Null
      ] = js.undefined
  }
  object IUnaryFilter {
    
    inline def apply(): IUnaryFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IUnaryFilter]
    }
    
    extension [Self <: IUnaryFilter](x: Self) {
      
      inline def setField(value: IFieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldNull: Self = StObject.set(x, "field", null)
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setOp(
        value: typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.UnaryFilter.Operator
      ): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setOpNull: Self = StObject.set(x, "op", null)
      
      inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    }
  }
}
