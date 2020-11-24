package typings.downshift.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseSelectStateChangeOptions[Item] extends UseSelectDispatchAction[Item] {
  
  var changes: Partial[UseSelectState[Item]] = js.native
}
object UseSelectStateChangeOptions {
  
  @scala.inline
  def apply[Item](changes: Partial[UseSelectState[Item]], `type`: UseSelectStateChangeTypes): UseSelectStateChangeOptions[Item] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectStateChangeOptions[Item]]
  }
  
  @scala.inline
  implicit class UseSelectStateChangeOptionsOps[Self <: UseSelectStateChangeOptions[_], Item] (val x: Self with UseSelectStateChangeOptions[Item]) extends AnyVal {
    
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
    def setChanges(value: Partial[UseSelectState[Item]]): Self = this.set("changes", value.asInstanceOf[js.Any])
  }
}
