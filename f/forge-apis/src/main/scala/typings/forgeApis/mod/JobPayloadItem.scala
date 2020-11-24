package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobPayloadItem extends js.Object {
  
  var advanced: js.UndefOr[JobObjOutputPayloadAdvanced] = js.native
  
  var `type`: String = js.native
  
  var views: js.UndefOr[js.Array[String]] = js.native
}
object JobPayloadItem {
  
  @scala.inline
  def apply(`type`: String): JobPayloadItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobPayloadItem]
  }
  
  @scala.inline
  implicit class JobPayloadItemOps[Self <: JobPayloadItem] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvanced(value: JobObjOutputPayloadAdvanced): Self = this.set("advanced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvanced: Self = this.set("advanced", js.undefined)
    
    @scala.inline
    def setViewsVarargs(value: String*): Self = this.set("views", js.Array(value :_*))
    
    @scala.inline
    def setViews(value: js.Array[String]): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
}
