package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpsTrigger extends StObject {
  
  /**
    * The security level for the function.
    */
  var securityLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The deployed url for the function.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaHttpsTrigger {
  
  inline def apply(): SchemaHttpsTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpsTrigger]
  }
  
  extension [Self <: SchemaHttpsTrigger](x: Self) {
    
    inline def setSecurityLevel(value: String): Self = StObject.set(x, "securityLevel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLevelNull: Self = StObject.set(x, "securityLevel", null)
    
    inline def setSecurityLevelUndefined: Self = StObject.set(x, "securityLevel", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
