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
  def apply(): SchemaReservationsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReservationsScopedList]
  }
  @scala.inline
  implicit class SchemaReservationsScopedListOps[Self <: SchemaReservationsScopedList] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

