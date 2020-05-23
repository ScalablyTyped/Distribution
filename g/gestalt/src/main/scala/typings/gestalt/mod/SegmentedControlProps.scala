package typings.gestalt.mod

import typings.gestalt.anon.ActiveIndex
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentedControlProps extends js.Object {
  var items: js.Array[ReactNode]
  var responsive: js.UndefOr[Boolean] = js.undefined
  var selectedItemIndex: Double
  var size: js.UndefOr[md | lg] = js.undefined
  def onChange(args: ActiveIndex): Unit
}

object SegmentedControlProps {
  @scala.inline
  def apply(
    items: js.Array[ReactNode],
    onChange: ActiveIndex => Unit,
    selectedItemIndex: Double,
    responsive: js.UndefOr[Boolean] = js.undefined,
    size: md | lg = null
  ): SegmentedControlProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentedControlProps]
  }
}

