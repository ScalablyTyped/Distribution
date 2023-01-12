package typings.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnInstalledDetails extends StObject {
  
  /**
    * Indicates the ID of the imported shared module extension which updated. This is present only if 'reason' is 'shared_module_update'.
    * @deprecated Unsupported on Firefox at this time.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the previous version of the extension, which has just been updated. This is present only if 'reason' is 'update'.
    */
  var previousVersion: js.UndefOr[String] = js.undefined
  
  /** The reason that this event is being dispatched. */
  var reason: OnInstalledReason
  
  /** Indicates whether the addon is installed as a temporary extension. */
  var temporary: Boolean
}
object OnInstalledDetails {
  
  inline def apply(reason: OnInstalledReason, temporary: Boolean): OnInstalledDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], temporary = temporary.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnInstalledDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnInstalledDetails] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPreviousVersion(value: String): Self = StObject.set(x, "previousVersion", value.asInstanceOf[js.Any])
    
    inline def setPreviousVersionUndefined: Self = StObject.set(x, "previousVersion", js.undefined)
    
    inline def setReason(value: OnInstalledReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
  }
}
