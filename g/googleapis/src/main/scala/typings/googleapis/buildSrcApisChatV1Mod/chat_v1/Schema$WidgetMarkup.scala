package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget is a UI element that presents texts, images, etc.
  */
@js.native
trait Schema$WidgetMarkup extends js.Object {
  /**
    * A list of buttons. Buttons is also oneof data and only one of these
    * fields should be set.
    */
  var buttons: js.UndefOr[js.Array[Schema$Button]] = js.native
  /**
    * Display an image in this widget.
    */
  var image: js.UndefOr[Schema$Image] = js.native
  /**
    * Display a key value item in this widget.
    */
  var keyValue: js.UndefOr[Schema$KeyValue] = js.native
  /**
    * Display a text paragraph in this widget.
    */
  var textParagraph: js.UndefOr[Schema$TextParagraph] = js.native
}

object Schema$WidgetMarkup {
  @scala.inline
  def apply(
    buttons: js.Array[Schema$Button] = null,
    image: Schema$Image = null,
    keyValue: Schema$KeyValue = null,
    textParagraph: Schema$TextParagraph = null
  ): Schema$WidgetMarkup = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue.asInstanceOf[js.Any])
    if (textParagraph != null) __obj.updateDynamic("textParagraph")(textParagraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WidgetMarkup]
  }
}

