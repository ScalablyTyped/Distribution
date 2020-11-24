package typings.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBoot extends js.Object {
  
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
  implicit class IBootOps[Self <: IBoot] (val x: Self) extends AnyVal {
    
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
    def setBeforeClose(value: () => js.Promise[Unit]): Self = this.set("beforeClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    
    @scala.inline
    def setConfigDidLoad(value: () => Unit): Self = this.set("configDidLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteConfigDidLoad: Self = this.set("configDidLoad", js.undefined)
    
    @scala.inline
    def setConfigWillLoad(value: () => Unit): Self = this.set("configWillLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteConfigWillLoad: Self = this.set("configWillLoad", js.undefined)
    
    @scala.inline
    def setDidLoad(value: () => js.Promise[Unit]): Self = this.set("didLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDidLoad: Self = this.set("didLoad", js.undefined)
    
    @scala.inline
    def setDidReady(value: () => js.Promise[Unit]): Self = this.set("didReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDidReady: Self = this.set("didReady", js.undefined)
    
    @scala.inline
    def setServerDidReady(value: () => js.Promise[Unit]): Self = this.set("serverDidReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteServerDidReady: Self = this.set("serverDidReady", js.undefined)
    
    @scala.inline
    def setWillReady(value: () => js.Promise[Unit]): Self = this.set("willReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteWillReady: Self = this.set("willReady", js.undefined)
  }
}
