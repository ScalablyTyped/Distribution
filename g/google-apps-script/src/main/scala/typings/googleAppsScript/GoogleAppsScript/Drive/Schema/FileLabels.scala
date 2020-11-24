package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileLabels extends js.Object {
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var modified: js.UndefOr[Boolean] = js.native
  
  var restricted: js.UndefOr[Boolean] = js.native
  
  var starred: js.UndefOr[Boolean] = js.native
  
  var trashed: js.UndefOr[Boolean] = js.native
  
  var viewed: js.UndefOr[Boolean] = js.native
}
object FileLabels {
  
  @scala.inline
  def apply(): FileLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileLabels]
  }
  
  @scala.inline
  implicit class FileLabelsOps[Self <: FileLabels] (val x: Self) extends AnyVal {
    
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
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setModified(value: Boolean): Self = this.set("modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModified: Self = this.set("modified", js.undefined)
    
    @scala.inline
    def setRestricted(value: Boolean): Self = this.set("restricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestricted: Self = this.set("restricted", js.undefined)
    
    @scala.inline
    def setStarred(value: Boolean): Self = this.set("starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarred: Self = this.set("starred", js.undefined)
    
    @scala.inline
    def setTrashed(value: Boolean): Self = this.set("trashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrashed: Self = this.set("trashed", js.undefined)
    
    @scala.inline
    def setViewed(value: Boolean): Self = this.set("viewed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewed: Self = this.set("viewed", js.undefined)
  }
}
