package typings.fhir.r5Mod

import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.fatal
import typings.fhir.fhirStrings.information
import typings.fhir.fhirStrings.success
import typings.fhir.fhirStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationOutcomeIssue
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _diagnostics: js.UndefOr[Element] = js.undefined
  
  var _expression: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _location: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _severity: js.UndefOr[Element] = js.undefined
  
  /**
    * Code values should align with the severity.  For example, a code of ```forbidden``` generally wouldn't make sense with a severity of ```information``` or ```warning```.  Similarly, a code of ```informational``` would generally not make sense with a severity of ```fatal``` or ```error```.  However, there are no strict rules about what severities must be used with which codes.  For example, ```code-invalid``` might be a ```warning``` or ```error```, depending on the context
    */
  var code: String
  
  /**
    * A human readable description of the error issue SHOULD be placed in details.text.
    */
  var details: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This may be a description of how a value is erroneous, a stack dump to help trace the issue or other troubleshooting information.
    */
  var diagnostics: js.UndefOr[String] = js.undefined
  
  /**
    * The root of the FHIRPath is the resource or bundle that generated OperationOutcome.  Each FHIRPath SHALL resolve to a single node.
    */
  var expression: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The root of the XPath is the resource or bundle that generated OperationOutcome.  Each XPath SHALL resolve to a single node.  This element is deprecated, and is being replaced by expression.
    */
  var location: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates whether the issue indicates a variation from successful processing.
    */
  var severity: fatal | error | warning | information | success
}
object OperationOutcomeIssue {
  
  inline def apply(code: String, severity: fatal | error | warning | information | success): OperationOutcomeIssue = {
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
    
    inline def setExpression(value: js.Array[String]): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setExpressionVarargs(value: String*): Self = StObject.set(x, "expression", js.Array(value*))
    
    inline def setLocation(value: js.Array[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: String*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setSeverity(value: fatal | error | warning | information | success): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_diagnostics(value: Element): Self = StObject.set(x, "_diagnostics", value.asInstanceOf[js.Any])
    
    inline def set_diagnosticsUndefined: Self = StObject.set(x, "_diagnostics", js.undefined)
    
    inline def set_expression(value: js.Array[Element]): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    inline def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    inline def set_expressionVarargs(value: Element*): Self = StObject.set(x, "_expression", js.Array(value*))
    
    inline def set_location(value: js.Array[Element]): Self = StObject.set(x, "_location", value.asInstanceOf[js.Any])
    
    inline def set_locationUndefined: Self = StObject.set(x, "_location", js.undefined)
    
    inline def set_locationVarargs(value: Element*): Self = StObject.set(x, "_location", js.Array(value*))
    
    inline def set_severity(value: Element): Self = StObject.set(x, "_severity", value.asInstanceOf[js.Any])
    
    inline def set_severityUndefined: Self = StObject.set(x, "_severity", js.undefined)
  }
}
