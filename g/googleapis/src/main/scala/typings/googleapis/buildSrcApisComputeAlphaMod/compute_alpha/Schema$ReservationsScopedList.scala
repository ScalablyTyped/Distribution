package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ReservationsScopedList extends js.Object {
  /**
    * A list of reservations contained in this scope.
    */
  var reservations: js.UndefOr[js.Array[Schema$Reservation]] = js.native
  /**
    * Informational warning which replaces the list of reservations when the
    * list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$ReservationsScopedList {
  @scala.inline
  def apply(reservations: js.Array[Schema$Reservation] = null, warning: Anon_Code = null): Schema$ReservationsScopedList = {
    val __obj = js.Dynamic.literal()
    if (reservations != null) __obj.updateDynamic("reservations")(reservations.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReservationsScopedList]
  }
}

