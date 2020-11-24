package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobObjOutputPayloadAdvanced extends js.Object {
  
  var exportFileStructure: js.UndefOr[String] = js.native
  
  var modelGuid: js.UndefOr[String] = js.native
  
  var objectIds: js.UndefOr[js.Array[String]] = js.native
}
object JobObjOutputPayloadAdvanced {
  
  @scala.inline
  def apply(): JobObjOutputPayloadAdvanced = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobObjOutputPayloadAdvanced]
  }
  
  @scala.inline
  implicit class JobObjOutputPayloadAdvancedOps[Self <: JobObjOutputPayloadAdvanced] (val x: Self) extends AnyVal {
    
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
    def setExportFileStructure(value: String): Self = this.set("exportFileStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportFileStructure: Self = this.set("exportFileStructure", js.undefined)
    
    @scala.inline
    def setModelGuid(value: String): Self = this.set("modelGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelGuid: Self = this.set("modelGuid", js.undefined)
    
    @scala.inline
    def setObjectIdsVarargs(value: String*): Self = this.set("objectIds", js.Array(value :_*))
    
    @scala.inline
    def setObjectIds(value: js.Array[String]): Self = this.set("objectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectIds: Self = this.set("objectIds", js.undefined)
  }
}
