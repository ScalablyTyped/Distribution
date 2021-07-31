package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssueDisplayNumber extends StObject {
  
  var issueDisplayNumber: js.UndefOr[String] = js.undefined
  
  var issueOrderNumber: js.UndefOr[Double] = js.undefined
}
object IssueDisplayNumber {
  
  @scala.inline
  def apply(): IssueDisplayNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssueDisplayNumber]
  }
  
  @scala.inline
  implicit class IssueDisplayNumberMutableBuilder[Self <: IssueDisplayNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssueDisplayNumber(value: String): Self = StObject.set(x, "issueDisplayNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueDisplayNumberUndefined: Self = StObject.set(x, "issueDisplayNumber", js.undefined)
    
    @scala.inline
    def setIssueOrderNumber(value: Double): Self = StObject.set(x, "issueOrderNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueOrderNumberUndefined: Self = StObject.set(x, "issueOrderNumber", js.undefined)
  }
}
