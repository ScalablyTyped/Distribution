package typings.glReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderInfo extends js.Object {
  
  var frag: String = js.native
  
  var vert: String = js.native
}
object ShaderInfo {
  
  @scala.inline
  def apply(frag: String, vert: String): ShaderInfo = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], vert = vert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderInfo]
  }
  
  @scala.inline
  implicit class ShaderInfoOps[Self <: ShaderInfo] (val x: Self) extends AnyVal {
    
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
    def setFrag(value: String): Self = this.set("frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVert(value: String): Self = this.set("vert", value.asInstanceOf[js.Any])
  }
}
