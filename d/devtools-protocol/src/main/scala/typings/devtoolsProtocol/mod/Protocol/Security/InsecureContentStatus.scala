package typings.devtoolsProtocol.mod.Protocol.Security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsecureContentStatus extends StObject {
  
  /**
    * Always false.
    */
  var containedMixedForm: Boolean = js.native
  
  /**
    * Always false.
    */
  var displayedContentWithCertErrors: Boolean = js.native
  
  /**
    * Always set to unknown.
    */
  var displayedInsecureContentStyle: SecurityState = js.native
  
  /**
    * Always false.
    */
  var displayedMixedContent: Boolean = js.native
  
  /**
    * Always false.
    */
  var ranContentWithCertErrors: Boolean = js.native
  
  /**
    * Always set to unknown.
    */
  var ranInsecureContentStyle: SecurityState = js.native
  
  /**
    * Always false.
    */
  var ranMixedContent: Boolean = js.native
}
object InsecureContentStatus {
  
  @scala.inline
  def apply(
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
  implicit class InsecureContentStatusMutableBuilder[Self <: InsecureContentStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainedMixedForm(value: Boolean): Self = StObject.set(x, "containedMixedForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedContentWithCertErrors(value: Boolean): Self = StObject.set(x, "displayedContentWithCertErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedInsecureContentStyle(value: SecurityState): Self = StObject.set(x, "displayedInsecureContentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedMixedContent(value: Boolean): Self = StObject.set(x, "displayedMixedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanContentWithCertErrors(value: Boolean): Self = StObject.set(x, "ranContentWithCertErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanInsecureContentStyle(value: SecurityState): Self = StObject.set(x, "ranInsecureContentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanMixedContent(value: Boolean): Self = StObject.set(x, "ranMixedContent", value.asInstanceOf[js.Any])
  }
}
