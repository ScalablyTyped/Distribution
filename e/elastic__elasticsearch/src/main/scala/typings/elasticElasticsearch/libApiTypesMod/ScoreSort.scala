package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScoreSort extends StObject {
  
  var order: js.UndefOr[SortOrder] = js.undefined
}
object ScoreSort {
  
  inline def apply(): ScoreSort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScoreSort]
  }
  
  extension [Self <: ScoreSort](x: Self) {
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
