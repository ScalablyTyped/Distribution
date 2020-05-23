package typings.emberTestHelpers

import typings.emberTestHelpers.anon.Resolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/test-helpers/setup-context", JSImport.Namespace)
@js.native
object setupContextMod extends js.Object {
  def default[C /* <: js.Object */](context: C): js.Promise[C] = js.native
  def default[C /* <: js.Object */](context: C, options: Resolver): js.Promise[C] = js.native
  def getContext(): js.Object = js.native
  def pauseTest(): js.Promise[Unit] = js.native
  def resumeTest(): Unit = js.native
  def setContext(context: js.Object): Unit = js.native
  def unsetContext(): Unit = js.native
}

