package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.FocusedCellChanging event.
  */
@js.native
trait ASPxClientGridViewFocusedCellChangingEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Provides information on a cell currently being focused.
    */
  var cellInfo: ASPxClientGridViewCellInfo = js.native
}
object ASPxClientGridViewFocusedCellChangingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, cellInfo: ASPxClientGridViewCellInfo): ASPxClientGridViewFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cellInfo = cellInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewFocusedCellChangingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewFocusedCellChangingEventArgsMutableBuilder[Self <: ASPxClientGridViewFocusedCellChangingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellInfo(value: ASPxClientGridViewCellInfo): Self = StObject.set(x, "cellInfo", value.asInstanceOf[js.Any])
  }
}
