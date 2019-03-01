package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSettings extends js.Object {
  /** Height of the TreeGrid.
    * @Default {450px}
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Width of the TreeGrid.
    * @Default {100%}
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

