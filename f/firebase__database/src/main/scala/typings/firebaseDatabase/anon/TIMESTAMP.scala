package typings.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TIMESTAMP extends js.Object {
  
  var TIMESTAMP: Sv = js.native
  
  def increment(delta: Double): SvIncrement = js.native
}
object TIMESTAMP {
  
  @scala.inline
  def apply(TIMESTAMP: Sv, increment: Double => SvIncrement): TIMESTAMP = {
    val __obj = js.Dynamic.literal(TIMESTAMP = TIMESTAMP.asInstanceOf[js.Any], increment = js.Any.fromFunction1(increment))
    __obj.asInstanceOf[TIMESTAMP]
  }
  
  @scala.inline
  implicit class TIMESTAMPOps[Self <: TIMESTAMP] (val x: Self) extends AnyVal {
    
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
    def setTIMESTAMP(value: Sv): Self = this.set("TIMESTAMP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrement(value: Double => SvIncrement): Self = this.set("increment", js.Any.fromFunction1(value))
  }
}
