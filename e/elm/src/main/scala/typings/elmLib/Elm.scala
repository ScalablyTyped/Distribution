package typings
package elmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Elm extends js.Object {
  def embed[P](elmModule: ElmModule[P], element: stdLib.Node): ElmComponent[P] = js.native
  def embed[P](elmModule: ElmModule[P], element: stdLib.Node, initialValues: js.Object): ElmComponent[P] = js.native
  def fullscreen[P](elmModule: ElmModule[P]): ElmComponent[P] = js.native
  def fullscreen[P](elmModule: ElmModule[P], initialValues: js.Object): ElmComponent[P] = js.native
  def worker[P](elmModule: ElmModule[P]): ElmComponent[P] = js.native
  def worker[P](elmModule: ElmModule[P], initialValues: js.Object): ElmComponent[P] = js.native
}

