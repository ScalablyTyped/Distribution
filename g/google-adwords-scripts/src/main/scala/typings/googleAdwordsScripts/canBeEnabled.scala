package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Extendables
@js.native
trait canBeEnabled extends js.Object {
  
  def enable(): Unit = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isPaused(): Boolean = js.native
  
  def pause(): Unit = js.native
}
object canBeEnabled {
  
  @scala.inline
  def apply(enable: () => Unit, isEnabled: () => Boolean, isPaused: () => Boolean, pause: () => Unit): canBeEnabled = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), isEnabled = js.Any.fromFunction0(isEnabled), isPaused = js.Any.fromFunction0(isPaused), pause = js.Any.fromFunction0(pause))
    __obj.asInstanceOf[canBeEnabled]
  }
  
  @scala.inline
  implicit class canBeEnabledOps[Self <: canBeEnabled] (val x: Self) extends AnyVal {
    
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
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = this.set("isEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPaused(value: () => Boolean): Self = this.set("isPaused", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
  }
}
