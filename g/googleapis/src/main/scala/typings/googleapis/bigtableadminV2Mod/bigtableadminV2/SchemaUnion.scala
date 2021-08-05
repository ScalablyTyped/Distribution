package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A GcRule which deletes cells matching any of the given rules.
  */
trait SchemaUnion extends StObject {
  
  /**
    * Delete cells which would be deleted by any element of `rules`.
    */
  var rules: js.UndefOr[js.Array[SchemaGcRule]] = js.undefined
}
object SchemaUnion {
  
  inline def apply(): SchemaUnion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnion]
  }
  
  extension [Self <: SchemaUnion](x: Self) {
    
    inline def setRules(value: js.Array[SchemaGcRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaGcRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
