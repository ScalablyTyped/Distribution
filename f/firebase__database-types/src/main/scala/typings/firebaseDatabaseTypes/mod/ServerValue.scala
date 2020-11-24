package typings.firebaseDatabaseTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerValue extends js.Object {
  
  var TIMESTAMP: js.Object = js.native
  
  def increment(delta: Double): js.Object = js.native
}
object ServerValue {
  
  @scala.inline
  def apply(TIMESTAMP: js.Object, increment: Double => js.Object): ServerValue = {
    val __obj = js.Dynamic.literal(TIMESTAMP = TIMESTAMP.asInstanceOf[js.Any], increment = js.Any.fromFunction1(increment))
    __obj.asInstanceOf[ServerValue]
  }
  
  @scala.inline
  implicit class ServerValueOps[Self <: ServerValue] (val x: Self) extends AnyVal {
    
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
    def setTIMESTAMP(value: js.Object): Self = this.set("TIMESTAMP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrement(value: Double => js.Object): Self = this.set("increment", js.Any.fromFunction1(value))
  }
}
