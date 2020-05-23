package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientChartDesignerMenuAction extends js.Object {
  var clickAction: js.Function
  var container: String
  var disabled: Boolean
  var hasSeparator: String
  var hotKey: String
  var imageClassName: String
  var text: String
  var visible: Boolean
}

object ASPxClientChartDesignerMenuAction {
  @scala.inline
  def apply(
    clickAction: js.Function,
    container: String,
    disabled: Boolean,
    hasSeparator: String,
    hotKey: String,
    imageClassName: String,
    text: String,
    visible: Boolean
  ): ASPxClientChartDesignerMenuAction = {
    val __obj = js.Dynamic.literal(clickAction = clickAction.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hasSeparator = hasSeparator.asInstanceOf[js.Any], hotKey = hotKey.asInstanceOf[js.Any], imageClassName = imageClassName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientChartDesignerMenuAction]
  }
}

