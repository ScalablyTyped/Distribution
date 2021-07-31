package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointColor extends StObject {
  
  var pointColor: js.UndefOr[String] = js.undefined
  
  var pointIndex: js.UndefOr[Double] = js.undefined
  
  var pointName: js.UndefOr[js.Any] = js.undefined
}
object PointColor {
  
  @scala.inline
  def apply(): PointColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointColor]
  }
  
  @scala.inline
  implicit class PointColorMutableBuilder[Self <: PointColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointColor(value: String): Self = StObject.set(x, "pointColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointColorUndefined: Self = StObject.set(x, "pointColor", js.undefined)
    
    @scala.inline
    def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointIndexUndefined: Self = StObject.set(x, "pointIndex", js.undefined)
    
    @scala.inline
    def setPointName(value: js.Any): Self = StObject.set(x, "pointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointNameUndefined: Self = StObject.set(x, "pointName", js.undefined)
  }
}
