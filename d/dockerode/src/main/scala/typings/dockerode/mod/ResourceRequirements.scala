package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceRequirements extends StObject {
  
  var Limits: js.UndefOr[ResourceLimits] = js.undefined
  
  var Reservations: js.UndefOr[Resources] = js.undefined
}
object ResourceRequirements {
  
  @scala.inline
  def apply(): ResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceRequirements]
  }
  
  @scala.inline
  implicit class ResourceRequirementsMutableBuilder[Self <: ResourceRequirements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimits(value: ResourceLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
    
    @scala.inline
    def setReservations(value: Resources): Self = StObject.set(x, "Reservations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationsUndefined: Self = StObject.set(x, "Reservations", js.undefined)
  }
}
