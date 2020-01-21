package typings.emberRouting.mod

import typings.emberRouting.routerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/routing", "Router")
@js.native
class Router () extends default

/* static members */
@JSImport("@ember/routing", "Router")
@js.native
object Router extends js.Object {
  /**
    * The `Router.map` function allows you to define mappings from URLs to routes
    * in your application. These mappings are defined within the
    * supplied callback function using `this.route`.
    */
  def map(callback: js.ThisFunction0[/* this */ typings.emberRouting.routerDslMod.default, Unit]): Unit = js.native
}

