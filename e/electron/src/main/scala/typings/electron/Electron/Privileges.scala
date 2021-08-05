package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Privileges extends StObject {
  
  /**
    * Default false.
    */
  var allowServiceWorkers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default false.
    */
  var bypassCSP: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default false.
    */
  var corsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default false.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default false.
    */
  var standard: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default false.
    */
  var stream: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default false.
    */
  var supportFetchAPI: js.UndefOr[Boolean] = js.undefined
}
object Privileges {
  
  inline def apply(): Privileges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Privileges]
  }
  
  extension [Self <: Privileges](x: Self) {
    
    inline def setAllowServiceWorkers(value: Boolean): Self = StObject.set(x, "allowServiceWorkers", value.asInstanceOf[js.Any])
    
    inline def setAllowServiceWorkersUndefined: Self = StObject.set(x, "allowServiceWorkers", js.undefined)
    
    inline def setBypassCSP(value: Boolean): Self = StObject.set(x, "bypassCSP", value.asInstanceOf[js.Any])
    
    inline def setBypassCSPUndefined: Self = StObject.set(x, "bypassCSP", js.undefined)
    
    inline def setCorsEnabled(value: Boolean): Self = StObject.set(x, "corsEnabled", value.asInstanceOf[js.Any])
    
    inline def setCorsEnabledUndefined: Self = StObject.set(x, "corsEnabled", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setStandard(value: Boolean): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
    
    inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    inline def setSupportFetchAPI(value: Boolean): Self = StObject.set(x, "supportFetchAPI", value.asInstanceOf[js.Any])
    
    inline def setSupportFetchAPIUndefined: Self = StObject.set(x, "supportFetchAPI", js.undefined)
  }
}
