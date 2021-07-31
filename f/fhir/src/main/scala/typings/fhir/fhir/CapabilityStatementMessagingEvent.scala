package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Declare support for this event
  */
trait CapabilityStatementMessagingEvent
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'focus'.
    */
  var _focus: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  
  /**
    * Consequence | Currency | Notification
    */
  var category: js.UndefOr[code] = js.undefined
  
  /**
    * Event type
    */
  var code: Coding
  
  /**
    * Endpoint-specific event documentation
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * Resource that's focus of message
    */
  var focus: code
  
  /**
    * sender | receiver
    */
  var mode: code
  
  /**
    * Profile that describes the request
    */
  var request: Reference
  
  /**
    * Profile that describes the response
    */
  var response: Reference
}
object CapabilityStatementMessagingEvent {
  
  @scala.inline
  def apply(code: Coding, focus: code, mode: code, request: Reference, response: Reference): CapabilityStatementMessagingEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementMessagingEvent]
  }
  
  @scala.inline
  implicit class CapabilityStatementMessagingEventMutableBuilder[Self <: CapabilityStatementMessagingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: code): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCode(value: Coding): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setFocus(value: code): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: code): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Reference): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_category(value: Element): Self = StObject.set(x, "_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_categoryUndefined: Self = StObject.set(x, "_category", js.undefined)
    
    @scala.inline
    def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    @scala.inline
    def set_focus(value: Element): Self = StObject.set(x, "_focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_focusUndefined: Self = StObject.set(x, "_focus", js.undefined)
    
    @scala.inline
    def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
  }
}
