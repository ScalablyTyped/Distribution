package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnterpriseAuthenticationAppLinkConfig extends StObject {
  
  /**
    * An authentication url.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnterpriseAuthenticationAppLinkConfig {
  
  inline def apply(): SchemaEnterpriseAuthenticationAppLinkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnterpriseAuthenticationAppLinkConfig]
  }
  
  extension [Self <: SchemaEnterpriseAuthenticationAppLinkConfig](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
