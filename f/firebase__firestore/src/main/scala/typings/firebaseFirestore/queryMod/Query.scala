package typings.firebaseFirestore.queryMod

import typings.firebaseFirestore.documentMod.Document
import typings.firebaseFirestore.pathMod.FieldPath
import typings.firebaseFirestore.pathMod.ResourcePath
import typings.firebaseFirestore.targetMod.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/query", "Query")
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
  var memoizedTarget: js.Any = js.native
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
@JSImport("@firebase/firestore/dist/lib/src/core/query", "Query")
@js.native
object Query extends js.Object {
  def atPath(path: ResourcePath): Query = js.native
}

