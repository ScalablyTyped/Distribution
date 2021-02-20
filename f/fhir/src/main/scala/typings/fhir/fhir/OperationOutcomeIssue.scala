package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single issue associated with the action
  */
@js.native
trait OperationOutcomeIssue extends BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'diagnostics'.
    */
  var _diagnostics: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'location'.
    */
  var _location: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'severity'.
    */
  var _severity: js.UndefOr[Element] = js.native
  
  /**
    * Error or warning code
    */
  var code: typings.fhir.fhir.code = js.native
  
  /**
    * Additional details about the error
    */
  var details: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Additional diagnostic information about the issue
    */
  var diagnostics: js.UndefOr[String] = js.native
  
  /**
    * FHIRPath of element(s) related to issue
    */
  var expression: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Path of element(s) related to issue
    */
  var location: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * fatal | error | warning | information
    */
  var severity: code = js.native
}
object OperationOutcomeIssue {
  
  @scala.inline
  def apply(code: code, severity: code): OperationOutcomeIssue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationOutcomeIssue]
  }
  
  @scala.inline
  implicit class OperationOutcomeIssueMutableBuilder[Self <: OperationOutcomeIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: CodeableConcept): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDiagnostics(value: String): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    @scala.inline
    def setExpression(value: js.Array[String]): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setExpressionVarargs(value: String*): Self = StObject.set(x, "expression", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: js.Array[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLocationVarargs(value: String*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    @scala.inline
    def setSeverity(value: code): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    @scala.inline
    def set_diagnostics(value: Element): Self = StObject.set(x, "_diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_diagnosticsUndefined: Self = StObject.set(x, "_diagnostics", js.undefined)
    
    @scala.inline
    def set_expression(value: js.Array[Element]): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    @scala.inline
    def set_expressionVarargs(value: Element*): Self = StObject.set(x, "_expression", js.Array(value :_*))
    
    @scala.inline
    def set_location(value: js.Array[Element]): Self = StObject.set(x, "_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_locationUndefined: Self = StObject.set(x, "_location", js.undefined)
    
    @scala.inline
    def set_locationVarargs(value: Element*): Self = StObject.set(x, "_location", js.Array(value :_*))
    
    @scala.inline
    def set_severity(value: Element): Self = StObject.set(x, "_severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_severityUndefined: Self = StObject.set(x, "_severity", js.undefined)
  }
}
