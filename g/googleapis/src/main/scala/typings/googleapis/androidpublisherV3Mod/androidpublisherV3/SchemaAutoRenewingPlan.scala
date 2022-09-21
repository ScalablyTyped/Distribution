package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoRenewingPlan extends StObject {
  
  /**
    * If the subscription is currently set to auto-renew, e.g. the user has not canceled the subscription
    */
  var autoRenewEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAutoRenewingPlan {
  
  inline def apply(): SchemaAutoRenewingPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoRenewingPlan]
  }
  
  extension [Self <: SchemaAutoRenewingPlan](x: Self) {
    
    inline def setAutoRenewEnabled(value: Boolean): Self = StObject.set(x, "autoRenewEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoRenewEnabledNull: Self = StObject.set(x, "autoRenewEnabled", null)
    
    inline def setAutoRenewEnabledUndefined: Self = StObject.set(x, "autoRenewEnabled", js.undefined)
  }
}
