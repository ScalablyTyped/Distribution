package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(reservations: js.Array[SchemaReservation] = null): SchemaRegionCommitmentsUpdateReservationsRequest = {
    val __obj = js.Dynamic.literal()
    if (reservations != null) __obj.updateDynamic("reservations")(reservations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegionCommitmentsUpdateReservationsRequest]
  }
}

