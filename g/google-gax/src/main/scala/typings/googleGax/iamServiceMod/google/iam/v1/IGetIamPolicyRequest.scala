package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetIamPolicyRequest. */
@js.native
trait IGetIamPolicyRequest extends StObject {
  
  /** GetIamPolicyRequest options */
  var options: js.UndefOr[IGetPolicyOptions | Null] = js.native
  
  /** GetIamPolicyRequest resource */
  var resource: js.UndefOr[String | Null] = js.native
}
object IGetIamPolicyRequest {
  
  @scala.inline
  def apply(): IGetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetIamPolicyRequest]
  }
  
  @scala.inline
  implicit class IGetIamPolicyRequestMutableBuilder[Self <: IGetIamPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: IGetPolicyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNull: Self = StObject.set(x, "resource", null)
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
