package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAcquisitionTargetingRule extends StObject {
  
  /**
    * Required. The scope of subscriptions this rule considers. Only allows "this subscription" and "any subscription in app".
    */
  var scope: js.UndefOr[SchemaTargetingRuleScope] = js.undefined
}
object SchemaAcquisitionTargetingRule {
  
  inline def apply(): SchemaAcquisitionTargetingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcquisitionTargetingRule]
  }
  
  extension [Self <: SchemaAcquisitionTargetingRule](x: Self) {
    
    inline def setScope(value: SchemaTargetingRuleScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
