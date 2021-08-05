package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.GroupRowExpanding and ASPxClientCardView.GroupRowCollapsing events.
  */
trait ASPxClientCardViewGroupCancelEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed group row's visible index.
    */
  var visibleIndex: Double
}
object ASPxClientCardViewGroupCancelEventArgs {
  
  inline def apply(cancel: Boolean, visibleIndex: Double): ASPxClientCardViewGroupCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewGroupCancelEventArgs]
  }
  
  extension [Self <: ASPxClientCardViewGroupCancelEventArgs](x: Self) {
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
