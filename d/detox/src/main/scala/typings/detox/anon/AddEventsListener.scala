package typings.detox.anon

import typings.detox.mod.global.Detox_.CircusTestEventListenerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddEventsListener extends js.Object {
  
  /**
    * Registers a listener such as an adapter or reporter
    * @param listener
    * @example
    * detoxCircus.getEnv().addEventsListener(adapter)
    * detoxCircus.getEnv().addEventsListener(assignReporter)
    */
  def addEventsListener(listener: CircusTestEventListenerBase): Unit = js.native
}
object AddEventsListener {
  
  @scala.inline
  def apply(addEventsListener: CircusTestEventListenerBase => Unit): AddEventsListener = {
    val __obj = js.Dynamic.literal(addEventsListener = js.Any.fromFunction1(addEventsListener))
    __obj.asInstanceOf[AddEventsListener]
  }
  
  @scala.inline
  implicit class AddEventsListenerOps[Self <: AddEventsListener] (val x: Self) extends AnyVal {
    
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
    def setAddEventsListener(value: CircusTestEventListenerBase => Unit): Self = this.set("addEventsListener", js.Any.fromFunction1(value))
  }
}
