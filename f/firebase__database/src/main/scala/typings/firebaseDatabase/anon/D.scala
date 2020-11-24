package typings.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait D extends js.Object {
  
  var d: js.Any = js.native
  
  var seg: Double = js.native
  
  var ts: Double = js.native
}
object D {
  
  @scala.inline
  def apply(d: js.Any, seg: Double, ts: Double): D = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], seg = seg.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[D]
  }
  
  @scala.inline
  implicit class DOps[Self <: D] (val x: Self) extends AnyVal {
    
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
    def setD(value: js.Any): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeg(value: Double): Self = this.set("seg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTs(value: Double): Self = this.set("ts", value.asInstanceOf[js.Any])
  }
}
