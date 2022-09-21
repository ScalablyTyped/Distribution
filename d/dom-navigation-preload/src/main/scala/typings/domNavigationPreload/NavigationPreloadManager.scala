package typings.domNavigationPreload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://w3c.github.io/ServiceWorker/#navigationpreloadmanager */
trait NavigationPreloadManager extends StObject {
  
  def disable(): js.Promise[Unit]
  
  def enable(): js.Promise[Unit]
  
  def getState(): js.Promise[NavigationPreloadState]
  
  def setHeaderValue(value: String): js.Promise[Unit]
}
object NavigationPreloadManager {
  
  inline def apply(
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    getState: () => js.Promise[NavigationPreloadState],
    setHeaderValue: String => js.Promise[Unit]
  ): NavigationPreloadManager = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getState = js.Any.fromFunction0(getState), setHeaderValue = js.Any.fromFunction1(setHeaderValue))
    __obj.asInstanceOf[NavigationPreloadManager]
  }
  
  extension [Self <: NavigationPreloadManager](x: Self) {
    
    inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setGetState(value: () => js.Promise[NavigationPreloadState]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setSetHeaderValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "setHeaderValue", js.Any.fromFunction1(value))
  }
}
