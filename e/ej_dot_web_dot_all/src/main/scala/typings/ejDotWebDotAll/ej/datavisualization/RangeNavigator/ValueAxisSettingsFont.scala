package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAxisSettingsFont extends js.Object {
  /** Text in axis render with the specified size.
    * @Default {0px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object ValueAxisSettingsFont {
  @scala.inline
  def apply(size: String = null): ValueAxisSettingsFont = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAxisSettingsFont]
  }
}

