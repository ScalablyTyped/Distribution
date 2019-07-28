package typings.gestalt.gestaltMod

import typings.gestalt.Anon_ActiveIndex
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentedControlProps extends js.Object {
  var items: js.Array[ReactNode]
  var selectedItemIndex: Double
  var size: js.UndefOr[md | lg] = js.undefined
  def onChange(args: Anon_ActiveIndex): Unit
}

object SegmentedControlProps {
  @scala.inline
  def apply(
    items: js.Array[ReactNode],
    onChange: Anon_ActiveIndex => Unit,
    selectedItemIndex: Double,
    size: md | lg = null
  ): SegmentedControlProps = {
    val __obj = js.Dynamic.literal(items = items, onChange = js.Any.fromFunction1(onChange), selectedItemIndex = selectedItemIndex)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentedControlProps]
  }
}

