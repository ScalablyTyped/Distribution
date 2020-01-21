package typings.emberTestHelpers

import typings.emberTestHelpers.mod.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/test-helpers/dom/trigger-event", JSImport.Namespace)
@js.native
object triggerEventMod extends js.Object {
  def default(target: Target, eventType: String): js.Promise[Unit] = js.native
  def default(target: Target, eventType: String, options: js.Object): js.Promise[Unit] = js.native
}

