package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridViewBatchEditRowInsertingEventArgs extends CancelEventArgs {
  
  val visibleIndex: Double = js.native
}
object GridViewBatchEditRowInsertingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, sender: Control, visibleIndex: Double): GridViewBatchEditRowInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditRowInsertingEventArgs]
  }
  
  @scala.inline
  implicit class GridViewBatchEditRowInsertingEventArgsMutableBuilder[Self <: GridViewBatchEditRowInsertingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
