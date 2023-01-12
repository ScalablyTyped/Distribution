package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopRightBottomLeftGeoBounds
  extends StObject
     with GeoBounds {
  
  var bottom_left: GeoLocation
  
  var top_right: GeoLocation
}
object TopRightBottomLeftGeoBounds {
  
  inline def apply(bottom_left: GeoLocation, top_right: GeoLocation): TopRightBottomLeftGeoBounds = {
    val __obj = js.Dynamic.literal(bottom_left = bottom_left.asInstanceOf[js.Any], top_right = top_right.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopRightBottomLeftGeoBounds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopRightBottomLeftGeoBounds] (val x: Self) extends AnyVal {
    
    inline def setBottom_left(value: GeoLocation): Self = StObject.set(x, "bottom_left", value.asInstanceOf[js.Any])
    
    inline def setBottom_leftVarargs(value: double*): Self = StObject.set(x, "bottom_left", js.Array(value*))
    
    inline def setTop_right(value: GeoLocation): Self = StObject.set(x, "top_right", value.asInstanceOf[js.Any])
    
    inline def setTop_rightVarargs(value: double*): Self = StObject.set(x, "top_right", js.Array(value*))
  }
}
