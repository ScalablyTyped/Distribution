package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource returned by the GenerateSignupUrl API, which contains the Signup
  * URL and Completion Token.
  */
trait SchemaSignupInfo extends StObject {
  
  /**
    * An opaque token that will be required, along with the Enterprise Token,
    * for obtaining the enterprise resource from CompleteSignup.
    */
  var completionToken: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#signupInfo&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A URL under which the Admin can sign up for an enterprise. The page
    * pointed to cannot be rendered in an iframe.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaSignupInfo {
  
  @scala.inline
  def apply(): SchemaSignupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignupInfo]
  }
  
  @scala.inline
  implicit class SchemaSignupInfoMutableBuilder[Self <: SchemaSignupInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionToken(value: String): Self = StObject.set(x, "completionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionTokenUndefined: Self = StObject.set(x, "completionToken", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
