package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAxisSettingsFont extends js.Object {
  /** Text in axis render with the specified size.
    * @Default {0px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object ValueAxisSettingsFont {
  @scala.inline
  def apply(size: java.lang.String = null): ValueAxisSettingsFont = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ValueAxisSettingsFont]
  }
}

