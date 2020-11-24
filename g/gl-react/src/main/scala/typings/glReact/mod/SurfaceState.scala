package typings.glReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SurfaceState extends js.Object {
  
  var debug: Boolean = js.native
  
  var ready: Boolean = js.native
  
  var rebootId: Double = js.native
}
object SurfaceState {
  
  @scala.inline
  def apply(debug: Boolean, ready: Boolean, rebootId: Double): SurfaceState = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], rebootId = rebootId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceState]
  }
  
  @scala.inline
  implicit class SurfaceStateOps[Self <: SurfaceState] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: Boolean): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebootId(value: Double): Self = this.set("rebootId", value.asInstanceOf[js.Any])
  }
}
