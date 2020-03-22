package typings.gestalt.mod

import typings.gestalt.AnonData
import typings.gestalt.gestaltStrings.MasonryDefaultLayout
import typings.gestalt.gestaltStrings.MasonryUniformRowLayout
import typings.react.mod.ComponentType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasonryProps extends js.Object {
  var columnWidth: js.UndefOr[Double] = js.undefined
  var comp: ComponentType[AnonData]
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
    comp: ComponentType[AnonData],
    items: js.Array[_],
    columnWidth: Int | Double = null,
    flexible: js.UndefOr[Boolean] = js.undefined,
    gutterWidth: Int | Double = null,
    layout: MasonryDefaultLayout | MasonryUniformRowLayout = null,
    loadItems: () => Unit = null,
    measurementStore: js.Any = null,
    minCols: Int | Double = null,
    scrollContainer: () => HTMLElement = null,
    virtualBoundsBottom: Int | Double = null,
    virtualBoundsTop: Int | Double = null,
    virtualize: js.UndefOr[Boolean] = js.undefined
  ): MasonryProps = {
    val __obj = js.Dynamic.literal(comp = comp.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(flexible)) __obj.updateDynamic("flexible")(flexible.asInstanceOf[js.Any])
    if (gutterWidth != null) __obj.updateDynamic("gutterWidth")(gutterWidth.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (loadItems != null) __obj.updateDynamic("loadItems")(js.Any.fromFunction0(loadItems))
    if (measurementStore != null) __obj.updateDynamic("measurementStore")(measurementStore.asInstanceOf[js.Any])
    if (minCols != null) __obj.updateDynamic("minCols")(minCols.asInstanceOf[js.Any])
    if (scrollContainer != null) __obj.updateDynamic("scrollContainer")(js.Any.fromFunction0(scrollContainer))
    if (virtualBoundsBottom != null) __obj.updateDynamic("virtualBoundsBottom")(virtualBoundsBottom.asInstanceOf[js.Any])
    if (virtualBoundsTop != null) __obj.updateDynamic("virtualBoundsTop")(virtualBoundsTop.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualize)) __obj.updateDynamic("virtualize")(virtualize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryProps]
  }
}

