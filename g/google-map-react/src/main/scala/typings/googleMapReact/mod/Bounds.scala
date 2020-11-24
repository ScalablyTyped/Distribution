package typings.googleMapReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bounds extends js.Object {
  
  @JSName("ne")
  var ne_FBounds: Coords = js.native
  
  var nw: Coords = js.native
  
  var se: Coords = js.native
  
  var sw: Coords = js.native
}
object Bounds {
  
  @scala.inline
  def apply(ne: Coords, nw: Coords, se: Coords, sw: Coords): Bounds = {
    val __obj = js.Dynamic.literal(ne = ne.asInstanceOf[js.Any], nw = nw.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  
  @scala.inline
  implicit class BoundsOps[Self <: Bounds] (val x: Self) extends AnyVal {
    
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
    def setNe(value: Coords): Self = this.set("ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNw(value: Coords): Self = this.set("nw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSe(value: Coords): Self = this.set("se", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSw(value: Coords): Self = this.set("sw", value.asInstanceOf[js.Any])
  }
}
