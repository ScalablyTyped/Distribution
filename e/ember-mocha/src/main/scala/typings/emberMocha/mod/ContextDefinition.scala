package typings.emberMocha.mod

import typings.emberTestHelpers.mod.ModuleCallbacks
import typings.mocha.mod.Suite_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextDefinition extends ContextDefinitionFunction {
  
  def only(name: String, callbacks: ModuleCallbacks, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
  def only(
    name: String,
    description: String,
    callbacks: ModuleCallbacks,
    tests: js.ThisFunction0[/* this */ Suite_, Unit]
  ): Unit = js.native
  def only(name: String, description: String, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
  def only(name: String, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
  @JSName("only")
  var only_Original: ContextDefinitionFunction = js.native
  
  def skip(name: String, callbacks: ModuleCallbacks, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
  def skip(
    name: String,
    description: String,
    callbacks: ModuleCallbacks,
    tests: js.ThisFunction0[/* this */ Suite_, Unit]
  ): Unit = js.native
  def skip(name: String, description: String, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
  def skip(name: String, tests: js.ThisFunction0[/* this */ Suite_, Unit]): Unit = js.native
  @JSName("skip")
  var skip_Original: ContextDefinitionFunction = js.native
}
