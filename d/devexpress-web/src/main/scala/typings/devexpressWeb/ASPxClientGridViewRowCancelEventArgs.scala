package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.RowCollapsing and ASPxClientGridView.RowExpanding events.
  */
@js.native
trait ASPxClientGridViewRowCancelEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double = js.native
}
object ASPxClientGridViewRowCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, visibleIndex: Double): ASPxClientGridViewRowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewRowCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewRowCancelEventArgsMutableBuilder[Self <: ASPxClientGridViewRowCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
