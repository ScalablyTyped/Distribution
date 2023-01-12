package typings.fhir.r2Mod

import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.fatal
import typings.fhir.fhirStrings.information
import typings.fhir.fhirStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationOutcomeIssue
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _diagnostics: js.UndefOr[Element] = js.undefined
  
  var _location: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _severity: js.UndefOr[Element] = js.undefined
  
  /**
    * Expresses the issue in a human and computer-friendly way, allowing the requesting system to behave differently based on the type of issue.
    */
  var code: String
  
  /**
    * Additional details about the error. This may be a text description of the error, or a system code that identifies the error.
    */
  var details: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Additional diagnostic information about the issue.  Typically, this may be a description of how a value is erroneous, or a stack dump to help trace the issue.
    */
  var diagnostics: js.UndefOr[String] = js.undefined
  
  /**
    * Allows systems to highlight or otherwise guide users to elements implicated in issues to allow them to be fixed more easily.
    */
  var location: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates how relevant the issue is to the overall success of the action.
    */
  var severity: fatal | error | warning | information
}
object OperationOutcomeIssue {
  
  inline def apply(code: String, severity: fatal | error | warning | information): OperationOutcomeIssue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationOutcomeIssue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationOutcomeIssue] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: CodeableConcept): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDiagnostics(value: String): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setLocation(value: js.Array[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: String*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setSeverity(value: fatal | error | warning | information): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_diagnostics(value: Element): Self = StObject.set(x, "_diagnostics", value.asInstanceOf[js.Any])
    
    inline def set_diagnosticsUndefined: Self = StObject.set(x, "_diagnostics", js.undefined)
    
    inline def set_location(value: js.Array[Element]): Self = StObject.set(x, "_location", value.asInstanceOf[js.Any])
    
    inline def set_locationUndefined: Self = StObject.set(x, "_location", js.undefined)
    
    inline def set_locationVarargs(value: Element*): Self = StObject.set(x, "_location", js.Array(value*))
    
    inline def set_severity(value: Element): Self = StObject.set(x, "_severity", value.asInstanceOf[js.Any])
    
    inline def set_severityUndefined: Self = StObject.set(x, "_severity", js.undefined)
  }
}
