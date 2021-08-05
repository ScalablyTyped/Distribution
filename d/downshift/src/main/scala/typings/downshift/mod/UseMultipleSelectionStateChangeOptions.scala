package typings.downshift.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseMultipleSelectionStateChangeOptions[Item]
  extends StObject
     with UseMultipleSelectionDispatchAction[Item] {
  
  var changes: Partial[UseMultipleSelectionState[Item]]
}
object UseMultipleSelectionStateChangeOptions {
  
  inline def apply[Item](changes: Partial[UseMultipleSelectionState[Item]], `type`: UseMultipleSelectionStateChangeTypes): UseMultipleSelectionStateChangeOptions[Item] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionStateChangeOptions[Item]]
  }
  
  extension [Self <: UseMultipleSelectionStateChangeOptions[?], Item](x: Self & UseMultipleSelectionStateChangeOptions[Item]) {
    
    inline def setChanges(value: Partial[UseMultipleSelectionState[Item]]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
  }
}
