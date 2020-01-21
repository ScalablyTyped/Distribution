package typings.durandal.widgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetSettings extends js.Object {
  var kind: String
  var model: js.UndefOr[js.Any] = js.undefined
  var view: js.UndefOr[js.Any] = js.undefined
}

object WidgetSettings {
  @scala.inline
  def apply(kind: String, model: js.Any = null, view: js.Any = null): WidgetSettings = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetSettings]
  }
}

