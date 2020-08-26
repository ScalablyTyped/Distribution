package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesEmptyPointSettingsStyle extends js.Object {
  /** Options for customizing border of the empty point in the series.
    */
  var border: js.UndefOr[SeriesEmptyPointSettingsStyleBorder] = js.native
  /** Color of the empty point.
    */
  var color: js.UndefOr[String] = js.native
}

object SeriesEmptyPointSettingsStyle {
  @scala.inline
  def apply(): SeriesEmptyPointSettingsStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesEmptyPointSettingsStyle]
  }
  @scala.inline
  implicit class SeriesEmptyPointSettingsStyleOps[Self <: SeriesEmptyPointSettingsStyle] (val x: Self) extends AnyVal {
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
    def setBorder(value: SeriesEmptyPointSettingsStyleBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
  
}

