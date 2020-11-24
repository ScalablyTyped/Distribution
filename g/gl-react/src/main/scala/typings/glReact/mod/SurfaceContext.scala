package typings.glReact.mod

import typings.glReact.anon.GetGLSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SurfaceContext extends js.Object {
  
  var glParent: Node | Surface[_] | Bus = js.native
  
  var glSizable: GetGLSize = js.native
  
  var glSurface: Surface[_] = js.native
}
object SurfaceContext {
  
  @scala.inline
  def apply(glParent: Node | Surface[_] | Bus, glSizable: GetGLSize, glSurface: Surface[_]): SurfaceContext = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSizable = glSizable.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceContext]
  }
  
  @scala.inline
  implicit class SurfaceContextOps[Self <: SurfaceContext] (val x: Self) extends AnyVal {
    
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
    def setGlParent(value: Node | Surface[_] | Bus): Self = this.set("glParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlSizable(value: GetGLSize): Self = this.set("glSizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlSurface(value: Surface[_]): Self = this.set("glSurface", value.asInstanceOf[js.Any])
  }
}
