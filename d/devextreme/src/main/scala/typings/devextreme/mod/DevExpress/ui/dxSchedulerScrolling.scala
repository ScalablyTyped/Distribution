package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.ScrollMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSchedulerScrolling extends StObject {
  
  /**
    * Specifies the scrolling mode.
    */
  var mode: js.UndefOr[ScrollMode] = js.undefined
}
object dxSchedulerScrolling {
  
  inline def apply(): dxSchedulerScrolling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSchedulerScrolling]
  }
  
  extension [Self <: dxSchedulerScrolling](x: Self) {
    
    inline def setMode(value: ScrollMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
