package typings
package durandalLib.pluginsWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetSettings extends js.Object {
  var kind: java.lang.String
  var model: js.UndefOr[js.Any] = js.undefined
  var view: js.UndefOr[js.Any] = js.undefined
}

object WidgetSettings {
  @scala.inline
  def apply(kind: java.lang.String, model: js.Any = null, view: js.Any = null): WidgetSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    if (model != null) __obj.updateDynamic("model")(model)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[WidgetSettings]
  }
}

