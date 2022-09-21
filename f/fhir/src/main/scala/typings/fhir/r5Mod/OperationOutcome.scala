package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationOutcome
  extends StObject
     with DomainResource
     with _FhirResource {
  
  /**
    * An error, warning, or information message that results from a system action.
    */
  var issue: js.Array[OperationOutcomeIssue]
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_OperationOutcome: typings.fhir.fhirStrings.OperationOutcome
}
object OperationOutcome {
  
  inline def apply(issue: js.Array[OperationOutcomeIssue]): OperationOutcome = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any], resourceType = "OperationOutcome")
    __obj.asInstanceOf[OperationOutcome]
  }
  
  extension [Self <: OperationOutcome](x: Self) {
    
    inline def setIssue(value: js.Array[OperationOutcomeIssue]): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setIssueVarargs(value: OperationOutcomeIssue*): Self = StObject.set(x, "issue", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.OperationOutcome): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
