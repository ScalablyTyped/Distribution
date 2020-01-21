package typings.easyXHeaders

import typings.easyXHeaders.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domain", JSImport.Namespace)
@js.native
object domainMod extends js.Object {
  @js.native
  class Domain () extends EventEmitter {
    def add(emitter: EventEmitter): Unit = js.native
    def bind(cb: js.Function2[/* err */ Error, /* data */ js.Any, _]): js.Any = js.native
    def dispose(): Unit = js.native
    def intercept(cb: js.Function1[/* data */ js.Any, _]): js.Any = js.native
    def remove(emitter: EventEmitter): Unit = js.native
    def run(fn: js.Function): Unit = js.native
  }
  
  def create(): Domain = js.native
}

