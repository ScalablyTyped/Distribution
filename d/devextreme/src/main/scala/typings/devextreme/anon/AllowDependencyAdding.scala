package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowDependencyAdding extends js.Object {
  
  var allowDependencyAdding: js.UndefOr[Boolean] = js.native
  
  var allowDependencyDeleting: js.UndefOr[Boolean] = js.native
  
  var allowResourceAdding: js.UndefOr[Boolean] = js.native
  
  var allowResourceDeleting: js.UndefOr[Boolean] = js.native
  
  var allowResourceUpdating: js.UndefOr[Boolean] = js.native
  
  var allowTaskAdding: js.UndefOr[Boolean] = js.native
  
  var allowTaskDeleting: js.UndefOr[Boolean] = js.native
  
  var allowTaskUpdating: js.UndefOr[Boolean] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
}
object AllowDependencyAdding {
  
  @scala.inline
  def apply(): AllowDependencyAdding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowDependencyAdding]
  }
  
  @scala.inline
  implicit class AllowDependencyAddingOps[Self <: AllowDependencyAdding] (val x: Self) extends AnyVal {
    
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
    def setAllowDependencyAdding(value: Boolean): Self = this.set("allowDependencyAdding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDependencyAdding: Self = this.set("allowDependencyAdding", js.undefined)
    
    @scala.inline
    def setAllowDependencyDeleting(value: Boolean): Self = this.set("allowDependencyDeleting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDependencyDeleting: Self = this.set("allowDependencyDeleting", js.undefined)
    
    @scala.inline
    def setAllowResourceAdding(value: Boolean): Self = this.set("allowResourceAdding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowResourceAdding: Self = this.set("allowResourceAdding", js.undefined)
    
    @scala.inline
    def setAllowResourceDeleting(value: Boolean): Self = this.set("allowResourceDeleting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowResourceDeleting: Self = this.set("allowResourceDeleting", js.undefined)
    
    @scala.inline
    def setAllowResourceUpdating(value: Boolean): Self = this.set("allowResourceUpdating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowResourceUpdating: Self = this.set("allowResourceUpdating", js.undefined)
    
    @scala.inline
    def setAllowTaskAdding(value: Boolean): Self = this.set("allowTaskAdding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTaskAdding: Self = this.set("allowTaskAdding", js.undefined)
    
    @scala.inline
    def setAllowTaskDeleting(value: Boolean): Self = this.set("allowTaskDeleting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTaskDeleting: Self = this.set("allowTaskDeleting", js.undefined)
    
    @scala.inline
    def setAllowTaskUpdating(value: Boolean): Self = this.set("allowTaskUpdating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTaskUpdating: Self = this.set("allowTaskUpdating", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
}
