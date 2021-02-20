package typings.easyXHeaders

import typings.easyXHeaders.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainMod {
  
  @JSImport("domain", "Domain")
  @js.native
  class Domain () extends EventEmitter {
    
    def add(emitter: EventEmitter): Unit = js.native
    
    def bind(cb: js.Function2[/* err */ Error, /* data */ js.Any, _]): js.Any = js.native
    
    def dispose(): Unit = js.native
    
    def intercept(cb: js.Function1[/* data */ js.Any, _]): js.Any = js.native
    
    def remove(emitter: EventEmitter): Unit = js.native
    
    def run(fn: js.Function): Unit = js.native
  }
  
  @JSImport("domain", "create")
  @js.native
  def create(): Domain = js.native
}
