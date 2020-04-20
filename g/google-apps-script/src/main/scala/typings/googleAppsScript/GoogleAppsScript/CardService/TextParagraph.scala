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
trait TextParagraph extends js.Object {
  def setText(text: String): TextParagraph
}

object TextParagraph {
  @scala.inline
  def apply(setText: String => TextParagraph): TextParagraph = {
    val __obj = js.Dynamic.literal(setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[TextParagraph]
  }
}

