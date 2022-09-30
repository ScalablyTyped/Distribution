package typings.googleCloudSpanner.protosMod.google.rpc

import typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.IViolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a QuotaFailure. */
trait IQuotaFailure extends StObject {
  
  /** QuotaFailure violations */
  var violations: js.UndefOr[js.Array[IViolation] | Null] = js.undefined
}
object IQuotaFailure {
  
  inline def apply(): IQuotaFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQuotaFailure]
  }
  
  extension [Self <: IQuotaFailure](x: Self) {
    
    inline def setViolations(value: js.Array[IViolation]): Self = StObject.set(x, "violations", value.asInstanceOf[js.Any])
    
    inline def setViolationsNull: Self = StObject.set(x, "violations", null)
    
    inline def setViolationsUndefined: Self = StObject.set(x, "violations", js.undefined)
    
    inline def setViolationsVarargs(value: IViolation*): Self = StObject.set(x, "violations", js.Array(value*))
  }
}
