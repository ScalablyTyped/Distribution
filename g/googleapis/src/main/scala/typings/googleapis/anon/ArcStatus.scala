package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcStatus extends StObject {
  
  var arcStatus: js.UndefOr[String] = js.undefined
  
  var dealId: js.UndefOr[String] = js.undefined
  
  var webPropertyId: js.UndefOr[Double] = js.undefined
}
object ArcStatus {
  
  inline def apply(): ArcStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcStatus]
  }
  
  extension [Self <: ArcStatus](x: Self) {
    
    inline def setArcStatus(value: String): Self = StObject.set(x, "arcStatus", value.asInstanceOf[js.Any])
    
    inline def setArcStatusUndefined: Self = StObject.set(x, "arcStatus", js.undefined)
    
    inline def setDealId(value: String): Self = StObject.set(x, "dealId", value.asInstanceOf[js.Any])
    
    inline def setDealIdUndefined: Self = StObject.set(x, "dealId", js.undefined)
    
    inline def setWebPropertyId(value: Double): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
