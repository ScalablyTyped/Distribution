package typings.gestalt.mod

import typings.gestalt.anon.Data
import typings.gestalt.gestaltStrings.MasonryDefaultLayout
import typings.gestalt.gestaltStrings.MasonryUniformRowLayout
import typings.react.mod.ComponentType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasonryProps extends js.Object {
  var columnWidth: js.UndefOr[Double] = js.undefined
  var comp: ComponentType[Data]
  var flexible: js.UndefOr[Boolean] = js.undefined
  var gutterWidth: js.UndefOr[Double] = js.undefined
  var items: js.Array[_]
  var layout: js.UndefOr[MasonryDefaultLayout | MasonryUniformRowLayout] = js.undefined
  var loadItems: js.UndefOr[js.Function0[Unit]] = js.undefined
  var measurementStore: js.UndefOr[js.Any] = js.undefined
  var minCols: js.UndefOr[Double] = js.undefined
  var scrollContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var virtualBoundsBottom: js.UndefOr[Double] = js.undefined
  var virtualBoundsTop: js.UndefOr[Double] = js.undefined
  var virtualize: js.UndefOr[Boolean] = js.undefined
}

object MasonryProps {
  @scala.inline
  def apply(
    comp: ComponentType[Data],
    items: js.Array[_],
    columnWidth: js.UndefOr[Double] = js.undefined,
    flexible: js.UndefOr[Boolean] = js.undefined,
    gutterWidth: js.UndefOr[Double] = js.undefined,
    layout: MasonryDefaultLayout | MasonryUniformRowLayout = null,
    loadItems: () => Unit = null,
    measurementStore: js.Any = null,
    minCols: js.UndefOr[Double] = js.undefined,
    scrollContainer: () => HTMLElement = null,
    virtualBoundsBottom: js.UndefOr[Double] = js.undefined,
    virtualBoundsTop: js.UndefOr[Double] = js.undefined,
    virtualize: js.UndefOr[Boolean] = js.undefined
  ): MasonryProps = {
    val __obj = js.Dynamic.literal(comp = comp.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    if (!js.isUndefined(columnWidth)) __obj.updateDynamic("columnWidth")(columnWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flexible)) __obj.updateDynamic("flexible")(flexible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gutterWidth)) __obj.updateDynamic("gutterWidth")(gutterWidth.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (loadItems != null) __obj.updateDynamic("loadItems")(js.Any.fromFunction0(loadItems))
    if (measurementStore != null) __obj.updateDynamic("measurementStore")(measurementStore.asInstanceOf[js.Any])
    if (!js.isUndefined(minCols)) __obj.updateDynamic("minCols")(minCols.get.asInstanceOf[js.Any])
    if (scrollContainer != null) __obj.updateDynamic("scrollContainer")(js.Any.fromFunction0(scrollContainer))
    if (!js.isUndefined(virtualBoundsBottom)) __obj.updateDynamic("virtualBoundsBottom")(virtualBoundsBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualBoundsTop)) __obj.updateDynamic("virtualBoundsTop")(virtualBoundsTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualize)) __obj.updateDynamic("virtualize")(virtualize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryProps]
  }
}

