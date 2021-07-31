package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the cancelable events of a client ASPxVerticalGrid row.
  */
trait ASPxClientVerticalGridRowCancelEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed client row.
    */
  var row: ASPxClientVerticalGridRow
}
object ASPxClientVerticalGridRowCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridRowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRowCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientVerticalGridRowCancelEventArgsMutableBuilder[Self <: ASPxClientVerticalGridRowCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRow(value: ASPxClientVerticalGridRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
