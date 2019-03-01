package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SymbolPaletteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Palette extends js.Object {
  /** Defines whether the palette must be in expanded state or in collapsed state
    * @Default {true}
    */
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the palette items
    * @Default {[]}
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines the name of the palette
    * @Default {null}
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Palette {
  @scala.inline
  def apply(
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    items: js.Array[_] = null,
    name: java.lang.String = null
  ): Palette = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (items != null) __obj.updateDynamic("items")(items)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Palette]
  }
}

