package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewBatchEditRowValidatingEventArgs
  extends StObject
     with EventArgs {
  
  val validationInfo: js.Any
  
  val visibleIndex: Double
}
object GridViewBatchEditRowValidatingEventArgs {
  
  inline def apply(sender: Control, validationInfo: js.Any, visibleIndex: Double): GridViewBatchEditRowValidatingEventArgs = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any], validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditRowValidatingEventArgs]
  }
  
  extension [Self <: GridViewBatchEditRowValidatingEventArgs](x: Self) {
    
    inline def setValidationInfo(value: js.Any): Self = StObject.set(x, "validationInfo", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
