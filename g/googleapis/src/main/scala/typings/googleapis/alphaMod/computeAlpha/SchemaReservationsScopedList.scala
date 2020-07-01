package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaReservationsScopedList extends js.Object {
  /**
    * A list of reservations contained in this scope.
    */
  var reservations: js.UndefOr[js.Array[SchemaReservation]] = js.native
  /**
    * Informational warning which replaces the list of reservations when the
    * list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaReservationsScopedList {
  @scala.inline
  def apply(reservations: js.Array[SchemaReservation] = null, warning: Code = null): SchemaReservationsScopedList = {
    val __obj = js.Dynamic.literal()
    if (reservations != null) __obj.updateDynamic("reservations")(reservations.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReservationsScopedList]
  }
}

