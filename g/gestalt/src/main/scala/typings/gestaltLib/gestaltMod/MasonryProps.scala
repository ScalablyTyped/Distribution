package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasonryProps extends js.Object {
  var columnWidth: js.UndefOr[scala.Double] = js.undefined
  var comp: reactLib.reactMod.ReactNs.ComponentType[js.Object]
  var flexible: js.UndefOr[scala.Boolean] = js.undefined
  var gutterWidth: js.UndefOr[scala.Double] = js.undefined
  var items: js.Array[_]
  var layout: js.UndefOr[
    gestaltLib.gestaltLibStrings.MasonryDefaultLayout | gestaltLib.gestaltLibStrings.MasonryUniformRowLayout
  ] = js.undefined
  var loadItems: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var measurementStore: js.UndefOr[js.Any] = js.undefined
  var minCols: js.UndefOr[scala.Double] = js.undefined
  var scrollContainer: js.UndefOr[js.Function0[reactLib.HTMLElement]] = js.undefined
  var virtualize: js.UndefOr[scala.Boolean] = js.undefined
}

object MasonryProps {
  @scala.inline
  def apply(
    comp: reactLib.reactMod.ReactNs.ComponentType[js.Object],
    items: js.Array[_],
    columnWidth: scala.Int | scala.Double = null,
    flexible: js.UndefOr[scala.Boolean] = js.undefined,
    gutterWidth: scala.Int | scala.Double = null,
    layout: gestaltLib.gestaltLibStrings.MasonryDefaultLayout | gestaltLib.gestaltLibStrings.MasonryUniformRowLayout = null,
    loadItems: js.Function0[scala.Unit] = null,
    measurementStore: js.Any = null,
    minCols: scala.Int | scala.Double = null,
    scrollContainer: js.Function0[reactLib.HTMLElement] = null,
    virtualize: js.UndefOr[scala.Boolean] = js.undefined
  ): MasonryProps = {
    val __obj = js.Dynamic.literal(comp = comp.asInstanceOf[js.Any], items = items)
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(flexible)) __obj.updateDynamic("flexible")(flexible)
    if (gutterWidth != null) __obj.updateDynamic("gutterWidth")(gutterWidth.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (loadItems != null) __obj.updateDynamic("loadItems")(loadItems)
    if (measurementStore != null) __obj.updateDynamic("measurementStore")(measurementStore)
    if (minCols != null) __obj.updateDynamic("minCols")(minCols.asInstanceOf[js.Any])
    if (scrollContainer != null) __obj.updateDynamic("scrollContainer")(scrollContainer)
    if (!js.isUndefined(virtualize)) __obj.updateDynamic("virtualize")(virtualize)
    __obj.asInstanceOf[MasonryProps]
  }
}

