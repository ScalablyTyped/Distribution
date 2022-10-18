package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslDistanceFeatureQueryBase[TOrigin, TDistance]
  extends StObject
     with QueryDslQueryBase {
  
  var field: Field
  
  var origin: TOrigin
  
  var pivot: TDistance
}
object QueryDslDistanceFeatureQueryBase {
  
  inline def apply[TOrigin, TDistance](field: Field, origin: TOrigin, pivot: TDistance): QueryDslDistanceFeatureQueryBase[TOrigin, TDistance] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pivot = pivot.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslDistanceFeatureQueryBase[TOrigin, TDistance]]
  }
  
  extension [Self <: QueryDslDistanceFeatureQueryBase[?, ?], TOrigin, TDistance](x: Self & (QueryDslDistanceFeatureQueryBase[TOrigin, TDistance])) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: TOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPivot(value: TDistance): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
  }
}
