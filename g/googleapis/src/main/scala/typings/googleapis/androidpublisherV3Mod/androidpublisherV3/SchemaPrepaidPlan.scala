package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrepaidPlan extends StObject {
  
  /**
    * After this time, the subscription is allowed for a new top-up purchase. Not present if the subscription is already extended by a top-up purchase.
    */
  var allowExtendAfterTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrepaidPlan {
  
  inline def apply(): SchemaPrepaidPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrepaidPlan]
  }
  
  extension [Self <: SchemaPrepaidPlan](x: Self) {
    
    inline def setAllowExtendAfterTime(value: String): Self = StObject.set(x, "allowExtendAfterTime", value.asInstanceOf[js.Any])
    
    inline def setAllowExtendAfterTimeNull: Self = StObject.set(x, "allowExtendAfterTime", null)
    
    inline def setAllowExtendAfterTimeUndefined: Self = StObject.set(x, "allowExtendAfterTime", js.undefined)
  }
}
