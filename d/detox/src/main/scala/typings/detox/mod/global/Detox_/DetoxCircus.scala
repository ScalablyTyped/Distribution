package typings.detox.mod.global.Detox_

import typings.detox.anon.AddEventsListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetoxCircus extends js.Object {
  
  /**
    * A get function that Enables access to this instance (single in each worker's scope)
    */
  def getEnv(): AddEventsListener = js.native
}
object DetoxCircus {
  
  @scala.inline
  def apply(getEnv: () => AddEventsListener): DetoxCircus = {
    val __obj = js.Dynamic.literal(getEnv = js.Any.fromFunction0(getEnv))
    __obj.asInstanceOf[DetoxCircus]
  }
  
  @scala.inline
  implicit class DetoxCircusOps[Self <: DetoxCircus] (val x: Self) extends AnyVal {
    
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
    def setGetEnv(value: () => AddEventsListener): Self = this.set("getEnv", js.Any.fromFunction0(value))
  }
}
