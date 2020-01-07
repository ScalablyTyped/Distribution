package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A UI element contains a key (label) and a value (content). And this element
  * may also contain some actions such as onclick button.
  */
@js.native
trait Schema$KeyValue extends js.Object {
  /**
    * The text of the bottom label. Formatted text supported.
    */
  var bottomLabel: js.UndefOr[String] = js.native
  /**
    * A button that can be clicked to trigger an action.
    */
  var button: js.UndefOr[Schema$Button] = js.native
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
  var onClick: js.UndefOr[Schema$OnClick] = js.native
  /**
    * The text of the top label. Formatted text supported.
    */
  var topLabel: js.UndefOr[String] = js.native
}

object Schema$KeyValue {
  @scala.inline
  def apply(
    bottomLabel: String = null,
    button: Schema$Button = null,
    content: String = null,
    contentMultiline: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    iconUrl: String = null,
    onClick: Schema$OnClick = null,
    topLabel: String = null
  ): Schema$KeyValue = {
    val __obj = js.Dynamic.literal()
    if (bottomLabel != null) __obj.updateDynamic("bottomLabel")(bottomLabel.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(contentMultiline)) __obj.updateDynamic("contentMultiline")(contentMultiline.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (topLabel != null) __obj.updateDynamic("topLabel")(topLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$KeyValue]
  }
}

