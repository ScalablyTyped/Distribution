package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchStupidBackoffSmoothingModel extends StObject {
  
  var discount: double
}
object SearchStupidBackoffSmoothingModel {
  
  inline def apply(discount: double): SearchStupidBackoffSmoothingModel = {
    val __obj = js.Dynamic.literal(discount = discount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchStupidBackoffSmoothingModel]
  }
  
  extension [Self <: SearchStupidBackoffSmoothingModel](x: Self) {
    
    inline def setDiscount(value: double): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
  }
}
