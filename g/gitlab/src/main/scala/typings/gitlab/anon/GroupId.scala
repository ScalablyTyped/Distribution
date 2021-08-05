package typings.gitlab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupId extends StObject {
  
  var groupId: js.UndefOr[String | Double] = js.undefined
}
object GroupId {
  
  inline def apply(): GroupId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupId]
  }
  
  extension [Self <: GroupId](x: Self) {
    
    inline def setGroupId(value: String | Double): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
  }
}
