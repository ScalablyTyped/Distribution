package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardViewFocusedCellChangingEventArgs
  extends StObject
     with CancelEventArgs {
  
  val cellInfo: BootstrapCardViewCellInfo
}
object CardViewFocusedCellChangingEventArgs {
  
  inline def apply(cancel: Boolean, cellInfo: BootstrapCardViewCellInfo, sender: Control): CardViewFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cellInfo = cellInfo.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewFocusedCellChangingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardViewFocusedCellChangingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCellInfo(value: BootstrapCardViewCellInfo): Self = StObject.set(x, "cellInfo", value.asInstanceOf[js.Any])
  }
}
