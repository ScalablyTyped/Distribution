package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StylesheetLoadingIssueDetails extends StObject {
  
  /**
    * Contains additional info when the failure was due to a request.
    */
  var failedRequestInfo: js.UndefOr[FailedRequestInfo] = js.undefined
  
  /**
    * Source code position that referenced the failing stylesheet.
    */
  var sourceCodeLocation: SourceCodeLocation
  
  /**
    * Reason why the stylesheet couldn't be loaded.
    */
  var styleSheetLoadingIssueReason: StyleSheetLoadingIssueReason
}
object StylesheetLoadingIssueDetails {
  
  inline def apply(sourceCodeLocation: SourceCodeLocation, styleSheetLoadingIssueReason: StyleSheetLoadingIssueReason): StylesheetLoadingIssueDetails = {
    val __obj = js.Dynamic.literal(sourceCodeLocation = sourceCodeLocation.asInstanceOf[js.Any], styleSheetLoadingIssueReason = styleSheetLoadingIssueReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesheetLoadingIssueDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StylesheetLoadingIssueDetails] (val x: Self) extends AnyVal {
    
    inline def setFailedRequestInfo(value: FailedRequestInfo): Self = StObject.set(x, "failedRequestInfo", value.asInstanceOf[js.Any])
    
    inline def setFailedRequestInfoUndefined: Self = StObject.set(x, "failedRequestInfo", js.undefined)
    
    inline def setSourceCodeLocation(value: SourceCodeLocation): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetLoadingIssueReason(value: StyleSheetLoadingIssueReason): Self = StObject.set(x, "styleSheetLoadingIssueReason", value.asInstanceOf[js.Any])
  }
}
