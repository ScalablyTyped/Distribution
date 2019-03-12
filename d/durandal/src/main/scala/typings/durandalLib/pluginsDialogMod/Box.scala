package typings
package durandalLib.pluginsDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Models a message box's message, title and options.
  * @class
  */
trait Box extends js.Object {
  /**
    * Provides the view to the composition system.
    * @returns {DOMElement} The view of the message box.
    */
  def getView(): stdLib.HTMLElement
  /**
    * Selects an option and closes the message box, returning the selected option through the dialog system's promise.
    * @param {string} dialogResult The result to select.
    */
  def selectOption(dialogResult: java.lang.String): scala.Unit
}

object Box {
  @scala.inline
  def apply(getView: () => stdLib.HTMLElement, selectOption: java.lang.String => scala.Unit): Box = {
    val __obj = js.Dynamic.literal(getView = js.Any.fromFunction0(getView), selectOption = js.Any.fromFunction1(selectOption))
  
    __obj.asInstanceOf[Box]
  }
}

