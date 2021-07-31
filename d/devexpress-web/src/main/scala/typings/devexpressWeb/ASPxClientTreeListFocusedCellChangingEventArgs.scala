package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.FocusedCellChanging event.
  */
trait ASPxClientTreeListFocusedCellChangingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Provides information on a cell currently being focused.
    */
  var cellInfo: ASPxClientTreeListCellInfo
}
object ASPxClientTreeListFocusedCellChangingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, cellInfo: ASPxClientTreeListCellInfo): ASPxClientTreeListFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cellInfo = cellInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListFocusedCellChangingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListFocusedCellChangingEventArgsMutableBuilder[Self <: ASPxClientTreeListFocusedCellChangingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellInfo(value: ASPxClientTreeListCellInfo): Self = StObject.set(x, "cellInfo", value.asInstanceOf[js.Any])
  }
}
