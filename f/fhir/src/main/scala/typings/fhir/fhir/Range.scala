package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of values bounded by low and high
  */
@js.native
trait Range extends Element {
  /**
    * High limit
    */
  var high: js.UndefOr[Quantity] = js.native
  /**
    * Low limit
    */
  var low: js.UndefOr[Quantity] = js.native
}

object Range {
  @scala.inline
  def apply(): Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Range]
  }
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
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
    def setHigh(value: Quantity): Self = this.set("high", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    @scala.inline
    def setLow(value: Quantity): Self = this.set("low", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
  }
  
}

