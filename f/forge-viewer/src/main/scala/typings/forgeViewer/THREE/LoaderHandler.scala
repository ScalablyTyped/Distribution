package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderHandler extends StObject {
  
  def add(regex: js.RegExp, loader: Loader): Unit
  
  def get(file: String): Loader
  
  var handlers: js.Array[js.RegExp | Loader]
}
object LoaderHandler {
  
  inline def apply(add: (js.RegExp, Loader) => Unit, get: String => Loader, handlers: js.Array[js.RegExp | Loader]): LoaderHandler = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get = js.Any.fromFunction1(get), handlers = handlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderHandler]
  }
  
  extension [Self <: LoaderHandler](x: Self) {
    
    inline def setAdd(value: (js.RegExp, Loader) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setGet(value: String => Loader): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHandlers(value: js.Array[js.RegExp | Loader]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    inline def setHandlersVarargs(value: (js.RegExp | Loader)*): Self = StObject.set(x, "handlers", js.Array(value*))
  }
}
