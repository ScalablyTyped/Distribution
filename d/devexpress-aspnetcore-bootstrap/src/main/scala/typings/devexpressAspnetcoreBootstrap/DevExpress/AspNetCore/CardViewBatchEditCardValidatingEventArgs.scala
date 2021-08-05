package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardViewBatchEditCardValidatingEventArgs
  extends StObject
     with EventArgs {
  
  val validationInfo: js.Any
  
  val visibleIndex: Double
}
object CardViewBatchEditCardValidatingEventArgs {
  
  inline def apply(sender: Control, validationInfo: js.Any, visibleIndex: Double): CardViewBatchEditCardValidatingEventArgs = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any], validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewBatchEditCardValidatingEventArgs]
  }
  
  extension [Self <: CardViewBatchEditCardValidatingEventArgs](x: Self) {
    
    inline def setValidationInfo(value: js.Any): Self = StObject.set(x, "validationInfo", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
