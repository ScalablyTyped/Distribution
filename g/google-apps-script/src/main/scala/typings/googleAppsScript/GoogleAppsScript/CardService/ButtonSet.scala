package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds a set of Button objects that are displayed in a row.
  *
  *     var textButton = CardService.newTextButton();
  *     // Finish building the text button...
  *
  *     var imageButton = CardService.newImageButton();
  *     // Finish building the image button...
  *
  *     var buttonSet = CardService.newButtonSet()
  *         .addButton(textButton)
  *         .addButton(imageButton);
  */
trait ButtonSet extends js.Object {
  def addButton(button: Button): ButtonSet
}

object ButtonSet {
  @scala.inline
  def apply(addButton: Button => ButtonSet): ButtonSet = {
    val __obj = js.Dynamic.literal(addButton = js.Any.fromFunction1(addButton))
  
    __obj.asInstanceOf[ButtonSet]
  }
}

