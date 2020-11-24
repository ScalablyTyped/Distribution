package typings.diff2html.typesMod

import typings.diff2html.typesMod.LineType.INSERT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffLineInserted extends js.Object {
  
  var newNumber: Double = js.native
  
  var oldNumber: js.UndefOr[scala.Nothing] = js.native
  
  var `type`: INSERT = js.native
}
object DiffLineInserted {
  
  @scala.inline
  def apply(newNumber: Double, `type`: INSERT): DiffLineInserted = {
    val __obj = js.Dynamic.literal(newNumber = newNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffLineInserted]
  }
  
  @scala.inline
  implicit class DiffLineInsertedOps[Self <: DiffLineInserted] (val x: Self) extends AnyVal {
    
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
    def setType(value: INSERT): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
