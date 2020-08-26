package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesErrorBar extends js.Object {
  /** Options for customizing the error bar cap.
    */
  var cap: js.UndefOr[SeriesErrorBarCap] = js.native
  /** Specifies the direction of error bar.
    * @Default {both}
    */
  var direction: js.UndefOr[ErrorBarDirection | String] = js.native
  /** Fill color of the error bar.
    * @Default {#000000}
    */
  var fill: js.UndefOr[String] = js.native
  /** Value of horizontal  error bar.
    * @Default {1}
    */
  var horizontalErrorValue: js.UndefOr[Double] = js.native
  /** Value of negative horizontal error bar.
    * @Default {1}
    */
  var horizontalNegativeErrorValue: js.UndefOr[Double] = js.native
  /** Value of positive horizontal error bar.
    * @Default {1}
    */
  var horizontalPositiveErrorValue: js.UndefOr[Double] = js.native
  /** Specifies the mode of error bar.
    * @Default {vertical}
    */
  var mode: js.UndefOr[ErrorBarMode | String] = js.native
  /** Specifies the type of error bar.
    * @Default {FixedValue}
    */
  var `type`: js.UndefOr[ErrorBarType | String] = js.native
  /** Value of vertical error bar.
    * @Default {3}
    */
  var verticalErrorValue: js.UndefOr[Double] = js.native
  /** Value of negative vertical error bar.
    * @Default {5}
    */
  var verticalNegativeErrorValue: js.UndefOr[Double] = js.native
  /** Value of positive vertical error bar.
    * @Default {5}
    */
  var verticalPositiveErrorValue: js.UndefOr[Double] = js.native
  /** Show/hides the error bar
    * @Default {visible}
    */
  var visibility: js.UndefOr[Boolean] = js.native
  /** Width of the error bar.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}

object SeriesErrorBar {
  @scala.inline
  def apply(): SeriesErrorBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesErrorBar]
  }
  @scala.inline
  implicit class SeriesErrorBarOps[Self <: SeriesErrorBar] (val x: Self) extends AnyVal {
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
    def setCap(value: SeriesErrorBarCap): Self = this.set("cap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCap: Self = this.set("cap", js.undefined)
    @scala.inline
    def setDirection(value: ErrorBarDirection | String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHorizontalErrorValue(value: Double): Self = this.set("horizontalErrorValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalErrorValue: Self = this.set("horizontalErrorValue", js.undefined)
    @scala.inline
    def setHorizontalNegativeErrorValue(value: Double): Self = this.set("horizontalNegativeErrorValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalNegativeErrorValue: Self = this.set("horizontalNegativeErrorValue", js.undefined)
    @scala.inline
    def setHorizontalPositiveErrorValue(value: Double): Self = this.set("horizontalPositiveErrorValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalPositiveErrorValue: Self = this.set("horizontalPositiveErrorValue", js.undefined)
    @scala.inline
    def setMode(value: ErrorBarMode | String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setType(value: ErrorBarType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVerticalErrorValue(value: Double): Self = this.set("verticalErrorValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalErrorValue: Self = this.set("verticalErrorValue", js.undefined)
    @scala.inline
    def setVerticalNegativeErrorValue(value: Double): Self = this.set("verticalNegativeErrorValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalNegativeErrorValue: Self = this.set("verticalNegativeErrorValue", js.undefined)
    @scala.inline
    def setVerticalPositiveErrorValue(value: Double): Self = this.set("verticalPositiveErrorValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalPositiveErrorValue: Self = this.set("verticalPositiveErrorValue", js.undefined)
    @scala.inline
    def setVisibility(value: Boolean): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

