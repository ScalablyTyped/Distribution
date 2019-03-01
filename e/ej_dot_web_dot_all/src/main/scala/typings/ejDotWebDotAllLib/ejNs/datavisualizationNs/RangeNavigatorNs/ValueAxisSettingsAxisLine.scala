package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAxisSettingsAxisLine extends js.Object {
  /** Toggles the visibility of axis line.
    * @Default {none}
    */
  var visible: js.UndefOr[java.lang.String] = js.undefined
}

object ValueAxisSettingsAxisLine {
  @scala.inline
  def apply(visible: java.lang.String = null): ValueAxisSettingsAxisLine = {
    val __obj = js.Dynamic.literal()
    if (visible != null) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ValueAxisSettingsAxisLine]
  }
}

