package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetingRuleScope extends StObject {
  
  /**
    * The scope of the current targeting rule is the subscription with the specified subscription ID. Must be a subscription within the same parent app.
    */
  var specificSubscriptionInApp: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetingRuleScope {
  
  inline def apply(): SchemaTargetingRuleScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingRuleScope]
  }
  
  extension [Self <: SchemaTargetingRuleScope](x: Self) {
    
    inline def setSpecificSubscriptionInApp(value: String): Self = StObject.set(x, "specificSubscriptionInApp", value.asInstanceOf[js.Any])
    
    inline def setSpecificSubscriptionInAppNull: Self = StObject.set(x, "specificSubscriptionInApp", null)
    
    inline def setSpecificSubscriptionInAppUndefined: Self = StObject.set(x, "specificSubscriptionInApp", js.undefined)
  }
}
