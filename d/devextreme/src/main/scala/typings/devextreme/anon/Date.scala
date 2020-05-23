package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var date: js.UndefOr[typings.std.Date] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[String] = js.undefined
}

object Date {
  @scala.inline
  def apply(date: typings.std.Date = null, text: String = null, view: String = null): Date = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

