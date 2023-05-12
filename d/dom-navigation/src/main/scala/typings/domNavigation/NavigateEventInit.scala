package typings.domNavigation

import typings.std.AbortSignal
import typings.std.EventInit
import typings.std.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateEventInit
  extends StObject
     with EventInit {
  
  var canIntercept: js.UndefOr[Boolean] = js.undefined
  
  var destination: NavigationDestination
  
  var downloadRequest: js.UndefOr[String | Null] = js.undefined
  
  var formData: js.UndefOr[FormData | Null] = js.undefined
  
  var hashChange: js.UndefOr[Boolean] = js.undefined
  
  var info: js.UndefOr[Any] = js.undefined
  
  var navigationType: js.UndefOr[NavigationTypeString] = js.undefined
  
  var signal: AbortSignal
  
  var userInitiated: js.UndefOr[Boolean] = js.undefined
}
object NavigateEventInit {
  
  inline def apply(destination: NavigationDestination, signal: AbortSignal): NavigateEventInit = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigateEventInit] (val x: Self) extends AnyVal {
    
    inline def setCanIntercept(value: Boolean): Self = StObject.set(x, "canIntercept", value.asInstanceOf[js.Any])
    
    inline def setCanInterceptUndefined: Self = StObject.set(x, "canIntercept", js.undefined)
    
    inline def setDestination(value: NavigationDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDownloadRequest(value: String): Self = StObject.set(x, "downloadRequest", value.asInstanceOf[js.Any])
    
    inline def setDownloadRequestNull: Self = StObject.set(x, "downloadRequest", null)
    
    inline def setDownloadRequestUndefined: Self = StObject.set(x, "downloadRequest", js.undefined)
    
    inline def setFormData(value: FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataNull: Self = StObject.set(x, "formData", null)
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setHashChange(value: Boolean): Self = StObject.set(x, "hashChange", value.asInstanceOf[js.Any])
    
    inline def setHashChangeUndefined: Self = StObject.set(x, "hashChange", js.undefined)
    
    inline def setInfo(value: Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setNavigationType(value: NavigationTypeString): Self = StObject.set(x, "navigationType", value.asInstanceOf[js.Any])
    
    inline def setNavigationTypeUndefined: Self = StObject.set(x, "navigationType", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setUserInitiated(value: Boolean): Self = StObject.set(x, "userInitiated", value.asInstanceOf[js.Any])
    
    inline def setUserInitiatedUndefined: Self = StObject.set(x, "userInitiated", js.undefined)
  }
}
