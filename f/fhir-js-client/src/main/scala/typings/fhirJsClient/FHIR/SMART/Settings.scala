package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SMART client settings for browser behaviour
  */
@js.native
trait Settings extends StObject {
  
  /**
    * When set to true, this variable will fully utilize HTML5 sessionStorage API.
    * Default to true
    * This variable can be overriden to false by setting FHIR.oauth2.settings.fullSessionStorageSupport = false.
    * When set to false, the sessionStorage will be keyed by a state variable. This is to allow the embedded IE browser
    * instances instantiated on a single thread to continue to function without having sessionStorage data shared
    * across the embedded IE instances.
    */
  var fullSessionStorageSupport: Boolean = js.native
  
  /**
    * Replaces the browser's current URL using window.history.replaceState API.
    * Default to true
    */
  var replaceBrowserHistory: Boolean = js.native
}
object Settings {
  
  @scala.inline
  def apply(fullSessionStorageSupport: Boolean, replaceBrowserHistory: Boolean): Settings = {
    val __obj = js.Dynamic.literal(fullSessionStorageSupport = fullSessionStorageSupport.asInstanceOf[js.Any], replaceBrowserHistory = replaceBrowserHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullSessionStorageSupport(value: Boolean): Self = StObject.set(x, "fullSessionStorageSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceBrowserHistory(value: Boolean): Self = StObject.set(x, "replaceBrowserHistory", value.asInstanceOf[js.Any])
  }
}
