package typings.elkjs.libElkApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElkLayoutOptionDescription
  extends StObject
     with ElkCommonDescription {
  
  var group: js.UndefOr[String] = js.undefined
  
  var targets: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ElkLayoutOptionDescription {
  
  inline def apply(): ElkLayoutOptionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElkLayoutOptionDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElkLayoutOptionDescription] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
