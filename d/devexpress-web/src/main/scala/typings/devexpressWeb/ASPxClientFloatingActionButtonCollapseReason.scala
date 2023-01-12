package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values specifying whether the user action or APIs has collapsed the action group.
  */
trait ASPxClientFloatingActionButtonCollapseReason extends StObject {
  
  /**
    * The action group is collapsed using APIs.
    */
  var API: String
  
  /**
    * The action group is collapsed by clicking on the action item.
    */
  var ActionItem: String
  
  /**
    * The action group is collapsed using the collapse button.
    */
  var CollapseButton: String
}
object ASPxClientFloatingActionButtonCollapseReason {
  
  inline def apply(API: String, ActionItem: String, CollapseButton: String): ASPxClientFloatingActionButtonCollapseReason = {
    val __obj = js.Dynamic.literal(API = API.asInstanceOf[js.Any], ActionItem = ActionItem.asInstanceOf[js.Any], CollapseButton = CollapseButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonCollapseReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientFloatingActionButtonCollapseReason] (val x: Self) extends AnyVal {
    
    inline def setAPI(value: String): Self = StObject.set(x, "API", value.asInstanceOf[js.Any])
    
    inline def setActionItem(value: String): Self = StObject.set(x, "ActionItem", value.asInstanceOf[js.Any])
    
    inline def setCollapseButton(value: String): Self = StObject.set(x, "CollapseButton", value.asInstanceOf[js.Any])
  }
}
