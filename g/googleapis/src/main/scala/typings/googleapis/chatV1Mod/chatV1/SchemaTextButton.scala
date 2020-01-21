package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A button with text and onclick action.
  */
@js.native
trait SchemaTextButton extends js.Object {
  /**
    * The onclick action of the button.
    */
  var onClick: js.UndefOr[SchemaOnClick] = js.native
  /**
    * The text of the button.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaTextButton {
  @scala.inline
  def apply(onClick: SchemaOnClick = null, text: String = null): SchemaTextButton = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextButton]
  }
}

