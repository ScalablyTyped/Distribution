package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Point extends StObject {
  
  var point: typings.googleMapReact.mod.Point
}
object Point {
  
  inline def apply(point: typings.googleMapReact.mod.Point): Point = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  
  extension [Self <: Point](x: Self) {
    
    inline def setPoint(value: typings.googleMapReact.mod.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
