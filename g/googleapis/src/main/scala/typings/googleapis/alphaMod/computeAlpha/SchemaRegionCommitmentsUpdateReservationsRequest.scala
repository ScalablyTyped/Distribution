package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRegionCommitmentsUpdateReservationsRequest extends js.Object {
  
  /**
    * List of reservations for the capacity move of VMs with accelerators and
    * local ssds.
    */
  var reservations: js.UndefOr[js.Array[SchemaReservation]] = js.native
}
object SchemaRegionCommitmentsUpdateReservationsRequest {
  
  @scala.inline
  def apply(): SchemaRegionCommitmentsUpdateReservationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionCommitmentsUpdateReservationsRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionCommitmentsUpdateReservationsRequestOps[Self <: SchemaRegionCommitmentsUpdateReservationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReservationsVarargs(value: SchemaReservation*): Self = this.set("reservations", js.Array(value :_*))
    
    @scala.inline
    def setReservations(value: js.Array[SchemaReservation]): Self = this.set("reservations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservations: Self = this.set("reservations", js.undefined)
  }
}
