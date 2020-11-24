package typings.discordRpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoThreshold extends js.Object {
  
  var autoThreshold: Boolean = js.native
  
  var delay: Double = js.native
  
  var shortcut: js.Array[Code] = js.native
  
  var threshold: Double = js.native
}
object AutoThreshold {
  
  @scala.inline
  def apply(autoThreshold: Boolean, delay: Double, shortcut: js.Array[Code], threshold: Double): AutoThreshold = {
    val __obj = js.Dynamic.literal(autoThreshold = autoThreshold.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoThreshold]
  }
  
  @scala.inline
  implicit class AutoThresholdOps[Self <: AutoThreshold] (val x: Self) extends AnyVal {
    
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
    def setAutoThreshold(value: Boolean): Self = this.set("autoThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcutVarargs(value: Code*): Self = this.set("shortcut", js.Array(value :_*))
    
    @scala.inline
    def setShortcut(value: js.Array[Code]): Self = this.set("shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
  }
}
