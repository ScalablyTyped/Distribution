package typings.dexie.mod

import typings.dexie.dexieStrings.add
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreAddRequest
  extends StObject
     with DBCoreMutateRequest {
  
  var keys: js.UndefOr[js.Array[Any]] = js.undefined
  
  var trans: DBCoreTransaction
  
  var `type`: add
  
  var values: js.Array[Any]
  
  /** @deprecated Will always get results since 3.1.0-alpha.5 */
  var wantResults: js.UndefOr[Boolean] = js.undefined
}
object DBCoreAddRequest {
  
  inline def apply(trans: DBCoreTransaction, values: js.Array[Any]): DBCoreAddRequest = {
    val __obj = js.Dynamic.literal(trans = trans.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("add")
    __obj.asInstanceOf[DBCoreAddRequest]
  }
  
  extension [Self <: DBCoreAddRequest](x: Self) {
    
    inline def setKeys(value: js.Array[Any]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: Any*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setTrans(value: DBCoreTransaction): Self = StObject.set(x, "trans", value.asInstanceOf[js.Any])
    
    inline def setType(value: add): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setWantResults(value: Boolean): Self = StObject.set(x, "wantResults", value.asInstanceOf[js.Any])
    
    inline def setWantResultsUndefined: Self = StObject.set(x, "wantResults", js.undefined)
  }
}
