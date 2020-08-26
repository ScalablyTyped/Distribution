package typings.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorStatistics extends js.Object {
  var Maximum: String = js.native
  var Mean: String = js.native
  var Minimum: String = js.native
  var `Standard Deviation`: String = js.native
}

object ColorStatistics {
  @scala.inline
  def apply(Maximum: String, Mean: String, Minimum: String, `Standard Deviation`: String): ColorStatistics = {
    val __obj = js.Dynamic.literal(Maximum = Maximum.asInstanceOf[js.Any], Mean = Mean.asInstanceOf[js.Any], Minimum = Minimum.asInstanceOf[js.Any])
    __obj.updateDynamic("Standard Deviation")((`Standard Deviation`).asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStatistics]
  }
  @scala.inline
  implicit class ColorStatisticsOps[Self <: ColorStatistics] (val x: Self) extends AnyVal {
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
    def setMaximum(value: String): Self = this.set("Maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def setMean(value: String): Self = this.set("Mean", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimum(value: String): Self = this.set("Minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def `setStandard Deviation`(value: String): Self = this.set("Standard Deviation", value.asInstanceOf[js.Any])
  }
  
}

