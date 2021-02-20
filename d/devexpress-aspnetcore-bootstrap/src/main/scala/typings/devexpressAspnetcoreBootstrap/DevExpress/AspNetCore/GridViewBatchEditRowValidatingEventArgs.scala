package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridViewBatchEditRowValidatingEventArgs extends EventArgs {
  
  val validationInfo: js.Any = js.native
  
  val visibleIndex: Double = js.native
}
object GridViewBatchEditRowValidatingEventArgs {
  
  @scala.inline
  def apply(sender: Control, validationInfo: js.Any, visibleIndex: Double): GridViewBatchEditRowValidatingEventArgs = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any], validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditRowValidatingEventArgs]
  }
  
  @scala.inline
  implicit class GridViewBatchEditRowValidatingEventArgsMutableBuilder[Self <: GridViewBatchEditRowValidatingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidationInfo(value: js.Any): Self = StObject.set(x, "validationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
