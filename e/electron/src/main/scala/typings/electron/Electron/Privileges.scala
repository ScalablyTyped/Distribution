package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Privileges extends StObject {
  
  /**
    * Default false.
    */
  var allowServiceWorkers: js.UndefOr[Boolean] = js.native
  
  /**
    * Default false.
    */
  var bypassCSP: js.UndefOr[Boolean] = js.native
  
  /**
    * Default false.
    */
  var corsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Default false.
    */
  var secure: js.UndefOr[Boolean] = js.native
  
  /**
    * Default false.
    */
  var standard: js.UndefOr[Boolean] = js.native
  
  /**
    * Default false.
    */
  var stream: js.UndefOr[Boolean] = js.native
  
  /**
    * Default false.
    */
  var supportFetchAPI: js.UndefOr[Boolean] = js.native
}
object Privileges {
  
  @scala.inline
  def apply(): Privileges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Privileges]
  }
  
  @scala.inline
  implicit class PrivilegesMutableBuilder[Self <: Privileges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowServiceWorkers(value: Boolean): Self = StObject.set(x, "allowServiceWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowServiceWorkersUndefined: Self = StObject.set(x, "allowServiceWorkers", js.undefined)
    
    @scala.inline
    def setBypassCSP(value: Boolean): Self = StObject.set(x, "bypassCSP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassCSPUndefined: Self = StObject.set(x, "bypassCSP", js.undefined)
    
    @scala.inline
    def setCorsEnabled(value: Boolean): Self = StObject.set(x, "corsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsEnabledUndefined: Self = StObject.set(x, "corsEnabled", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setStandard(value: Boolean): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
    
    @scala.inline
    def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    @scala.inline
    def setSupportFetchAPI(value: Boolean): Self = StObject.set(x, "supportFetchAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportFetchAPIUndefined: Self = StObject.set(x, "supportFetchAPI", js.undefined)
  }
}
