package typings.dexie.mod

import typings.dexie.dexieStrings.deleteRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreDeleteRangeRequest
  extends StObject
     with DBCoreMutateRequest {
  
  var range: DBCoreKeyRange
  
  var trans: DBCoreTransaction
  
  var `type`: deleteRange
}
object DBCoreDeleteRangeRequest {
  
  inline def apply(range: DBCoreKeyRange, trans: DBCoreTransaction): DBCoreDeleteRangeRequest = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("deleteRange")
    __obj.asInstanceOf[DBCoreDeleteRangeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBCoreDeleteRangeRequest] (val x: Self) extends AnyVal {
    
    inline def setRange(value: DBCoreKeyRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setTrans(value: DBCoreTransaction): Self = StObject.set(x, "trans", value.asInstanceOf[js.Any])
    
    inline def setType(value: deleteRange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
