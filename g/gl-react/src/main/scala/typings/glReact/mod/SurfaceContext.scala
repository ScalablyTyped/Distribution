package typings.glReact.mod

import typings.glReact.anon.GetGLSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurfaceContext extends StObject {
  
  var glParent: Node | Surface[Any] | Bus
  
  var glSizable: GetGLSize
  
  var glSurface: Surface[Any]
}
object SurfaceContext {
  
  inline def apply(glParent: Node | Surface[Any] | Bus, glSizable: GetGLSize, glSurface: Surface[Any]): SurfaceContext = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSizable = glSizable.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceContext]
  }
  
  extension [Self <: SurfaceContext](x: Self) {
    
    inline def setGlParent(value: Node | Surface[Any] | Bus): Self = StObject.set(x, "glParent", value.asInstanceOf[js.Any])
    
    inline def setGlSizable(value: GetGLSize): Self = StObject.set(x, "glSizable", value.asInstanceOf[js.Any])
    
    inline def setGlSurface(value: Surface[Any]): Self = StObject.set(x, "glSurface", value.asInstanceOf[js.Any])
  }
}
