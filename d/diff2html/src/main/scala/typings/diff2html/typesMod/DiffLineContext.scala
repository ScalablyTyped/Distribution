package typings.diff2html.typesMod

import typings.diff2html.typesMod.LineType.CONTEXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffLineContext extends js.Object {
  
  var newNumber: Double = js.native
  
  var oldNumber: Double = js.native
  
  var `type`: CONTEXT = js.native
}
object DiffLineContext {
  
  @scala.inline
  def apply(newNumber: Double, oldNumber: Double, `type`: CONTEXT): DiffLineContext = {
    val __obj = js.Dynamic.literal(newNumber = newNumber.asInstanceOf[js.Any], oldNumber = oldNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffLineContext]
  }
  
  @scala.inline
  implicit class DiffLineContextOps[Self <: DiffLineContext] (val x: Self) extends AnyVal {
    
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
    def setNewNumber(value: Double): Self = this.set("newNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldNumber(value: Double): Self = this.set("oldNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CONTEXT): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
