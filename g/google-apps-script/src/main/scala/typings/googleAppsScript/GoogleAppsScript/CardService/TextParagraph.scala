package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget that displays text and supports basic HTML formatting.
  *
  *     var textParagraph = CardService.newTextParagraph()
  *         .setText("This is a text paragraph widget. Multiple lines are allowed if needed.");
  */
@js.native
trait TextParagraph extends js.Object {
  def setText(text: String): TextParagraph = js.native
}

object TextParagraph {
  @scala.inline
  def apply(setText: String => TextParagraph): TextParagraph = {
    val __obj = js.Dynamic.literal(setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[TextParagraph]
  }
  @scala.inline
  implicit class TextParagraphOps[Self <: TextParagraph] (val x: Self) extends AnyVal {
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
    def setSetText(value: String => TextParagraph): Self = this.set("setText", js.Any.fromFunction1(value))
  }
  
}

