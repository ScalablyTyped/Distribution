package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppRestrictionsSchema extends StObject {
  
  /**
    * Deprecated.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The set of restrictions that make up this schema.
    */
  var restrictions: js.UndefOr[js.Array[SchemaAppRestrictionsSchemaRestriction]] = js.undefined
}
object SchemaAppRestrictionsSchema {
  
  inline def apply(): SchemaAppRestrictionsSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppRestrictionsSchema]
  }
  
  extension [Self <: SchemaAppRestrictionsSchema](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRestrictions(value: js.Array[SchemaAppRestrictionsSchemaRestriction]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setRestrictionsVarargs(value: SchemaAppRestrictionsSchemaRestriction*): Self = StObject.set(x, "restrictions", js.Array(value*))
  }
}
