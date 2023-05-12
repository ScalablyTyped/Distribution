package typings.firefoxWebextBrowser.browser.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The details of the request to test. */
trait TestMatchOutcomeRequest extends StObject {
  
  /** The initiator URL (if any) for the hypothetical request. */
  var initiator: js.UndefOr[String] = js.undefined
  
  /** Standard HTTP method of the hypothetical request. */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the tab in which the hypothetical request takes place. Does not need to correspond to a real tab ID. Default is -1, meaning that the request isn't related to a tab.
    */
  var tabId: js.UndefOr[Double] = js.undefined
  
  /** The resource type of the hypothetical request. */
  var `type`: ResourceType
  
  /** The URL of the hypothetical request. */
  var url: String
}
object TestMatchOutcomeRequest {
  
  inline def apply(`type`: ResourceType, url: String): TestMatchOutcomeRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMatchOutcomeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestMatchOutcomeRequest] (val x: Self) extends AnyVal {
    
    inline def setInitiator(value: String): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
