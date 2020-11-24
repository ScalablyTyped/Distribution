package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindByNameOptions extends js.Object {
  
  var deleted: js.UndefOr[Boolean] = js.native
  
  var httpCache: js.UndefOr[Boolean] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var removed: js.UndefOr[Boolean] = js.native
}
object FindByNameOptions {
  
  @scala.inline
  def apply(): FindByNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindByNameOptions]
  }
  
  @scala.inline
  implicit class FindByNameOptionsOps[Self <: FindByNameOptions] (val x: Self) extends AnyVal {
    
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
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setHttpCache(value: Boolean): Self = this.set("httpCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpCache: Self = this.set("httpCache", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setRemoved(value: Boolean): Self = this.set("removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoved: Self = this.set("removed", js.undefined)
  }
}
