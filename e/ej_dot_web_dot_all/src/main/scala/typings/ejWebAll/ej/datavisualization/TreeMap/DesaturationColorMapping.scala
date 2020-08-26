package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DesaturationColorMapping extends js.Object {
  /** Specifies the color for desaturationColorMapping
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** Specifies the from value for desaturation color mapping
    * @Default {0}
    */
  var from: js.UndefOr[Double] = js.native
  /** Specifies the rangeMaximum value for desaturation color mapping
    * @Default {0}
    */
  var rangeMaximum: js.UndefOr[Double] = js.native
  /** Specifies the rangeMinimum value for desaturation color mapping
    * @Default {0}
    */
  var rangeMinimum: js.UndefOr[Double] = js.native
  /** Specifies the to value for desaturation color mapping
    * @Default {0}
    */
  var to: js.UndefOr[Double] = js.native
}

object DesaturationColorMapping {
  @scala.inline
  def apply(): DesaturationColorMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DesaturationColorMapping]
  }
  @scala.inline
  implicit class DesaturationColorMappingOps[Self <: DesaturationColorMapping] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setRangeMaximum(value: Double): Self = this.set("rangeMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeMaximum: Self = this.set("rangeMaximum", js.undefined)
    @scala.inline
    def setRangeMinimum(value: Double): Self = this.set("rangeMinimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeMinimum: Self = this.set("rangeMinimum", js.undefined)
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

