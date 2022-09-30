package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreCountRequest extends StObject {
  
  var query: DBCoreQuery
  
  var trans: DBCoreTransaction
}
object DBCoreCountRequest {
  
  inline def apply(query: DBCoreQuery, trans: DBCoreTransaction): DBCoreCountRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreCountRequest]
  }
  
  extension [Self <: DBCoreCountRequest](x: Self) {
    
    inline def setQuery(value: DBCoreQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setTrans(value: DBCoreTransaction): Self = StObject.set(x, "trans", value.asInstanceOf[js.Any])
  }
}
