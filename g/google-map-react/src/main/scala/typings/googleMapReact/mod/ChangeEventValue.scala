package typings.googleMapReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeEventValue extends StObject {
  
  var bounds: Bounds = js.native
  
  var center: Coords = js.native
  
  var marginBounds: Bounds = js.native
  
  var size: Size = js.native
  
  var zoom: Double = js.native
}
object ChangeEventValue {
  
  @scala.inline
  def apply(bounds: Bounds, center: Coords, marginBounds: Bounds, size: Size, zoom: Double): ChangeEventValue = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], marginBounds = marginBounds.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventValue]
  }
  
  @scala.inline
  implicit class ChangeEventValueMutableBuilder[Self <: ChangeEventValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: Coords): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBounds(value: Bounds): Self = StObject.set(x, "marginBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
