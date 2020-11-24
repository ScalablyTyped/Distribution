package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeGroupAssignment extends js.Object {
  
  var creativeGroupId: js.UndefOr[String] = js.native
  
  var creativeGroupNumber: js.UndefOr[String] = js.native
}
object CreativeGroupAssignment {
  
  @scala.inline
  def apply(): CreativeGroupAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeGroupAssignment]
  }
  
  @scala.inline
  implicit class CreativeGroupAssignmentOps[Self <: CreativeGroupAssignment] (val x: Self) extends AnyVal {
    
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
    def setCreativeGroupId(value: String): Self = this.set("creativeGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeGroupId: Self = this.set("creativeGroupId", js.undefined)
    
    @scala.inline
    def setCreativeGroupNumber(value: String): Self = this.set("creativeGroupNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeGroupNumber: Self = this.set("creativeGroupNumber", js.undefined)
  }
}
