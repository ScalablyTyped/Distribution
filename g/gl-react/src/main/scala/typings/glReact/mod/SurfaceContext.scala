package typings.glReact.mod

import typings.glReact.anon.GetGLSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurfaceContext extends StObject {
  
  var glParent: Node | Surface[js.Any] | Bus
  
  var glSizable: GetGLSize
  
  var glSurface: Surface[js.Any]
}
object SurfaceContext {
  
  @scala.inline
  def apply(glParent: Node | Surface[js.Any] | Bus, glSizable: GetGLSize, glSurface: Surface[js.Any]): SurfaceContext = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSizable = glSizable.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceContext]
  }
  
  @scala.inline
  implicit class SurfaceContextMutableBuilder[Self <: SurfaceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlParent(value: Node | Surface[js.Any] | Bus): Self = StObject.set(x, "glParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlSizable(value: GetGLSize): Self = StObject.set(x, "glSizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlSurface(value: Surface[js.Any]): Self = StObject.set(x, "glSurface", value.asInstanceOf[js.Any])
  }
}
