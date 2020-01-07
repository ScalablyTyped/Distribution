package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An image button with an onclick action.
  */
@js.native
trait Schema$ImageButton extends js.Object {
  /**
    * The icon specified by an enum that indices to an icon provided by Chat
    * API.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * The icon specified by a URL.
    */
  var iconUrl: js.UndefOr[String] = js.native
  /**
    * The name of this image_button which will be used for accessibility.
    * Default value will be provided if developers don&#39;t specify.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The onclick action.
    */
  var onClick: js.UndefOr[Schema$OnClick] = js.native
}

object Schema$ImageButton {
  @scala.inline
  def apply(icon: String = null, iconUrl: String = null, name: String = null, onClick: Schema$OnClick = null): Schema$ImageButton = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImageButton]
  }
}

