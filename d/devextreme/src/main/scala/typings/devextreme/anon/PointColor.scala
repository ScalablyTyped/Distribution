package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointColor extends StObject {
  
  var pointColor: js.UndefOr[String] = js.undefined
  
  var pointIndex: js.UndefOr[Double] = js.undefined
  
  var pointName: js.UndefOr[Any] = js.undefined
}
object PointColor {
  
  inline def apply(): PointColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointColor] (val x: Self) extends AnyVal {
    
    inline def setPointColor(value: String): Self = StObject.set(x, "pointColor", value.asInstanceOf[js.Any])
    
    inline def setPointColorUndefined: Self = StObject.set(x, "pointColor", js.undefined)
    
    inline def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
    
    inline def setPointIndexUndefined: Self = StObject.set(x, "pointIndex", js.undefined)
    
    inline def setPointName(value: Any): Self = StObject.set(x, "pointName", value.asInstanceOf[js.Any])
    
    inline def setPointNameUndefined: Self = StObject.set(x, "pointName", js.undefined)
  }
}
