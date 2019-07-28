package typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSettings extends js.Object {
  /** Specifies height of the range navigator.
    * @Default {null}
    */
  var height: js.UndefOr[String] = js.undefined
  /** Specifies width of the range navigator.
    * @Default {null}
    */
  var width: js.UndefOr[String] = js.undefined
}

object SizeSettings {
  @scala.inline
  def apply(height: String = null, width: String = null): SizeSettings = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SizeSettings]
  }
}

