package typings.downshift.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseSelectStateChangeOptions[Item]
  extends StObject
     with UseSelectDispatchAction[Item] {
  
  var changes: Partial[UseSelectState[Item]]
}
object UseSelectStateChangeOptions {
  
  inline def apply[Item](changes: Partial[UseSelectState[Item]], `type`: UseSelectStateChangeTypes): UseSelectStateChangeOptions[Item] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectStateChangeOptions[Item]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseSelectStateChangeOptions[?], Item] (val x: Self & UseSelectStateChangeOptions[Item]) extends AnyVal {
    
    inline def setChanges(value: Partial[UseSelectState[Item]]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
  }
}
