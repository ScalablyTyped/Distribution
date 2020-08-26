package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassengerCounts extends js.Object {
  /** The number of passengers that are adults. */
  var adultCount: js.UndefOr[Double] = js.native
  /** The number of passengers that are children. */
  var childCount: js.UndefOr[Double] = js.native
  /** The number of passengers that are infants travelling in the lap of an adult. */
  var infantInLapCount: js.UndefOr[Double] = js.native
  /** The number of passengers that are infants each assigned a seat. */
  var infantInSeatCount: js.UndefOr[Double] = js.native
  /** Identifies this as a passenger count object, representing the number of passengers. Value: the fixed string qpxexpress#passengerCounts. */
  var kind: js.UndefOr[String] = js.native
  /** The number of passengers that are senior citizens. */
  var seniorCount: js.UndefOr[Double] = js.native
}

object PassengerCounts {
  @scala.inline
  def apply(): PassengerCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PassengerCounts]
  }
  @scala.inline
  implicit class PassengerCountsOps[Self <: PassengerCounts] (val x: Self) extends AnyVal {
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
    def setAdultCount(value: Double): Self = this.set("adultCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdultCount: Self = this.set("adultCount", js.undefined)
    @scala.inline
    def setChildCount(value: Double): Self = this.set("childCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildCount: Self = this.set("childCount", js.undefined)
    @scala.inline
    def setInfantInLapCount(value: Double): Self = this.set("infantInLapCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfantInLapCount: Self = this.set("infantInLapCount", js.undefined)
    @scala.inline
    def setInfantInSeatCount(value: Double): Self = this.set("infantInSeatCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfantInSeatCount: Self = this.set("infantInSeatCount", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSeniorCount(value: Double): Self = this.set("seniorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeniorCount: Self = this.set("seniorCount", js.undefined)
  }
  
}

