package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageRemoveInfo extends js.Object {
  
  var Deleted: String = js.native
  
  var Untagged: String = js.native
}
object ImageRemoveInfo {
  
  @scala.inline
  def apply(Deleted: String, Untagged: String): ImageRemoveInfo = {
    val __obj = js.Dynamic.literal(Deleted = Deleted.asInstanceOf[js.Any], Untagged = Untagged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRemoveInfo]
  }
  
  @scala.inline
  implicit class ImageRemoveInfoOps[Self <: ImageRemoveInfo] (val x: Self) extends AnyVal {
    
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
    def setDeleted(value: String): Self = this.set("Deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntagged(value: String): Self = this.set("Untagged", value.asInstanceOf[js.Any])
  }
}
