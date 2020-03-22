package typings.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/List/List.ListHeaderProps> */
trait PartialListHeaderProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object PartialListHeaderProps {
  @scala.inline
  def apply(className: String = null): PartialListHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialListHeaderProps]
  }
}

