package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSettings extends js.Object {
  /** Specifies height of the range navigator.
    * @Default {null}
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies width of the range navigator.
    * @Default {null}
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object SizeSettings {
  @scala.inline
  def apply(height: java.lang.String = null, width: java.lang.String = null): SizeSettings = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SizeSettings]
  }
}

