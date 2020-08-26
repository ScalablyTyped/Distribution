package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientMenuAction extends js.Object {
  var clickAction: js.Function = js.native
  var container: String = js.native
  var disabled: Boolean = js.native
  var hasSeparator: Boolean = js.native
  var hotKey: ASPxClientMenuActionHotKey = js.native
  var imageClassName: String = js.native
  var imageTemplateName: String = js.native
  var text: String = js.native
  var visible: Boolean = js.native
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
  @scala.inline
  implicit class ASPxClientMenuActionOps[Self <: ASPxClientMenuAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClickAction(value: js.Function): Self = this.set("clickAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasSeparator(value: Boolean): Self = this.set("hasSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setHotKey(value: ASPxClientMenuActionHotKey): Self = this.set("hotKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageClassName(value: String): Self = this.set("imageClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageTemplateName(value: String): Self = this.set("imageTemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

