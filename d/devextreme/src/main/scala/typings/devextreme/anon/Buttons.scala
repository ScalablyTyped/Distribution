package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxButtonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buttons extends js.Object {
  var buttons: js.UndefOr[js.Array[dxButtonOptions]] = js.undefined
  var dragEnabled: js.UndefOr[Boolean] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var messageHtml: js.UndefOr[String] = js.undefined
  var showTitle: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Buttons {
  @scala.inline
  def apply(
    buttons: js.Array[dxButtonOptions] = null,
    dragEnabled: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    messageHtml: String = null,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): Buttons = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(dragEnabled)) __obj.updateDynamic("dragEnabled")(dragEnabled.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (messageHtml != null) __obj.updateDynamic("messageHtml")(messageHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
}

