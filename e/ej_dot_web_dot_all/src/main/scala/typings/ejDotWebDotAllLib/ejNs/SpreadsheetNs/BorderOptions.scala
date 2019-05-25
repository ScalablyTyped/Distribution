package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderOptions extends js.Object {
  /** Pass the color to set border of the cell
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the style to set border of the cell
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the type to set border of the cell
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BorderOptions {
  @scala.inline
  def apply(color: java.lang.String = null, style: java.lang.String = null, `type`: java.lang.String = null): BorderOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BorderOptions]
  }
}

