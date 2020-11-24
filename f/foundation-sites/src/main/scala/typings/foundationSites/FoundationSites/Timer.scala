package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timer extends js.Object {
  
  def pause(): Unit = js.native
  
  def restart(): Unit = js.native
  
  def start(): Unit = js.native
}
object Timer {
  
  @scala.inline
  def apply(pause: () => Unit, restart: () => Unit, start: () => Unit): Timer = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), restart = js.Any.fromFunction0(restart), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[Timer]
  }
  
  @scala.inline
  implicit class TimerOps[Self <: Timer] (val x: Self) extends AnyVal {
    
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
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestart(value: () => Unit): Self = this.set("restart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
  }
}
