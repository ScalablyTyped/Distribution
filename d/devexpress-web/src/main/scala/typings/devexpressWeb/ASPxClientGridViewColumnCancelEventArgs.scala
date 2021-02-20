package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the cancelable events of a client ASPxGridView column.
  */
@js.native
trait ASPxClientGridViewColumnCancelEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed client column.
    */
  var column: ASPxClientGridViewColumn = js.native
}
object ASPxClientGridViewColumnCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, column: ASPxClientGridViewColumn): ASPxClientGridViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewColumnCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewColumnCancelEventArgsMutableBuilder[Self <: ASPxClientGridViewColumnCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ASPxClientGridViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
