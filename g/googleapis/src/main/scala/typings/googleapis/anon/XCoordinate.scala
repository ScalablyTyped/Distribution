package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XCoordinate extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var xCoordinate: js.UndefOr[Double] = js.undefined
  
  var yCoordinate: js.UndefOr[Double] = js.undefined
}
object XCoordinate {
  
  @scala.inline
  def apply(): XCoordinate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XCoordinate]
  }
  
  @scala.inline
  implicit class XCoordinateMutableBuilder[Self <: XCoordinate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setXCoordinate(value: Double): Self = StObject.set(x, "xCoordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXCoordinateUndefined: Self = StObject.set(x, "xCoordinate", js.undefined)
    
    @scala.inline
    def setYCoordinate(value: Double): Self = StObject.set(x, "yCoordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYCoordinateUndefined: Self = StObject.set(x, "yCoordinate", js.undefined)
  }
}
