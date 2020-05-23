package typings.emberMocha.mod

import typings.emberTestHelpers.mod.ModuleCallbacks
import typings.mocha.Mocha.ISuiteCallbackContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextDefinitionFunction extends js.Object {
  def apply(
    name: String,
    callbacks: ModuleCallbacks,
    tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]
  ): Unit = js.native
  def apply(
    name: String,
    description: String,
    callbacks: ModuleCallbacks,
    tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]
  ): Unit = js.native
  def apply(name: String, description: String, tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]): Unit = js.native
  def apply(name: String, tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]): Unit = js.native
}

