package typings.diff2html.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffFileName extends js.Object {
  
  var newName: String = js.native
  
  var oldName: String = js.native
}
object DiffFileName {
  
  @scala.inline
  def apply(newName: String, oldName: String): DiffFileName = {
    val __obj = js.Dynamic.literal(newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffFileName]
  }
  
  @scala.inline
  implicit class DiffFileNameOps[Self <: DiffFileName] (val x: Self) extends AnyVal {
    
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
    def setNewName(value: String): Self = this.set("newName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldName(value: String): Self = this.set("oldName", value.asInstanceOf[js.Any])
  }
}
