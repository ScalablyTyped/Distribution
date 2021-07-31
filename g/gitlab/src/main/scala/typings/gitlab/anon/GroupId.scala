package typings.gitlab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupId extends StObject {
  
  var groupId: js.UndefOr[String | Double] = js.undefined
}
object GroupId {
  
  @scala.inline
  def apply(): GroupId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupId]
  }
  
  @scala.inline
  implicit class GroupIdMutableBuilder[Self <: GroupId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: String | Double): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
  }
}
