package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseMultipleSelectionSelectGetDropdownProps
  extends GetToggleButtonPropsOptions
     with GetPropsWithRefKey
     with UseMultipleSelectionGetDropdownProps {
  
  var preventKeyAction: js.UndefOr[Boolean] = js.native
}
object UseMultipleSelectionSelectGetDropdownProps {
  
  @scala.inline
  def apply(): UseMultipleSelectionSelectGetDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseMultipleSelectionSelectGetDropdownProps]
  }
  
  @scala.inline
  implicit class UseMultipleSelectionSelectGetDropdownPropsMutableBuilder[Self <: UseMultipleSelectionSelectGetDropdownProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventKeyAction(value: Boolean): Self = StObject.set(x, "preventKeyAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventKeyActionUndefined: Self = StObject.set(x, "preventKeyAction", js.undefined)
  }
}
