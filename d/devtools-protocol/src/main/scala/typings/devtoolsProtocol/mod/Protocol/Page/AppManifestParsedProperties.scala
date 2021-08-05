package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppManifestParsedProperties extends StObject {
  
  /**
    * Computed scope value
    */
  var scope: String
}
object AppManifestParsedProperties {
  
  inline def apply(scope: String): AppManifestParsedProperties = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppManifestParsedProperties]
  }
  
  extension [Self <: AppManifestParsedProperties](x: Self) {
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
