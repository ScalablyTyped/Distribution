package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatasetAccessEntry extends StObject {
  
  /**
    * [Required] The dataset this entry applies to.
    */
  var dataset: js.UndefOr[SchemaDatasetReference] = js.undefined
  
  var targetTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaDatasetAccessEntry {
  
  inline def apply(): SchemaDatasetAccessEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatasetAccessEntry]
  }
  
  extension [Self <: SchemaDatasetAccessEntry](x: Self) {
    
    inline def setDataset(value: SchemaDatasetReference): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setTargetTypes(value: js.Array[String]): Self = StObject.set(x, "targetTypes", value.asInstanceOf[js.Any])
    
    inline def setTargetTypesNull: Self = StObject.set(x, "targetTypes", null)
    
    inline def setTargetTypesUndefined: Self = StObject.set(x, "targetTypes", js.undefined)
    
    inline def setTargetTypesVarargs(value: String*): Self = StObject.set(x, "targetTypes", js.Array(value*))
  }
}
