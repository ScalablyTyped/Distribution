package typings.expiredStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeekInterface extends js.Object {
  
  /**
    * Has the [key] expired or not
    */
  var isExpired: Boolean = js.native
  
  /**
    * Time remaining until expiration
    */
  var timeLeft: Double | Null = js.native
  
  /**
    * The value of a [key]
    */
  var value: String | Null = js.native
}
object PeekInterface {
  
  @scala.inline
  def apply(isExpired: Boolean): PeekInterface = {
    val __obj = js.Dynamic.literal(isExpired = isExpired.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeekInterface]
  }
  
  @scala.inline
  implicit class PeekInterfaceOps[Self <: PeekInterface] (val x: Self) extends AnyVal {
    
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
    def setIsExpired(value: Boolean): Self = this.set("isExpired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLeft(value: Double): Self = this.set("timeLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLeftNull: Self = this.set("timeLeft", null)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
