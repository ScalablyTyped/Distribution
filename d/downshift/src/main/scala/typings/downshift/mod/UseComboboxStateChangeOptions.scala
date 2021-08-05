package typings.downshift.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseComboboxStateChangeOptions[Item]
  extends StObject
     with UseComboboxDispatchAction[Item] {
  
  var changes: Partial[UseComboboxState[Item]]
}
object UseComboboxStateChangeOptions {
  
  inline def apply[Item](changes: Partial[UseComboboxState[Item]], `type`: UseComboboxStateChangeTypes): UseComboboxStateChangeOptions[Item] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseComboboxStateChangeOptions[Item]]
  }
  
  extension [Self <: UseComboboxStateChangeOptions[?], Item](x: Self & UseComboboxStateChangeOptions[Item]) {
    
    inline def setChanges(value: Partial[UseComboboxState[Item]]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
  }
}
