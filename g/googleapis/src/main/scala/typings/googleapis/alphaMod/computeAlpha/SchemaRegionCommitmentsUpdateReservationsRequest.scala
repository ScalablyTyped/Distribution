package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionCommitmentsUpdateReservationsRequest extends StObject {
  
  /**
    * List of reservations for the capacity move of VMs with accelerators and
    * local ssds.
    */
  var reservations: js.UndefOr[js.Array[SchemaReservation]] = js.undefined
}
object SchemaRegionCommitmentsUpdateReservationsRequest {
  
  @scala.inline
  def apply(): SchemaRegionCommitmentsUpdateReservationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionCommitmentsUpdateReservationsRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionCommitmentsUpdateReservationsRequestMutableBuilder[Self <: SchemaRegionCommitmentsUpdateReservationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservations(value: js.Array[SchemaReservation]): Self = StObject.set(x, "reservations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationsUndefined: Self = StObject.set(x, "reservations", js.undefined)
    
    @scala.inline
    def setReservationsVarargs(value: SchemaReservation*): Self = StObject.set(x, "reservations", js.Array(value :_*))
  }
}
