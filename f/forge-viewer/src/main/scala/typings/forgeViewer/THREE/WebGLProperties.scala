package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLProperties extends StObject {
  
  def clear(): Unit
  
  def delete(`object`: Any): Unit
  
  def get(`object`: Any): Any
}
object WebGLProperties {
  
  inline def apply(clear: () => Unit, delete: Any => Unit, get: Any => Any): WebGLProperties = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[WebGLProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGLProperties] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setDelete(value: Any => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setGet(value: Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
