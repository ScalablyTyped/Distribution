package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAxisSettingsAxisLine extends js.Object {
  /** Toggles the visibility of axis line.
    * @Default {none}
    */
  var visible: js.UndefOr[String] = js.undefined
}

object ValueAxisSettingsAxisLine {
  @scala.inline
  def apply(visible: String = null): ValueAxisSettingsAxisLine = {
    val __obj = js.Dynamic.literal()
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAxisSettingsAxisLine]
  }
}

