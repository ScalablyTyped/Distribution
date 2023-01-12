package typings.devtoolsProtocol.mod.Protocol.Security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsecureContentStatus extends StObject {
  
  /**
    * Always false.
    */
  var containedMixedForm: Boolean
  
  /**
    * Always false.
    */
  var displayedContentWithCertErrors: Boolean
  
  /**
    * Always set to unknown.
    */
  var displayedInsecureContentStyle: SecurityState
  
  /**
    * Always false.
    */
  var displayedMixedContent: Boolean
  
  /**
    * Always false.
    */
  var ranContentWithCertErrors: Boolean
  
  /**
    * Always set to unknown.
    */
  var ranInsecureContentStyle: SecurityState
  
  /**
    * Always false.
    */
  var ranMixedContent: Boolean
}
object InsecureContentStatus {
  
  inline def apply(
    containedMixedForm: Boolean,
    displayedContentWithCertErrors: Boolean,
    displayedInsecureContentStyle: SecurityState,
    displayedMixedContent: Boolean,
    ranContentWithCertErrors: Boolean,
    ranInsecureContentStyle: SecurityState,
    ranMixedContent: Boolean
  ): InsecureContentStatus = {
    val __obj = js.Dynamic.literal(containedMixedForm = containedMixedForm.asInstanceOf[js.Any], displayedContentWithCertErrors = displayedContentWithCertErrors.asInstanceOf[js.Any], displayedInsecureContentStyle = displayedInsecureContentStyle.asInstanceOf[js.Any], displayedMixedContent = displayedMixedContent.asInstanceOf[js.Any], ranContentWithCertErrors = ranContentWithCertErrors.asInstanceOf[js.Any], ranInsecureContentStyle = ranInsecureContentStyle.asInstanceOf[js.Any], ranMixedContent = ranMixedContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsecureContentStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsecureContentStatus] (val x: Self) extends AnyVal {
    
    inline def setContainedMixedForm(value: Boolean): Self = StObject.set(x, "containedMixedForm", value.asInstanceOf[js.Any])
    
    inline def setDisplayedContentWithCertErrors(value: Boolean): Self = StObject.set(x, "displayedContentWithCertErrors", value.asInstanceOf[js.Any])
    
    inline def setDisplayedInsecureContentStyle(value: SecurityState): Self = StObject.set(x, "displayedInsecureContentStyle", value.asInstanceOf[js.Any])
    
    inline def setDisplayedMixedContent(value: Boolean): Self = StObject.set(x, "displayedMixedContent", value.asInstanceOf[js.Any])
    
    inline def setRanContentWithCertErrors(value: Boolean): Self = StObject.set(x, "ranContentWithCertErrors", value.asInstanceOf[js.Any])
    
    inline def setRanInsecureContentStyle(value: SecurityState): Self = StObject.set(x, "ranInsecureContentStyle", value.asInstanceOf[js.Any])
    
    inline def setRanMixedContent(value: Boolean): Self = StObject.set(x, "ranMixedContent", value.asInstanceOf[js.Any])
  }
}
