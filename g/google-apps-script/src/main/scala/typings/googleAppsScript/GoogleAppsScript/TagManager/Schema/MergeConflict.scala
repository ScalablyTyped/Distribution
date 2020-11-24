package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeConflict extends js.Object {
  
  var entityInBaseVersion: js.UndefOr[Entity] = js.native
  
  var entityInWorkspace: js.UndefOr[Entity] = js.native
}
object MergeConflict {
  
  @scala.inline
  def apply(): MergeConflict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeConflict]
  }
  
  @scala.inline
  implicit class MergeConflictOps[Self <: MergeConflict] (val x: Self) extends AnyVal {
    
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
    def setEntityInBaseVersion(value: Entity): Self = this.set("entityInBaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityInBaseVersion: Self = this.set("entityInBaseVersion", js.undefined)
    
    @scala.inline
    def setEntityInWorkspace(value: Entity): Self = this.set("entityInWorkspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityInWorkspace: Self = this.set("entityInWorkspace", js.undefined)
  }
}
