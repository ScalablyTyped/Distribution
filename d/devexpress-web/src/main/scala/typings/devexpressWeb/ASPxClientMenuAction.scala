package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientMenuAction extends js.Object {
  var clickAction: js.Function
  var container: String
  var disabled: Boolean
  var hasSeparator: Boolean
  var hotKey: ASPxClientMenuActionHotKey
  var imageClassName: String
  var imageTemplateName: String
  var text: String
  var visible: Boolean
}

object ASPxClientMenuAction {
  @scala.inline
  def apply(
    clickAction: js.Function,
    container: String,
    disabled: Boolean,
    hasSeparator: Boolean,
    hotKey: ASPxClientMenuActionHotKey,
    imageClassName: String,
    imageTemplateName: String,
    text: String,
    visible: Boolean
  ): ASPxClientMenuAction = {
    val __obj = js.Dynamic.literal(clickAction = clickAction.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hasSeparator = hasSeparator.asInstanceOf[js.Any], hotKey = hotKey.asInstanceOf[js.Any], imageClassName = imageClassName.asInstanceOf[js.Any], imageTemplateName = imageTemplateName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuAction]
  }
}

