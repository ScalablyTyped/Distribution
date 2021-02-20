package typings.downshift.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseMultipleSelectionStateChangeOptions[Item] extends UseMultipleSelectionDispatchAction[Item] {
  
  var changes: Partial[UseMultipleSelectionState[Item]] = js.native
}
object UseMultipleSelectionStateChangeOptions {
  
  @scala.inline
  def apply[Item](changes: Partial[UseMultipleSelectionState[Item]], `type`: UseMultipleSelectionStateChangeTypes): UseMultipleSelectionStateChangeOptions[Item] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionStateChangeOptions[Item]]
  }
  
  @scala.inline
  implicit class UseMultipleSelectionStateChangeOptionsMutableBuilder[Self <: UseMultipleSelectionStateChangeOptions[_], Item] (val x: Self with UseMultipleSelectionStateChangeOptions[Item]) extends AnyVal {
    
    @scala.inline
    def setChanges(value: Partial[UseMultipleSelectionState[Item]]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
  }
}
