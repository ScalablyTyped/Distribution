package typings.fhir.fhir

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
  implicit class OperationOutcomeIssueOps[Self <: OperationOutcomeIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverity(value: code): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    
    @scala.inline
    def set_diagnostics(value: Element): Self = this.set("_diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_diagnostics: Self = this.set("_diagnostics", js.undefined)
    
    @scala.inline
    def set_expressionVarargs(value: Element*): Self = this.set("_expression", js.Array(value :_*))
    
    @scala.inline
    def set_expression(value: js.Array[Element]): Self = this.set("_expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_expression: Self = this.set("_expression", js.undefined)
    
    @scala.inline
    def set_locationVarargs(value: Element*): Self = this.set("_location", js.Array(value :_*))
    
    @scala.inline
    def set_location(value: js.Array[Element]): Self = this.set("_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_location: Self = this.set("_location", js.undefined)
    
    @scala.inline
    def set_severity(value: Element): Self = this.set("_severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_severity: Self = this.set("_severity", js.undefined)
    
    @scala.inline
    def setDetails(value: CodeableConcept): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setDiagnostics(value: String): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagnostics: Self = this.set("diagnostics", js.undefined)
    
    @scala.inline
    def setExpressionVarargs(value: String*): Self = this.set("expression", js.Array(value :_*))
    
    @scala.inline
    def setExpression(value: js.Array[String]): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    
    @scala.inline
    def setLocationVarargs(value: String*): Self = this.set("location", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: js.Array[String]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
