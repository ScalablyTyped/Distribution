package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowPan extends StObject {
  
  var allowPan: js.UndefOr[Boolean] = js.native
  
  var allowSelection: js.UndefOr[Boolean] = js.native
  
  var allowZoom: js.UndefOr[Boolean] = js.native
}
object AllowPan {
  
  @scala.inline
  def apply(): AllowPan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowPan]
  }
  
  @scala.inline
  implicit class AllowPanMutableBuilder[Self <: AllowPan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPan(value: Boolean): Self = StObject.set(x, "allowPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPanUndefined: Self = StObject.set(x, "allowPan", js.undefined)
    
    @scala.inline
    def setAllowSelection(value: Boolean): Self = StObject.set(x, "allowSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSelectionUndefined: Self = StObject.set(x, "allowSelection", js.undefined)
    
    @scala.inline
    def setAllowZoom(value: Boolean): Self = StObject.set(x, "allowZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowZoomUndefined: Self = StObject.set(x, "allowZoom", js.undefined)
  }
}
