package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreBoundMod.Bound
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreFilterMod.FieldFilter
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreFilterMod.Filter
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreOrderByMod.OrderBy
import typings.firebaseFirestore.distPackagesFirestoreSrcModelFieldIndexMod.FieldIndex
import typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.FieldPath
import typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.ResourcePath
import typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcCoreTargetMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def canonifyTarget(target: Target): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonifyTarget")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def newTarget(
    path: ResourcePath,
    collectionGroup: js.UndefOr[String | Null],
    orderBy: js.UndefOr[js.Array[OrderBy]],
    filters: js.UndefOr[js.Array[Filter]],
    limit: js.UndefOr[Double | Null],
    startAt: js.UndefOr[Bound | Null],
    endAt: js.UndefOr[Bound | Null]
  ): Target = (^.asInstanceOf[js.Dynamic].applyDynamic("newTarget")(path.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any], orderBy.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], startAt.asInstanceOf[js.Any], endAt.asInstanceOf[js.Any])).asInstanceOf[Target]
  
  inline def stringifyTarget(target: Target): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyTarget")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def targetEquals(left: Target, right: Target): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("targetEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def targetGetArrayValues(target: Target, fieldIndex: FieldIndex): js.Array[Value] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("targetGetArrayValues")(target.asInstanceOf[js.Any], fieldIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value] | Null]
  
  inline def targetGetFieldFiltersForPath(target: Target, path: FieldPath): js.Array[FieldFilter] = (^.asInstanceOf[js.Dynamic].applyDynamic("targetGetFieldFiltersForPath")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[FieldFilter]]
  
  inline def targetGetLowerBound(target: Target, fieldIndex: FieldIndex): Bound = (^.asInstanceOf[js.Dynamic].applyDynamic("targetGetLowerBound")(target.asInstanceOf[js.Any], fieldIndex.asInstanceOf[js.Any])).asInstanceOf[Bound]
  
  inline def targetGetNotInValues(target: Target, fieldIndex: FieldIndex): js.Array[Value] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("targetGetNotInValues")(target.asInstanceOf[js.Any], fieldIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value] | Null]
  
  inline def targetGetSegmentCount(target: Target): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("targetGetSegmentCount")(target.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def targetGetUpperBound(target: Target, fieldIndex: FieldIndex): Bound = (^.asInstanceOf[js.Dynamic].applyDynamic("targetGetUpperBound")(target.asInstanceOf[js.Any], fieldIndex.asInstanceOf[js.Any])).asInstanceOf[Bound]
  
  inline def targetHasLimit(target: Target): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("targetHasLimit")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def targetIsDocumentTarget(target: Target): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("targetIsDocumentTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
