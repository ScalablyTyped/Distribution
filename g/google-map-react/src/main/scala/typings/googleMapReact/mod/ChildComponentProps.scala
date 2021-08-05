package typings.googleMapReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildComponentProps
  extends StObject
     with Coords {
  
  @JSName("$hover")
  var $hover: js.UndefOr[Boolean] = js.undefined
}
object ChildComponentProps {
  
  inline def apply(lat: Double, lng: Double): ChildComponentProps = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildComponentProps]
  }
  
  extension [Self <: ChildComponentProps](x: Self) {
    
    inline def set$hover(value: Boolean): Self = StObject.set(x, "$hover", value.asInstanceOf[js.Any])
    
    inline def set$hoverUndefined: Self = StObject.set(x, "$hover", js.undefined)
  }
}
