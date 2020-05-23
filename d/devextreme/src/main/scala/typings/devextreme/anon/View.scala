package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  var component: js.UndefOr[js.Any] = js.undefined
  var date: js.UndefOr[typings.std.Date] = js.undefined
  var view: js.UndefOr[String] = js.undefined
}

object View {
  @scala.inline
  def apply(component: js.Any = null, date: typings.std.Date = null, view: String = null): View = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
}

