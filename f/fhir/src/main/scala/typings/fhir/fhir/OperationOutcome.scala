package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the success/failure of an action
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait OperationOutcome extends DomainResource {
  
  /**
    * A single issue associated with the action
    */
  var issue: js.Array[OperationOutcomeIssue] = js.native
}
object OperationOutcome {
  
  @scala.inline
  def apply(issue: js.Array[OperationOutcomeIssue]): OperationOutcome = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationOutcome]
  }
  
  @scala.inline
  implicit class OperationOutcomeOps[Self <: OperationOutcome] (val x: Self) extends AnyVal {
    
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
    def setIssueVarargs(value: OperationOutcomeIssue*): Self = this.set("issue", js.Array(value :_*))
    
    @scala.inline
    def setIssue(value: js.Array[OperationOutcomeIssue]): Self = this.set("issue", value.asInstanceOf[js.Any])
  }
}
