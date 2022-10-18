package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopLeftBottomRightGeoBounds
  extends StObject
     with GeoBounds {
  
  var bottom_right: GeoLocation
  
  var top_left: GeoLocation
}
object TopLeftBottomRightGeoBounds {
  
  inline def apply(bottom_right: GeoLocation, top_left: GeoLocation): TopLeftBottomRightGeoBounds = {
    val __obj = js.Dynamic.literal(bottom_right = bottom_right.asInstanceOf[js.Any], top_left = top_left.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopLeftBottomRightGeoBounds]
  }
  
  extension [Self <: TopLeftBottomRightGeoBounds](x: Self) {
    
    inline def setBottom_right(value: GeoLocation): Self = StObject.set(x, "bottom_right", value.asInstanceOf[js.Any])
    
    inline def setBottom_rightVarargs(value: double*): Self = StObject.set(x, "bottom_right", js.Array(value*))
    
    inline def setTop_left(value: GeoLocation): Self = StObject.set(x, "top_left", value.asInstanceOf[js.Any])
    
    inline def setTop_leftVarargs(value: double*): Self = StObject.set(x, "top_left", js.Array(value*))
  }
}
