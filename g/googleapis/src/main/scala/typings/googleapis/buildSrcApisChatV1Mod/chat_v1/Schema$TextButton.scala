package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A button with text and onclick action.
  */
@js.native
trait Schema$TextButton extends js.Object {
  /**
    * The onclick action of the button.
    */
  var onClick: js.UndefOr[Schema$OnClick] = js.native
  /**
    * The text of the button.
    */
  var text: js.UndefOr[String] = js.native
}

object Schema$TextButton {
  @scala.inline
  def apply(onClick: Schema$OnClick = null, text: String = null): Schema$TextButton = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TextButton]
  }
}

