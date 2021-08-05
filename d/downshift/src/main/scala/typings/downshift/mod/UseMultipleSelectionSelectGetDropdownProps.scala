package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseMultipleSelectionSelectGetDropdownProps
  extends StObject
     with GetToggleButtonPropsOptions
     with GetPropsWithRefKey
     with UseMultipleSelectionGetDropdownProps {
  
  var preventKeyAction: js.UndefOr[Boolean] = js.undefined
}
object UseMultipleSelectionSelectGetDropdownProps {
  
  inline def apply(): UseMultipleSelectionSelectGetDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseMultipleSelectionSelectGetDropdownProps]
  }
  
  extension [Self <: UseMultipleSelectionSelectGetDropdownProps](x: Self) {
    
    inline def setPreventKeyAction(value: Boolean): Self = StObject.set(x, "preventKeyAction", value.asInstanceOf[js.Any])
    
    inline def setPreventKeyActionUndefined: Self = StObject.set(x, "preventKeyAction", js.undefined)
  }
}
