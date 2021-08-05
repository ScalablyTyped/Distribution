package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssueDisplayNumber extends StObject {
  
  var issueDisplayNumber: js.UndefOr[String] = js.undefined
  
  var issueOrderNumber: js.UndefOr[Double] = js.undefined
}
object IssueDisplayNumber {
  
  inline def apply(): IssueDisplayNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssueDisplayNumber]
  }
  
  extension [Self <: IssueDisplayNumber](x: Self) {
    
    inline def setIssueDisplayNumber(value: String): Self = StObject.set(x, "issueDisplayNumber", value.asInstanceOf[js.Any])
    
    inline def setIssueDisplayNumberUndefined: Self = StObject.set(x, "issueDisplayNumber", js.undefined)
    
    inline def setIssueOrderNumber(value: Double): Self = StObject.set(x, "issueOrderNumber", value.asInstanceOf[js.Any])
    
    inline def setIssueOrderNumberUndefined: Self = StObject.set(x, "issueOrderNumber", js.undefined)
  }
}
