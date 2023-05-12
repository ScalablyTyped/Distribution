package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardNavigation extends StObject {
  
  /**
    * Specifies whether users can enter a new cell value on a key press. Applies if editing.mode is &apos;cell&apos; or &apos;batch&apos;.
    */
  var editOnKeyPress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables keyboard navigation.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the Enter key switches the cell or row to the edit state or moves focus in the enterKeyDirection. Applies for all edit modes, except &apos;popup&apos;.
    */
  var enterKeyAction: js.UndefOr[EnterKeyAction] = js.undefined
  
  /**
    * Specifies the direction in which to move focus when a user presses Enter. Applies if editing.mode is &apos;cell&apos; or &apos;batch&apos;.
    */
  var enterKeyDirection: js.UndefOr[EnterKeyDirection] = js.undefined
}
object KeyboardNavigation {
  
  inline def apply(): KeyboardNavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardNavigation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardNavigation] (val x: Self) extends AnyVal {
    
    inline def setEditOnKeyPress(value: Boolean): Self = StObject.set(x, "editOnKeyPress", value.asInstanceOf[js.Any])
    
    inline def setEditOnKeyPressUndefined: Self = StObject.set(x, "editOnKeyPress", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEnterKeyAction(value: EnterKeyAction): Self = StObject.set(x, "enterKeyAction", value.asInstanceOf[js.Any])
    
    inline def setEnterKeyActionUndefined: Self = StObject.set(x, "enterKeyAction", js.undefined)
    
    inline def setEnterKeyDirection(value: EnterKeyDirection): Self = StObject.set(x, "enterKeyDirection", value.asInstanceOf[js.Any])
    
    inline def setEnterKeyDirectionUndefined: Self = StObject.set(x, "enterKeyDirection", js.undefined)
  }
}
