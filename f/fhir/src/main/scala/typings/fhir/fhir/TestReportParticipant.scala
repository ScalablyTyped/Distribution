package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A participant in the test execution, either the execution engine, a client, or a server
  */
trait TestReportParticipant
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'uri'.
    */
  var _uri: js.UndefOr[Element] = js.undefined
  
  /**
    * The display name of the participant
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * test-engine | client | server
    */
  var `type`: code
  
  /**
    * The uri of the participant. An absolute URL is preferred
    */
  var uri: typings.fhir.fhir.uri
}
object TestReportParticipant {
  
  inline def apply(`type`: code, uri: uri): TestReportParticipant = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportParticipant]
  }
  
  extension [Self <: TestReportParticipant](x: Self) {
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_uri(value: Element): Self = StObject.set(x, "_uri", value.asInstanceOf[js.Any])
    
    inline def set_uriUndefined: Self = StObject.set(x, "_uri", js.undefined)
  }
}
