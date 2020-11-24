package typings.ethersprojectContracts.mod

import typings.ethersprojectAbstractProvider.mod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunningEvent extends js.Object {
  
  var _listeners: js.Any = js.native
  
  def addListener(listener: Listener, once: Boolean): Unit = js.native
  
  val filter: EventFilter = js.native
  
  def getEmit(event: Event): js.Array[_] = js.native
  
  def listenerCount(): Double = js.native
  
  def listeners(): js.Array[Listener] = js.native
  
  def prepareEvent(event: Event): Unit = js.native
  
  def removeAllListeners(): Unit = js.native
  
  def removeListener(listener: Listener): Unit = js.native
  
  def run(args: js.Array[_]): Double = js.native
  
  val tag: String = js.native
}
object RunningEvent {
  
  @scala.inline
  def apply(
    _listeners: js.Any,
    addListener: (Listener, Boolean) => Unit,
    filter: EventFilter,
    getEmit: Event => js.Array[_],
    listenerCount: () => Double,
    listeners: () => js.Array[Listener],
    prepareEvent: Event => Unit,
    removeAllListeners: () => Unit,
    removeListener: Listener => Unit,
    run: js.Array[_] => Double,
    tag: String
  ): RunningEvent = {
    val __obj = js.Dynamic.literal(_listeners = _listeners.asInstanceOf[js.Any], addListener = js.Any.fromFunction2(addListener), filter = filter.asInstanceOf[js.Any], getEmit = js.Any.fromFunction1(getEmit), listenerCount = js.Any.fromFunction0(listenerCount), listeners = js.Any.fromFunction0(listeners), prepareEvent = js.Any.fromFunction1(prepareEvent), removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListener = js.Any.fromFunction1(removeListener), run = js.Any.fromFunction1(run), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunningEvent]
  }
  
  @scala.inline
  implicit class RunningEventOps[Self <: RunningEvent] (val x: Self) extends AnyVal {
    
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
    def set_listeners(value: js.Any): Self = this.set("_listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddListener(value: (Listener, Boolean) => Unit): Self = this.set("addListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilter(value: EventFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEmit(value: Event => js.Array[_]): Self = this.set("getEmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListenerCount(value: () => Double): Self = this.set("listenerCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setListeners(value: () => js.Array[Listener]): Self = this.set("listeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrepareEvent(value: Event => Unit): Self = this.set("prepareEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAllListeners(value: () => Unit): Self = this.set("removeAllListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveListener(value: Listener => Unit): Self = this.set("removeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRun(value: js.Array[_] => Double): Self = this.set("run", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
}
