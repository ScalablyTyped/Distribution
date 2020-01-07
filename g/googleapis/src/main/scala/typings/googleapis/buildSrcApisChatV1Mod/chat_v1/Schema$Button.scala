package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A button. Can be a text button or an image button.
  */
@js.native
trait Schema$Button extends js.Object {
  /**
    * A button with image and onclick action.
    */
  var imageButton: js.UndefOr[Schema$ImageButton] = js.native
  /**
    * A button with text and onclick action.
    */
  var textButton: js.UndefOr[Schema$TextButton] = js.native
}

object Schema$Button {
  @scala.inline
  def apply(imageButton: Schema$ImageButton = null, textButton: Schema$TextButton = null): Schema$Button = {
    val __obj = js.Dynamic.literal()
    if (imageButton != null) __obj.updateDynamic("imageButton")(imageButton.asInstanceOf[js.Any])
    if (textButton != null) __obj.updateDynamic("textButton")(textButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Button]
  }
}

