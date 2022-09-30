package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreGetRequest extends StObject {
  
  var key: Any
  
  var trans: DBCoreTransaction
}
object DBCoreGetRequest {
  
  inline def apply(key: Any, trans: DBCoreTransaction): DBCoreGetRequest = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreGetRequest]
  }
  
  extension [Self <: DBCoreGetRequest](x: Self) {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setTrans(value: DBCoreTransaction): Self = StObject.set(x, "trans", value.asInstanceOf[js.Any])
  }
}
