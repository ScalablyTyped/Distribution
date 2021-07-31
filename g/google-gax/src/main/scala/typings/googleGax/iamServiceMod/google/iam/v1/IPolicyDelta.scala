package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PolicyDelta. */
trait IPolicyDelta extends StObject {
  
  /** PolicyDelta auditConfigDeltas */
  var auditConfigDeltas: js.UndefOr[js.Array[IAuditConfigDelta] | Null] = js.undefined
  
  /** PolicyDelta bindingDeltas */
  var bindingDeltas: js.UndefOr[js.Array[IBindingDelta] | Null] = js.undefined
}
object IPolicyDelta {
  
  @scala.inline
  def apply(): IPolicyDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolicyDelta]
  }
  
  @scala.inline
  implicit class IPolicyDeltaMutableBuilder[Self <: IPolicyDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuditConfigDeltas(value: js.Array[IAuditConfigDelta]): Self = StObject.set(x, "auditConfigDeltas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditConfigDeltasNull: Self = StObject.set(x, "auditConfigDeltas", null)
    
    @scala.inline
    def setAuditConfigDeltasUndefined: Self = StObject.set(x, "auditConfigDeltas", js.undefined)
    
    @scala.inline
    def setAuditConfigDeltasVarargs(value: IAuditConfigDelta*): Self = StObject.set(x, "auditConfigDeltas", js.Array(value :_*))
    
    @scala.inline
    def setBindingDeltas(value: js.Array[IBindingDelta]): Self = StObject.set(x, "bindingDeltas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingDeltasNull: Self = StObject.set(x, "bindingDeltas", null)
    
    @scala.inline
    def setBindingDeltasUndefined: Self = StObject.set(x, "bindingDeltas", js.undefined)
    
    @scala.inline
    def setBindingDeltasVarargs(value: IBindingDelta*): Self = StObject.set(x, "bindingDeltas", js.Array(value :_*))
  }
}
