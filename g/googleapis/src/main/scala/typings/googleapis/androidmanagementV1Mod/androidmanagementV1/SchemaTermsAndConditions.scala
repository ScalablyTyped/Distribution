package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A terms and conditions page to be accepted during provisioning.
  */
@js.native
trait SchemaTermsAndConditions extends StObject {
  
  /**
    * A well-formatted HTML string. It will be parsed on the client with
    * android.text.Html#fromHtml.
    */
  var content: js.UndefOr[SchemaUserFacingMessage] = js.native
  
  /**
    * A short header which appears above the HTML content.
    */
  var header: js.UndefOr[SchemaUserFacingMessage] = js.native
}
object SchemaTermsAndConditions {
  
  @scala.inline
  def apply(): SchemaTermsAndConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTermsAndConditions]
  }
  
  @scala.inline
  implicit class SchemaTermsAndConditionsMutableBuilder[Self <: SchemaTermsAndConditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: SchemaUserFacingMessage): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setHeader(value: SchemaUserFacingMessage): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
