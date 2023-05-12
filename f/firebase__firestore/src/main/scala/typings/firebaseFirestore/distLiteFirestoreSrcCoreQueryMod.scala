package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcCoreBoundMod.Bound
import typings.firebaseFirestore.distLiteFirestoreSrcCoreFilterMod.Filter
import typings.firebaseFirestore.distLiteFirestoreSrcCoreOrderByMod.OrderBy
import typings.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.Target
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath
import typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.ResourcePath
import typings.firebaseFirestore.firebaseFirestoreStrings.F
import typings.firebaseFirestore.firebaseFirestoreStrings.L
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcCoreQueryMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/query", "QueryImpl")
  @js.native
  open class QueryImpl protected ()
    extends StObject
       with Query {
    /**
      * Initializes a Query with a path and optional additional query constraints.
      * Path must currently be empty if this is a collection group query.
      */
    def this(
      path: ResourcePath,
      collectionGroup: js.UndefOr[String | Null],
      explicitOrderBy: js.UndefOr[js.Array[OrderBy]],
      filters: js.UndefOr[js.Array[Filter]],
      limit: js.UndefOr[Double | Null],
      limitType: js.UndefOr[LimitType],
      startAt: js.UndefOr[Bound | Null],
      endAt: js.UndefOr[Bound | Null]
    ) = this()
    
    /* CompleteClass */
    override val collectionGroup: String | Null = js.native
    
    /* CompleteClass */
    override val endAt: Bound | Null = js.native
    
    /* CompleteClass */
    override val explicitOrderBy: js.Array[OrderBy] = js.native
    
    /* CompleteClass */
    override val filters: js.Array[Filter] = js.native
    
    /* CompleteClass */
    override val limit: Double | Null = js.native
    
    /* CompleteClass */
    override val limitType: LimitType = js.native
    
    var memoizedOrderBy: js.Array[OrderBy] | Null = js.native
    
    var memoizedTarget: Target | Null = js.native
    
    /* CompleteClass */
    override val path: ResourcePath = js.native
    
    /* CompleteClass */
    override val startAt: Bound | Null = js.native
  }
  
  inline def asCollectionQueryAtPath(query: Query, path: ResourcePath): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("asCollectionQueryAtPath")(query.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Query]
  
  inline def canonifyQuery(query: Query): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonifyQuery")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def compareDocs(orderBy: OrderBy, d1: Document, d2: Document): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDocs")(orderBy.asInstanceOf[js.Any], d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getFirstOrderByField(query: Query): FieldPath | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstOrderByField")(query.asInstanceOf[js.Any]).asInstanceOf[FieldPath | Null]
  
  inline def getInequalityFilterField(query: Query): FieldPath | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getInequalityFilterField")(query.asInstanceOf[js.Any]).asInstanceOf[FieldPath | Null]
  
  inline def isCollectionGroupQuery(query: Query): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollectionGroupQuery")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDocumentQuery(query: Query): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocumentQuery")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: String,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Double,
    limitType: LimitType
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: String,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Double,
    limitType: LimitType,
    startAt: Null,
    endAt: Bound
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any], startAt.asInstanceOf[js.Any], endAt.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: String,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Double,
    limitType: LimitType,
    startAt: Bound
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any], startAt.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: String,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Double,
    limitType: LimitType,
    startAt: Bound,
    endAt: Bound
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any], startAt.asInstanceOf[js.Any], endAt.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: String,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Null,
    limitType: LimitType
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: String,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Null,
    limitType: LimitType,
    startAt: Null,
    endAt: Bound
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any], startAt.asInstanceOf[js.Any], endAt.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: String,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Null,
    limitType: LimitType,
    startAt: Bound
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any], startAt.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: String,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Null,
    limitType: LimitType,
    startAt: Bound,
    endAt: Bound
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any], startAt.asInstanceOf[js.Any], endAt.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: Null,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Double,
    limitType: LimitType
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: Null,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Double,
    limitType: LimitType,
    startAt: Null,
    endAt: Bound
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any], startAt.asInstanceOf[js.Any], endAt.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: Null,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Double,
    limitType: LimitType,
    startAt: Bound
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any], startAt.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: Null,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Double,
    limitType: LimitType,
    startAt: Bound,
    endAt: Bound
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any], startAt.asInstanceOf[js.Any], endAt.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: Null,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Null,
    limitType: LimitType
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: Null,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Null,
    limitType: LimitType,
    startAt: Null,
    endAt: Bound
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any], startAt.asInstanceOf[js.Any], endAt.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: Null,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Null,
    limitType: LimitType,
    startAt: Bound
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any], startAt.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def newQuery(
    path: ResourcePath,
    collectionGroup: Null,
    explicitOrderBy: js.Array[OrderBy],
    filters: js.Array[Filter],
    limit: Null,
    limitType: LimitType,
    startAt: Bound,
    endAt: Bound
  ): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("newQuery")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], explicitOrderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any], startAt.asInstanceOf[js.Any], endAt.asInstanceOf[js.Any])).asInstanceOf[Query]
  
  inline def newQueryComparator(query: Query): js.Function2[/* d1 */ Document, /* d2 */ Document, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("newQueryComparator")(query.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* d1 */ Document, /* d2 */ Document, Double]]
  
  inline def newQueryForCollectionGroup(collectionId: String): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("newQueryForCollectionGroup")(collectionId.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  inline def newQueryForPath(path: ResourcePath): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("newQueryForPath")(path.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  inline def queryCollectionGroup(query: Query): String = ^.asInstanceOf[js.Dynamic].applyDynamic("queryCollectionGroup")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def queryEquals(left: Query, right: Query): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def queryMatches(query: Query, doc: Document): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryMatches")(query.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def queryMatchesAllDocuments(query: Query): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("queryMatchesAllDocuments")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def queryOrderBy(query: Query): js.Array[OrderBy] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryOrderBy")(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[OrderBy]]
  
  inline def queryToTarget(query: Query): Target = ^.asInstanceOf[js.Dynamic].applyDynamic("queryToTarget")(query.asInstanceOf[js.Any]).asInstanceOf[Target]
  
  inline def queryWithAddedFilter(query: Query, filter: Filter): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("queryWithAddedFilter")(query.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Query]
  
  inline def queryWithAddedOrderBy(query: Query, orderBy: OrderBy): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("queryWithAddedOrderBy")(query.asInstanceOf[js.Any], orderBy.asInstanceOf[js.Any])).asInstanceOf[Query]
  
  inline def queryWithEndAt(query: Query, bound: Bound): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("queryWithEndAt")(query.asInstanceOf[js.Any], bound.asInstanceOf[js.Any])).asInstanceOf[Query]
  
  inline def queryWithLimit(query: Query, limit: Double, limitType: LimitType): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("queryWithLimit")(query.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def queryWithLimit(query: Query, limit: Null, limitType: LimitType): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("queryWithLimit")(query.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any])).asInstanceOf[Query]
  
  inline def queryWithStartAt(query: Query, bound: Bound): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("queryWithStartAt")(query.asInstanceOf[js.Any], bound.asInstanceOf[js.Any])).asInstanceOf[Query]
  
  inline def stringifyQuery(query: Query): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyQuery")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.F
    - typings.firebaseFirestore.firebaseFirestoreStrings.L
  */
  trait LimitType extends StObject
  object LimitType {
    
    inline def First: F = "F".asInstanceOf[F]
    
    inline def Last: L = "L".asInstanceOf[L]
  }
  
  trait Query extends StObject {
    
    val collectionGroup: String | Null
    
    val endAt: Bound | Null
    
    val explicitOrderBy: js.Array[OrderBy]
    
    val filters: js.Array[Filter]
    
    val limit: Double | Null
    
    val limitType: LimitType
    
    val path: ResourcePath
    
    val startAt: Bound | Null
  }
  object Query {
    
    inline def apply(
      explicitOrderBy: js.Array[OrderBy],
      filters: js.Array[Filter],
      limitType: LimitType,
      path: ResourcePath
    ): Query = {
      val __obj = js.Dynamic.literal(explicitOrderBy = explicitOrderBy.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], limitType = limitType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], collectionGroup = null, endAt = null, limit = null, startAt = null)
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      inline def setCollectionGroup(value: String): Self = StObject.set(x, "collectionGroup", value.asInstanceOf[js.Any])
      
      inline def setCollectionGroupNull: Self = StObject.set(x, "collectionGroup", null)
      
      inline def setEndAt(value: Bound): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
      
      inline def setEndAtNull: Self = StObject.set(x, "endAt", null)
      
      inline def setExplicitOrderBy(value: js.Array[OrderBy]): Self = StObject.set(x, "explicitOrderBy", value.asInstanceOf[js.Any])
      
      inline def setExplicitOrderByVarargs(value: OrderBy*): Self = StObject.set(x, "explicitOrderBy", js.Array(value*))
      
      inline def setFilters(value: js.Array[Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitNull: Self = StObject.set(x, "limit", null)
      
      inline def setLimitType(value: LimitType): Self = StObject.set(x, "limitType", value.asInstanceOf[js.Any])
      
      inline def setPath(value: ResourcePath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStartAt(value: Bound): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      inline def setStartAtNull: Self = StObject.set(x, "startAt", null)
    }
  }
}
