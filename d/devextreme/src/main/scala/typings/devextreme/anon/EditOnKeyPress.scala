package typings.devextreme.anon

import typings.devextreme.devextremeStrings.column
import typings.devextreme.devextremeStrings.moveFocus
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.row
import typings.devextreme.devextremeStrings.startEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditOnKeyPress extends StObject {
  
  var editOnKeyPress: js.UndefOr[Boolean] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var enterKeyAction: js.UndefOr[startEdit | moveFocus] = js.native
  
  var enterKeyDirection: js.UndefOr[none | column | row] = js.native
}
object EditOnKeyPress {
  
  @scala.inline
  def apply(): EditOnKeyPress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditOnKeyPress]
  }
  
  @scala.inline
  implicit class EditOnKeyPressMutableBuilder[Self <: EditOnKeyPress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditOnKeyPress(value: Boolean): Self = StObject.set(x, "editOnKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditOnKeyPressUndefined: Self = StObject.set(x, "editOnKeyPress", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setEnterKeyAction(value: startEdit | moveFocus): Self = StObject.set(x, "enterKeyAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterKeyActionUndefined: Self = StObject.set(x, "enterKeyAction", js.undefined)
    
    @scala.inline
    def setEnterKeyDirection(value: none | column | row): Self = StObject.set(x, "enterKeyDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterKeyDirectionUndefined: Self = StObject.set(x, "enterKeyDirection", js.undefined)
  }
}
