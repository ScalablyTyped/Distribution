package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distPackagesFirestoreSrcModelFieldIndexMod.FieldIndex
import typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.FieldPath
import typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.ResourcePath
import typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.Value
import typings.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign
import typings.firebaseFirestore.firebaseFirestoreStrings.ExclamationmarkEqualssign
import typings.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign
import typings.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign
import typings.firebaseFirestore.firebaseFirestoreStrings.Lessthansign
import typings.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign
import typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any`
import typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains`
import typings.firebaseFirestore.firebaseFirestoreStrings.`not-in`
import typings.firebaseFirestore.firebaseFirestoreStrings.asc
import typings.firebaseFirestore.firebaseFirestoreStrings.desc
import typings.firebaseFirestore.firebaseFirestoreStrings.in_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcCoreTargetMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", "ArrayContainsAnyFilter")
  @js.native
  open class ArrayContainsAnyFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: Value) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", "ArrayContainsFilter")
  @js.native
  open class ArrayContainsFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: Value) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", "Bound")
  @js.native
  open class Bound protected () extends StObject {
    def this(position: js.Array[Value], inclusive: Boolean) = this()
    
    val inclusive: Boolean = js.native
    
    val position: js.Array[Value] = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", "FieldFilter")
  @js.native
  open class FieldFilter protected () extends Filter {
    /* protected */ def this(field: FieldPath, op: Operator, value: Value) = this()
    
    var field: FieldPath = js.native
    
    def isInequality(): Boolean = js.native
    
    /* protected */ def matchesComparison(comparison: Double): Boolean = js.native
    
    var op: Operator = js.native
    
    var value: Value = js.native
  }
  /* static members */
  object FieldFilter {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", "FieldFilter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a filter based on the provided arguments.
      */
    inline def create(field: FieldPath, op: Operator, value: Value): FieldFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(field.asInstanceOf[js.Any], op.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FieldFilter]
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", "FieldFilter.createKeyFieldInFilter")
    @js.native
    def createKeyFieldInFilter: Any = js.native
    inline def createKeyFieldInFilter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createKeyFieldInFilter")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", "Filter")
  @js.native
  open class Filter () extends StObject {
    
    def matches(doc: Document): Boolean = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", "InFilter")
  @js.native
  open class InFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: Value) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", "KeyFieldFilter")
  @js.native
  open class KeyFieldFilter protected () extends FieldFilter {
    def this(field: FieldPath, op: Operator, value: Value) = this()
    
    /* private */ val key: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", "KeyFieldInFilter")
  @js.native
  open class KeyFieldInFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: Value) = this()
    
    /* private */ val keys: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", "KeyFieldNotInFilter")
  @js.native
  open class KeyFieldNotInFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: Value) = this()
    
    /* private */ val keys: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", "NotInFilter")
  @js.native
  open class NotInFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: Value) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", "OrderBy")
  @js.native
  open class OrderBy protected () extends StObject {
    def this(field: FieldPath) = this()
    def this(field: FieldPath, dir: Direction) = this()
    
    val dir: Direction = js.native
    
    val field: FieldPath = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", "TargetImpl")
  @js.native
  open class TargetImpl protected ()
    extends StObject
       with Target {
    def this(
      path: ResourcePath,
      collectionGroup: js.UndefOr[String | Null],
      orderBy: js.UndefOr[js.Array[OrderBy]],
      filters: js.UndefOr[js.Array[Filter]],
      limit: js.UndefOr[Double | Null],
      startAt: js.UndefOr[Bound | Null],
      endAt: js.UndefOr[Bound | Null]
    ) = this()
    
    /* CompleteClass */
    override val collectionGroup: String | Null = js.native
    
    /* CompleteClass */
    override val endAt: Bound | Null = js.native
    
    /* CompleteClass */
    override val filters: js.Array[Filter] = js.native
    
    /* CompleteClass */
    override val limit: Double | Null = js.native
    
    var memoizedCanonicalId: String | Null = js.native
    
    /* CompleteClass */
    override val orderBy: js.Array[OrderBy] = js.native
    
    /* CompleteClass */
    override val path: ResourcePath = js.native
    
    /* CompleteClass */
    override val startAt: Bound | Null = js.native
  }
  
  inline def boundEquals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("boundEquals")().asInstanceOf[Boolean]
  inline def boundEquals(left: Null, right: Bound): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boundEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def boundEquals(left: Bound): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("boundEquals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def boundEquals(left: Bound, right: Bound): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boundEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def boundSortsAfterDocument(bound: Bound, orderBy: js.Array[OrderBy], doc: Document): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boundSortsAfterDocument")(bound.asInstanceOf[js.Any], orderBy.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def boundSortsBeforeDocument(bound: Bound, orderBy: js.Array[OrderBy], doc: Document): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boundSortsBeforeDocument")(bound.asInstanceOf[js.Any], orderBy.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def canonifyFilter(filter: Filter): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonifyFilter")(filter.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def canonifyOrderBy(orderBy: OrderBy): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonifyOrderBy")(orderBy.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def canonifyTarget(target: Target): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonifyTarget")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def filterEquals(f1: Filter, f2: Filter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("filterEquals")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def newTarget(
    path: ResourcePath,
    collectionGroup: js.UndefOr[String | Null],
    orderBy: js.UndefOr[js.Array[OrderBy]],
    filters: js.UndefOr[js.Array[Filter]],
    limit: js.UndefOr[Double | Null],
    startAt: js.UndefOr[Bound | Null],
    endAt: js.UndefOr[Bound | Null]
  ): Target = (^.asInstanceOf[js.Dynamic].applyDynamic("newTarget")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], orderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], startAt.asInstanceOf[js.Any], endAt.asInstanceOf[js.Any])).asInstanceOf[Target]
  
  inline def orderByEquals(left: OrderBy, right: OrderBy): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("orderByEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def stringifyFilter(filter: Filter): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyFilter")(filter.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyOrderBy(orderBy: OrderBy): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyOrderBy")(orderBy.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyTarget(target: Target): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyTarget")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def targetEquals(left: Target, right: Target): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("targetEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def targetGetArrayValues(target: Target, fieldIndex: FieldIndex): js.Array[Value] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("targetGetArrayValues")(target.asInstanceOf[js.Any], fieldIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value] | Null]
  
  inline def targetGetFieldFiltersForPath(target: Target, path: FieldPath): js.Array[FieldFilter] = (^.asInstanceOf[js.Dynamic].applyDynamic("targetGetFieldFiltersForPath")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[FieldFilter]]
  
  inline def targetGetLowerBound(target: Target, fieldIndex: FieldIndex): Bound = (^.asInstanceOf[js.Dynamic].applyDynamic("targetGetLowerBound")(target.asInstanceOf[js.Any], fieldIndex.asInstanceOf[js.Any])).asInstanceOf[Bound]
  
  inline def targetGetNotInValues(target: Target, fieldIndex: FieldIndex): js.Array[Value] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("targetGetNotInValues")(target.asInstanceOf[js.Any], fieldIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value] | Null]
  
  inline def targetGetSegmentCount(target: Target): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("targetGetSegmentCount")(target.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def targetGetUpperBound(target: Target, fieldIndex: FieldIndex): Bound = (^.asInstanceOf[js.Dynamic].applyDynamic("targetGetUpperBound")(target.asInstanceOf[js.Any], fieldIndex.asInstanceOf[js.Any])).asInstanceOf[Bound]
  
  inline def targetIsDocumentTarget(target: Target): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("targetIsDocumentTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.asc
    - typings.firebaseFirestore.firebaseFirestoreStrings.desc
  */
  trait Direction extends StObject
  object Direction {
    
    inline def ASCENDING: asc = "asc".asInstanceOf[asc]
    
    inline def DESCENDING: desc = "desc".asInstanceOf[desc]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.Lessthansign
    - typings.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.ExclamationmarkEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign
    - typings.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains`
    - typings.firebaseFirestore.firebaseFirestoreStrings.in_
    - typings.firebaseFirestore.firebaseFirestoreStrings.`not-in`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any`
  */
  trait Operator extends StObject
  object Operator {
    
    inline def ARRAY_CONTAINS: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
    
    inline def ARRAY_CONTAINS_ANY: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
    
    inline def EQUAL: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
    
    inline def GREATER_THAN: Greaterthansign = ">".asInstanceOf[Greaterthansign]
    
    inline def GREATER_THAN_OR_EQUAL: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
    
    inline def IN: in_ = "in".asInstanceOf[in_]
    
    inline def LESS_THAN: Lessthansign = "<".asInstanceOf[Lessthansign]
    
    inline def LESS_THAN_OR_EQUAL: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
    
    inline def NOT_EQUAL: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
    
    inline def NOT_IN: `not-in` = "not-in".asInstanceOf[`not-in`]
  }
  
  trait Target extends StObject {
    
    val collectionGroup: String | Null
    
    val endAt: Bound | Null
    
    val filters: js.Array[Filter]
    
    val limit: Double | Null
    
    val orderBy: js.Array[OrderBy]
    
    val path: ResourcePath
    
    val startAt: Bound | Null
  }
  object Target {
    
    inline def apply(filters: js.Array[Filter], orderBy: js.Array[OrderBy], path: ResourcePath): Target = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], collectionGroup = null, endAt = null, limit = null, startAt = null)
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      inline def setCollectionGroup(value: String): Self = StObject.set(x, "collectionGroup", value.asInstanceOf[js.Any])
      
      inline def setCollectionGroupNull: Self = StObject.set(x, "collectionGroup", null)
      
      inline def setEndAt(value: Bound): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
      
      inline def setEndAtNull: Self = StObject.set(x, "endAt", null)
      
      inline def setFilters(value: js.Array[Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitNull: Self = StObject.set(x, "limit", null)
      
      inline def setOrderBy(value: js.Array[OrderBy]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderByVarargs(value: OrderBy*): Self = StObject.set(x, "orderBy", js.Array(value*))
      
      inline def setPath(value: ResourcePath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStartAt(value: Bound): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      inline def setStartAtNull: Self = StObject.set(x, "startAt", null)
    }
  }
}
