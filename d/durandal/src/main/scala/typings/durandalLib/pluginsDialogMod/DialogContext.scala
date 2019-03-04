package typings
package durandalLib.pluginsDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogContext extends js.Object {
  /**
    * Opacity of the blockout. The default is 0.6.
    */
  var blockoutOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * In this function, you are expected to add a DOM element to the tree which will serve as the "host" for the modal's composed view. You must add a property called host to the modalWindow object which references the dom element. It is this host which is passed to the composition module.
    * @param {Dialog} theDialog The dialog model.
    */
  def addHost(theDialog: Dialog): scala.Unit
  /**
    * This function is called after the modal is fully composed into the DOM, allowing your implementation to do any final modifications, such as positioning or animation. You can obtain the original dialog object by using `getDialog` on context.model.
    * @param {DOMElement} child The dialog view.
    * @param {DOMElement} parent The parent view.
    * @param {object} context The composition context.
    */
  def compositionComplete(
    child: stdLib.HTMLElement,
    parent: stdLib.HTMLElement,
    context: durandalLib.compositionMod.CompositionContext
  ): scala.Unit
  /**
    * This function is expected to remove any DOM machinery associated with the specified dialog and do any other necessary cleanup.
    * @param {Dialog} theDialog The dialog model.
    */
  def removeHost(theDialog: Dialog): scala.Unit
}

object DialogContext {
  @scala.inline
  def apply(
    addHost: js.Function1[Dialog, scala.Unit],
    compositionComplete: js.Function3[
      stdLib.HTMLElement, 
      stdLib.HTMLElement, 
      durandalLib.compositionMod.CompositionContext, 
      scala.Unit
    ],
    removeHost: js.Function1[Dialog, scala.Unit],
    blockoutOpacity: scala.Int | scala.Double = null
  ): DialogContext = {
    val __obj = js.Dynamic.literal(addHost = addHost, compositionComplete = compositionComplete, removeHost = removeHost)
    if (blockoutOpacity != null) __obj.updateDynamic("blockoutOpacity")(blockoutOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogContext]
  }
}

