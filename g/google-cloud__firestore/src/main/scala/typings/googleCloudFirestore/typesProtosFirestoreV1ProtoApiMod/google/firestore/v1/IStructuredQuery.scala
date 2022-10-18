package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.ICollectionSelector
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.IFilter
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.IOrder
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.IProjection
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf.IInt32Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StructuredQuery. */
trait IStructuredQuery extends StObject {
  
  /** StructuredQuery endAt */
  var endAt: js.UndefOr[ICursor | Null] = js.undefined
  
  /** StructuredQuery from */
  var from: js.UndefOr[js.Array[ICollectionSelector] | Null] = js.undefined
  
  /** StructuredQuery limit */
  var limit: js.UndefOr[IInt32Value | Null] = js.undefined
  
  /** StructuredQuery offset */
  var offset: js.UndefOr[Double | Null] = js.undefined
  
  /** StructuredQuery orderBy */
  var orderBy: js.UndefOr[js.Array[IOrder] | Null] = js.undefined
  
  /** StructuredQuery select */
  var select: js.UndefOr[IProjection | Null] = js.undefined
  
  /** StructuredQuery startAt */
  var startAt: js.UndefOr[ICursor | Null] = js.undefined
  
  /** StructuredQuery where */
  var where: js.UndefOr[IFilter | Null] = js.undefined
}
object IStructuredQuery {
  
  inline def apply(): IStructuredQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStructuredQuery]
  }
  
  extension [Self <: IStructuredQuery](x: Self) {
    
    inline def setEndAt(value: ICursor): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
    
    inline def setEndAtNull: Self = StObject.set(x, "endAt", null)
    
    inline def setEndAtUndefined: Self = StObject.set(x, "endAt", js.undefined)
    
    inline def setFrom(value: js.Array[ICollectionSelector]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFromVarargs(value: ICollectionSelector*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setLimit(value: IInt32Value): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitNull: Self = StObject.set(x, "limit", null)
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrderBy(value: js.Array[IOrder]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByNull: Self = StObject.set(x, "orderBy", null)
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setOrderByVarargs(value: IOrder*): Self = StObject.set(x, "orderBy", js.Array(value*))
    
    inline def setSelect(value: IProjection): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectNull: Self = StObject.set(x, "select", null)
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setStartAt(value: ICursor): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    inline def setStartAtNull: Self = StObject.set(x, "startAt", null)
    
    inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
    
    inline def setWhere(value: IFilter): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereNull: Self = StObject.set(x, "where", null)
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
