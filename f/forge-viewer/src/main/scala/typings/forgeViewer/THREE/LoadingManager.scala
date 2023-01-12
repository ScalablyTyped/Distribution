package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingManager extends StObject {
  
  def itemEnd(url: String): Unit
  
  def itemError(url: String): Unit
  
  def itemStart(url: String): Unit
  
  def onError(): Unit
  
  def onLoad(): Unit
  
  def onProgress(item: Any, loaded: Double, total: Double): Unit
  
  def onStart(): Unit
}
object LoadingManager {
  
  inline def apply(
    itemEnd: String => Unit,
    itemError: String => Unit,
    itemStart: String => Unit,
    onError: () => Unit,
    onLoad: () => Unit,
    onProgress: (Any, Double, Double) => Unit,
    onStart: () => Unit
  ): LoadingManager = {
    val __obj = js.Dynamic.literal(itemEnd = js.Any.fromFunction1(itemEnd), itemError = js.Any.fromFunction1(itemError), itemStart = js.Any.fromFunction1(itemStart), onError = js.Any.fromFunction0(onError), onLoad = js.Any.fromFunction0(onLoad), onProgress = js.Any.fromFunction3(onProgress), onStart = js.Any.fromFunction0(onStart))
    __obj.asInstanceOf[LoadingManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadingManager] (val x: Self) extends AnyVal {
    
    inline def setItemEnd(value: String => Unit): Self = StObject.set(x, "itemEnd", js.Any.fromFunction1(value))
    
    inline def setItemError(value: String => Unit): Self = StObject.set(x, "itemError", js.Any.fromFunction1(value))
    
    inline def setItemStart(value: String => Unit): Self = StObject.set(x, "itemStart", js.Any.fromFunction1(value))
    
    inline def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
    
    inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
    
    inline def setOnProgress(value: (Any, Double, Double) => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction3(value))
    
    inline def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
  }
}
