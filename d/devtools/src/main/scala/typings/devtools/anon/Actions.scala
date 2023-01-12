package typings.devtools.anon

import typings.devtools.buildCommandsPerformActionsMod.ActionsParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: js.Array[ActionsParameter]
}
object Actions {
  
  inline def apply(actions: js.Array[ActionsParameter]): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[ActionsParameter]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: ActionsParameter*): Self = StObject.set(x, "actions", js.Array(value*))
  }
}
