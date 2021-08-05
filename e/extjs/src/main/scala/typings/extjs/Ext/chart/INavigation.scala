package typings.extjs.Ext.chart

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INavigation
  extends StObject
     with IBase {
  
  /** [Method] Restores the zoom to the original value  */
  var restoreZoom: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Zooms the chart to the specified selection range
    * @param zoomConfig Object
    */
  var setZoom: js.UndefOr[js.Function1[/* zoomConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
}
object INavigation {
  
  inline def apply(): INavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavigation]
  }
  
  extension [Self <: INavigation](x: Self) {
    
    inline def setRestoreZoom(value: () => Unit): Self = StObject.set(x, "restoreZoom", js.Any.fromFunction0(value))
    
    inline def setRestoreZoomUndefined: Self = StObject.set(x, "restoreZoom", js.undefined)
    
    inline def setSetZoom(value: /* zoomConfig */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setZoom", js.Any.fromFunction1(value))
    
    inline def setSetZoomUndefined: Self = StObject.set(x, "setZoom", js.undefined)
  }
}
