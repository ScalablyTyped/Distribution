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
@js.native
trait ButtonSet extends js.Object {
  def addButton(button: Button): ButtonSet = js.native
}

object ButtonSet {
  @scala.inline
  def apply(addButton: Button => ButtonSet): ButtonSet = {
    val __obj = js.Dynamic.literal(addButton = js.Any.fromFunction1(addButton))
    __obj.asInstanceOf[ButtonSet]
  }
  @scala.inline
  implicit class ButtonSetOps[Self <: ButtonSet] (val x: Self) extends AnyVal {
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
    def setAddButton(value: Button => ButtonSet): Self = this.set("addButton", js.Any.fromFunction1(value))
  }
  
}

