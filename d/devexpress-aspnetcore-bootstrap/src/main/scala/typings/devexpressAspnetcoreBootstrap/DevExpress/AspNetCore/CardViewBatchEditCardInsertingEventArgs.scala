package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardViewBatchEditCardInsertingEventArgs
  extends StObject
     with CancelEventArgs {
  
  val visibleIndex: Double
}
object CardViewBatchEditCardInsertingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, sender: Control, visibleIndex: Double): CardViewBatchEditCardInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewBatchEditCardInsertingEventArgs]
  }
  
  @scala.inline
  implicit class CardViewBatchEditCardInsertingEventArgsMutableBuilder[Self <: CardViewBatchEditCardInsertingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
