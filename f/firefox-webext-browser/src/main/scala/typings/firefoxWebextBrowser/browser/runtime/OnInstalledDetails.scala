package typings.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnInstalledDetails extends StObject {
  
  /**
    * Indicates the ID of the imported shared module extension which updated. This is present only if 'reason' is 'shared_module_update'.
    * @deprecated Unsupported on Firefox at this time.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Indicates the previous version of the extension, which has just been updated. This is present only if 'reason' is 'update'.
    */
  var previousVersion: js.UndefOr[String] = js.native
  
  /** The reason that this event is being dispatched. */
  var reason: OnInstalledReason = js.native
  
  /** Indicates whether the addon is installed as a temporary extension. */
  var temporary: Boolean = js.native
}
object OnInstalledDetails {
  
  @scala.inline
  def apply(reason: OnInstalledReason, temporary: Boolean): OnInstalledDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], temporary = temporary.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnInstalledDetails]
  }
  
  @scala.inline
  implicit class OnInstalledDetailsMutableBuilder[Self <: OnInstalledDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPreviousVersion(value: String): Self = StObject.set(x, "previousVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousVersionUndefined: Self = StObject.set(x, "previousVersion", js.undefined)
    
    @scala.inline
    def setReason(value: OnInstalledReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
  }
}
