package typings.elementResizeDetector.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Erd extends js.Object {
  
  def listenTo(element: HTMLElement, callback: js.Function1[/* elem */ HTMLElement, Unit]): Unit = js.native
  
  def removeAllListeners(element: HTMLElement): Unit = js.native
  
  def removeListener(element: HTMLElement, callback: js.Function1[/* elem */ HTMLElement, Unit]): Unit = js.native
  
  def uninstall(element: HTMLElement): Unit = js.native
}
object Erd {
  
  @scala.inline
  def apply(
    listenTo: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Unit,
    removeAllListeners: HTMLElement => Unit,
    removeListener: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Unit,
    uninstall: HTMLElement => Unit
  ): Erd = {
    val __obj = js.Dynamic.literal(listenTo = js.Any.fromFunction2(listenTo), removeAllListeners = js.Any.fromFunction1(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener), uninstall = js.Any.fromFunction1(uninstall))
    __obj.asInstanceOf[Erd]
  }
  
  @scala.inline
  implicit class ErdOps[Self <: Erd] (val x: Self) extends AnyVal {
    
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
    def setListenTo(value: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Unit): Self = this.set("listenTo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveAllListeners(value: HTMLElement => Unit): Self = this.set("removeAllListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveListener(value: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Unit): Self = this.set("removeListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUninstall(value: HTMLElement => Unit): Self = this.set("uninstall", js.Any.fromFunction1(value))
  }
}
