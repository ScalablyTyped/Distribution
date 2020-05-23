package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactNumbers.`1`
import typings.fundamentalReact.fundamentalReactNumbers.`2`
import typings.fundamentalReact.fundamentalReactNumbers.`3`
import typings.fundamentalReact.fundamentalReactNumbers.`4`
import typings.fundamentalReact.fundamentalReactNumbers.`5`
import typings.fundamentalReact.fundamentalReactNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Panel/Panel.PanelProps> */
trait PartialPanelProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
}

object PartialPanelProps {
  @scala.inline
  def apply(
    className: String = null,
    colSpan: `1` | `2` | `3` | `4` | `5` | `6` = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined
  ): PartialPanelProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPanelProps]
  }
}

