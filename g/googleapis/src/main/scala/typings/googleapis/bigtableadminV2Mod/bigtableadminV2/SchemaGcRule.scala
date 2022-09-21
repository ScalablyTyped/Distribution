package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGcRule extends StObject {
  
  /**
    * Delete cells that would be deleted by every nested rule.
    */
  var intersection: js.UndefOr[SchemaIntersection] = js.undefined
  
  /**
    * Delete cells in a column older than the given age. Values must be at least one millisecond, and will be truncated to microsecond granularity.
    */
  var maxAge: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Delete all cells in a column except the most recent N.
    */
  var maxNumVersions: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Delete cells that would be deleted by any nested rule.
    */
  var union: js.UndefOr[SchemaUnion] = js.undefined
}
object SchemaGcRule {
  
  inline def apply(): SchemaGcRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcRule]
  }
  
  extension [Self <: SchemaGcRule](x: Self) {
    
    inline def setIntersection(value: SchemaIntersection): Self = StObject.set(x, "intersection", value.asInstanceOf[js.Any])
    
    inline def setIntersectionUndefined: Self = StObject.set(x, "intersection", js.undefined)
    
    inline def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeNull: Self = StObject.set(x, "maxAge", null)
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setMaxNumVersions(value: Double): Self = StObject.set(x, "maxNumVersions", value.asInstanceOf[js.Any])
    
    inline def setMaxNumVersionsNull: Self = StObject.set(x, "maxNumVersions", null)
    
    inline def setMaxNumVersionsUndefined: Self = StObject.set(x, "maxNumVersions", js.undefined)
    
    inline def setUnion(value: SchemaUnion): Self = StObject.set(x, "union", value.asInstanceOf[js.Any])
    
    inline def setUnionUndefined: Self = StObject.set(x, "union", js.undefined)
  }
}
