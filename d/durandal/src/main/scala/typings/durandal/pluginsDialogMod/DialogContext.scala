package typings.durandal.pluginsDialogMod

import typings.durandal.compositionMod.CompositionContext
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogContext extends js.Object {
  /**
    * Opacity of the blockout. The default is 0.6.
    */
  var blockoutOpacity: js.UndefOr[Double] = js.undefined
  /**
    * In this function, you are expected to add a DOM element to the tree which will serve as the "host" for the modal's composed view. You must add a property called host to the modalWindow object which references the dom element. It is this host which is passed to the composition module.
    * @param {Dialog} theDialog The dialog model.
    */
  def addHost(theDialog: Dialog): Unit
  /**
    * This function is called after the modal is fully composed into the DOM, allowing your implementation to do any final modifications, such as positioning or animation. You can obtain the original dialog object by using `getDialog` on context.model.
    * @param {DOMElement} child The dialog view.
    * @param {DOMElement} parent The parent view.
    * @param {object} context The composition context.
    */
  def compositionComplete(child: HTMLElement, parent: HTMLElement, context: CompositionContext): Unit
  /**
    * This function is expected to remove any DOM machinery associated with the specified dialog and do any other necessary cleanup.
    * @param {Dialog} theDialog The dialog model.
    */
  def removeHost(theDialog: Dialog): Unit
}

object DialogContext {
  @scala.inline
  def apply(
    addHost: Dialog => Unit,
    compositionComplete: (HTMLElement, HTMLElement, CompositionContext) => Unit,
    removeHost: Dialog => Unit,
    blockoutOpacity: Int | Double = null
  ): DialogContext = {
    val __obj = js.Dynamic.literal(addHost = js.Any.fromFunction1(addHost), compositionComplete = js.Any.fromFunction3(compositionComplete), removeHost = js.Any.fromFunction1(removeHost))
    if (blockoutOpacity != null) __obj.updateDynamic("blockoutOpacity")(blockoutOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogContext]
  }
}

