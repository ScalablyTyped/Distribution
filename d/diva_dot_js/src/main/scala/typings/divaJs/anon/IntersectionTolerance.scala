package typings.divaJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntersectionTolerance extends StObject {
  
  var intersectionTolerance: Double
}
object IntersectionTolerance {
  
  inline def apply(intersectionTolerance: Double): IntersectionTolerance = {
    val __obj = js.Dynamic.literal(intersectionTolerance = intersectionTolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionTolerance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntersectionTolerance] (val x: Self) extends AnyVal {
    
    inline def setIntersectionTolerance(value: Double): Self = StObject.set(x, "intersectionTolerance", value.asInstanceOf[js.Any])
  }
}
