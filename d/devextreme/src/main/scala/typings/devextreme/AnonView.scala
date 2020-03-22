package typings.devextreme

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonView extends js.Object {
  var component: js.UndefOr[js.Any] = js.undefined
  var date: js.UndefOr[Date] = js.undefined
  var view: js.UndefOr[String] = js.undefined
}

object AnonView {
  @scala.inline
  def apply(component: js.Any = null, date: Date = null, view: String = null): AnonView = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonView]
  }
}

