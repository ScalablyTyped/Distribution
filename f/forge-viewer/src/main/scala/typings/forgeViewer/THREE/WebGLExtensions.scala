package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLExtensions extends StObject {
  
  def get(name: String): Any
}
object WebGLExtensions {
  
  inline def apply(get: String => Any): WebGLExtensions = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[WebGLExtensions]
  }
  
  extension [Self <: WebGLExtensions](x: Self) {
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
