package typings.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Panel/Panel.PanelActionsProps> */
trait PartialPanelActionsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object PartialPanelActionsProps {
  @scala.inline
  def apply(className: String = null): PartialPanelActionsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPanelActionsProps]
  }
}

