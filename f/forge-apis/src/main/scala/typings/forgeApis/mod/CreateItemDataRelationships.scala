package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateItemDataRelationships extends js.Object {
  
  var parent: js.UndefOr[CreateStorageDataRelationshipsTarget] = js.native
  
  var tip: js.UndefOr[CreateItemDataRelationshipsTip] = js.native
}
object CreateItemDataRelationships {
  
  @scala.inline
  def apply(): CreateItemDataRelationships = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateItemDataRelationships]
  }
  
  @scala.inline
  implicit class CreateItemDataRelationshipsOps[Self <: CreateItemDataRelationships] (val x: Self) extends AnyVal {
    
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
    def setParent(value: CreateStorageDataRelationshipsTarget): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setTip(value: CreateItemDataRelationshipsTip): Self = this.set("tip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTip: Self = this.set("tip", js.undefined)
  }
}
