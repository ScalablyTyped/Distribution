package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetPolicyOptions. */
trait IGetPolicyOptions extends StObject {
  
  /** GetPolicyOptions requestedPolicyVersion */
  var requestedPolicyVersion: js.UndefOr[Double | Null] = js.undefined
}
object IGetPolicyOptions {
  
  @scala.inline
  def apply(): IGetPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetPolicyOptions]
  }
  
  @scala.inline
  implicit class IGetPolicyOptionsMutableBuilder[Self <: IGetPolicyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestedPolicyVersion(value: Double): Self = StObject.set(x, "requestedPolicyVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedPolicyVersionNull: Self = StObject.set(x, "requestedPolicyVersion", null)
    
    @scala.inline
    def setRequestedPolicyVersionUndefined: Self = StObject.set(x, "requestedPolicyVersion", js.undefined)
  }
}
