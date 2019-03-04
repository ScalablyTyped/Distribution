package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentedControlProps extends js.Object {
  var items: js.Array[reactLib.reactMod.ReactNs.ReactNode]
  var selectedItemIndex: scala.Double
  var size: js.UndefOr[gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg] = js.undefined
  def onChange(args: gestaltLib.Anon_ActiveIndex): scala.Unit
}

object SegmentedControlProps {
  @scala.inline
  def apply(
    items: js.Array[reactLib.reactMod.ReactNs.ReactNode],
    onChange: js.Function1[gestaltLib.Anon_ActiveIndex, scala.Unit],
    selectedItemIndex: scala.Double,
    size: gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg = null
  ): SegmentedControlProps = {
    val __obj = js.Dynamic.literal(items = items, onChange = onChange, selectedItemIndex = selectedItemIndex)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentedControlProps]
  }
}

