package typings.dv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Textline extends js.Object {
  
  var box: Box = js.native
}
object Textline {
  
  @scala.inline
  def apply(box: Box): Textline = {
    val __obj = js.Dynamic.literal(box = box.asInstanceOf[js.Any])
    __obj.asInstanceOf[Textline]
  }
  
  @scala.inline
  implicit class TextlineOps[Self <: Textline] (val x: Self) extends AnyVal {
    
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
    def setBox(value: Box): Self = this.set("box", value.asInstanceOf[js.Any])
  }
}
