package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Member extends js.Object {
  
  var caption: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[js.Array[Member]] = js.native
  
  var hierarchyName: js.UndefOr[String] = js.native
  
  var isLeaf: js.UndefOr[Boolean] = js.native
  
  var parentMember: js.UndefOr[String] = js.native
  
  var uniqueName: js.UndefOr[String] = js.native
}
object Member {
  
  @scala.inline
  def apply(): Member = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Member]
  }
  
  @scala.inline
  implicit class MemberOps[Self <: Member] (val x: Self) extends AnyVal {
    
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: Member*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[Member]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setHierarchyName(value: String): Self = this.set("hierarchyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHierarchyName: Self = this.set("hierarchyName", js.undefined)
    
    @scala.inline
    def setIsLeaf(value: Boolean): Self = this.set("isLeaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLeaf: Self = this.set("isLeaf", js.undefined)
    
    @scala.inline
    def setParentMember(value: String): Self = this.set("parentMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentMember: Self = this.set("parentMember", js.undefined)
    
    @scala.inline
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueName: Self = this.set("uniqueName", js.undefined)
  }
}
