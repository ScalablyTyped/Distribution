package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget is a UI element that presents texts, images, etc.
  */
@js.native
trait SchemaWidgetMarkup extends js.Object {
  /**
    * A list of buttons. Buttons is also oneof data and only one of these
    * fields should be set.
    */
  var buttons: js.UndefOr[js.Array[SchemaButton]] = js.native
  /**
    * Display an image in this widget.
    */
  var image: js.UndefOr[SchemaImage] = js.native
  /**
    * Display a key value item in this widget.
    */
  var keyValue: js.UndefOr[SchemaKeyValue] = js.native
  /**
    * Display a text paragraph in this widget.
    */
  var textParagraph: js.UndefOr[SchemaTextParagraph] = js.native
}

object SchemaWidgetMarkup {
  @scala.inline
  def apply(
    buttons: js.Array[SchemaButton] = null,
    image: SchemaImage = null,
    keyValue: SchemaKeyValue = null,
    textParagraph: SchemaTextParagraph = null
  ): SchemaWidgetMarkup = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue.asInstanceOf[js.Any])
    if (textParagraph != null) __obj.updateDynamic("textParagraph")(textParagraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWidgetMarkup]
  }
}

