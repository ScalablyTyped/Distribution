package typings.devextreme.mod.DevExpress.events

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxEvent extends event {
  
  /**
    * [descr:dxEvent.currentTarget]
    */
  var currentTarget: Element = js.native
  
  /**
    * [descr:dxEvent.data]
    */
  var data: js.Any = js.native
  
  /**
    * [descr:dxEvent.delegateTarget]
    */
  var delegateTarget: Element = js.native
  
  /**
    * [descr:dxEvent.isDefaultPrevented()]
    */
  def isDefaultPrevented(): Boolean = js.native
  
  /**
    * [descr:dxEvent.isImmediatePropagationStopped()]
    */
  def isImmediatePropagationStopped(): Boolean = js.native
  
  /**
    * [descr:dxEvent.isPropagationStopped()]
    */
  def isPropagationStopped(): Boolean = js.native
  
  /**
    * [descr:dxEvent.preventDefault()]
    */
  def preventDefault(): Unit = js.native
  
  /**
    * [descr:dxEvent.stopImmediatePropagation()]
    */
  def stopImmediatePropagation(): Unit = js.native
  
  /**
    * [descr:dxEvent.stopPropagation()]
    */
  def stopPropagation(): Unit = js.native
  
  /**
    * [descr:dxEvent.target]
    */
  var target: Element = js.native
}
object dxEvent {
  
  @scala.inline
  def apply(
    currentTarget: Element,
    data: js.Any,
    delegateTarget: Element,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: Element
  ): dxEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxEvent]
  }
  
  @scala.inline
  implicit class dxEventOps[Self <: dxEvent] (val x: Self) extends AnyVal {
    
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
    def setCurrentTarget(value: Element): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegateTarget(value: Element): Self = this.set("delegateTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultPrevented(value: () => Boolean): Self = this.set("isDefaultPrevented", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsImmediatePropagationStopped(value: () => Boolean): Self = this.set("isImmediatePropagationStopped", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPropagationStopped(value: () => Boolean): Self = this.set("isPropagationStopped", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopImmediatePropagation(value: () => Unit): Self = this.set("stopImmediatePropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
