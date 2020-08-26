package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A UI element contains a key (label) and a value (content). And this element
  * may also contain some actions such as onclick button.
  */
@js.native
trait SchemaKeyValue extends js.Object {
  /**
    * The text of the bottom label. Formatted text supported.
    */
  var bottomLabel: js.UndefOr[String] = js.native
  /**
    * A button that can be clicked to trigger an action.
    */
  var button: js.UndefOr[SchemaButton] = js.native
  /**
    * The text of the content. Formatted text supported and always required.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * If the content should be multiline.
    */
  var contentMultiline: js.UndefOr[Boolean] = js.native
  /**
    * An enum value that will be replaced by the Chat API with the
    * corresponding icon image.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * The icon specified by a URL.
    */
  var iconUrl: js.UndefOr[String] = js.native
  /**
    * The onclick action. Only the top label, bottom label and content region
    * are clickable.
    */
  var onClick: js.UndefOr[SchemaOnClick] = js.native
  /**
    * The text of the top label. Formatted text supported.
    */
  var topLabel: js.UndefOr[String] = js.native
}

object SchemaKeyValue {
  @scala.inline
  def apply(): SchemaKeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyValue]
  }
  @scala.inline
  implicit class SchemaKeyValueOps[Self <: SchemaKeyValue] (val x: Self) extends AnyVal {
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
    def setBottomLabel(value: String): Self = this.set("bottomLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomLabel: Self = this.set("bottomLabel", js.undefined)
    @scala.inline
    def setButton(value: SchemaButton): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentMultiline(value: Boolean): Self = this.set("contentMultiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentMultiline: Self = this.set("contentMultiline", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    @scala.inline
    def setOnClick(value: SchemaOnClick): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setTopLabel(value: String): Self = this.set("topLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopLabel: Self = this.set("topLabel", js.undefined)
  }
  
}

