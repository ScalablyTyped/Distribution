package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructuredQuery extends StObject {
  
  var endAt: js.UndefOr[Cursor] = js.undefined
  
  var from: js.UndefOr[js.Array[CollectionSelector]] = js.undefined
  
  var limit: js.UndefOr[Double | typings.firebaseFirestore.anon.Value] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var orderBy: js.UndefOr[js.Array[Order]] = js.undefined
  
  var select: js.UndefOr[Projection] = js.undefined
  
  var startAt: js.UndefOr[Cursor] = js.undefined
  
  var where: js.UndefOr[Filter] = js.undefined
}
object StructuredQuery {
  
  inline def apply(): StructuredQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuredQuery]
  }
  
  extension [Self <: StructuredQuery](x: Self) {
    
    inline def setEndAt(value: Cursor): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
    
    inline def setEndAtUndefined: Self = StObject.set(x, "endAt", js.undefined)
    
    inline def setFrom(value: js.Array[CollectionSelector]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFromVarargs(value: CollectionSelector*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setLimit(value: Double | typings.firebaseFirestore.anon.Value): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrderBy(value: js.Array[Order]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setOrderByVarargs(value: Order*): Self = StObject.set(x, "orderBy", js.Array(value*))
    
    inline def setSelect(value: Projection): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setStartAt(value: Cursor): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
    
    inline def setWhere(value: Filter): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
