package typings.egg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBoot extends StObject {
  
  /**
    * Do some thing before app close
    */
  var beforeClose: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  
  /**
    * Config, plugin files have loaded
    */
  var configDidLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Ready to call configDidLoad,
    * Config, plugin files are referred,
    * this is the last chance to modify the config.
    */
  var configWillLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * All files have loaded, start plugin here
    */
  var didLoad: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  
  /**
    * Worker is ready, can do some things,
    * don't need to block the app boot
    */
  var didReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  
  /**
    * Server is listening
    */
  var serverDidReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  
  /**
    * All plugins have started, can do some thing before app ready
    */
  var willReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
}
object IBoot {
  
  inline def apply(): IBoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBoot] (val x: Self) extends AnyVal {
    
    inline def setBeforeClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "beforeClose", js.Any.fromFunction0(value))
    
    inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
    
    inline def setConfigDidLoad(value: () => Unit): Self = StObject.set(x, "configDidLoad", js.Any.fromFunction0(value))
    
    inline def setConfigDidLoadUndefined: Self = StObject.set(x, "configDidLoad", js.undefined)
    
    inline def setConfigWillLoad(value: () => Unit): Self = StObject.set(x, "configWillLoad", js.Any.fromFunction0(value))
    
    inline def setConfigWillLoadUndefined: Self = StObject.set(x, "configWillLoad", js.undefined)
    
    inline def setDidLoad(value: () => js.Promise[Unit]): Self = StObject.set(x, "didLoad", js.Any.fromFunction0(value))
    
    inline def setDidLoadUndefined: Self = StObject.set(x, "didLoad", js.undefined)
    
    inline def setDidReady(value: () => js.Promise[Unit]): Self = StObject.set(x, "didReady", js.Any.fromFunction0(value))
    
    inline def setDidReadyUndefined: Self = StObject.set(x, "didReady", js.undefined)
    
    inline def setServerDidReady(value: () => js.Promise[Unit]): Self = StObject.set(x, "serverDidReady", js.Any.fromFunction0(value))
    
    inline def setServerDidReadyUndefined: Self = StObject.set(x, "serverDidReady", js.undefined)
    
    inline def setWillReady(value: () => js.Promise[Unit]): Self = StObject.set(x, "willReady", js.Any.fromFunction0(value))
    
    inline def setWillReadyUndefined: Self = StObject.set(x, "willReady", js.undefined)
  }
}
