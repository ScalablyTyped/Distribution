package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.RowExpandedChanged event.
  */
trait ASPxClientVerticalGridRowExpandedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the expanded row.
    */
  var row: ASPxClientVerticalGridRow
}
object ASPxClientVerticalGridRowExpandedEventArgs {
  
  inline def apply(row: ASPxClientVerticalGridRow): ASPxClientVerticalGridRowExpandedEventArgs = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRowExpandedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientVerticalGridRowExpandedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setRow(value: ASPxClientVerticalGridRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
