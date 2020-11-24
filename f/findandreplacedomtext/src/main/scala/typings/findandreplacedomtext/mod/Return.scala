package typings.findandreplacedomtext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Return extends js.Object {
  
  /**
    * Reversion occurs backwards so as to avoid nodes subsequently replaced during the matching phase.
    */
  def revert(): Return = js.native
}
object Return {
  
  @scala.inline
  def apply(revert: () => Return): Return = {
    val __obj = js.Dynamic.literal(revert = js.Any.fromFunction0(revert))
    __obj.asInstanceOf[Return]
  }
  
  @scala.inline
  implicit class ReturnOps[Self <: Return] (val x: Self) extends AnyVal {
    
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
    def setRevert(value: () => Return): Self = this.set("revert", js.Any.fromFunction0(value))
  }
}
