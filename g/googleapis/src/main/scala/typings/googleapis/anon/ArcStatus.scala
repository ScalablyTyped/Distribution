package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcStatus extends StObject {
  
  var arcStatus: js.UndefOr[String] = js.native
  
  var dealId: js.UndefOr[String] = js.native
  
  var webPropertyId: js.UndefOr[Double] = js.native
}
object ArcStatus {
  
  @scala.inline
  def apply(): ArcStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcStatus]
  }
  
  @scala.inline
  implicit class ArcStatusMutableBuilder[Self <: ArcStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArcStatus(value: String): Self = StObject.set(x, "arcStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcStatusUndefined: Self = StObject.set(x, "arcStatus", js.undefined)
    
    @scala.inline
    def setDealId(value: String): Self = StObject.set(x, "dealId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealIdUndefined: Self = StObject.set(x, "dealId", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: Double): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
