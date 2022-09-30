package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.googleCloudSpanner.protosMod.google.rpc.IStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ExecuteBatchDmlResponse. */
trait IExecuteBatchDmlResponse extends StObject {
  
  /** ExecuteBatchDmlResponse resultSets */
  var resultSets: js.UndefOr[js.Array[IResultSet] | Null] = js.undefined
  
  /** ExecuteBatchDmlResponse status */
  var status: js.UndefOr[IStatus | Null] = js.undefined
}
object IExecuteBatchDmlResponse {
  
  inline def apply(): IExecuteBatchDmlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExecuteBatchDmlResponse]
  }
  
  extension [Self <: IExecuteBatchDmlResponse](x: Self) {
    
    inline def setResultSets(value: js.Array[IResultSet]): Self = StObject.set(x, "resultSets", value.asInstanceOf[js.Any])
    
    inline def setResultSetsNull: Self = StObject.set(x, "resultSets", null)
    
    inline def setResultSetsUndefined: Self = StObject.set(x, "resultSets", js.undefined)
    
    inline def setResultSetsVarargs(value: IResultSet*): Self = StObject.set(x, "resultSets", js.Array(value*))
    
    inline def setStatus(value: IStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
