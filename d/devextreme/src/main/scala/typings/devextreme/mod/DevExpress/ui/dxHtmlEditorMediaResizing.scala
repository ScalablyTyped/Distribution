package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxHtmlEditorMediaResizing extends js.Object {
  /** @name dxHtmlEditorMediaResizing.allowedTargets */
  var allowedTargets: js.UndefOr[js.Array[String]] = js.undefined
  /** @name dxHtmlEditorMediaResizing.enabled */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object dxHtmlEditorMediaResizing {
  @scala.inline
  def apply(allowedTargets: js.Array[String] = null, enabled: js.UndefOr[Boolean] = js.undefined): dxHtmlEditorMediaResizing = {
    val __obj = js.Dynamic.literal()
    if (allowedTargets != null) __obj.updateDynamic("allowedTargets")(allowedTargets.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxHtmlEditorMediaResizing]
  }
}

