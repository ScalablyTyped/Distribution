package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentGuid extends js.Object {
  
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parentGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  
  var updateSequenceNum: js.UndefOr[Double] = js.native
}
object ParentGuid {
  
  @scala.inline
  def apply(): ParentGuid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentGuid]
  }
  
  @scala.inline
  implicit class ParentGuidOps[Self <: ParentGuid] (val x: Self) extends AnyVal {
    
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
    def setGuid(value: typings.evernote.mod.Types.Guid): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentGuid(value: typings.evernote.mod.Types.Guid): Self = this.set("parentGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentGuid: Self = this.set("parentGuid", js.undefined)
    
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = this.set("updateSequenceNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateSequenceNum: Self = this.set("updateSequenceNum", js.undefined)
  }
}
