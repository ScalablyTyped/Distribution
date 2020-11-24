package typings.emberMocha.mod

import typings.emberTestHelpers.mod.ModuleCallbacks
import typings.mocha.mod.Suite_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextDefinitionFunction extends js.Object {
  
  def apply(name: String, callbacks: ModuleCallbacks, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
  def apply(
    name: String,
    description: String,
    callbacks: ModuleCallbacks,
    tests: js.ThisFunction0[/* this */ Suite_, Unit]
  ): Unit = js.native
  def apply(name: String, description: String, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
  def apply(name: String, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
}
