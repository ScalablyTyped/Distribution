package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.RowExpandedChanging event.
  */
@js.native
trait ASPxClientVerticalGridRowExpandingEventArgs extends ASPxClientVerticalGridRowExpandedEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean = js.native
}
object ASPxClientVerticalGridRowExpandingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridRowExpandingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRowExpandingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientVerticalGridRowExpandingEventArgsMutableBuilder[Self <: ASPxClientVerticalGridRowExpandingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
  }
}
