package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordsGeoBounds
  extends StObject
     with GeoBounds {
  
  var bottom: double
  
  var left: double
  
  var right: double
  
  var top: double
}
object CoordsGeoBounds {
  
  inline def apply(bottom: double, left: double, right: double, top: double): CoordsGeoBounds = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordsGeoBounds]
  }
  
  extension [Self <: CoordsGeoBounds](x: Self) {
    
    inline def setBottom(value: double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
