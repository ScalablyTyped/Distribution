package typings.dndCore.distInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentinelAction extends StObject {
  
  var `type`: Identifier
}
object SentinelAction {
  
  inline def apply(`type`: Identifier): SentinelAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentinelAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SentinelAction] (val x: Self) extends AnyVal {
    
    inline def setType(value: Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
