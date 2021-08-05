package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the success/failure of an action
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait OperationOutcome
  extends StObject
     with DomainResource {
  
  /**
    * A single issue associated with the action
    */
  var issue: js.Array[OperationOutcomeIssue]
}
object OperationOutcome {
  
  inline def apply(issue: js.Array[OperationOutcomeIssue]): OperationOutcome = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationOutcome]
  }
  
  extension [Self <: OperationOutcome](x: Self) {
    
    inline def setIssue(value: js.Array[OperationOutcomeIssue]): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setIssueVarargs(value: OperationOutcomeIssue*): Self = StObject.set(x, "issue", js.Array(value :_*))
  }
}
