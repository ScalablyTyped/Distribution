package typings.googleCloudSpanner.protosMod.google.rpc

import typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.IViolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PreconditionFailure. */
trait IPreconditionFailure extends StObject {
  
  /** PreconditionFailure violations */
  var violations: js.UndefOr[js.Array[IViolation] | Null] = js.undefined
}
object IPreconditionFailure {
  
  inline def apply(): IPreconditionFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPreconditionFailure]
  }
  
  extension [Self <: IPreconditionFailure](x: Self) {
    
    inline def setViolations(value: js.Array[IViolation]): Self = StObject.set(x, "violations", value.asInstanceOf[js.Any])
    
    inline def setViolationsNull: Self = StObject.set(x, "violations", null)
    
    inline def setViolationsUndefined: Self = StObject.set(x, "violations", js.undefined)
    
    inline def setViolationsVarargs(value: IViolation*): Self = StObject.set(x, "violations", js.Array(value*))
  }
}
