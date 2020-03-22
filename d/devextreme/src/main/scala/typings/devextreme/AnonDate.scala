package typings.devextreme

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var date: js.UndefOr[Date] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[String] = js.undefined
}

object AnonDate {
  @scala.inline
  def apply(date: Date = null, text: String = null, view: String = null): AnonDate = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDate]
  }
}

