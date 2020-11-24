package typings.diff2html.typesMod

import typings.diff2html.typesMod.LineType.DELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffLineDeleted extends js.Object {
  
  var newNumber: js.UndefOr[scala.Nothing] = js.native
  
  var oldNumber: Double = js.native
  
  var `type`: DELETE = js.native
}
object DiffLineDeleted {
  
  @scala.inline
  def apply(oldNumber: Double, `type`: DELETE): DiffLineDeleted = {
    val __obj = js.Dynamic.literal(oldNumber = oldNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffLineDeleted]
  }
  
  @scala.inline
  implicit class DiffLineDeletedOps[Self <: DiffLineDeleted] (val x: Self) extends AnyVal {
    
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
    def setOldNumber(value: Double): Self = this.set("oldNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DELETE): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
