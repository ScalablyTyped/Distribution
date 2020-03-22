package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxHtmlEditorMediaResizing extends js.Object {
  /** Specifies media types that can be resized. Currently, only images are supported. */
  var allowedTargets: js.UndefOr[js.Array[String]] = js.undefined
  /** Enables media resizing. */
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

