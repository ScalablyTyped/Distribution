package typings.eggView

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewManager
  extends Map[String, js.Any] {
  def resolve(name: String): js.Promise[String] = js.native
  def use(name: String, viewEngine: ViewBase): Unit = js.native
}

