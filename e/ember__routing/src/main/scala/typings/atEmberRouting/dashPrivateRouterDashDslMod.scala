package typings.atEmberRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/routing/-private/router-dsl", JSImport.Namespace)
@js.native
object dashPrivateRouterDashDslMod extends js.Object {
  @js.native
  trait RouterDSL extends js.Object {
    def mount(name: String): Unit = js.native
    def mount(name: String, options: Anon_As): Unit = js.native
    def route(name: String): Unit = js.native
    def route(name: String, callback: js.ThisFunction0[/* this */ this.type, Unit]): Unit = js.native
    def route(name: String, options: Anon_Path): Unit = js.native
    def route(name: String, options: Anon_Path, callback: js.ThisFunction0[/* this */ this.type, Unit]): Unit = js.native
  }
  
  @js.native
  class default protected () extends RouterDSL {
    def this(name: String, options: js.Object) = this()
  }
  
}

