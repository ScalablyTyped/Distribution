package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type dxTooltipOptions = devextreme.devextreme.DevExpress.ui.dxPopoverOptions<devextreme.devextreme.DevExpress.ui.dxTooltip>
}}}
to avoid circular code involving: 
- devextreme.devextreme.DevExpress.ui.dxTooltip
- devextreme.devextreme.DevExpress.ui.dxTooltip.ContentReadyEvent
- devextreme.devextreme.DevExpress.ui.dxTooltip.DisposingEvent
- devextreme.devextreme.DevExpress.ui.dxTooltip.HiddenEvent
- devextreme.devextreme.DevExpress.ui.dxTooltip.InitializedEvent
- devextreme.devextreme.DevExpress.ui.dxTooltip.Properties
- devextreme.devextreme.DevExpress.ui.dxTooltip.ShownEvent
- devextreme.devextreme.DevExpress.ui.dxTooltipOptions
*/
trait dxTooltipOptions
  extends StObject
     with dxPopoverOptions[dxTooltip]
object dxTooltipOptions {
  
  inline def apply(): dxTooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTooltipOptions]
  }
}
