package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreQueryRequest extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var query: DBCoreQuery
  
  var trans: DBCoreTransaction
  
  var values: js.UndefOr[Boolean] = js.undefined
}
object DBCoreQueryRequest {
  
  inline def apply(query: DBCoreQuery, trans: DBCoreTransaction): DBCoreQueryRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreQueryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBCoreQueryRequest] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setQuery(value: DBCoreQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setTrans(value: DBCoreTransaction): Self = StObject.set(x, "trans", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
