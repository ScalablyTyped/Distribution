package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeColorMapping extends js.Object {
  /** Specifies the color value for rangeColorMapping.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** Specifies the from value for rangeColorMapping.
    * @Default {-1}
    */
  var from: js.UndefOr[Double] = js.native
  /** specifies the gradient colors for th given range value
    * @Default {[]}
    */
  var gradientColors: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the legend label value for rangeColorMapping.
    * @Default {null}
    */
  var legendLabel: js.UndefOr[String] = js.native
  /** Specifies the to value for rangeColorMapping.
    * @Default {-1}
    */
  var to: js.UndefOr[Double] = js.native
}

object RangeColorMapping {
  @scala.inline
  def apply(): RangeColorMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeColorMapping]
  }
  @scala.inline
  implicit class RangeColorMappingOps[Self <: RangeColorMapping] (val x: Self) extends AnyVal {
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
    def setGradientColorsVarargs(value: js.Any*): Self = this.set("gradientColors", js.Array(value :_*))
    @scala.inline
    def setGradientColors(value: js.Array[_]): Self = this.set("gradientColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientColors: Self = this.set("gradientColors", js.undefined)
    @scala.inline
    def setLegendLabel(value: String): Self = this.set("legendLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendLabel: Self = this.set("legendLabel", js.undefined)
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

