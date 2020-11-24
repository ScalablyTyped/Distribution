package typings.glReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlSurface extends js.Object {
  
  var glParent: js.Any = js.native
  
  var glSurface: js.Any = js.native
}
object GlSurface {
  
  @scala.inline
  def apply(glParent: js.Any, glSurface: js.Any): GlSurface = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlSurface]
  }
  
  @scala.inline
  implicit class GlSurfaceOps[Self <: GlSurface] (val x: Self) extends AnyVal {
    
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
    def setGlParent(value: js.Any): Self = this.set("glParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlSurface(value: js.Any): Self = this.set("glSurface", value.asInstanceOf[js.Any])
  }
}
