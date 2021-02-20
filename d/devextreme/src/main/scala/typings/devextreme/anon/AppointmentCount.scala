package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentCount extends StObject {
  
  var appointmentCount: js.UndefOr[Double] = js.native
  
  var isCompact: js.UndefOr[Boolean] = js.native
}
object AppointmentCount {
  
  @scala.inline
  def apply(): AppointmentCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentCount]
  }
  
  @scala.inline
  implicit class AppointmentCountMutableBuilder[Self <: AppointmentCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointmentCount(value: Double): Self = StObject.set(x, "appointmentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentCountUndefined: Self = StObject.set(x, "appointmentCount", js.undefined)
    
    @scala.inline
    def setIsCompact(value: Boolean): Self = StObject.set(x, "isCompact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCompactUndefined: Self = StObject.set(x, "isCompact", js.undefined)
  }
}
