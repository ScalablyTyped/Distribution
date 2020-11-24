package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupWidth extends js.Object {
  
  var groupWidth: js.Any = js.native
}
object GroupWidth {
  
  @scala.inline
  def apply(groupWidth: js.Any): GroupWidth = {
    val __obj = js.Dynamic.literal(groupWidth = groupWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupWidth]
  }
  
  @scala.inline
  implicit class GroupWidthOps[Self <: GroupWidth] (val x: Self) extends AnyVal {
    
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
    def setGroupWidth(value: js.Any): Self = this.set("groupWidth", value.asInstanceOf[js.Any])
  }
}
