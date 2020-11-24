package typings.googleMapReact.mod

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
  implicit class ChildComponentPropsOps[Self <: ChildComponentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$hover(value: Boolean): Self = this.set("$hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$hover: Self = this.set("$hover", js.undefined)
  }
}
