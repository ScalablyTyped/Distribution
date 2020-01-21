package typings.emberTestHelpers

import typings.emberTestHelpers.mod.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/test-helpers/dom/type-in", JSImport.Namespace)
@js.native
object typeInMod extends js.Object {
  def default(target: Target, text: String): js.Promise[Unit] = js.native
  def default(target: Target, text: String, options: AnonDelay): js.Promise[Unit] = js.native
}

