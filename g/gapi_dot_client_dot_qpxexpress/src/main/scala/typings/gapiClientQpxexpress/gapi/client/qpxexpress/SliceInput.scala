package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliceInput extends js.Object {
  /**
    * Slices with only the carriers in this alliance should be returned; do not use this field with permittedCarrier. Allowed values are ONEWORLD, SKYTEAM,
    * and STAR.
    */
  var alliance: js.UndefOr[String] = js.native
  /** Departure date in YYYY-MM-DD format. */
  var date: js.UndefOr[String] = js.native
  /** Airport or city IATA designator of the destination. */
  var destination: js.UndefOr[String] = js.native
  /** Identifies this as a slice input object, representing the criteria a desired slice must satisfy. Value: the fixed string qpxexpress#sliceInput. */
  var kind: js.UndefOr[String] = js.native
  /** The longest connection between two legs, in minutes, you are willing to accept. */
  var maxConnectionDuration: js.UndefOr[Double] = js.native
  /** The maximum number of stops you are willing to accept in this slice. */
  var maxStops: js.UndefOr[Double] = js.native
  /** Airport or city IATA designator of the origin. */
  var origin: js.UndefOr[String] = js.native
  /** A list of 2-letter IATA airline designators. Slices with only these carriers should be returned. */
  var permittedCarrier: js.UndefOr[js.Array[String]] = js.native
  /** Slices must depart in this time of day range, local to the point of departure. */
  var permittedDepartureTime: js.UndefOr[TimeOfDayRange] = js.native
  /** Prefer solutions that book in this cabin for this slice. Allowed values are COACH, PREMIUM_COACH, BUSINESS, and FIRST. */
  var preferredCabin: js.UndefOr[String] = js.native
  /** A list of 2-letter IATA airline designators. Exclude slices that use these carriers. */
  var prohibitedCarrier: js.UndefOr[js.Array[String]] = js.native
}

object SliceInput {
  @scala.inline
  def apply(): SliceInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliceInput]
  }
  @scala.inline
  implicit class SliceInputOps[Self <: SliceInput] (val x: Self) extends AnyVal {
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
    def setAlliance(value: String): Self = this.set("alliance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlliance: Self = this.set("alliance", js.undefined)
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMaxConnectionDuration(value: Double): Self = this.set("maxConnectionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConnectionDuration: Self = this.set("maxConnectionDuration", js.undefined)
    @scala.inline
    def setMaxStops(value: Double): Self = this.set("maxStops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxStops: Self = this.set("maxStops", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setPermittedCarrierVarargs(value: String*): Self = this.set("permittedCarrier", js.Array(value :_*))
    @scala.inline
    def setPermittedCarrier(value: js.Array[String]): Self = this.set("permittedCarrier", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermittedCarrier: Self = this.set("permittedCarrier", js.undefined)
    @scala.inline
    def setPermittedDepartureTime(value: TimeOfDayRange): Self = this.set("permittedDepartureTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermittedDepartureTime: Self = this.set("permittedDepartureTime", js.undefined)
    @scala.inline
    def setPreferredCabin(value: String): Self = this.set("preferredCabin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredCabin: Self = this.set("preferredCabin", js.undefined)
    @scala.inline
    def setProhibitedCarrierVarargs(value: String*): Self = this.set("prohibitedCarrier", js.Array(value :_*))
    @scala.inline
    def setProhibitedCarrier(value: js.Array[String]): Self = this.set("prohibitedCarrier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProhibitedCarrier: Self = this.set("prohibitedCarrier", js.undefined)
  }
  
}

