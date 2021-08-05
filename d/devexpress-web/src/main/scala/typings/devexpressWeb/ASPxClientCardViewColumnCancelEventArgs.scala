package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the cancelable events of a client ASPxCardView column.
  */
trait ASPxClientCardViewColumnCancelEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed client column.
    */
  var column: ASPxClientCardViewColumn
}
object ASPxClientCardViewColumnCancelEventArgs {
  
  inline def apply(cancel: Boolean, column: ASPxClientCardViewColumn): ASPxClientCardViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewColumnCancelEventArgs]
  }
  
  extension [Self <: ASPxClientCardViewColumnCancelEventArgs](x: Self) {
    
    inline def setColumn(value: ASPxClientCardViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
