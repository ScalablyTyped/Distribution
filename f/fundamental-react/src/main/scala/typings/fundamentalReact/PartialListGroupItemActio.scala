package typings.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/ListGroup/ListGroup.ListGroupItemActionsProps> */
trait PartialListGroupItemActio extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object PartialListGroupItemActio {
  @scala.inline
  def apply(className: String = null): PartialListGroupItemActio = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialListGroupItemActio]
  }
}

