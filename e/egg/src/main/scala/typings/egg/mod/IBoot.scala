package typings.egg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBoot extends StObject {
  
  /**
    * Do some thing before app close
    */
  var beforeClose: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  
  /**
    * Config, plugin files have loaded
    */
  var configDidLoad: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Ready to call configDidLoad,
    * Config, plugin files are referred,
    * this is the last chance to modify the config.
    */
  var configWillLoad: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * All files have loaded, start plugin here
    */
  var didLoad: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  
  /**
    * Worker is ready, can do some things,
    * don't need to block the app boot
    */
  var didReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  
  /**
    * Server is listening
    */
  var serverDidReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  
  /**
    * All plugins have started, can do some thing before app ready
    */
  var willReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
}
object IBoot {
  
  @scala.inline
  def apply(): IBoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoot]
  }
  
  @scala.inline
  implicit class IBootMutableBuilder[Self <: IBoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "beforeClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
    
    @scala.inline
    def setConfigDidLoad(value: () => Unit): Self = StObject.set(x, "configDidLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConfigDidLoadUndefined: Self = StObject.set(x, "configDidLoad", js.undefined)
    
    @scala.inline
    def setConfigWillLoad(value: () => Unit): Self = StObject.set(x, "configWillLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConfigWillLoadUndefined: Self = StObject.set(x, "configWillLoad", js.undefined)
    
    @scala.inline
    def setDidLoad(value: () => js.Promise[Unit]): Self = StObject.set(x, "didLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDidLoadUndefined: Self = StObject.set(x, "didLoad", js.undefined)
    
    @scala.inline
    def setDidReady(value: () => js.Promise[Unit]): Self = StObject.set(x, "didReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDidReadyUndefined: Self = StObject.set(x, "didReady", js.undefined)
    
    @scala.inline
    def setServerDidReady(value: () => js.Promise[Unit]): Self = StObject.set(x, "serverDidReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def setServerDidReadyUndefined: Self = StObject.set(x, "serverDidReady", js.undefined)
    
    @scala.inline
    def setWillReady(value: () => js.Promise[Unit]): Self = StObject.set(x, "willReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWillReadyUndefined: Self = StObject.set(x, "willReady", js.undefined)
  }
}
