package typings.googleCloudPreciseDate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Long extends js.Object {
  
  def toNumber(): Double = js.native
}
object Long {
  
  @scala.inline
  def apply(toNumber: () => Double): Long = {
    val __obj = js.Dynamic.literal(toNumber = js.Any.fromFunction0(toNumber))
    __obj.asInstanceOf[Long]
  }
  
  @scala.inline
  implicit class LongOps[Self <: Long] (val x: Self) extends AnyVal {
    
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
    def setToNumber(value: () => Double): Self = this.set("toNumber", js.Any.fromFunction0(value))
  }
}
