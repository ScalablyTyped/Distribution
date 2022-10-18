package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslQueryBase extends StObject {
  
  var _name: js.UndefOr[String] = js.undefined
  
  var boost: js.UndefOr[float] = js.undefined
}
object QueryDslQueryBase {
  
  inline def apply(): QueryDslQueryBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslQueryBase]
  }
  
  extension [Self <: QueryDslQueryBase](x: Self) {
    
    inline def setBoost(value: float): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def set_name(value: String): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
