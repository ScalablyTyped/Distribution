package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Panel/Panel.PanelFooterProps> */
trait PartialPanelFooterProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object PartialPanelFooterProps {
  @scala.inline
  def apply(className: String = null): PartialPanelFooterProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPanelFooterProps]
  }
}

