package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////////
// Shape Interfaces
//////////////////////////////////////////////////////////////////////////////
trait ICircleOptions
  extends StObject
     with IObjectOptions {
  
  /**
    * End angle of the circle
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Radius of this circle
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * Start angle of the circle, moving clockwise
    */
  var startAngle: js.UndefOr[Double] = js.undefined
}
object ICircleOptions {
  
  @scala.inline
  def apply(): ICircleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICircleOptions]
  }
  
  @scala.inline
  implicit class ICircleOptionsMutableBuilder[Self <: ICircleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
