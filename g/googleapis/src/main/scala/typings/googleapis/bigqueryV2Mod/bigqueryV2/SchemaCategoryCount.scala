package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCategoryCount extends StObject {
  
  /**
    * The name of category.
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The count of training samples matching the category within the cluster.
    */
  var count: js.UndefOr[String | Null] = js.undefined
}
object SchemaCategoryCount {
  
  inline def apply(): SchemaCategoryCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCategoryCount]
  }
  
  extension [Self <: SchemaCategoryCount](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
