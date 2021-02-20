package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.ColumnResized event.
  */
@js.native
trait ASPxClientTreeListColumnResizedEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the processed client column.
    */
  var column: ASPxClientTreeListColumn = js.native
}
object ASPxClientTreeListColumnResizedEventArgs {
  
  @scala.inline
  def apply(column: ASPxClientTreeListColumn, processOnServer: Boolean): ASPxClientTreeListColumnResizedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListColumnResizedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListColumnResizedEventArgsMutableBuilder[Self <: ASPxClientTreeListColumnResizedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ASPxClientTreeListColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
