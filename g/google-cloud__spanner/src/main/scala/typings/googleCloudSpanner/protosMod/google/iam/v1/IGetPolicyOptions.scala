package typings.googleCloudSpanner.protosMod.google.iam.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetPolicyOptions. */
trait IGetPolicyOptions extends StObject {
  
  /** GetPolicyOptions requestedPolicyVersion */
  var requestedPolicyVersion: js.UndefOr[Double | Null] = js.undefined
}
object IGetPolicyOptions {
  
  inline def apply(): IGetPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetPolicyOptions]
  }
  
  extension [Self <: IGetPolicyOptions](x: Self) {
    
    inline def setRequestedPolicyVersion(value: Double): Self = StObject.set(x, "requestedPolicyVersion", value.asInstanceOf[js.Any])
    
    inline def setRequestedPolicyVersionNull: Self = StObject.set(x, "requestedPolicyVersion", null)
    
    inline def setRequestedPolicyVersionUndefined: Self = StObject.set(x, "requestedPolicyVersion", js.undefined)
  }
}
