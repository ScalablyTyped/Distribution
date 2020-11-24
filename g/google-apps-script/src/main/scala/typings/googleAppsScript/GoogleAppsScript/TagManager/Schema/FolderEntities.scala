package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderEntities extends js.Object {
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var tag: js.UndefOr[js.Array[Tag]] = js.native
  
  var trigger: js.UndefOr[js.Array[Trigger]] = js.native
  
  var variable: js.UndefOr[js.Array[Variable]] = js.native
}
object FolderEntities {
  
  @scala.inline
  def apply(): FolderEntities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderEntities]
  }
  
  @scala.inline
  implicit class FolderEntitiesOps[Self <: FolderEntities] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTagVarargs(value: Tag*): Self = this.set("tag", js.Array(value :_*))
    
    @scala.inline
    def setTag(value: js.Array[Tag]): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setTriggerVarargs(value: Trigger*): Self = this.set("trigger", js.Array(value :_*))
    
    @scala.inline
    def setTrigger(value: js.Array[Trigger]): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setVariableVarargs(value: Variable*): Self = this.set("variable", js.Array(value :_*))
    
    @scala.inline
    def setVariable(value: js.Array[Variable]): Self = this.set("variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
  }
}
