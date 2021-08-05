package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetIamPolicyRequest. */
trait IGetIamPolicyRequest extends StObject {
  
  /** GetIamPolicyRequest options */
  var options: js.UndefOr[IGetPolicyOptions | Null] = js.undefined
  
  /** GetIamPolicyRequest resource */
  var resource: js.UndefOr[String | Null] = js.undefined
}
object IGetIamPolicyRequest {
  
  inline def apply(): IGetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetIamPolicyRequest]
  }
  
  extension [Self <: IGetIamPolicyRequest](x: Self) {
    
    inline def setOptions(value: IGetPolicyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
