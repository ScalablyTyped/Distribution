package typings.googleMapReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ne extends js.Object {
  
  @JSName("ne")
  var ne_FNe: typings.googleMapReact.mod.Coords = js.native
  
  var sw: typings.googleMapReact.mod.Coords = js.native
}
object Ne {
  
  @scala.inline
  def apply(ne: typings.googleMapReact.mod.Coords, sw: typings.googleMapReact.mod.Coords): Ne = {
    val __obj = js.Dynamic.literal(ne = ne.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ne]
  }
  
  @scala.inline
  implicit class NeOps[Self <: Ne] (val x: Self) extends AnyVal {
    
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
    def setNe(value: typings.googleMapReact.mod.Coords): Self = this.set("ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSw(value: typings.googleMapReact.mod.Coords): Self = this.set("sw", value.asInstanceOf[js.Any])
  }
}
