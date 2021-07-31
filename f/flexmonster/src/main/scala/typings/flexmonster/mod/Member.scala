package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Member extends StObject {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[js.Array[Member]] = js.undefined
  
  var hierarchyName: js.UndefOr[String] = js.undefined
  
  var isLeaf: js.UndefOr[Boolean] = js.undefined
  
  var parentMember: js.UndefOr[String] = js.undefined
  
  var uniqueName: js.UndefOr[String] = js.undefined
}
object Member {
  
  @scala.inline
  def apply(): Member = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Member]
  }
  
  @scala.inline
  implicit class MemberMutableBuilder[Self <: Member] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Array[Member]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: Member*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setHierarchyName(value: String): Self = StObject.set(x, "hierarchyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyNameUndefined: Self = StObject.set(x, "hierarchyName", js.undefined)
    
    @scala.inline
    def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
    
    @scala.inline
    def setParentMember(value: String): Self = StObject.set(x, "parentMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentMemberUndefined: Self = StObject.set(x, "parentMember", js.undefined)
    
    @scala.inline
    def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
  }
}
