package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A button. Can be a text button or an image button.
  */
@js.native
trait SchemaButton extends js.Object {
  /**
    * A button with image and onclick action.
    */
  var imageButton: js.UndefOr[SchemaImageButton] = js.native
  /**
    * A button with text and onclick action.
    */
  var textButton: js.UndefOr[SchemaTextButton] = js.native
}

object SchemaButton {
  @scala.inline
  def apply(imageButton: SchemaImageButton = null, textButton: SchemaTextButton = null): SchemaButton = {
    val __obj = js.Dynamic.literal()
    if (imageButton != null) __obj.updateDynamic("imageButton")(imageButton.asInstanceOf[js.Any])
    if (textButton != null) __obj.updateDynamic("textButton")(textButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaButton]
  }
}

