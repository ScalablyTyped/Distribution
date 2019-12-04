package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcCoreQueryMod.Bound
import typings.atFirebaseFirestore.distSrcCoreQueryMod.Direction
import typings.atFirebaseFirestore.distSrcCoreQueryMod.FieldFilter
import typings.atFirebaseFirestore.distSrcCoreQueryMod.Filter
import typings.atFirebaseFirestore.distSrcCoreQueryMod.LimitType
import typings.atFirebaseFirestore.distSrcCoreQueryMod.Operator
import typings.atFirebaseFirestore.distSrcCoreQueryMod.OrderBy
import typings.atFirebaseFirestore.distSrcCoreQueryMod.Query
import typings.atFirebaseFirestore.distSrcCoreTargetMod.Target
import typings.atFirebaseFirestore.distSrcModelDocumentMod.Document
import typings.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.ArrayValue
import typings.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.FieldValue
import typings.atFirebaseFirestore.distSrcModelPathMod.FieldPath
import typings.atFirebaseFirestore.distSrcModelPathMod.ResourcePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/query", JSImport.Namespace)
@js.native
object distSrcCoreQueryMod extends js.Object {
  @js.native
  class ArrayContainsAnyFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: ArrayValue) = this()
    @JSName("value")
    var value_ArrayContainsAnyFilter: ArrayValue = js.native
  }
  
  @js.native
  class ArrayContainsFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: FieldValue) = this()
  }
  
  @js.native
  class Bound protected () extends js.Object {
    def this(position: js.Array[FieldValue], before: Boolean) = this()
    val before: Boolean = js.native
    val position: js.Array[FieldValue] = js.native
    def canonicalId(): String = js.native
    def isEqual(): Boolean = js.native
    def isEqual(other: Bound): Boolean = js.native
    /**
      * Returns true if a document sorts before a bound using the provided sort
      * order.
      */
    def sortsBeforeDocument(orderBy: js.Array[OrderBy], doc: Document): Boolean = js.native
  }
  
  @js.native
  class Direction protected () extends js.Object {
    var name: String = js.native
  }
  
  @js.native
  class FieldFilter protected () extends Filter {
    protected def this(field: FieldPath, op: Operator, value: FieldValue) = this()
    var field: FieldPath = js.native
    var op: Operator = js.native
    var value: FieldValue = js.native
    def isInequality(): Boolean = js.native
    /* protected */ def matchesComparison(comparison: Double): Boolean = js.native
  }
  
  @js.native
  abstract class Filter () extends js.Object {
    def canonicalId(): String = js.native
    def isEqual(filter: Filter): Boolean = js.native
    def matches(doc: Document): Boolean = js.native
  }
  
  @js.native
  class InFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: ArrayValue) = this()
    @JSName("value")
    var value_InFilter: ArrayValue = js.native
  }
  
  @js.native
  class KeyFieldFilter () extends FieldFilter
  
  @js.native
  class KeyFieldInFilter protected () extends FieldFilter {
    def this(field: FieldPath, value: ArrayValue) = this()
    @JSName("value")
    var value_KeyFieldInFilter: ArrayValue = js.native
  }
  
  @js.native
  sealed trait LimitType extends js.Object
  
  @js.native
  class Operator protected () extends js.Object {
    def this(name: String) = this()
    var name: String = js.native
    def isEqual(other: Operator): Boolean = js.native
  }
  
  @js.native
  class OrderBy protected () extends js.Object {
    def this(field: FieldPath) = this()
    def this(field: FieldPath, dir: Direction) = this()
    val dir: Direction = js.native
    val field: FieldPath = js.native
    val isKeyOrderBy: js.Any = js.native
    def canonicalId(): String = js.native
    def compare(d1: Document, d2: Document): Double = js.native
    def isEqual(other: OrderBy): Boolean = js.native
  }
  
  @js.native
  class Query protected () extends js.Object {
    /**
      * Initializes a Query with a path and optional additional query constraints.
      * Path must currently be empty if this is a collection group query.
      */
    def this(
      path: ResourcePath,
      collectionGroup: js.UndefOr[Null | String],
      explicitOrderBy: js.UndefOr[js.Array[OrderBy]],
      filters: js.UndefOr[js.Array[Filter]],
      limit: js.UndefOr[Double | Null],
      limitType: js.UndefOr[LimitType],
      startAt: js.UndefOr[Bound | Null],
      endAt: js.UndefOr[Bound | Null]
    ) = this()
    var assertValidBound: js.Any = js.native
    val collectionGroup: String | Null = js.native
    val endAt: Bound | Null = js.native
    val explicitOrderBy: js.Array[OrderBy] = js.native
    val filters: js.Array[Filter] = js.native
    val limit: Double | Null = js.native
    val limitType: LimitType = js.native
    /**
      * Makes sure a document is within the bounds, if provided.
      */
    var matchesBounds: js.Any = js.native
    var matchesFilters: js.Any = js.native
    /**
      * A document must have a value for every ordering clause in order to show up
      * in the results.
      */
    var matchesOrderBy: js.Any = js.native
    var matchesPathAndCollectionGroup: js.Any = js.native
    var memoizedOrderBy: js.Any = js.native
    var memorizedTarget: js.Any = js.native
    val path: ResourcePath = js.native
    val startAt: Bound | Null = js.native
    def addFilter(filter: Filter): Query = js.native
    def addOrderBy(orderBy: OrderBy): Query = js.native
    /**
      * Helper to convert a collection group query into a collection query at a
      * specific path. This is used when executing collection group queries, since
      * we have to split the query into a set of collection queries at multiple
      * paths.
      */
    def asCollectionQueryAtPath(path: ResourcePath): Query = js.native
    def canonicalId(): String = js.native
    def docComparator(d1: Document, d2: Document): Double = js.native
    def findFilterOperator(operators: js.Array[Operator]): Operator | Null = js.native
    def getFirstOrderByField(): FieldPath | Null = js.native
    def getInequalityFilterField(): FieldPath | Null = js.native
    def hasLimitToFirst(): Boolean = js.native
    def hasLimitToLast(): Boolean = js.native
    def isCollectionGroupQuery(): Boolean = js.native
    def isDocumentQuery(): Boolean = js.native
    def isEqual(other: Query): Boolean = js.native
    def matches(doc: Document): Boolean = js.native
    /**
      * Returns true if this query does not specify any query constraints that
      * could remove results.
      */
    def matchesAllDocuments(): Boolean = js.native
    def orderBy(): js.Array[OrderBy] = js.native
    /**
      * Converts this `Query` instance to it's corresponding `Target`
      * representation.
      */
    def toTarget(): Target = js.native
    def withEndAt(bound: Bound): Query = js.native
    def withLimitToFirst(): Query = js.native
    def withLimitToFirst(limit: Double): Query = js.native
    def withLimitToLast(): Query = js.native
    def withLimitToLast(limit: Double): Query = js.native
    def withStartAt(bound: Bound): Query = js.native
  }
  
  /* static members */
  @js.native
  object Direction extends js.Object {
    var ASCENDING: Direction = js.native
    var DESCENDING: Direction = js.native
  }
  
  /* static members */
  @js.native
  object FieldFilter extends js.Object {
    /**
      * Creates a filter based on the provided arguments.
      */
    def create(field: FieldPath, op: Operator, value: FieldValue): FieldFilter = js.native
  }
  
  @js.native
  object LimitType extends js.Object {
    @js.native
    sealed trait First extends LimitType
    
    @js.native
    sealed trait Last extends LimitType
    
    /* "F" */ val First: typings.atFirebaseFirestore.distSrcCoreQueryMod.LimitType.First with String = js.native
    /* "L" */ val Last: typings.atFirebaseFirestore.distSrcCoreQueryMod.LimitType.Last with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LimitType with String] = js.native
  }
  
  /* static members */
  @js.native
  object Operator extends js.Object {
    var ARRAY_CONTAINS: Operator = js.native
    var ARRAY_CONTAINS_ANY: Operator = js.native
    var EQUAL: Operator = js.native
    var GREATER_THAN: Operator = js.native
    var GREATER_THAN_OR_EQUAL: Operator = js.native
    var IN: Operator = js.native
    var LESS_THAN: Operator = js.native
    var LESS_THAN_OR_EQUAL: Operator = js.native
    def fromString(op: String): Operator = js.native
  }
  
  /* static members */
  @js.native
  object Query extends js.Object {
    def atPath(path: ResourcePath): Query = js.native
  }
  
}

