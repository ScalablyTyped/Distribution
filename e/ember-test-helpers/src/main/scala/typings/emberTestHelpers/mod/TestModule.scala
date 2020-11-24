package typings.emberTestHelpers.mod

import typings.ember.mod.default.Resolver
import typings.rsvp.mod.default.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember-test-helpers", "TestModule")
@js.native
class TestModule protected () extends js.Object {
  def this(name: String) = this()
  def this(name: String, callbacks: ModuleCallbacks) = this()
  def this(name: String, description: String) = this()
  def this(name: String, description: js.UndefOr[scala.Nothing], callbacks: ModuleCallbacks) = this()
  def this(name: String, description: String, callbacks: ModuleCallbacks) = this()
  
  var callbacks: ModuleCallbacks = js.native
  
  var context: TestContext = js.native
  
  var description: String = js.native
  
  def getContext(): TestContext = js.native
  
  var isIntegration: Boolean = js.native
  
  var name: String = js.native
  
  var resolver: Resolver = js.native
  
  def setContext(context: TestContext): Unit = js.native
  
  def setup(): Promise[Unit] = js.native
  def setup(assert: js.Any): Promise[Unit] = js.native
  
  var subjectName: String = js.native
  
  def teardown(): Promise[Unit] = js.native
  def teardown(assert: js.Any): Promise[Unit] = js.native
}
