package typings.glidejsGlide.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modify extends js.Object {
  
  /**
    * Modifies passed translate value by 100 pixels.
    */
  def modify(translate: Double): Double = js.native
}
object Modify {
  
  @scala.inline
  def apply(modify: Double => Double): Modify = {
    val __obj = js.Dynamic.literal(modify = js.Any.fromFunction1(modify))
    __obj.asInstanceOf[Modify]
  }
  
  @scala.inline
  implicit class ModifyOps[Self <: Modify] (val x: Self) extends AnyVal {
    
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
    def setModify(value: Double => Double): Self = this.set("modify", js.Any.fromFunction1(value))
  }
}
