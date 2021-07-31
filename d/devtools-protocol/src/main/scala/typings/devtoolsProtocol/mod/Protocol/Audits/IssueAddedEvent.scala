package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssueAddedEvent extends StObject {
  
  var issue: InspectorIssue
}
object IssueAddedEvent {
  
  @scala.inline
  def apply(issue: InspectorIssue): IssueAddedEvent = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueAddedEvent]
  }
  
  @scala.inline
  implicit class IssueAddedEventMutableBuilder[Self <: IssueAddedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssue(value: InspectorIssue): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
  }
}
