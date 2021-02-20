package typings.googleMapReact.anon

import typings.googleMapReact.mod.Bounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Center extends StObject {
  
  var center: Lat = js.native
  
  var newBounds: Bounds = js.native
  
  var zoom: Double = js.native
}
object Center {
  
  @scala.inline
  def apply(center: Lat, newBounds: Bounds, zoom: Double): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], newBounds = newBounds.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit class CenterMutableBuilder[Self <: Center] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Lat): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewBounds(value: Bounds): Self = StObject.set(x, "newBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
