package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoLine extends StObject {
  
  var coordinates: js.Array[js.Array[double]]
  
  var `type`: String
}
object GeoLine {
  
  inline def apply(coordinates: js.Array[js.Array[double]], `type`: String): GeoLine = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoLine]
  }
  
  extension [Self <: GeoLine](x: Self) {
    
    inline def setCoordinates(value: js.Array[js.Array[double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: js.Array[double]*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
