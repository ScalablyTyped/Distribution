package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapSettingsHorizontalGridLines extends js.Object {
  /** Defines the line color of horizontal grid lines
    * @Default {lightgray}
    */
  var lineColor: js.UndefOr[String] = js.native
  /** Specifies the pattern of dashes and gaps used to stroke horizontal grid lines
    */
  var lineDashArray: js.UndefOr[String] = js.native
  /** A pattern of lines and gaps that defines a set of horizontal gridlines
    * @Default {[1.25, 18.75, 0.25, 19.75, 0.25, 19.75, 0.25, 19.75, 0.25, 19.75]}
    */
  var linesInterval: js.UndefOr[js.Array[_]] = js.native
  /** Specifies a set of intervals to snap the objects
    * @Default {[20]}
    */
  var snapInterval: js.UndefOr[js.Array[_]] = js.native
}

object SnapSettingsHorizontalGridLines {
  @scala.inline
  def apply(): SnapSettingsHorizontalGridLines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapSettingsHorizontalGridLines]
  }
  @scala.inline
  implicit class SnapSettingsHorizontalGridLinesOps[Self <: SnapSettingsHorizontalGridLines] (val x: Self) extends AnyVal {
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
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    @scala.inline
    def setLineDashArray(value: String): Self = this.set("lineDashArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineDashArray: Self = this.set("lineDashArray", js.undefined)
    @scala.inline
    def setLinesIntervalVarargs(value: js.Any*): Self = this.set("linesInterval", js.Array(value :_*))
    @scala.inline
    def setLinesInterval(value: js.Array[_]): Self = this.set("linesInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinesInterval: Self = this.set("linesInterval", js.undefined)
    @scala.inline
    def setSnapIntervalVarargs(value: js.Any*): Self = this.set("snapInterval", js.Array(value :_*))
    @scala.inline
    def setSnapInterval(value: js.Array[_]): Self = this.set("snapInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapInterval: Self = this.set("snapInterval", js.undefined)
  }
  
}

