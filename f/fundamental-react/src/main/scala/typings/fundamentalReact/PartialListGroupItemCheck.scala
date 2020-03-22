package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/ListGroup/ListGroup.ListGroupItemCheckboxProps> */
trait PartialListGroupItemCheck extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var labelProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object PartialListGroupItemCheck {
  @scala.inline
  def apply(
    className: String = null,
    inputProps: StringDictionary[js.Any] = null,
    labelProps: StringDictionary[js.Any] = null
  ): PartialListGroupItemCheck = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (labelProps != null) __obj.updateDynamic("labelProps")(labelProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialListGroupItemCheck]
  }
}

