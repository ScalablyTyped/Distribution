package typings.durandal.dialogMod

import typings.durandal.compositionMod.CompositionContext
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogContext extends js.Object {
  
  /**
    * In this function, you are expected to add a DOM element to the tree which will serve as the "host" for the modal's composed view. You must add a property called host to the modalWindow object which references the dom element. It is this host which is passed to the composition module.
    * @param {Dialog} theDialog The dialog model.
    */
  def addHost(theDialog: Dialog): Unit = js.native
  
  /**
    * Opacity of the blockout. The default is 0.6.
    */
  var blockoutOpacity: js.UndefOr[Double] = js.native
  
  /**
    * This function is called after the modal is fully composed into the DOM, allowing your implementation to do any final modifications, such as positioning or animation. You can obtain the original dialog object by using `getDialog` on context.model.
    * @param {DOMElement} child The dialog view.
    * @param {DOMElement} parent The parent view.
    * @param {object} context The composition context.
    */
  def compositionComplete(child: HTMLElement, parent: HTMLElement, context: CompositionContext): Unit = js.native
  
  /**
    * This function is expected to remove any DOM machinery associated with the specified dialog and do any other necessary cleanup.
    * @param {Dialog} theDialog The dialog model.
    */
  def removeHost(theDialog: Dialog): Unit = js.native
}
object DialogContext {
  
  @scala.inline
  def apply(
    addHost: Dialog => Unit,
    compositionComplete: (HTMLElement, HTMLElement, CompositionContext) => Unit,
    removeHost: Dialog => Unit
  ): DialogContext = {
    val __obj = js.Dynamic.literal(addHost = js.Any.fromFunction1(addHost), compositionComplete = js.Any.fromFunction3(compositionComplete), removeHost = js.Any.fromFunction1(removeHost))
    __obj.asInstanceOf[DialogContext]
  }
  
  @scala.inline
  implicit class DialogContextOps[Self <: DialogContext] (val x: Self) extends AnyVal {
    
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
    def setAddHost(value: Dialog => Unit): Self = this.set("addHost", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompositionComplete(value: (HTMLElement, HTMLElement, CompositionContext) => Unit): Self = this.set("compositionComplete", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveHost(value: Dialog => Unit): Self = this.set("removeHost", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBlockoutOpacity(value: Double): Self = this.set("blockoutOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockoutOpacity: Self = this.set("blockoutOpacity", js.undefined)
  }
}
