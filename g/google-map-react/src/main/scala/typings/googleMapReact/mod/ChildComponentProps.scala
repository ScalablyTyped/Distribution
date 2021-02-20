package typings.googleMapReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildComponentProps extends Coords {
  
  @JSName("$hover")
  var $hover: js.UndefOr[Boolean] = js.native
}
object ChildComponentProps {
  
  @scala.inline
  def apply(lat: Double, lng: Double): ChildComponentProps = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildComponentProps]
  }
  
  @scala.inline
  implicit class ChildComponentPropsMutableBuilder[Self <: ChildComponentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$hover(value: Boolean): Self = StObject.set(x, "$hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$hoverUndefined: Self = StObject.set(x, "$hover", js.undefined)
  }
}
