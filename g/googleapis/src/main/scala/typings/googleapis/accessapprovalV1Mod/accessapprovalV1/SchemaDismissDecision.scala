package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDismissDecision extends StObject {
  
  /**
    * The time at which the approval request was dismissed.
    */
  var dismissTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field will be true if the ApprovalRequest was implicitly dismissed due to inaction by the access approval approvers (the request is not acted on by the approvers before the exiration time).
    */
  var `implicit`: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDismissDecision {
  
  inline def apply(): SchemaDismissDecision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDismissDecision]
  }
  
  extension [Self <: SchemaDismissDecision](x: Self) {
    
    inline def setDismissTime(value: String): Self = StObject.set(x, "dismissTime", value.asInstanceOf[js.Any])
    
    inline def setDismissTimeNull: Self = StObject.set(x, "dismissTime", null)
    
    inline def setDismissTimeUndefined: Self = StObject.set(x, "dismissTime", js.undefined)
    
    inline def setImplicit(value: Boolean): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
    
    inline def setImplicitNull: Self = StObject.set(x, "implicit", null)
    
    inline def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
  }
}
