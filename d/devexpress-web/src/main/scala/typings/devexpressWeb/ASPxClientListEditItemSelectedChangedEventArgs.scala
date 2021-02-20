package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientListEdit.SelectedIndexChanged event.
  */
@js.native
trait ASPxClientListEditItemSelectedChangedEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double = js.native
  
  /**
    * Gets whether the item has been selected.
    */
  var isSelected: Boolean = js.native
}
object ASPxClientListEditItemSelectedChangedEventArgs {
  
  @scala.inline
  def apply(index: Double, isSelected: Boolean, processOnServer: Boolean): ASPxClientListEditItemSelectedChangedEventArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientListEditItemSelectedChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientListEditItemSelectedChangedEventArgsMutableBuilder[Self <: ASPxClientListEditItemSelectedChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
  }
}
