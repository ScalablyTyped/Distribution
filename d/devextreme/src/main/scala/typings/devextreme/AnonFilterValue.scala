package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterValue[T] extends js.Object {
  var component: js.UndefOr[T] = js.undefined
  var filterValue: js.UndefOr[js.Any] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonFilterValue {
  @scala.inline
  def apply[T](component: T = null, filterValue: js.Any = null, text: String = null): AnonFilterValue[T] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (filterValue != null) __obj.updateDynamic("filterValue")(filterValue.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterValue[T]]
  }
}

