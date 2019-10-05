package typings.ejDotWebDotAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaletteColorMapping extends js.Object {
  /** Specifies the colors of the paletteColorMapping
    * @Default {[]}
    */
  var colors: js.UndefOr[js.Array[_]] = js.undefined
}

object PaletteColorMapping {
  @scala.inline
  def apply(colors: js.Array[_] = null): PaletteColorMapping = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    __obj.asInstanceOf[PaletteColorMapping]
  }
}

