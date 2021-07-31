package typings.easyXHeaders

import typings.easyXHeaders.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainMod {
  
  @JSImport("domain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("domain", "Domain")
  @js.native
  class Domain () extends EventEmitter {
    
    def add(emitter: EventEmitter): Unit = js.native
    
    def bind(cb: js.Function2[/* err */ Error, /* data */ js.Any, js.Any]): js.Any = js.native
    
    def dispose(): Unit = js.native
    
    def intercept(cb: js.Function1[/* data */ js.Any, js.Any]): js.Any = js.native
    
    def remove(emitter: EventEmitter): Unit = js.native
    
    def run(fn: js.Function): Unit = js.native
  }
  
  @scala.inline
  def create(): Domain = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Domain]
}
