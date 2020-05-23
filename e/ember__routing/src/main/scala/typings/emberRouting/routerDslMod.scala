package typings.emberRouting

import typings.emberRouting.anon.As
import typings.emberRouting.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/routing/-private/router-dsl", JSImport.Namespace)
@js.native
object routerDslMod extends js.Object {
  @js.native
  trait RouterDSL extends js.Object {
    def mount(name: String): Unit = js.native
    def mount(name: String, options: As): Unit = js.native
    def route(name: String): Unit = js.native
    def route(name: String, callback: js.ThisFunction0[/* this */ this.type, Unit]): Unit = js.native
    def route(name: String, options: Path): Unit = js.native
    def route(name: String, options: Path, callback: js.ThisFunction0[/* this */ this.type, Unit]): Unit = js.native
  }
  
  @js.native
  class default protected () extends RouterDSL {
    def this(name: String, options: js.Object) = this()
  }
  
}

