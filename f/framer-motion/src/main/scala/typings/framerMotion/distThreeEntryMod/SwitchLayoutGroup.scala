package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchLayoutGroup extends StObject {
  
  var deregister: js.UndefOr[js.Function1[/* member */ IProjectionNode[Any], Unit]] = js.undefined
  
  var register: js.UndefOr[js.Function1[/* member */ IProjectionNode[Any], Unit]] = js.undefined
}
object SwitchLayoutGroup {
  
  inline def apply(): SwitchLayoutGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchLayoutGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwitchLayoutGroup] (val x: Self) extends AnyVal {
    
    inline def setDeregister(value: /* member */ IProjectionNode[Any] => Unit): Self = StObject.set(x, "deregister", js.Any.fromFunction1(value))
    
    inline def setDeregisterUndefined: Self = StObject.set(x, "deregister", js.undefined)
    
    inline def setRegister(value: /* member */ IProjectionNode[Any] => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    
    inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
  }
}
