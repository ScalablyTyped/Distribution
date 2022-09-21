package typings.googleapis.cloudbuildV1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApprovalConfig extends StObject {
  
  /**
    * Whether or not approval is needed. If this is set on a build, it will become pending when created, and will need to be explicitly approved to start.
    */
  var approvalRequired: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaApprovalConfig {
  
  inline def apply(): SchemaApprovalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApprovalConfig]
  }
  
  extension [Self <: SchemaApprovalConfig](x: Self) {
    
    inline def setApprovalRequired(value: Boolean): Self = StObject.set(x, "approvalRequired", value.asInstanceOf[js.Any])
    
    inline def setApprovalRequiredNull: Self = StObject.set(x, "approvalRequired", null)
    
    inline def setApprovalRequiredUndefined: Self = StObject.set(x, "approvalRequired", js.undefined)
  }
}
