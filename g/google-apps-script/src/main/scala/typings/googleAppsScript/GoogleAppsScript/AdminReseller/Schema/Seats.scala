package typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Seats extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var licensedNumberOfSeats: js.UndefOr[Double] = js.native
  var maximumNumberOfSeats: js.UndefOr[Double] = js.native
  var numberOfSeats: js.UndefOr[Double] = js.native
}

object Seats {
  @scala.inline
  def apply(): Seats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seats]
  }
  @scala.inline
  implicit class SeatsOps[Self <: Seats] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLicensedNumberOfSeats(value: Double): Self = this.set("licensedNumberOfSeats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicensedNumberOfSeats: Self = this.set("licensedNumberOfSeats", js.undefined)
    @scala.inline
    def setMaximumNumberOfSeats(value: Double): Self = this.set("maximumNumberOfSeats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumNumberOfSeats: Self = this.set("maximumNumberOfSeats", js.undefined)
    @scala.inline
    def setNumberOfSeats(value: Double): Self = this.set("numberOfSeats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfSeats: Self = this.set("numberOfSeats", js.undefined)
  }
  
}

