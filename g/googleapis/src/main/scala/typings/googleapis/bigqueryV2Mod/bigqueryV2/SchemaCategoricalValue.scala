package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCategoricalValue extends StObject {
  
  /**
    * Counts of all categories for the categorical feature. If there are more than ten categories, we return top ten (by count) and return one more CategoryCount with category "_OTHER_" and count as aggregate counts of remaining categories.
    */
  var categoryCounts: js.UndefOr[js.Array[SchemaCategoryCount]] = js.undefined
}
object SchemaCategoricalValue {
  
  inline def apply(): SchemaCategoricalValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCategoricalValue]
  }
  
  extension [Self <: SchemaCategoricalValue](x: Self) {
    
    inline def setCategoryCounts(value: js.Array[SchemaCategoryCount]): Self = StObject.set(x, "categoryCounts", value.asInstanceOf[js.Any])
    
    inline def setCategoryCountsUndefined: Self = StObject.set(x, "categoryCounts", js.undefined)
    
    inline def setCategoryCountsVarargs(value: SchemaCategoryCount*): Self = StObject.set(x, "categoryCounts", js.Array(value*))
  }
}
