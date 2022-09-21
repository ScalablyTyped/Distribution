package typings.googleapis.cloudfunctionsV1beta2Mod.cloudfunctionsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHTTPSTrigger extends StObject {
  
  /**
    * Output only. The deployed url for the function.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaHTTPSTrigger {
  
  inline def apply(): SchemaHTTPSTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHTTPSTrigger]
  }
  
  extension [Self <: SchemaHTTPSTrigger](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
