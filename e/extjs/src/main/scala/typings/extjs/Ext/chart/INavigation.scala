package typings.extjs.Ext.chart

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INavigation extends IBase {
  
  /** [Method] Restores the zoom to the original value  */
  var restoreZoom: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Zooms the chart to the specified selection range
    * @param zoomConfig Object
    */
  var setZoom: js.UndefOr[js.Function1[/* zoomConfig */ js.UndefOr[js.Any], Unit]] = js.native
}
object INavigation {
  
  @scala.inline
  def apply(): INavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavigation]
  }
  
  @scala.inline
  implicit class INavigationMutableBuilder[Self <: INavigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestoreZoom(value: () => Unit): Self = StObject.set(x, "restoreZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestoreZoomUndefined: Self = StObject.set(x, "restoreZoom", js.undefined)
    
    @scala.inline
    def setSetZoom(value: /* zoomConfig */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setZoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetZoomUndefined: Self = StObject.set(x, "setZoom", js.undefined)
  }
}
