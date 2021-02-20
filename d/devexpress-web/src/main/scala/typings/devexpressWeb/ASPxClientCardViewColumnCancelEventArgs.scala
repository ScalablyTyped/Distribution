package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the cancelable events of a client ASPxCardView column.
  */
@js.native
trait ASPxClientCardViewColumnCancelEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed client column.
    */
  var column: ASPxClientCardViewColumn = js.native
}
object ASPxClientCardViewColumnCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, column: ASPxClientCardViewColumn): ASPxClientCardViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewColumnCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCardViewColumnCancelEventArgsMutableBuilder[Self <: ASPxClientCardViewColumnCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ASPxClientCardViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
