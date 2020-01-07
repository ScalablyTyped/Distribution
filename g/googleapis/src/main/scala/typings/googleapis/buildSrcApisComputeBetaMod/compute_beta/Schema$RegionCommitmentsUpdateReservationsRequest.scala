package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RegionCommitmentsUpdateReservationsRequest extends js.Object {
  /**
    * List of reservations for the capacity move of VMs with accelerators and
    * local ssds.
    */
  var reservations: js.UndefOr[js.Array[Schema$Reservation]] = js.native
}

object Schema$RegionCommitmentsUpdateReservationsRequest {
  @scala.inline
  def apply(reservations: js.Array[Schema$Reservation] = null): Schema$RegionCommitmentsUpdateReservationsRequest = {
    val __obj = js.Dynamic.literal()
    if (reservations != null) __obj.updateDynamic("reservations")(reservations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionCommitmentsUpdateReservationsRequest]
  }
}

