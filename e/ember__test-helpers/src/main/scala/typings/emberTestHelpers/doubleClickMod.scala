package typings.emberTestHelpers

import typings.emberTestHelpers.mod.Target
import typings.std.MouseEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/test-helpers/dom/double-click", JSImport.Namespace)
@js.native
object doubleClickMod extends js.Object {
  def default(target: Target): js.Promise[Unit] = js.native
  def default(target: Target, options: MouseEventInit): js.Promise[Unit] = js.native
}

