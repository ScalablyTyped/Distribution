package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSignupInfo extends StObject {
  
  /**
    * An opaque token that will be required, along with the Enterprise Token, for obtaining the enterprise resource from CompleteSignup.
    */
  var completionToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A URL under which the Admin can sign up for an enterprise. The page pointed to cannot be rendered in an iframe.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaSignupInfo {
  
  inline def apply(): SchemaSignupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignupInfo]
  }
  
  extension [Self <: SchemaSignupInfo](x: Self) {
    
    inline def setCompletionToken(value: String): Self = StObject.set(x, "completionToken", value.asInstanceOf[js.Any])
    
    inline def setCompletionTokenNull: Self = StObject.set(x, "completionToken", null)
    
    inline def setCompletionTokenUndefined: Self = StObject.set(x, "completionToken", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
