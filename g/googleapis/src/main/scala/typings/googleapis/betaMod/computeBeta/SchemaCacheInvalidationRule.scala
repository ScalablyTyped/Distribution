package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCacheInvalidationRule extends StObject {
  
  /**
    * If set, this invalidation rule will only apply to requests with a Host header matching host.
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  var path: js.UndefOr[String | Null] = js.undefined
}
object SchemaCacheInvalidationRule {
  
  inline def apply(): SchemaCacheInvalidationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCacheInvalidationRule]
  }
  
  extension [Self <: SchemaCacheInvalidationRule](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
