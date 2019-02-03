package typings
package eggDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewManager
  extends stdLib.Map[java.lang.String, js.Any] {
  def resolve(name: java.lang.String): js.Promise[java.lang.String] = js.native
  def use(name: java.lang.String, viewEngine: ViewBase): scala.Unit = js.native
}

