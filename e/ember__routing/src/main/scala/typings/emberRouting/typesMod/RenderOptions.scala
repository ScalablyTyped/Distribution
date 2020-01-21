package typings.emberRouting.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  var controller: js.UndefOr[String] = js.undefined
  var into: js.UndefOr[String] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var outlet: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[String] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    controller: String = null,
    into: String = null,
    model: js.Any = null,
    outlet: String = null,
    view: String = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal()
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (into != null) __obj.updateDynamic("into")(into.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (outlet != null) __obj.updateDynamic("outlet")(outlet.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
}

