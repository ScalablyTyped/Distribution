package typings.downshift.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseComboboxStateChangeOptions[Item] extends UseComboboxDispatchAction[Item] {
  
  var changes: Partial[UseComboboxState[Item]] = js.native
}
object UseComboboxStateChangeOptions {
  
  @scala.inline
  def apply[Item](changes: Partial[UseComboboxState[Item]], `type`: UseComboboxStateChangeTypes): UseComboboxStateChangeOptions[Item] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseComboboxStateChangeOptions[Item]]
  }
  
  @scala.inline
  implicit class UseComboboxStateChangeOptionsMutableBuilder[Self <: UseComboboxStateChangeOptions[_], Item] (val x: Self with UseComboboxStateChangeOptions[Item]) extends AnyVal {
    
    @scala.inline
    def setChanges(value: Partial[UseComboboxState[Item]]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
  }
}
