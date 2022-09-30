package typings.dexie.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dexie.anon.Index
import typings.dexie.dexieStrings.put
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCorePutRequest
  extends StObject
     with DBCoreMutateRequest {
  
  var changeSpec: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  // Common changeSpec for each key
  var changeSpecs: js.UndefOr[js.Array[StringDictionary[Any]]] = js.undefined
  
  var criteria: js.UndefOr[Index] = js.undefined
  
  var keys: js.UndefOr[js.Array[Any]] = js.undefined
  
  var trans: DBCoreTransaction
  
  var `type`: put
  
  var values: js.Array[Any]
  
  // changeSpec per key. 
  /** @deprecated Will always get results since 3.1.0-alpha.5 */
  var wantResults: js.UndefOr[Boolean] = js.undefined
}
object DBCorePutRequest {
  
  inline def apply(trans: DBCoreTransaction, values: js.Array[Any]): DBCorePutRequest = {
    val __obj = js.Dynamic.literal(trans = trans.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("put")
    __obj.asInstanceOf[DBCorePutRequest]
  }
  
  extension [Self <: DBCorePutRequest](x: Self) {
    
    inline def setChangeSpec(value: StringDictionary[Any]): Self = StObject.set(x, "changeSpec", value.asInstanceOf[js.Any])
    
    inline def setChangeSpecUndefined: Self = StObject.set(x, "changeSpec", js.undefined)
    
    inline def setChangeSpecs(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "changeSpecs", value.asInstanceOf[js.Any])
    
    inline def setChangeSpecsUndefined: Self = StObject.set(x, "changeSpecs", js.undefined)
    
    inline def setChangeSpecsVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "changeSpecs", js.Array(value*))
    
    inline def setCriteria(value: Index): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setKeys(value: js.Array[Any]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: Any*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setTrans(value: DBCoreTransaction): Self = StObject.set(x, "trans", value.asInstanceOf[js.Any])
    
    inline def setType(value: put): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setWantResults(value: Boolean): Self = StObject.set(x, "wantResults", value.asInstanceOf[js.Any])
    
    inline def setWantResultsUndefined: Self = StObject.set(x, "wantResults", js.undefined)
  }
}
