package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointStyle extends js.Object {
  /** Name of the icon. Use values defined in http://www.google.com/fusiontables/DataSource?dsrcid=308519 */
  var iconName: js.UndefOr[java.lang.String] = js.undefined
  /** Column or a bucket value from which the icon name is to be determined. */
  var iconStyler: js.UndefOr[StyleFunction] = js.undefined
}

object PointStyle {
  @scala.inline
  def apply(iconName: java.lang.String = null, iconStyler: StyleFunction = null): PointStyle = {
    val __obj = js.Dynamic.literal()
    if (iconName != null) __obj.updateDynamic("iconName")(iconName)
    if (iconStyler != null) __obj.updateDynamic("iconStyler")(iconStyler)
    __obj.asInstanceOf[PointStyle]
  }
}

