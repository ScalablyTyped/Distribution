package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An enterprise signup URL.
  */
trait SchemaSignupUrl extends StObject {
  
  /**
    * The name of the resource. Use this value in the signupUrl field when
    * calling enterprises.create to complete the enterprise signup flow.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A URL where an enterprise admin can register their enterprise. The page
    * can&#39;t be rendered in an iframe.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaSignupUrl {
  
  inline def apply(): SchemaSignupUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignupUrl]
  }
  
  extension [Self <: SchemaSignupUrl](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
