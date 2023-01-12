package typings.dexie.mod

import typings.dexie.anon.Index
import typings.dexie.dexieStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreDeleteRequest
  extends StObject
     with DBCoreMutateRequest {
  
  var criteria: js.UndefOr[Index] = js.undefined
  
  var keys: js.Array[Any]
  
  var trans: DBCoreTransaction
  
  var `type`: delete
}
object DBCoreDeleteRequest {
  
  inline def apply(keys: js.Array[Any], trans: DBCoreTransaction): DBCoreDeleteRequest = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[DBCoreDeleteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBCoreDeleteRequest] (val x: Self) extends AnyVal {
    
    inline def setCriteria(value: Index): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setKeys(value: js.Array[Any]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: Any*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setTrans(value: DBCoreTransaction): Self = StObject.set(x, "trans", value.asInstanceOf[js.Any])
    
    inline def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
