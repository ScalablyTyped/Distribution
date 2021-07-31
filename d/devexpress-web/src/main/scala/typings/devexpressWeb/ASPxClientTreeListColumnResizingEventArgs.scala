package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.ColumnResizing event.
  */
trait ASPxClientTreeListColumnResizingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed client column.
    */
  var column: ASPxClientTreeListColumn
}
object ASPxClientTreeListColumnResizingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, column: ASPxClientTreeListColumn): ASPxClientTreeListColumnResizingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListColumnResizingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListColumnResizingEventArgsMutableBuilder[Self <: ASPxClientTreeListColumnResizingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ASPxClientTreeListColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
