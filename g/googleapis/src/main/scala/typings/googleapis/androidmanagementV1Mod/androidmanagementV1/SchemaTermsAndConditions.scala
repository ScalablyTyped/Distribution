package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTermsAndConditions extends StObject {
  
  /**
    * A well-formatted HTML string. It will be parsed on the client with android.text.Html#fromHtml.
    */
  var content: js.UndefOr[SchemaUserFacingMessage] = js.undefined
  
  /**
    * A short header which appears above the HTML content.
    */
  var header: js.UndefOr[SchemaUserFacingMessage] = js.undefined
}
object SchemaTermsAndConditions {
  
  inline def apply(): SchemaTermsAndConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTermsAndConditions]
  }
  
  extension [Self <: SchemaTermsAndConditions](x: Self) {
    
    inline def setContent(value: SchemaUserFacingMessage): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setHeader(value: SchemaUserFacingMessage): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
