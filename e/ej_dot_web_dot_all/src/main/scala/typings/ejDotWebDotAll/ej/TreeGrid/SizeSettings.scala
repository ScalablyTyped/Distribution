package typings.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSettings extends js.Object {
  /** Height of the TreeGrid.
    * @Default {450px}
    */
  var height: js.UndefOr[String] = js.undefined
  /** Width of the TreeGrid.
    * @Default {100%}
    */
  var width: js.UndefOr[String] = js.undefined
}

object SizeSettings {
  @scala.inline
  def apply(height: String = null, width: String = null): SizeSettings = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSettings]
  }
}

