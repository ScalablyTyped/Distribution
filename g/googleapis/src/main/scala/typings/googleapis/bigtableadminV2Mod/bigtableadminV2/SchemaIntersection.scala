package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIntersection extends StObject {
  
  /**
    * Only delete cells which would be deleted by every element of `rules`.
    */
  var rules: js.UndefOr[js.Array[SchemaGcRule]] = js.undefined
}
object SchemaIntersection {
  
  inline def apply(): SchemaIntersection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntersection]
  }
  
  extension [Self <: SchemaIntersection](x: Self) {
    
    inline def setRules(value: js.Array[SchemaGcRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaGcRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
